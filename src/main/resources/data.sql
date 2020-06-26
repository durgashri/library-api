drop table if exists category;

create table category(category_id INT AUTO_INCREMENT PRIMARY KEY, category_name VARCHAR(250));

drop table if exists book;

create table book(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(250), author_name VARCHAR(250), 
category_id INT, FOREIGN KEY(category_id) references category(category_id));

insert into category values(1,'Science');
insert into category values(2,'Technology');

insert into book values(1,'Science book 1','Durga',1);
insert into book values(2,'Science book 2','shri',1);

insert into book values(3,'Technology book 1','Durga',2);
insert into book values(4,'Technology book 2','shri',2);