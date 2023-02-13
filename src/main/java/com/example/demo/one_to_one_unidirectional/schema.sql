drop table Country;
select * from Country;
create table Country(
    id UUID primary key,
    name VARCHAR(100) not null,
    capital_id UUID references capital(id)
);


drop table Capital;
select * from Capital;
create table Capital(
    id UUID primary key,
    name VARCHAR(100) not null
);

