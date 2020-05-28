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
select (co_code)강의코드, (pr_name)교수명
	from course
		join professor
        on co_pr_num=pr_num;
        
-- 강의의 과목명 확인
select (co_code)강의코드, (su_title)과목명
	from course
		join subject
        on  co_su_code=su_code;
        
-- 강의의 과목과 교수명 확인
select (co_code)강의코드, (su_title)과목명, (pr_name)교수명
	from course
		join subject
        on  co_su_code=su_code
        join professor
        on co_pr_num=pr_num;
        
-- 지도학생의 이름과 지도교수의 이름이 출력
select (st_name)피지도학생, (pr_name)지도교수
	from coach
		join professor
		on ch_pr_num=pr_num
        join student
        on ch_st_num=st_num;
        
-- 홍길동 학생이 수강했거나 하고 있는 과목을 출력
select (st_name)강의코드, (su_title)과목명
	from attend
		-- student 테이블에서 이름이 임꺽정인 학생을 검색하여 검색 결과를 st라는 임시 테이블로 생성
        -- 
        --
		join (select * from student where st_name='임꺽정')임꺽정의학생정보
        on at_st_num=st_num
        join course
        on at_co_code=co_code
        join subject
        on co_su_code=su_code;
        
-- 현재(2020년 1학기) 개설된 과목명을 출력
select co_code, su_title
	from (select * from course where co_code like '2020#_%#_1#_%' escape '#')2020년1학기
		join subject
		on co_su_code=su_code;
        
-- 임꺽정 학생이 현재까지 수강한 과목의 총 학점은?
select (st_name) 이름, sum(su_point) as 누적학점
	from attend
		join (select * from student where st_name='임꺽정') as '임꺽정의 학생정보'
        on at_st_num=st_num
        join course
        on at_co_code=co_code
        join subject
        on co_su_code=su_code;
        
-- 수강기록에서 총점을 확인
select (at_co_code) as 강의코드, (st_num) as 학번, (st_name) as 이름, (at_mid+at_final+at_homework+at_attendance) as 총점
	from attend
		join student
        on at_st_num=st_num;
        
-- 2020년 1학기에 대학수학기초 강의 1분반 학생의 수를 확인
select count(*) as '학생 수'
	from attend
	where at_co_code like '2020#_MSC001#_1#_1' escape '#';
    
select count(*) as '학생수'
	from (select * from attend where at_co_code like '2020#_%#_1#_%1' escape '#') as t
		join course
        on co_code=at_co_code
        join (select * from subject where su_title='대학수학기초') as t2
        on su_code=co_su_code;
        
-- 홍길동 학생이 작성한 게시글을 확인하는 SPL문
select * 
	from post
		join (select * from student where st_name='홍길동') as st
		on po_st_num=st_num;