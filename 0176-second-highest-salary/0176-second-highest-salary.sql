# Write your MySQL query statement below
-- CREATE TABLE SecondHighestSalary
SELECT ( SELECT DISTINCT salary
  FROM Employee
  ORDER BY salary DESC
  LIMIT 1 OFFSET 1
)  AS SecondHighestSalary ;