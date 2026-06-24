
select activity_date as day , COUNT(DISTINCT user_id) as active_users
from activity
where activity_date BETWEEN '2019-06-28' and '2019-07-27' and activity_type in  ('open_session', 'end_session', 'scroll_down', 'send_message')
group by activity_date

