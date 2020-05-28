-- 성이 홍씨인 모든 학생들의 정보를 출력
select * from student where st_name like '홍%';
 
-- 학번이 2020인 모든 학생들의 정보를 출력
select * from student where st_num like '2020%';

-- 데이터 삭제시 유의사항
-- 삭제하려는 데이터를 다른 테이블에서 외래키로 참조하고 있을 때 삭제 불가
-- 1. 참고하고 있는 데이터를 삭제 후 해당 데이터를 삭제
-- 2. 참고하고 있는 데이터를 삭제 후 해당 데이터를 삭제

-- 학생이 게시글에 첨부파일을 추가하여 게시글을 등록하려고 한다.
-- 이 때 게시글 등록이 성공적으로 이루어지기 위한 전제 조건은 무엇이고
-- 어느 테이블에서 insert가 일어나야 하는가?
-- ==> 1. student, attachment, board 데이터가 있어야 하고 2. post에서 insert가 일어나야 함

-- 학생의 성이 홍씨이고, 학번이 2020번인 학생들의 모든 정보를 출력
select * from student where st_name like '홍%' && st_num like '2020%';
select * from student where st_name like '홍%' and st_num like '2020%';

-- 강의가 2020_MSC001_1_1인 강의를 수강하는 학생들의 중간고사 총점
select sum(at_mid) from attend where at_co_code='2020_MSC001_1_1';
-- 강의가 2020_MSC001_1_1인 강의를 수강하는 학생들의 중간고사 평균
select avg(at_mid) from attend where at_co_code='2020_MSC001_1_1';
-- 강의가 2020_MSC001_1_1인 강의를 수강하는 학생들의 수
select count(*) from attend where at_co_code='2020_MSC001_1_1';

select * from student;