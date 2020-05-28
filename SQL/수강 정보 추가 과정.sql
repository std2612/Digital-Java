-- 1. 과목 등록
insert into subject values('MSC002', '대학수학기초2', 2, 2);
SELECT * FROM university.subject;

-- 2. 교수 등록
insert into professor 
	values(2020110002, '장영실', '41', '010-1234-5648', '교수실 102호');
select * from professor;

-- 3. 강의 등록
insert into course
	values('2020_MSC001_1_2','강의실 102호','월1,2 수1,2',2,2020110002,'MSC001');
select * from course;

-- 4. 학생 등록
insert into student(st_num, st_name, st_identification_number)
	values(2020110015, '곽재우', '010103-1495269');
select * from student;

-- 5. 수강 등록
insert into attend(at_st_num, at_co_code)
	values(2020110012,'2020_MSC001_1_2');
select * from attend;

-- 6. 지도 등록
insert into coach(ch_pr_num, ch_st_num)
	values(2020110002, 2020110012);
select * from coach;