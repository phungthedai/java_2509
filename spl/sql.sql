CREATE database dtn_2509_school_mng;
use dtn_2509_school_mng;

create table major (
	id_major int auto_increment primary key,
    name varchar(30),
    id_teacher int,
    create_date date,
    infor_major varchar(250)
);

create table course (
	id_course int auto_increment primary key,
    id_major int,
    course_name varchar(10),
    number_classes int,
    create_date date,
    end_date date
);

create table class (
	id_class int auto_increment primary key,
    id_course int,
    id_teacher int,
    name varchar(10),
    quantity int
);

create table students (
	id_student int auto_increment primary key,
	name varchar(30),
    age int,
    birth date,
    gender enum('Male', 'Female', 'Other'),
    status varchar(20),
    phone int, 
    id_class int,	
    address varchar(255),
    start_date date,
    end_date date
);

create table teachers (
	id_teacher int auto_increment primary key,
    name varchar(30),
    birth date,
    age int,
    address varchar(255),
    status varchar(20),
    gender enum('Male', 'Female', 'Other'),
    phone int,
    department varchar(30),
    id_subject int,
    id_class int,
    start_date date,
    end_date date
);

create table subject (
	id_subject int auto_increment primary key,
    name_subject varchar(20),
    level int
);

create table scores (
	id_score int auto_increment primary key,
    id_student int,
    id_teacher int,
    id_subject int,
    semester int,
    academic_year date,
    score int
);

create table library (
	id_book int,
    id_teacher int,
    id_type_book int
);

create table type_book (
	id_type_book int auto_increment primary key,
    name_type varchar(20),
    id_book int
);

create table books (
	id_book int auto_increment primary key,
    id_type_book int,
	name varchar(20),
    id_author int,
    year date,
    pages int,
    price int
);

create table author (
	id_author int auto_increment primary key,
    name varchar(30),
    age int,
    gender enum('Male', 'Female', 'Other'),
    address varchar(50),
    nationality varchar(20),
    birth date,
    death date
);

create table borrowing_book (
	id_borrowing_book int auto_increment primary key,
    id_student int,
    id_book int,
    status enum("Borrowing","Overdue", "returned"),
    borrowing_start date,
    borrowing_end date,
    crate_date date
);
