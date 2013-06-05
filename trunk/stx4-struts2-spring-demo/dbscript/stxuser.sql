create table STXUSER
(
  usid      INTEGER primary key,
  password  VARCHAR2(20),
  uname     VARCHAR2(20),
  loginname VARCHAR2(20)
);

/*******初始化用户的数据******/
insert into STXUSER (usid, password, uname, loginname)
values (1, 'admin', '管理员', 'admin');
insert into STXUSER (usid, password, uname, loginname)
values (2, '1234', '张三', 'user1');
insert into STXUSER (usid, password, uname, loginname)
values (3, '1234', '李四', 'user2');
commit;