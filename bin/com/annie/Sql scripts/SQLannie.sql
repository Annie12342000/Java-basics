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
select ename,sal from emp;
select ename,sal,sal+500 from emp;
select ename,job,sal+(sal*10/100) from emp;
select ename,sal*12 from emp;
select 'super'||'man' from dual;
select ename ||''||job from emp;
select ename ||'working as a '||job from emp;
select ename  || 'working in dept'||deptno || 'and getting a salary of'||sal from emp;
select * from emp;
select ename || 'joining the company' || hiredate || 'working in a dept' || deptno || 'and reporting manager' || mgr from emp;
select ename,job from emp where ename = 'SMITH';
select * from emp where sal > 2000;
select * from emp where job != 'CLERK';
SELECT * FROM EMP WHERE DEPTNO = 30;
SELECT * FROM EMP WHERE ENAME = 'SMITH' OR ENAME = 'WARD' OR ENAME = 'ALLEN';
SELECT * FROM EMP WHERE JOB = 'MANAGER' AND JOB = 'SALESMAN';
SELECT * FROM EMP WHERE JOB = 'MANAGER' AND ENAME = 'JONES';
SELECT * FROM EMP WHERE JOB = 'MANAGER' OR JOB = 'CLERK' AND SAL >=1000 AND SAL <=3000;
SELECT * FROM EMP WHERE (ENAME = 'SMITH' OR ENAME = 'ALLEN' OR ENAME = ' WARD' OR ENAME = 'BLAKE' ) AND (DEPTNO = 10 OR DEPTNO =20 OR DEPTNO = 30) AND (SAL >=500 AND SAL <=3000) ;
SELECT * FROM EMP WHERE (SAL >2000 AND SAL < 4500) AND (DEPTNO = 10 OR DEPTNO = 30);
SELECT * FROM EMP WHERE (HIREDATE >= '01-JAN-80' AND HIREDATE<= '01-JAN-83' ) AND (JOB = 'SALESMAN' OR JOB = 'CLERK');
SELECT * FROM EMP WHERE (JOB = 'CLERK' OR JOB = 'MANAGER' OR JOB = 'SALESMAN') AND (DEPTNO =10 OR DEPTNO =20 OR DEPTNO =30) AND (ENAME!='SMITH');
SELECT * FROM EMP WHERE JOB IN ('SALESMAN','CLERK','MANAGER');
SELECT * FROM EMP WHERE ENAME IN ( 'SMITH' , 'ALLEN','WARD','SCOTT') AND DEPTNO IN (10,20,30);
SELECT ENAME FROM EMP WHERE ENAME LIKE 'S%H'; 
SELECT ENAME FROM EMP WHERE ENAME LIKE 'A_L_%';
SELECT JOB FROM EMP WHERE ENAME LIKE '__I%H';
SELECT JOB FROM EMP WHERE ENAME LIKE '______E%T';
SELECT DNAME FROM DEPT WHERE DNAME LIKE 'A_______N_';
SELECT MGR FROM EMP WHERE MGR LIKE '7%8';
SELECT * FROM EMP WHERE HIREDATE LIKE '%dec%';
SELECT SAL FROM EMP WHERE SAL BETWEEN 200 AND 3000;
SELECT HIREDATE FROM EMP WHERE HIREDATE BETWEEN '01-JAN-80' AND '01-JAN-83';
SELECT ENAME FROM EMP WHERE ENAME BETWEEN 'N' AND 'W';
SELECT * FROM EMP WHERE MGR IS NULL;
INSERT INTO DEPT VALUES(50,'DEVI','INDIA');
INSERT INTO EMP VALUES (131,'MODI','PM',0000,'03-SEP-6589',9999,0,50);
SELECT * FROM EMP;
INSERT INTO EMP VALUES(1212,'RAM',NULL,NULL,NULL,NULL,NULL);
UPDATE EMP SET SAL =6000,JOB = 'MANAGER' WHERE ENAME = 'ALLEN';
select *from emp;
update emp set  mgr = 1000,hiredate = '05-jan-83', sal = 50000,deptno =30 where empno = 7369;
select * from emp;
update emp set sal = sal *1.1 where job = 'SALESMAN';
select * from emp where job = 'SALESMAN';
SELECT * FROM EMP;
ROLLBACK TO SAVEPOINT;
INSERT INTO BONUS VALUES('RAVI','CLERK',20000,700); 
INSERT INTO BONUS VALUES('RAVI','CLERK',20000,700); 
INSERT INTO BONUS VALUES('RAVI','CLERK',20000,700); 
INSERT INTO BONUS VALUES('RAVI','CLERK',20000,700); 
INSERT INTO BONUS VALUES('RAVI','CLERK',20000,700);
INSERT INTO BONUS VALUES('UTFUF','CLERK',800,40);
INSERT INTO BONUS VALUES('ANI','CLERK',2500,30);
UPDATE BONUS SET SAL = SAL + 20;
SAVEPOINT A;
SELECT * FROM BONUS;
DELETE FROM EMP WHERE ENAME = 'SMITH';
SELECT * FROM EMP;
DELETE FROM EMP WHERE DEPTNO = 30;
SELECT * FROM EMP;
INSERT INTO BONUS VALUES ('aaa','manager',500500,2000);
select * from bonus;
savepoint c ;
select * from bonus;
rollback to savepoint c;
INSERT into BONUS VALUES ('ANUUU', 'CLERK',7690,7087);
SAVEPOINT B;
SELECT  * FROM BONUS;
select * from emp;
select abs(-123) from dual;
select mod (123,2) from dual;
select mod(123,5) from dual;
select mod(18,4)from dual; 
select sqrt(121) from dual;
select sal,sqrt(sal) from emp;
select power(5,3) from dual;
select floor(4.4) from dual;
select ceil(8.9) from dual;
select round(4.9) from dual;
select ename,length(ename) from emp;
select loc,length(loc) from dept;
select * from dept;
select length('1732873') from dual;
select length('___HELLO__') from dual;
select job,length(job),ename,length(ename) from emp;
select upper('superman') from dual;
select ename, lower(ename) from emp;
select trim('hello') from dual;
select substr('good morning',5) from dual;
select substr('good morning',-5) from dual;
select ename,substr(ename,1,3) from emp;
select replace('apple','p','z')from dual;
select replace('good morning','o') from dual;
select ename,replace('m','s') from emp;
select sysdate from dual;
select sessiontimezone from dual;
select time;
select months_between('12-sep-22','01-jan-22') from dual;
select ename,months_between(current_date,hiredate)/12 from emp;
select to_date('01/05/22','mm/dd/yy') from dual;
select count(*) from emp ;
select sal,ename from emp order by sal desc,ename desc;
select ename from emp where ename in ('SMITH','SCOTT','ALLEN','WARD','KING') ORDER BY ENAME desc;
select * from emp where rownum<=5;
select * from emp where sal = (select min(sal) from emp);
select * from emp where hiredate = (select max(hiredate) from emp);
select * from emp where deptno = (select deptno from dept where dname = 'SALES');
select * from emp where empno = (select mgr from emp where ename ='ALLEN');
select * from emp; 
SELECT LOC FROM DEPT WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'SMITH');
SELECT DNAME,LOC FROM DEPT WHERE DEPTNO IN (SELECT DEPTNO FROM EMP WHERE ENAME IN('SCOTT','ALLEN'));
SELECT ENAME,EMPNO FROM EMP WHERE JOB = 'CLERK' AND SAL = (SELECT MAX(SAL) FROM EMP WHERE JOB = 'CLERK' );
SELECT ENAME,SAL FROM EMP WHERE JOB = 'SALESMAN'AND SAL > (SELECT MAX(SAL) FROM EMP WHERE JOB = 'CLERK');
CREATE TABLE STUDENT
(STUID NUMBER(4) PRIMARY KEY, 
SNAME VARCHAR(20) NOT NULL, 
AGE NUMBER(2) CHECK (AGE>=22), 
GENDER VARCHAR(20) CHECK (GENDER IN ('M','F')),
COUNTRY VARCHAR(20) DEFAULT 'INDIA');
SELECT * FROM STUDENT;
INSERT INTO STUDENT VALUES(101,'ANNIE',22,'F','USA') ;
COMMIT;
ALTER TABLE STUDENT 
MODIFY COUNTRY VARCHAR(20) DEFAULT 'INDIA';
COMMIT;
INSERT INTO STUDENT VALUES(11,'ANN',23,'F',DEFAULT) ;
CREATE TABLE COUR (CID NUMBER(4) PRIMARY KEY,
CNAME VARCHAR(20) NOT NULL,
TRAINER VARCHAR(20));
INSERT INTO COUR VALUES(1,'JAVA','RAVEE');
INSERT INTO COUR VALUES(2,'HTML','KSA');
INSERT INTO COUR VALUES(3,'SQL','GREE');
INSERT INTO COUR VALUES(4,'JDBC','ABHI');
SELECT * FROM COUR;
select emp.ename,student.sname from emp,student;
SELECT EMP.ENAME,STUDENT.SNAME FROM EMP,STUDENT WHERE ENAME = 'SMITH';



SELECT E.ENAME,S.SNAME FROM EMP E CROSS JOIN STUDENT S WHERE E.ENAME = 'SMITH';
SELECT S.SNAME,C.* FROM STUDENT S ,COUR C WHERE S.SNAME = 'RAVI';

grant select on jobs to SCOTT; 

CREATE TABLE TRANSPORT( BUSES_id int primary key,passengers int, route varchar(255),
road varchar(255));
select * from transport;
select student.sname,student.cid,cour.cid,cour.cname from student s right join cour c on student.cid=cour.cid;
CREATE TABLE P1 ((p_id number(4) primary key,
p_name varchar(2@) not null,
trainer varchar(2@) not null));


