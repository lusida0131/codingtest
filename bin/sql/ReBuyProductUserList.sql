-- 코드를 입력하세요
select USER_ID, PRODUCT_ID
from ONLINE_SALE
group by PRODUCT_ID, USER_ID
having count(*) >= 2
order by USER_ID asc, PRODUCT_ID desc