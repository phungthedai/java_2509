CREATE database dtn_2509_school_mng;
use dtn_2509_school_mng;

create table students (
	id int auto_increment primary key,
	name_student varchar(30) not null,
    age int,
    birth date,
    gender enum('Male', 'Female', 'Other'),
    status_student varchar(20),
    phone int, 
    id_class int not null,
    address varchar(255),
    start_date date not null,
    end_date date
);

create table teachers (
	id int auto_increment primary key,
    name_teacher varchar(30) not null,
    birth date,
    age int,
    address varchar(255),
    status_teacher varchar(20),
    gender enum('Male', 'Female', 'Other'),
    phone int,
    department varchar(30) not null,
    id_subject int not null,
    id_class int,
    start_date date not null,
    end_date date,
    foreign key (id_class) references class(id)
);

create table major (
	id int auto_increment primary key,
    name_major varchar(30) not null,
    id_teacher int,
    create_date date,
    infor_major varchar(250),
    foreign key (id_teacher) references teachers(id)
);

create table course (
	id int auto_increment primary key,
    id_major int not null,
    course_name varchar(10),
    number_classes int,
    create_date date,
    end_date date,
    foreign key (id_major) references major(id)
);

create table class (
	id int auto_increment primary key,
    id_course int not null,
    id_teacher int,
    `name` varchar(10),
    quantity int,
    foreign key (id_course) references course(id),
    foreign key (id_teacher) references teachers(id)
);

create table subject (
	id int auto_increment primary key,
    name_subject varchar(20) not null,
    level int
);

create table scores (
	id int auto_increment primary key,
    id_student int not null,
    id_teacher int not null,
    id_subject int not null,
    semester enum('KI1', 'KI2') not null,
    academic_year date not null,
    score int,
    check (score >= 0 && score <= 10),
    foreign key (id_student) references students(id),
    foreign key (id_teacher) references teachers(id),
	foreign key (id_subject) references subject(id)
);

create table library (
	id int auto_increment primary key,
    person varchar(30)
);

create table type_book (
	id int auto_increment primary key,
    name_type varchar(20),
    quantity int
);

create table author (
	id int auto_increment primary key,
    name varchar(30),
    age int,
    gender enum('Male', 'Female', 'Other'),
    address varchar(50),
    birth_date date,
    death_date date
);

create table books (
	id int auto_increment primary key,
    id_type_book int,
	name varchar(20),
    id_author int,
    year date,
    pages int,
    price int,
    foreign key (id_type_book) references type_book(id),
    foreign key (id_author) references author(id)
);

create table borrowing_book (
	id int auto_increment primary key,
    id_student int not null,
    id_book int not null,
    status enum("Borrowing","Overdue", "returned"),
    borrowing_start date not null,
    borrowing_end date not null,
    crate_date date,
    foreign key (id_student) references students(id),
    foreign key (id_book) references books(id)
);
