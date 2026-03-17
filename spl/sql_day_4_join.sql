-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
select *
from accounts ac join departments dp on ac.department_id = dp.department_id;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
select *
from accounts
where create_date > '2010-12-20';

-- Question 3: Viết lệnh để lấy ra tất cả các developer
select * 
from accounts ac join positions ps on ac.position_id = ps.position_id
where ps.position_name = 'developer';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
select
	dp.department_id, 
    dp.department_name,
	count(ac.account_id) as count_id
from departments dp join accounts ac on dp.department_id = ac.department_id
group by dp.department_id
having count(ac.account_id) > 3;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều
-- nhất
select
	qs.question_id,
    qs.content,
    count(qs.question_id) as count_question
from exam_question eq join questions qs on eq.question_id = qs.question_id
group by eq.question_id
having count_question = (
	select count(question_id)
    from exam_question
    group by question_id
    order by count(question_id) desc
    limit 1
);

-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
select
	cq.category_id,
    cq.category_name,
    count(qs.question_id) as count_qs
from category_question cq join questions qs on cq.category_id = qs.category_id
group by cq.category_id;

-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
select
	questions.content,
	count(exams.exam_id) as count_exams
from questions join exam_question on questions.question_id = exam_question.question_id
join exams on exam_question.exam_id = exams.exam_id
group by questions.question_id;

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất
select
	questions.content,
    count(answers.answer_id) as count_answer
from questions join answers on questions.question_id = answers.question_id
group by questions.question_id
having count_answer = (
    select max(get_max_question.count_answer_id)
    from (
		select count(answer_id) as count_answer_id
        from answers
        group by question_id
    ) as get_max_question
);

-- Question 9: Thống kê số lượng account trong mỗi group
select group_id, count(account_id)
from group_account
group by group_id;

-- Question 10: Tìm chức vụ có ít người nhất
select
	position_name,
	count(accounts.account_id)
from positions left join accounts on positions.position_id = accounts.position_id
group by positions.position_id
having count(accounts.account_id) = (
	select min(get_max_acc.count_account)
    from (
			select count(accounts.account_id) as count_account
			from positions left join accounts on positions.position_id = accounts.position_id
            group by positions.position_id
		) as get_max_acc
);

-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
select
	departments.department_id,
	departments.department_name,
    positions.position_name, count(accounts.account_id)
from accounts join positions on accounts.position_id = positions.position_id join departments on departments.department_id = accounts.department_id
group by departments.department_id, positions.position_id;

-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của
-- question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …
select
	qs.question_id,
	qs.content, tq.type_name,
    ac.full_name, ans.content
from questions qs join type_questions tq on tq.type_id = tq.type_id join accounts ac on qs.creator_id = ac.account_id
join answers ans on qs.question_id = ans.question_id;

-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
select type_questions.type_name, count(questions.question_id) as count_question
from questions join type_questions on questions.type_id = type_questions.type_id
group by type_questions.type_id;

-- Question 14:Lấy ra group không có account nào
-- Question 15: Lấy ra group không có account nào
select gs.group_name, count(ga.account_id) as count_account
from `groups` gs join group_account ga on gs.group_id = ga.group_id
group by gs.group_id
having count_account = 0;

-- Question 16: Lấy ra question không có answer nào.
select qs.content, count(ans.answer_id) as count_answer
from questions qs join answers ans on qs.question_id = ans.question_id
group by qs.question_id
having count_answer = 0;

-- Question 17:
-- a) Lấy các account thuộc nhóm thứ 1
select *
from group_account ga join accounts ac on ga.account_id = ac.account_id
where ga.group_id = 1;

-- b) Lấy các account thuộc nhóm thứ 2
select *
from group_account ga join accounts ac on ga.account_id = ac.account_id
where ga.group_id = 2;

-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau
select *
from group_account ga join accounts ac on ga.account_id = ac.account_id
where ga.group_id = 1
union
select *
from group_account ga join accounts ac on ga.account_id = ac.account_id
where ga.group_id = 2;

-- Question 18:
-- a) Lấy các group có lớn hơn 5 thành viên
select group_id, count(account_id) as count_acc
from group_account
group by group_id
having count_acc > 5;

-- b) Lấy các group có nhỏ hơn 7 thành viên
select group_id, count(account_id) as count_acc
from group_account
group by group_id
having count_acc  < 7;

-- c) Ghép 2 kết quả từ câu a) và câu b).
select group_id, count(account_id) as count_acc
from group_account
group by group_id
having count_acc > 5

union all

select group_id, count(account_id) as count_acc
from group_account
group by group_id
having count_acc  < 7;
