/*User:用户表*/
create table tbl_user(
us_id        integer primary key,
us_name        varchar(20), /*用户登录名*/
us_blogname     varchar(40), /*博客名*/
us_password     varchar(20), /*密码*/
us_email       varchar(30), /*邮箱*/
us_description    varchar(400), /*描述*/
us_createtime date,              /*创建时间*/ 
us_lastmodifytime date,          /*最后一次修改时间*/
us_delflag    varchar(5)    /*是否删除标志*/
); 

/*blogger:博文*/
create table tbl_blogger(
bl_id     integer primary key,
us_id     integer,/*外键 作者id*/
bl_title      varchar(20),/*博客标题*/
bl_content   clob,          /*博客内容*/
ca_id      integer, /*外键 类别*/
bl_levels    varchar(6), /*公开程度*/
bl_readable    varchar(6), /*是否可评论*/
bl_createtime date, 
bl_delflag    varchar(6)
);

/*用户序列*/
create sequence seq_us start with 1 increment by 1;
/*博文序列*/
create sequence seq_bl start with 1 increment by 1;

/*用户初始数据*/
insert into tbl_user values(seq_us.nextval, '张三', '神马的空间', '123456', null, null, sysdate, sysdate, null);

/*博文初始数据*/
insert into tbl_blogger values(seq_bl.nextval, 1, '第一个博文', '我的第一个博文的内容', null, null, null, sysdate, null);
insert into tbl_blogger values(seq_bl.nextval, 2, '第二个博文', '我的第二个博文的内容', null, null, null, sysdate, null);

