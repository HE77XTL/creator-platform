DROP TABLE IF EXISTS article;

create table article
(
    id          int           not null primary key auto_increment,
    title       varchar(100),
    summary     varchar(1000),
    create_time datetime,
    modify_time datetime
);