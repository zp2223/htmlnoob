create database  teacher
on 
(name=teacher_data,
 filename='d:\db\teacher_data.mdf',
 size=5mb,
 maxsize=10mb,
 filegrowth=15%)
 log on 
(name=teacher_log,
 filename='d:\db\teacher_log.ldf',
 size=500kb,
 maxsize=unlimited,
 filegrowth=500mb) 在SQL Server中创建数据库，具体要求如下：（1）数据库名称为Test1。（2）主要数据文件：逻辑文件名为Test1Data1，物理文件名为Test1Data1.mdf，初始容量为5MB，最大容量为10MB，递增量为1MB。（3）次要数据文件：逻辑文件名为Test1Data2，物理文件名为Test1Data2.ndf，初始容量为2MB，最大容量为10MB，递增量为1MB，放在testgroup1文件组中。（4）事务日志文件：逻辑文件名为Test1Log1，物理文件名为Test1Log1.ldf，初始容量为1MB，最大容量为5MB，递增量为20%。CREATE DATABASE Test1on(name=Test1Data1,filename='d:\db\TestData1.mdf',size=5mb,maxsize=10mb,filegrowth=1mb),filegroup testgroup1(name=Test1Data2,filename='d:\db\TestData2.mdf',size=5mb,maxsize=10mb,filegrowth=1mb)log on(name=Test1Log1,filename='d:\db\Test1Log1.ldf',size=1mb,maxsize=5mb,filegrowth=20%)create database ttdrop database tt,aaacreate table 学生(学号 char(11),姓名 varchar(20))