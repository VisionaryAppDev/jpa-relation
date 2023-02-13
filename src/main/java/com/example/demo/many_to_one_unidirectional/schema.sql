drop table post;
select * from post;
delete from post where 1=1;
CREATE TABLE post (
    id UUID PRIMARY KEY,
    title VARCHAR(100) NOT NULL
);


drop table comment;
select * from comment;
delete from comment where 1=1;
CREATE TABLE comment (
    id UUID PRIMARY KEY,
    content VARCHAR(1000) NOT NULL,
    post_id UUID NOT NULL,
    FOREIGN KEY (post_id) REFERENCES post(id)
);