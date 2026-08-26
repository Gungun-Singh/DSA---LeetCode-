# Write your MySQL query statement below
select s.score as score, 
(select count(distinct s1.score)
from Scores s1
where s1.score >=s.score
) as `rank`
from Scores as s
order by s.score desc;