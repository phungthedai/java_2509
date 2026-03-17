-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều
-- nhất
with thongKe as (
	select q.*, count(eq.exam_id) as soLuong
	from questions q
	left join  exam_question eq on q.question_id = eq.question_id
	group by q.question_id
)

select * from thongKe
where soLuong = (select max(soLuong) from thongKe);

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất
with statisticsAnswer as (
	select q.*, count(a.answer_id) as count_answer
    from questions q
    join answers a on q.question_id = a.question_id
    group by question_id
)

select *
from statisticsAnswer
where count_answer = ( select max(count_answer) from statisticsAnswer);

-- Question 10: Tìm chức vụ có ít người nhất
with statisticsAccount as (
	select p.*, count(a.account_id) as count_account
    from positions p
    left join accounts a on p.position_id = a.position_id
    group by p.position_id
)

select *
from statisticsAccount
where count_account = ( select min(count_account) from statisticsAccount );

-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
create view nhanvienSale as

with tableNhanvienSale as (
	select a.*, p.department_name
	from accounts a join departments d on a.department_id = d.department_id
	where p.department_name = 'sale'
)
select * from tableNhanvienSale;

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
create view infoAccountGroup as 
select a.*, count(ga.group_id) as count_group
from accounts a
join group_account ga on a.account_id = ga.account_id
group by a.account_id
having count_group = (
	select max(table_account_group.account_group)
    from (
		select count(ga.group_id) as account_group
		from accounts a
		join group_account ga on a.account_id = ga.account_id
		group by a.account_id
	) as table_account_group
);
select * from infoAccountGroup;

with tableInfoAccount as (
	select a.*, count(ga.group_id) as count_group
	from accounts a
	join group_account ga on a.account_id = ga.account_id
	group by a.account_id
)

select *
from tableInfoAccount
where count_group = (select max(count_group) from tableInfoAccount);



-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi
create view length_content as
select *
from questions
where length(content) > 300;

delete from length_content
where length(content) > 300;

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
create view account_department as
select d.*, count(a.account_id) as count_account
from departments d join accounts a on d.department_id = a.department_id
group by d.department_id
having count_account = (
	select max(count_account)
    from (
		select count(a.account_id) as count_account
		from departments d join accounts a on d.department_id = a.department_id
		group by d.department_id
	) as table_count_account
);

with table_account_department as (
	select d.*, count(a.account_id) as count_account
	from departments d join accounts a on d.department_id = a.department_id
	group by d.department_id
)

select *
from table_account_department
where count_account = ( select max(count_account) from table_account_department);

-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo.
create view question_user as
select *
from questions q join accounts a on q.creator_id = a.account_id
where a.full_name like 'Nguyen%';




