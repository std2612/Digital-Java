-- join은 두 테이블을 연결하여 하나의 테이블을 만듬
-- 두 테이블을 연결해주는 연결고리에 해당하는 부분이 on 다음에 나오는 코드
-- on을 통해 연결할 때 테이블A와 테이블B에 연결하는 속성명이 서로 다른 경우 테이블명을 생략할 수 있다.
-- 여러개의 테이블을 join으로 연결할 때, 테이블 연결 순서에 따라 join속도가 달라진다.
select 속성
	from 테이블A
		join 테이블B
		on 테이블A.속성명 = 테이블B.속성명
	where 조건;

select * from course;

-- 강의를 하는 교수명을 확인
select co_code, pr_name
	from course
		join professor
        on co_pr_num=pr_num;
        
-- 강의의 과목명 확인
select co_code, su_title
	from course
		join subject
        on  co_su_code=su_code;
        
-- 강의의 과목과 교수명 확인
select co_code, su_title, pr_name
	from course
		join subject
        on  co_su_code=su_code
        join professor
        on co_pr_num=pr_num;
        
-- 지도학생의 이름과 지도교수의 이름이 출력
select st_name, pr_name
	from coach
		join professor
		on ch_pr_num=pr_num
        join student
        on ch_st_num=st_num;
        
-- 홍길동 학생이 수강했거나 하고 있는 과목을 출력
select 