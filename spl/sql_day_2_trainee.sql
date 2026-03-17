drop table if exists trainings;
create table trainings (
	id int auto_increment primary key,
    name varchar(20)
);

drop table if exists trainee;
create table trainee (
	id int auto_increment primary key,
    full_name nvarchar(30),
    birth_date date,
    gender enum('male', 'female', 'unknown'),
    et_iq tinyint,
    et_gmath tinyint,
    et_english tinyint,
    training_class int,
    evaluation_note varchar(255),
    check (et_iq >= 0 && et_iq <= 20),
    check (et_gmath >= 0 && et_gmath <= 20),
    check (et_english >= 0 && et_english <= 50),
    foreign key (training_class) references trainings(id)
);

alter table trainee add vti_account int not null unique;