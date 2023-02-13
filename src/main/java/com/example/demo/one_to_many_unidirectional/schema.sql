drop table "order";
select * from "order";
delete from "order" where 1=1;
CREATE TABLE "order" (
    id UUID PRIMARY KEY
);


drop table order_detail;
select * from order_detail;
delete from order_detail where 1=1;
CREATE TABLE order_detail (
    id UUID PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    order_id UUID, -- NOT NULL: Set it to not null will cause issue when tried to Cascade save order detail from order repo. It will complain about order_id no null violation.
    FOREIGN KEY (order_id) REFERENCES "order"(id)
);

