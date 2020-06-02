-- 수강 테이블에 수강한 수강 정보를 추가
-- Ex) 2019년도 수강을 추가

-- 2019110011 학번 학생이 현재까지 이수한 학점을 출력
select (at_st_num) as '학번', sum(su_point) as '이수 학점'
	from (select* from attend where at_st_num=2019110011 and at_complete='Y') as slctat
		join course
			on at_co_code=co_code
		join subject
			on co_su_code=su_code;
            
drop trigger if exists insert_attend;

delimiter //
create trigger insert_attend after insert on attend
for each row
begin
	declare _point int default 0;
    
    set _point=(select ifnull(sum(su_point), 0)
					from (select * from attend where at_st_num=new.at_st_num and at_complete='Y') as slctat
						join course
							on at_co_code=co_code
						join subject
							on co_su_code=su_code);
	update student
		set st_point=_point
        where new.at_st_num=st_num;
end
// delimiter ;

drop trigger if exists update_attend;

delimiter //
create trigger update_attend after update on attend
for each row
begin
	declare _point int default 0; #
    declare _total int default 0; # 업데이트 되기전 학생의 총 이수 학점
        
    if new.at_complete='Y' then
    	set _point=(select sum(su_point)
						from (select * from attend where at_st_num=new.at_st_num and at_complete='Y') as slctat
							join course
								on at_co_code=co_code
							join subject
								on co_su_code=su_code);
     end if;
    
    if old.at_complete='Y' and new.at_complete='N' then
		set _total=(select st_point from student where st_num=new.at_st_num);
        set _point=(select su_point
						from (select * from attend where at_st_num=new.at_st_num and at_co_code=new.at_co_code) as slctat
							join course
								on at_co_code=co_code
							join subject
								on co_su_code=su_code);
		set _point=_total-_point;
    end if;
    update student
			set st_point=_point
            where st_num=new.at_st_num;
    
end
// delimiter ;

show triggers;

# 트리거의 실행문 안에서 트리거 이벤트가 발생한 테이블을 수정할 수 없다
# 위의 트리거는 attend 테이블에서 이벤트가 발생할 때 실행되는 이벤트이기 때문에 트리거 안에서 attend 테이블을 수정할 수 없다

select * from attachment;
select * from attend;
select * from board;
select * from coach;
select * from course;
select * from graduation;
select * from graduation_requirement;
select * from post;
select * from professor;
select * from student;
select * from subject;