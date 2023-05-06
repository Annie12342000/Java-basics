select * from emp;
select ename,sal,mgr,hiredate,comm from emp;
set pages 200 lines 200;
desc emp;
select col1,col2 from emp;
select * from dept;
select * from bonus;
select * from emp  where ename = 'SCOTT';
select dname,loc from dept;
select 1234||4567 from dept;
select * from dual;
desc dummy;
select sal*12 from emp;
select * from emp where (sal>=1500 and sal <=3000) and (job='SALESMAN' or job='MANAGER');
select ename from emp where ename like 'S%T';
select sal from emp where job like '____S%N';
select empno||ename total from emp;
select ename as empname from emp;
select ename as empname from emp;
select empname from emp; //wrong
select ename,hiredate as joiningdate from emp;
select hiredate as joiningdate from emp;
select hiredate as "joining date and hire" from emp;
select ename,hiredate as joiningdate from emp;
select ename,hiredate as joiningdate from emp;


select * from bonus;


