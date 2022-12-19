# haloed-rings-4228 sb101
This is my Project

![db_diagram](https://user-images.githubusercontent.com/107469553/207512935-2b10e144-322a-40c6-8d47-7dc3ab1881aa.png)




create table students
(
sRoll int primary key auto_increment,
sEmail varchar(25) unique not null,
sPassword varchar(15) NOT NULL,
sName varchar(20) NOT NULL
);

create table admin
(
adminId int primary key auto_increment,
a_name varchar(25) unique not null,
a_Pass varchar(15) NOT NULL

);


create table courses
(
c_id int primary key auto_increment,
c_name varchar(25) unique not null,
fee int NOT NULL,
seats int NOT NULL
);



create table student_course
(
roll int,
course int,
foreign key (roll) references students(sRoll) on delete set null, 
foreign key (course) references courses(c_id) on delete set null
);



create table batch
(
bId int primary key auto_increment,
bname varchar(25),
duration int,
cId int,
seats int,
foreign key (cId) references courses(c_id)  ON DELETE Cascade
);

create table student_batch
(
 roll int,
 course int,
 bid int,
foreign key (roll) references students(sRoll) ON DELETE CASCADE,
foreign key (course) references courses(c_id) ON DELETE CASCADE,
foreign key (bid) references batch(bId) ON DELETE CASCADE
);




insert into students(semail,spassword,sname) values('shyam@mail','shyam','Shyam');


insert into courses(c_name,fee,seats) values('java',500,50);

insert into admin(a_name,a_Pass) values('Shivam','mahadev');

insert into batch(bname,duration,cId,seats) values('Alpha',5,1,500);
