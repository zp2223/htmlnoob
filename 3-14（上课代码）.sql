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
 filegrowth=500mb) ��SQL Server�д������ݿ⣬����Ҫ�����£���1�����ݿ�����ΪTest1����2����Ҫ�����ļ����߼��ļ���ΪTest1Data1�������ļ���ΪTest1Data1.mdf����ʼ����Ϊ5MB���������Ϊ10MB��������Ϊ1MB����3����Ҫ�����ļ����߼��ļ���ΪTest1Data2�������ļ���ΪTest1Data2.ndf����ʼ����Ϊ2MB���������Ϊ10MB��������Ϊ1MB������testgroup1�ļ����С���4��������־�ļ����߼��ļ���ΪTest1Log1�������ļ���ΪTest1Log1.ldf����ʼ����Ϊ1MB���������Ϊ5MB��������Ϊ20%��CREATE DATABASE Test1on(name=Test1Data1,filename='d:\db\TestData1.mdf',size=5mb,maxsize=10mb,filegrowth=1mb),filegroup testgroup1(name=Test1Data2,filename='d:\db\TestData2.mdf',size=5mb,maxsize=10mb,filegrowth=1mb)log on(name=Test1Log1,filename='d:\db\Test1Log1.ldf',size=1mb,maxsize=5mb,filegrowth=20%)create database ttdrop database tt,aaacreate table ѧ��(ѧ�� char(11),���� varchar(20))