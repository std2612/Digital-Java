# 프로시저 : 함수, 필요할 때 호출
# 트리거 : 이벤트가 발생되면 자동 실행
/*
drop procedure if exists 프로시저명;

delimiter //
create procedure 프로시저명(
	in 매개변수 자료형,
    out 리턴변수 자료형
)
begin
end//
delimiter ;
*/

drop procedure if exists select_student;

delimiter //
create procedure select_student(
	in student_num int,
    out student_name varchar(40)
)
begin
	set student_name=(select st_name from student where st_num=student_num);
end//
delimiter ;

# @변수는 한 번 선언되면 끝까지 정보가 유지되는 변수

call select_student(2020110011, @student_name);
select @student_name;

# 학생 정보(학번, 이름, 주민번호, 분류(학사/석사/박사))가 주어지면 주어진 학생 정보를 학생 정보를 student테이블에 insert하는 프로시저를 작성

drop procedure if exists insert_student;

delimiter //
create procedure insert_student(

)
begin
end//
delimiter ;

# 과목코드, 강의년도, 강의학기, 분반, 강의실, 강의시간, 교수번호가 주어졌을 때 새로운 강의를 등록하는 프로시저를 작성

drop procedure if exists insert_course;

delimiter //
create procedure insert_course(
	in	subject_code varchar(6),
		course_year int,
        course_semester int,
        course_class int,
        course_room VARCHAR(15),
        course_time VARCHAR(30),
        professor_num int
)
begin
	declare course_code varchar(16);
    
    set course_code=concat(course_year, '_', subject_code, '_', course_semester, '_', course_class);
    
	if course_semester>=1 and course_semester<=4
		# 외래키 값으로 쓸 기본키 존재 체크
		and (select count(*) from professor where pr_num=professor_num)!=0
        # 외래키 값으로 쓸 기본키 존재 체크
		and (select count(*) from university.subject where su_code=subject_code)!=0
        and convert(professor_num/1000000, signed integer)<=course_year
        # 기본키 중복 체크
        and (select count(*) from course where co_code=course_code)=0 then
			insert into course
				values(course_code, course_room, course_time, course_class, professor_num, subject_code);
	end if;
end//
delimiter ;

call insert_course('MSC003', 2020, 2, 1, '강의실 305호', '월3,4 화3,4', 2019110001);

select convert(2019110002/1000000, signed integer);

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