select 
    round(count(distinct player_id ) ::numeric /
        (select count(distinct player_id) from activity)
        ,2) as fraction 
    from activity 
    where (player_id , event_date - interval '1 day') IN (
        select player_id ,
            min(event_date)  
        from activity 
        group by player_id)
