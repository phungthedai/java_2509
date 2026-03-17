-- Question 2
select *
from departments;

-- Question 3
select department_id
from departments
where department_name = 'Sale';

-- Question 4
select *, length(full_name)
from accounts
order by length(full_name) desc
limit 1;

-- Question 5
select *, length(full_name)
from accounts
where department_id = 3
order by length(full_name) desc
limit 1;

-- Question 6
select group_name
from `groups`
where create_date < '2019-12-20';

-- Question 7
select question_id, count(*)
from answers
group by question_id
having count(*) >= 4;

-- Question 8
select exam_id
from exams
where duration >= 60 and create_date < '2019-12-20';

-- Question 9
select *
from `groups`
order by create_date desc
limit 5;

-- Question 10
select count(*)
from accounts
where department_id = 2; 

-- Question 11
select full_name
from accounts
where full_name like 'D%o';

-- Question 12
delete from exams
where create_date < '2019-12-20';

-- Question 13
delete from questions
where content LIKE 'câu hỏi%';

-- Question 14
update accounts
set full_name = 'Nguyễn Bá Lộc',
	email = 'loc.nguyenba@vti.com.vn'
where accounts.account_id = 5;

-- Question 15
update group_account
set group_id = 4
where account_id = 5;
