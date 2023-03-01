

create table Employee_Details(
    emp_id number(5),
    emp_name varchar2(20),
    job_name varchar2(20),
    manager_id number(5),
    hire_date date,
    salary number(5),
    dep_id number(5)
   ); 
   

insert into Employee_Details values (68319,'Mr Singh','President',68319,'18-nov-2018',6000,1001);
insert into Employee_Details values (68320,'Mr khan','vice manager',68320,'20-mar-2018',5000,1015);
insert into Employee_Details values (68325,'Mr Sharma','floor manager',68325,'07-feb-2020',3000,1019);
insert into Employee_Details values (68339,'Mr varma','floor manager',68339,'08-nov-2020',3000,1020);
insert into Employee_Details values (68420,'vamsi','observer',68420,'01-mar-2022',1000,1023);
insert into Employee_Details values (69425,'alan','designer',69425,'02-dec-2022',1000,1024);
insert into Employee_Details values (66892,'justin','front-end dev',66892,'02-jun-2022',1000,1025);
insert into Employee_Details values (66890,'ed','back-end dev',66890,'22-jun-2022',1000,1026);
insert into Employee_Details values (66883,'emeniem','SDE',66883,'23-jun-2022',1000,1027);
insert into Employee_Details values (66452,'raj','SDE',66452,'23-jun-2022',1200,1028); 


select salary from Employee_Details;

Select DISTINCT emp_id from Employee_Details;

update Employee_Details set salary = 7000 where emp_name = 'raj';




