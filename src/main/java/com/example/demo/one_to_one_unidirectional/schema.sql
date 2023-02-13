drop table Country;
select * from Country;
create table Country(
    id UUID primary key,
    name VARCHAR(100) not null
);


drop table Capital;
select * from Capital;
create table Capital(
    id UUID primary key,
    name VARCHAR(100) not null,
    country_id UUID not NULL
);

