SELECT name as employee
FROM Employee e
WHERE salary >
(
    SELECT salary
    FROM Employee m
    WHERE m.id = e.managerId
)
