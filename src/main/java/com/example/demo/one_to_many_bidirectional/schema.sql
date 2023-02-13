drop table customer;
select * from customer;
delete from customer where 1=1;
create table customer (
  id uuid primary key,
  name varchar(255) not null
);


drop table feedback;
select * from feedback;
delete from feedback where 1=1;
CREATE TABLE feedback (
    id UUID PRIMARY KEY,
    comment varchar(255) not null,
    customer_id UUID, -- NOT NULL: Set it to not null will cause issue when tried to Cascade save order detail from order repo. It will complain about order_id no null violation.
    foreign key (customer_id) references customer(id)
);

