-- Write your PostgreSQL query statement below
select 
    id , 
    case when id % 2=0 then even_st 
    when id % 2!=0 and odd_st is not null then odd_st 
    else student end  as student
from (
    select *,
    lag(student)  over(order by id) as even_st,
    lead(student) over(order by id) as odd_st
    from seat)
