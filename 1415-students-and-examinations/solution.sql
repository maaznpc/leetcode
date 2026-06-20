select 
    s.student_id ,
    s.student_name , 
    c.subject_name , 
    count(e.subject_name) as attended_exams
from students s 
    cross join subjects c
    left join examinations e
    on s.student_id =e.student_id
    and c.subject_name = e.subject_name
GROUP BY 
    s.student_id, 
    s.student_name, 
    c.subject_name
order by student_id asc
