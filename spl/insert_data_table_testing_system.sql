use day_1_testing_system;

insert into departments (department_name)
value ('Sale'),('Marketing'), ('Teacher');

insert into positions (position_name)
value ('Dev'), ('Test'), ('Scrum Master'), ('PM'), ('Sale'), ('Comter'), ('BA'), ('Design');

insert into accounts (email, user_name, full_name, department_id, position_id, create_date)    
value 
	('van@gmail.com', 'van', 'Văn C', 1, 1, '2025-01-15'),
	('nguyena@gmail.com', 'nguyena', 'Nguyễn Văn A', 3, 2, '2025-02-20'),
	('tranb@gmail.com', 'tranb', 'Trần Thị B', 2, 4, '2025-03-10'),
	('hoangd@gmail.com', 'hoangd', 'Hoàng Văn D', 3, 3, '2025-04-05'),
    ('thed@gmail.com', 'thed', 'Thế D', 3, 2, '2025-01-05'),
    ('phungf@gmail.com', 'phungf', 'Phùng F', 3, 5, '2024-04-05'),
    ('dai@gmail.com', 'dai', 'Đại', 3, 4, '2021-04-05'),
    ('dai@gmail.com', 'dai', 'Đại', 3, 4, '2021-04-05'),
	('lephuong@gmail.com', 'lephuong', 'Lê Thị Phương', 1, 3, '2025-05-12');

insert into `groups` (group_name, creator_id, create_date)
value 
	-- ('Java core', 43, '2025-06-01'),
-- 	('Đào tạo test', 45, '2025-06-15'),
--     ('Cách tìm dự án', 43, '2025-06-08'),
--     ('Đào tạo test', 43, '2025-06-10'),
    ('groups 1', 43, '2026-01-15'),
    ('groups 2', 43, '2026-01-15'),
    ('groups 3', 43, '2026-01-15'),
    ('groups 3', 43, '2026-01-15'),
    ('Chia sẻ kinh nghiệm 1', 47, '2022-01-15'),
    ('Chia sẻ kinh nghiệm 2', 43, '2023-01-15'),
    ('Chia sẻ kinh nghiệm 3', 47, '2024-01-15'),
    ('Chia sẻ kinh nghiệm 4', 43, '2025-01-15'),
    ('Chia sẻ kinh nghiệm 5', 42, '2026-01-15'),
    ('Chia sẻ kinh nghiệm 6', 43, '2021-01-15'),
    ('Chia sẻ kinh nghiệm 7', 48, '2020-01-15');
-- 	('Thảo luận chung', 46, '2025-07-01'); 

insert into group_account (group_id, account_id, join_date)
value 
	-- (1, 42, '2025-07-04'),
-- 	(2, 43, '2025-06-20'),
-- 	(4, 44, '2025-06-16'),
-- 	(1, 45, '2025-07-02'),
--     (5, 46, '2026-02-02'),
-- 	(5, 47, '2026-01-25'),
--     (2, 48, '2025-07-05'),
--     (3, 49, '2025-07-05');
    (6, 48, '2025-07-05'),
    (7, 50, '2025-07-05'),
    (8, 52, '2025-07-05'),
    (9, 58, '2025-07-05'),
    (10, 60, '2025-07-05'),
    (11, 48, '2025-07-05'),
    (12, 68, '2025-07-05'),
    (13, 51, '2025-07-05'),
    (3, 60, '2025-07-05'),
    (8, 66, '2025-07-05');

insert into type_questions (type_name)
value ('Essay'), ('Multiple-Choice');

insert into category_question (category_name)
-- value ('Java'), ('SQL'), ('ReactJs'), ('VueJs');
value
	('category_question 1'),
	('category_question 2'),
	('category_question 3'),
    ('category_question 5'),
    ('category_question 6'),
    ('category_question 7'),
    ('category_question 8'),
    ('category_question 9'),
    ('category_question 10');

