CREATE database if not exists dtn_2509_school_mng;
use day_1_testing_system;

create table departments (
	department_id int auto_increment primary key,
    department_name varchar(30)
);

create table positions (
	position_id int auto_increment primary key,
    position_name enum('Dev', 'Test', 'Scrum Master', 'PM', 'Sale', 'Comter', 'BA', 'Design')
);

create table accounts (
	account_id int auto_increment primary key,
	email varchar(50),
    user_name varchar(20),
    full_name varchar(30),
    department_id int,
    position_id int,
    create_date date,
    foreign key (position_id) references positions(position_id),
    foreign key (department_id) references departments(department_id)
);

create table `groups` (
	group_id int auto_increment primary key,
    group_name varchar(30),
    creator_id int,
    create_date date,
    foreign key (creator_id) references accounts(account_id)
);

create table group_account (
	group_id int,
    account_id int,
    join_date date,
	foreign key (group_id) references `groups`(group_id),
	foreign key (account_id) references accounts(account_id)
);

create table type_questions (
	type_id int auto_increment primary key,
    type_name enum('Essay', 'Multiple-Choice')
);

create table category_question (
	category_id int auto_increment primary key,
    category_name varchar(20)
);

create table questions (
	question_id int auto_increment primary key,
    content varchar(225),
    category_id int,
    type_id int,
    creator_id int,
    create_date date,
    foreign key (category_id) references category_question(category_id),
    foreign key (type_id) references type_questions(type_id),
    foreign key (creator_id) references accounts(account_id)
);

create table answers (
	answer_id int auto_increment primary key,
    content varchar(225),
    question_id int,
    is_correct enum('true', 'false'),
    foreign key (question_id) references questions(question_id)
);

create table exams (
	exam_id int auto_increment primary key,
    code int,
    title varchar(50),
    category_id int,
    duration time,
    creator_id int,
    create_date date,
    foreign key (category_id) references category_question(category_id),
    foreign key (creator_id) references accounts(account_id)
);

create table exam_question (
	exam_id int,
    question_id int,
    foreign key (exam_id) references exams(exam_id),
    foreign key (question_id) references questions(question_id)
);

