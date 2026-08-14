# Write your MySQL query statement below
select * from Users 
where mail regexp '^[A-Z][A-Za-z0-9_.-]*@leetcode\\.com$'
and mail like binary '%leetcode.com';