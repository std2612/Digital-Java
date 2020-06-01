use shopping_mall;

drop trigger if exists insert_buy_list;

delimiter //
create trigger insert_buy_list after insert on buy_list
-- for each row는 update나 delete와 같이 조건에 의해 여러행이 수행되거나 삭제될 때 변경되는 각행을 의미
for each row
begin
	declare _amount int default 0;
    -- 구매 리스트에 추가된 제품의 현재 재고량을 가져와서 _amount에 저장
    set _amount=(select rl_amount from reg_list where rl_pd_code=new.bl_pd_code);
    -- 현재 재고량에서 구매한 재고량을 뺌
    set _amount=_amount-new.bl_amount;
    update reg_list
		set rl_amount=_amount
        where rl_pd_code=new.bl_pd_code;
end
// delimiter ;

drop trigger if exists insert_buy_price;

delimiter //
create trigger insert_buy_price after insert on buy_list
for each row
begin
	declare _price int default 0;
    declare _total_price int default 0;
    
    set _total_price
		=(select by_price
			from buy
            where new.bl_by_num=by_num);
            
    set _price
		=(select pd_price from product
			where new.bl_pd_code=pd_code);
	
--  set _price
-- 		=(select pd_price from buy_list
-- 			join product on pd_code=bl_pd_code
--             where new.bl_pd_code=pd_code
--             limit 0,1);
--             
-- 	set _price
-- 		=(select pd_price from buy_list
-- 			join product on pd_code=bl_pd_code
--             where new.bl_pd_code=pd_code
--             group by pd_code);
                
    set _total_price
		=_total_price+_price*new.bl_amount;
        
    update buy
		set by_price=_total_price
        where new.bl_by_num=by_num;
end
// delimiter ;

drop trigger if exists modify_buy_price;

delimiter //
create trigger modify_buy_price after update on buy_list
for each row
begin
	declare _price int default 0;
    declare _total_price int default 0;
    
    set _total_price
		=(select by_price
			from buy
            where new.bl_by_num=by_num);
            
    set _price
		=(select pd_price from product
			where new.bl_pd_code=pd_code);
	
--  set _price
-- 		=(select pd_price from buy_list
-- 			join product on pd_code=bl_pd_code
--             where new.bl_pd_code=pd_code
--             limit 0,1);
--             
-- 	set _price
-- 		=(select pd_price from buy_list
-- 			join product on pd_code=bl_pd_code
--             where new.bl_pd_code=pd_code
--             group by pd_code);
                
    set _total_price
		=_total_price+_price*new.bl_amount;
        
    update buy
		set by_price=_total_price
        where new.bl_by_num=by_num;
end
// delimiter ;

show triggers;