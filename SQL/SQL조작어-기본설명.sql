select 속성명1, 속성명2 
	from 데이터베이스.테이블A;
/* 
데이터베이스 안에 있는 테이블A에서 모든 행들을 속성명1
과 속성명2의 값들만 확인
*/

select 속성명1, 속성명2 
	from 데이터베이스.테이블A 
    where 조건;
/* 
데이터베이스 안에 있는 테이블A에서 조건을 만족하는 행들을 속성명1
과 속성명2의 값들만 확인
*/

insert into 테이블A (속성명1, 속성명2, 속성명N)
values (값1, 값2, 값N);
/* 
테이블A안에 있는 속성명1에 값1을 저장하고, 속성명2에 값2를 저장하고, 
속성명N에 값N을 저장하여 행을 추가하는 SQL문
추가할 때 유의사항
 1. 속성에 지정된 타입과 값의 타입이 같은지 확인
 2. 속성에 지정된 제약조건에 값이 맞는지 확인
insert할 때에 생략할 수 없는 속성들
 - 기본키인 속성
 - 제약조건이 NOT NULL이고, 기본값이 없는 경우
insert할 때 속성의 갯수와 값의 갯수가 같아야 한다.
*/
update 테이블A 
	set 
		속성명1 = 값1, 
        속성명2 = 값2, 
        속성명N = 값N 
where 조건;
/*
테이블 A에서 조건을 만족하는 행들의 속성명1을 값1로, 속성명2를 값2로
속성명N을 값 N으로 수정하는 SQL문
조건에는 기본키를 많이 이용한다
*/
delete from 테이블A where 조건;
/*
테이블A에서 조건을 만족하는 모든 행을 삭제하는 SQL문
from은 생략 가능
*/
/* where절은 참 또는 거짓으로 판별할 수 있어야 한다. 
where절에서 =은 같다를 의미한다. 
where절에서 같지 않다는 !=을 쓰거나 <>을 쓴다. 
where절에서 NULL 체크는 is NULL을 쓰거나 is not NULL을 쓴다
*/
DROP TABLE IF EXISTS 테이블A;
/* 테이블 생성 시 기존에 있는 테이블이면 지우고 다시 만들 때
사용하는 SQL문으로 테이블 A가 있으면 삭제, 없으면 아무일도 안함
테이블 안에 데이터가 삭제되기 때문에 데이터를 삭제하면 안되는 경우
사용해서는 안됨
*/

