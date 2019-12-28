drop database if exists mallanlisb;
create database mallanlisb;
use mallanlisb;
create table `Admin`(
  id int auto_increment,
  loginName varchar(255),
  password varchar(64),
  lastLoginTime datetime,
  remark  varchar(255),
  primary key (id)
);


create table `Book`(
  id int auto_increment,
  name varchar(255),
  price double,
  author varchar(255),
  creatorId int ,
  remark  varchar(255),
  primary key (id)
);
-- 附件
create table `imgFile`(
  id int auto_increment,
  bookId int,
  saveName varchar(255),
  originalName varchar(255),
  contentType varchar(255),
  path int ,
  size bigint,
  createTime datetime,
  remark  varchar(255),
  primary key (id)
);







