select distinct num as ConsecutiveNums 
from (select num,
    lag (num,1) over(order by id) as lag1,
    lag(num,2) over(order by id) as lag2
    from logs) 
where num = lag1 and num =lag2

