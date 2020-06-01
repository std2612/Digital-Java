-- 회원이 제품을 구매했을 때 DB에서 일어나는 상황

-- 1. buy테이블 insert 이벤트
-- 2. buy_list테이블 insert 이벤트 => 구매한 제품 종류만큼
-- 3. reg_list테이블 update 이벤트 => 재고량
-- 4. buy테이블 update 이벤트 => 총가격

-- 1, 2번은 무조건 고정
-- 3, 4번은 독립적이므로 서로 순서가 바뀌어도 됨

-- 관리자가 판매글을 등록했을 때 DB에서 일어나는 상황

-- 제품이 있는 경우
-- 1. selling_post테이블 insert 이벤트
-- 2. reg_list테이블 insert 이벤트 => 등록한 제품 종류만큼

-- 제품이 없는 경우
-- 1. product테이블 insert => 등록하려는 제품 종류만큼
-- 1. selling_post테이블 insert 이벤트
-- 2. reg_list테이블 insert 이벤트 => 등록한 제품 종류만큼

-- 비회원이 판매자로 등록되기 위한 과정

-- 1. member테이블 insert 이벤트 => 회원가입
-- 2. member테이블 update 이벤트 => 권한