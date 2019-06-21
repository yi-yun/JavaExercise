SELECT deptno, dname, loc
FROM exam.dept;
SELECT NOW();
SELECT * 
FROM exam.emp;
-- 1. 查询出部门编号为30的所有员工
SELECT *
FROM exam.emp
WHERE deptno=30;
-- 2. 所有销售员的姓名、编号和部门编号。
SELECT ename,empno,deptno
FROM exam.emp
WHERE job='销售员';
-- 3. 找出奖金高于工资的员工。
SELECT *
FROM exam.emp
WHERE COMM>sal;
-- 4. 找出奖金高于工资60%的员工。
SELECT *
FROM exam.emp
WHERE COMM>sal*0.6;
-- 5. 找出部门编号为10中所有经理，和部门编号为20中所有销售员的详细资料。
SELECT * 
FROM exam.emp
WHERE (deptno=10 AND job='经理') OR (deptno=20 AND job='销售员');
-- 6. 找出部门编号为10中所有经理，部门编号为20中所有销售员，还有即不是经理又不是销售员但其工资大或等于20000的所有员工详细资料。
SELECT * 
FROM exam.emp
WHERE (deptno=10 AND job='经理') OR (deptno=20 AND job='销售员') OR (job not IN('经理','销售员') AND sal>=20000);
-- 8. 无奖金或奖金低于1000的员工。
SELECT *
FROM exam.emp
WHERE COMM<1000 OR COMM IS NULL;
-- 9. 查询名字由三个字组成的员工。
SELECT *
FROM exam.emp
WHERE ename LIKE '___';
-- 10.查询2000年入职的员工。
SELECT *
FROM exam.emp
WHERE hiredate LIKE '2000-%';
-- 11. 查询所有员工详细信息，用编号升序排序
SELECT *
FROM exam.emp
ORDER BY empno ASC;
-- 12. 查询所有员工详细信息，用工资降序排序，如果工资相同使用入职日期升序排序
SELECT *
FROM exam.emp
ORDER BY sal ASC , hiredate DESC;
-- 13. 查询每个部门的平均工资
SELECT deptno,AVG(sal)
FROM exam.emp
GROUP BY deptno;
-- 14. 查询每个部门的雇员数量。
SELECT deptno,COUNT(*1)
FROM exam.emp
GROUP BY deptno;
-- 15. 查询每种工作的最高工资、最低工资、人数
SELECT job ,MAX(sal),MIN(sal),COUNT(*)
FROM exam.emp
GROUP BY job;
-- 16. 显示非销售人员工作名称以及从事同一工作雇员的月工资的总和，并且要满足从事同一工作的雇员的月工资合计大于50000，输出结果按月工资的合计升序排列
SELECT job,SUM(sal)
FROM exam.emp
WHERE job not IN ('销售员') 
GROUP by job
HAVING SUM(sal)>50000;
-- 7. 有奖金的工种。
SELECT job
FROM exam.emp
GROUP BY job
HAVING COUNT(COMM)>0;