insert into questions (content, category_id, type_id, creator_id, create_date)
value 
	-- ('Câu hỏi về Java là gì?', 1, 1, 43, '2024-08-01'),
-- 	('SQL có mấy loại Join?', 2, 2, 45, '2024-08-05'),
-- 	('ReactJs là gi?', 3, 1, 48, '2024-08-10'),
-- 	('Ưu điểm của VueJs?', 4, 2, 46, '2024-08-15'),
-- 	('Biến trong VueJs làm gì?', 4, 1, 45, '2024-08-20');
	('questions 1?', 5, 1, 45, '2021-08-20'),
    ('questions 2?', 6, 2, 47, '2022-08-20'),
    ('questions 3?', 7, 1, 46, '2023-08-20'),
    ('questions 4?', 8, 2, 48, '2024-08-20'),
    ('questions 5?', 9, 2, 42, '2025-08-20'),
    ('questions 6?', 10, 1, 43, '2021-08-20'),
    ('questions 7?', 11, 2, 47, '2020-08-20'),
    ('questions 8?', 12, 2, 45, '2021-08-20'),
    ('questions 9?', 13, 1, 48, '2023-08-20'),
    ('questions 10?', 14, 1, 42, '2021-08-20');
    
insert into answers (content, question_id, is_correct)
value 
	-- ('Java là ngôn ngữ hướng đối tượng', 1, 'true'),
-- 	('SQL có 4 loại Join chính', 2, 'true'),
-- 	('ReactJs là thư viện code UI', 3, 'true'),
-- 	('VueJs rất chậm', 4, 'false'),
-- 	('Biến dùng để lưu trữ dữ liệu', 5, 'true');
-- 	('answers 1', 5, 'true'),
--     ('answers 2', 6, 'false'),
--     ('answers 3', 7, 'true'),
--     ('answers 4', 8, 'false'),
--     ('answers 5', 9, 'true'),
--     ('answers 6', 10, 'false'),
--     ('answers 7', 11, 'true'),
--     ('answers 8', 12, 'false'),
--     ('answers 9', 13, 'true'),
--     ('answers 10', 14, 'true');
    ('answers 12', 14, 'true');
    
insert into exams (code, title, category_id, duration, creator_id, create_date)
value 
	-- (101, 'Đề thi Java cơ bản', 1, '01:00:00', 48, '2025-09-01'),
-- 	(102, 'Kiến thức SQL', 2, '00:45:00', 45, '2025-09-05'),
-- 	(103, 'Kiến thức cơ bản về ReactJs', 3, '01:30:00', 43, '2025-09-10'),
--     (103, 'Kiến thức cơ bản về VueJs', 4, '01:30:00', 43, '2025-09-10');
	(104, 'exams 1', 5, '00:30:00', 43, '2020-11-10'),
    (105, 'exams 2', 6, '02:30:00', 43, '2021-12-10'),
    (106, 'exams 3', 7, '00:30:00', 43, '2022-11-10'),
    (107, 'exams 4', 8, '01:30:00', 43, '2023-08-10'),
    (108, 'exams 5', 9, '02:30:00', 43, '2024-09-10'),
    (109, 'exams 6', 10, '01:30:00', 43, '2024-02-10'),
    (110, 'exams 7', 11, '00:30:00', 43, '2025-01-10'),
    (111, 'exams 8', 12, '00:30:00', 43, '2023-02-10'),
    (112, 'exams 9', 13, '01:30:00', 43, '2022-04-10'),
    (113, 'exams 10', 14, '00:15:00', 43, '2025-05-10');
insert into exam_question (exam_id, question_id)
value 
	-- (1, 1),
-- 	(2, 2),
-- 	(3, 3),
-- 	(4, 4);
	(5, 5),
    (6, 6),
    (7, 7),
    (8, 8),
    (9, 9),
    (10, 10),
    (11, 11),
    (12, 12),
    (13, 13),
    (14, 14);