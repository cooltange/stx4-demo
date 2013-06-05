create table student(
	sno varchar2(10) primary key,
	sname varchar2(20),
	sage number(3),
	ssex varchar2(5)
);

/*******初始化学生表的数据******/
insert into student values ('s001','张三',23,'男');
insert into student values ('s002','李四',23,'男');
insert into student values ('s003','吴鹏',25,'男');
insert into student values ('s004','琴沁',20,'女');
insert into student values ('s005','王丽',20,'女');
insert into student values ('s006','李波',21,'男');
insert into student values ('s007','刘玉',21,'男');
insert into student values ('s008','萧蓉',21,'女');
insert into student values ('s009','陈晓',23,'女');
insert into student values ('s010','张1',22,'女');
insert into student values ('s011','张2',23,'女');
insert into student values ('s012','张3',24,'女');
insert into student values ('s013','张4',25,'女');
insert into student values ('s014','张5',26,'女');
insert into student values ('s015','张6',27,'女');
insert into student values ('s016','张7',28,'女');
insert into student values ('s017','张8',29,'女');
insert into student values ('s018','张9',30,'女');
insert into student values ('s019','张10',31,'女');
insert into student values ('s020','张11',32,'女');
insert into student values ('s021','张12',33,'女');
insert into student values ('s022','张13',34,'女');
insert into student values ('s023','张14',35,'女');
insert into student values ('s024','张15',36,'女');
insert into student values ('s025','张16',37,'女');
insert into student values ('s026','张17',38,'女');
insert into student values ('s027','张18',39,'女');
insert into student values ('s028','张19',40,'女');
insert into student values ('s029','张20',41,'女');
insert into student values ('s030','李1',22,'男');
insert into student values ('s031','李2',23,'男');
insert into student values ('s032','李3',24,'男');
insert into student values ('s033','李4',25,'男');
insert into student values ('s034','李5',26,'男');
insert into student values ('s035','李6',27,'男');
insert into student values ('s036','李7',28,'男');
insert into student values ('s037','李8',29,'男');
insert into student values ('s038','李9',30,'男');
insert into student values ('s039','李10',31,'男');
insert into student values ('s040','李11',32,'男');
insert into student values ('s041','李12',33,'男');
insert into student values ('s042','李13',34,'男');
insert into student values ('s043','李14',35,'男');
insert into student values ('s044','李15',36,'男');
insert into student values ('s045','李16',37,'男');
insert into student values ('s046','李17',38,'男');
insert into student values ('s047','李18',39,'男');
insert into student values ('s048','李19',40,'男');
insert into student values ('s049','李20',41,'男');

commit;