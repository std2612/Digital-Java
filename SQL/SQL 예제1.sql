-- 학번과 이름만 출력
select st_num, st_name from university.student;

-- 학번이 2020110011인 학생 출력
select * from university.student
	where st_num=2020110011;

-- 학번이 2020110011이 아닌 학생 출력 
select * from university.student
	where st_num<>2020110011;
    
select * from university.student
	where st_num!=2020110011;
    
-- 2019학번 학생을 등록
insert into student
	values(2019110011, '장보고', '010101-8451532', '학사');

-- 2020학번만 출력 
select * from student
	where st_num>=2020000000 && st_num<=2021000000;

SELECT * FROM university.student;