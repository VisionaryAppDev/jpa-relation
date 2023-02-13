drop table student;
select * from student;
delete from student where 1=1;
create table student (
  id uuid primary key,
  name varchar(100) not null
);


drop table course;
select * from course;
delete from course where 1=1;
create table course (
  id uuid primary key,
  name varchar(100) not null
);


drop table student_course;
select * from student_course;
delete from student_course where 1=1;
create table student_course (
  student_id uuid, -- not null
  course_id uuid, -- not null
  primary key (student_id, course_id)
);