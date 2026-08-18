# Write your MySQL query statement below
select R.employee_id
from 
(select * from
    Employees  left join Salaries 
using(employee_id)

union

Select * from 
Employees  right join Salaries 
using (employee_id)
) as R
where R.name is null or R.salary is null
order by R.employee_id
;