-- 제품 등록을 하려면 선행되어야 하는 작업은 무엇인가?
-- 1. member 테이블에 회원 정보를 추가
-- 2. product 테이블에 제품 정보를 추가

-- 제품 등록을 할 수 있는 회원을 확인
-- 권한이 USER가 아닌 회원으로 검색 => 추후에 판매자가 등록될 수도 있기 때문에
select * from shopping_mall.member
	where m_power<>'USER';

-- 현재 구입할 수 있는 제품들을 확인
select pd_name as '제품명', rl_amount as '재고량'
	from (select * from reg_list where rl_amount>0) as slctrl
		join product
        on rl_pd_code=pd_code;
    
-- abcd1234 회원이 구매한 제품들을 확인
select m_id as '구매 회원명', pd_name as '제품명', bl_amount as '구매량'
	from buy_list
		join buy
			on bl_by_num=by_num
		join (select * from shopping_mall.member where m_id='abcd1234') as slctm
			on by_m_id=m_id
        join product
			on bl_pd_code=pd_code;

-- 테이블 A의 기본키 속성을 수정하려 할때 에러가 나는 경우
-- 원인 : 테이블 B의 외래키로 테이블 A의 기본키가 설정된 경우
-- 해결
--  1. 테이블 B의 외래키 해제
--  2. 테이블 A의 기본키 속성 변경
--  3. 테이블 B의 외래키 재설정

select *
		from buy_list
            join product
				on bl_pd_code=pd_code
				group by bl_num;