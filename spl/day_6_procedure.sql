-- 1. viết hàm tính tổng 3 số thập phân
delimiter $$
create procedure tongSoThapPhan(in so1 decimal(10,2), in so2 decimal(10,2), in so3 decimal(10,2), out tong decimal(10,2))
	begin
		set tong = so1 + so2 + so3;
	end$$
delimiter ;

call tongSoThapPhan(5.1, 5.6, 100.4, @tong);
select @tong;

-- 2. viết hàm tìm kiếm tên phòng ban theo id
delimiter $$
create procedure getDepartmentById(in departmentId int, out departmentName varchar(30))
	begin
		select department_name into departmentName
        from departments
        where department_id = departmentId;
	end$$
delimiter ;

call getDepartmentById(1, @departmentName);
select @departmentName;

-- 3. viết hàm lấy ra sô lượng câu trả lời dựa vào id của câu hỏi
delimiter $$
create procedure listAnswersByQuestionId(in questionId int, out listAnswers int)
	begin
		select count(answer_id) into listAnswers
        from answers
        where question_id = questionId
        group by question_id;
	end$$
delimiter ;

call listAnswersByQuestionId(14, @listAnswers);
select @listAnswers;

-- 4. viết hàm lấy ra nội dung của câu hỏi được tạo gần đây nhất dựa vào categoryId
delimiter $$
create procedure getContentByCategoryId(in categoryId int, out contentAnswers varchar(255))
	begin
		select content into contentAnswers
        from questions
        where create_date = (
			select max(create_date)
            from questions
            where category_id = categoryId
        ) and category_id = categoryId;
	end$$
delimiter ;

call getContentByCategoryId(14, @contentAnswers);
select @contentAnswers;










-- 1. viết hàm tính tổng 3 số thập phân
delimiter $$
create function tongSoThapPhan(so1 decimal(10,2), so2 decimal(10,2), so3 decimal(10,2)) returns decimal(10,2)
	deterministic
	begin
		declare tong  decimal(10,2);
		set tong = so1 + so2 + so3;
        return so1 + so2 + so3;
	end$$
delimiter ;
select tongSoThapPhan(5.1, 5.6, 100.4);

-- 2. viết hàm tìm kiếm tên phòng ban theo id
delimiter $$
create function getDepartmentById(departmentId int) returns varchar(30)
	deterministic
	begin
		declare departmentName varchar(30);
		select department_name into departmentName
        from departments
        where department_id = departmentId;
        return departmentName;
	end$$
delimiter ;
select getDepartmentById(1);

-- 3. viết hàm lấy ra sô lượng câu trả lời dựa vào id của câu hỏi
delimiter $$
create function listAnswersByQuestionId(questionId int) returns int
	deterministic
	begin
		declare listAnswers int;
		select count(answer_id) into listAnswers
        from answers
        where question_id = questionId;
        return listAnswers;
	end$$
delimiter ;
select listAnswersByQuestionId(14);

-- 4. viết hàm lấy ra nội dung của câu hỏi được tạo gần đây nhất dựa vào categoryId
delimiter $$
create function getContentByCategoryId(categoryId int) returns varchar(255)
	deterministic
	begin
		declare contentAnswers varchar(255);
		select content into contentAnswers
        from questions
        where create_date = (
			select max(create_date)
            from questions
            where category_id = categoryId
        ) and category_id = categoryId;
        return contentAnswers;
	end$$
delimiter ;
select getContentByCategoryId(14);






-- 1, thiêt kế cơ sở dữ liệu bảng sản phẩm và danh mục sản phẩm (category), sản phẩm chỉ có 1 danh mục, danh mục được phép có nhiều sản phẩm

-- no action
create table products (
	id int primary key not null auto_increment,
    product_name varchar(50)
);
insert into products (product_name)
value ('điện thoại');

create table categorys (
	id int primary key not null auto_increment,
    creator_name varchar(20),
    product_id int,
    foreign key (product_id) references products(id)
);
insert into categorys (product_id)
value ('dai', 1);

delete from products where id = 1;

-- cascade
drop table products;
drop table categorys;
create table products (
	id int primary key not null auto_increment,
    product_name varchar(50)
);
insert into products (product_name)
value ('điện thoại');

