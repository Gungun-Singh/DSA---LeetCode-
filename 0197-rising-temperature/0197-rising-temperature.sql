# Write your MySQL query statement below
select t.id
from Weather t join Weather y
on t.recordDate = DATE_ADD(y.recordDate, interval 1 day)
where t.temperature > y.temperature;