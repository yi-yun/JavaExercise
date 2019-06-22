# 1. 查出至少有一个员工的部门。显示部门编号、部门名称、部门位置、部门人数。
# 3. 列出所有员工的姓名及其直接上级的姓名。
# 4. 列出受雇日期早于直接上级的所有员工的编号、姓名、部门名称。
# 5. 列出部门名称和这些部门的员工信息，同时列出那些没有员工的部门。
# 7. 列出最低薪金大于15000的各种工作及从事此工作的员工人数。
# 8. 列出在销售部工作的员工的姓名，假定不知道销售部的部门编号。
# 9. 列出薪金高于公司平均薪金的所有员工信息，所在部门名称，上级领导，工资等级。
# 10.列出与庞统从事相同工作的所有员工及部门名称。
# 11.列出薪金高于在部门30工作的所有员工的薪金的员工姓名和薪金、部门名称。
# 13.查出年份、利润、年度增长比

# 2. 列出薪金比关羽高的所有员工。
# 6. 列出所有文员的姓名及其部门名称，部门的人数。
# 12.列出每个部门的员工数量、平均工资。



# 1. 查出至少有一个员工的部门。显示部门编号、部门名称、部门位置、部门人数。
select d.deptno, d.dname,d.loc
from dept d;

select deptno,count(*) as cnt
from emp
group by deptno;

select dept.*,t.cnt
from dept inner join 
    (select deptno,count(*) as cnt from emp group by deptno) t 
        on dept.deptno=t.deptno;
# 3. 列出所有员工的姓名及其直接上级的姓名。
select e1.ename,ifnull(e2.ename,'无上级') mgr
from emp e1 left outer join emp e2
on e1.mgr=e2.empno;
# 4. 列出受雇日期早于直接上级的所有员工的编号、姓名、部门名称。
select e1.empno,e1.ename,d.dname
from emp e1 , emp e2,dept d 
where e1.mgr=e2.empno 
  and e1.hiredate<e2.hiredate 
  and e1.deptno=d.deptno;
# 5. 列出部门名称和这些部门的员工信息，同时列出那些没有员工的部门。
select *
from exam.emp e right outer join exam.dept d 
on e.deptno=d.deptno;
# 7. 列出最低薪金大于15000的各种工作及从事此工作的员工人数。
select distinct job,count(*)
from exam.emp
group by job
having min(sal)>15000;
# 8. 列出在销售部工作的员工的姓名，假定不知道销售部的部门编号。
select emp.ename
from exam.emp
where deptno=(select deptno from exam.dept where dname='销售部');
# 9. 列出薪金高于公司平均薪金的所有员工信息，所在部门名称，上级领导，工资等级。
# select e.*,e1.ename,d.dname,s.grade
# from exam.emp e , exam.dept d,exam.emp e1,exam.salgrade s 
# where e.sal>(select avg(sal) from exam.emp) 
#   and e.deptno=d.deptno 
#   and e.mgr=e1.empno
#   and (e.sal between s.losal and s.hisal);
select e.*,e1.ename,d.dname,s.grade
from exam.emp e 
    left outer join exam.dept d on e.deptno=d.deptno
    left outer join exam.emp e1 on e.mgr=e1.empno
    left outer join exam.salgrade s on (e.sal between s.losal and s.hisal)
where e.sal>(select avg(sal) from exam.emp);
# 10.列出与庞统从事相同工作的所有员工及部门名称。
select e.*,d.dname
from exam.emp e,exam.dept d
where d.deptno=e.deptno 
  and e.job=(select job from exam.emp where emp.ename='庞统');
# 11.列出薪金高于在部门30工作的所有员工的薪金的员工姓名和薪金、部门名称。
select e.ename,e.sal,d.dname
from exam.emp e left outer join exam.dept d 
on e.deptno=d.deptno
where e.sal>all (select sal from exam.emp where emp.deptno=30);
# 13.查出年份、利润、年度增长比

# 2. 列出薪金比关羽高的所有员工。
select *
from exam.emp
where sal>(select sal from exam.emp where ename='关羽');
# 6. 列出所有文员的姓名及其部门名称，部门的人数。
select e.ename,d.dname,t.cnt
from exam.emp e 
    left outer join exam.dept d on e.deptno=d.deptno
    inner join (select deptno ,count(*) cnt from exam.emp group by deptno) t on t.deptno=e.deptno
where e.job='文员';
# 12.列出每个部门的员工数量、平均工资。