create table categorys (
	id int primary key not null auto_increment,
    creator_name varchar(20),
    product_id int,
    foreign key (product_id) references  products(id) on delete cascade
);
insert into categorys (product_id)
value ('dai', 1);

delete from products where id = 1;

-- set null
drop table products;
drop table categorys;
create table products (
	id int primary key not null auto_increment,
    product_name varchar(50)
);
insert into products (product_name)
value ('điện thoại');

create table categorys (
	id int primary key not null auto_increment,
    creator_name varchar(20),
    product_id int null,
    foreign key (product_id) references products(id) on delete set null
);
insert into categorys (product_id)
value ('dai', 1);

delete from products where id = 1;

-- --------------------------------------------------------------------------------------------------------------------------------
-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó.
delimiter $$
create procedure getAccountByDepartmmentName(in departmmentName varchar(255))
	deterministic
	begin
		select *
        from accounts join departments on accounts.department_id = departments.department_id
        where department_name = departmmentName;
	end$$
delimiter ;
call getAccountByDepartmmentName('sale');

-- Question 2: Tạo store để in ra số lượng account trong mỗi group.
delimiter $$
create procedure getAccountByGroup()
	deterministic
	begin
		select  group_id, count(account_id)
        from group_account
        group by group_id;
	end$$
delimiter ;
call getAccountByGroup();

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại.
delimiter $$
create procedure getQuestionsByTypeInMonth()
	deterministic
	begin
		select  type_id, count(question_id)
        from questions
        where month(create_date) = month(curdate())
        group by type_id;
	end$$
delimiter ;
call getQuestionsByTypeInMonth();

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất.
DROP FUNCTION IF EXISTS getMaxQuestion;
delimiter $$
create function getMaxQuestion() returns int
	deterministic
	begin
		declare maxCountQuestion int;
		select type_id into maxCountQuestion
        from questions
        group by type_id
        having count(question_id) = (
			select count(question_id) as count_question
            from questions
            group by type_id
            order by count_question desc
            limit 1
        );
        return maxCountQuestion;
	end$$
delimiter ;
select getMaxQuestion();

-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question.
set @type_id = getMaxQuestion();

select type_name
from type_questions
where type_id = @type_id

-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào.
delimiter $$
create procedure getGroupOrUserByString(in search_string varchar(255))
	deterministic
	begin
		if exists (select * from `groups` where group_name like concat('%', search_string, '%')) then
			select * from `groups` where group_name like concat('%', search_string, '%');
        else
			select * from accounts where full_name like concat('%', search_string, '%');
        end if;
	end$$
delimiter ;
call getGroupOrUserByString('Java');

-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán:
-- username sẽ giống email nhưng bỏ phần @..mail đi
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ
-- Sau đó in ra kết quả tạo thành công
delimiter $$
create procedure getGroupOrUserByString(in fullName varchar(255), in emailIn varchar(255))
	deterministic
	begin
		set @username = substring_index2(emailIn, '@', 1);
        set @positionID = (
			select position_id
            from positions
            where position_name = 'Dev'
        );
        set @departmentID = (
			select position_id
            from positions
            where position_name = 'Dev'
        );
        set @createDate = date(now());
        insert into accounts (email, user_name, full_name, department_id, position_id, create_date)
        values (emailIn, @username, fullName, @departmentID, @positionID, @createDate);
        
        select *
        from accounts
        where full_name = fullName and user_name = @username and email = emailIn and position_id = @positionID and create_date = @createDate;
	end$$
delimiter ;
call getGroupOrUserByString('Java');

-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất
delimiter $$
create procedure getMaxlengContent(in search_string varchar(50))
	deterministic
	begin
		select *
        from type_questions t
        join questions q on t.type_id = q.type_id
        where t.type_name = search_string and length(q.content) = (
			select length(q.content)
			from type_questions t
            join questions q on t.type_id = q.type_id
            where t.type_name = search_string
            order by length(q.content) desc
            limit 1
        );
	end$$
delimiter ;
call getMaxlengContent('Essay');

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
delimiter $$
create procedure deleteExamById(in idExam int)
	deterministic
	begin
		delete from exams
        where exam_id = idExam;
	end$$
delimiter ;
call deleteExamById(1);

-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa) Sau đó in số lượng record đã remove từ các table liên quan trong khi removing
-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc
-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay
-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng")
