-- select 속성 
-- 	from 테이블A
-- 		join 테이블B
--         on 테이블A.속성A=테이블B.속성B
--         join 테이블C
-- 		on 테이블A.속성A=테이블C.속성C
-- 	where 조건;

-- 안창호 교수의 모든 지도학생의 이름을 확인
select (pr_name) as '지도 교수명', (st_name) as '지도 학생명' 
	from coach
		join (select * from professor where pr_name = '안창호') as slctpr
			on ch_pr_num = pr_num
		join student
			on ch_st_num = st_num;
        
select * from student;
select * from professor;
select * from coach;
select * from course;

insert into coach(ch_pr_num, ch_st_num)
	values('2020110001', '2020110013');
    
-- 안창호 교수가 강의하거나 강의했던 모든 과목명을 확인
-- 폐강인 경우는 강의 테이블에서 해당 강의를 삭제한다는 조건의 시스템
select (pr_name) as '교수명', (su_title) as '과목명'
	from course
		join (select * from professor where pr_name = '안창호') as slctpr
			on co_pr_num = pr_num
		join subject
			on co_su_code=su_code;
            
-- 안창호 교수가 2020년 1학기에 강의하는 모든 과목명을 확인
-- 폐강인 경우는 강의 테이블에서 해당 강의를 삭제한다는 조건의 시스템

select (pr_name) as '교수명', (su_title) as '2020년 1학기 과목명'
	from (select * from course where co_code like '2020#_%#_1#__' escape '#') as slctco
		join (select * from professor where pr_name = '안창호') as slctpr
			on co_pr_num = pr_num
		join subject
			on co_su_code=su_code;
            
select (pr_name) as '교수명', (su_title) as '2020년 1학기 과목명'
	from course
		join professor
			on co_pr_num = pr_num
		join subject
			on co_su_code=su_code
	where pr_name = '안창호' and co_code like '2020#_%#_1#__' escape '#';
    
-- 안창호 교수가 하거나 했던 강의 이름
select (pr_name) as '교수명', (su_title) as '과목명'
	from course
		join (select * from professor where pr_name = '안창호') as slctpr
			on co_pr_num = pr_num
		join subject
			on co_su_code=su_code
	group by su_title;
    
-- 정렬 : order by ASC/DESC
select * from attend order by at_num desc;