# Write your MySQL query statement below
Select
(
    Select Distinct salary from Employee
group by salary
order by salary desc
limit 1 offset 1
)
 as SecondHighestSalary;