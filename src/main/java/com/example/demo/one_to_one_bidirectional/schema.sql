drop table employee;
select * from employee;
delete from employee where 1=1;
create table employee(
    id UUID primary key,
    name VARCHAR(100) not null
);


drop table Address;
select * from Address;
delete from Address where 1=1;
create table Address(
    id UUID primary key,
    location VARCHAR(100) not null,

    --- This relation is crucial for the JPA
    employee_id UUID not NULL,
    FOREIGN KEY (employee_id) REFERENCES employee(id)
);