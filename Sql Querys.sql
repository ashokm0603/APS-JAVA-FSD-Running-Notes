create database apsce_students_db;

use apsce_students_db;
create table universites(
                      id int primary key,
                      uname varchar(35) not null,
                      address varchar(50) default 'bengalore',
                      ucode varchar(7) unique ,
                      numbersOfBranch int check(numbersOfBranch>0) );


INSERT INTO universites
VALUES
(101, 'JNTU', 'Vijayawada', 'jnt001', 8),
(102, 'Sathyabama', 'Chennai', 'sat002', 2),
(103, 'Anna University', 'Chennai', 'ann003', 5),
(104, 'VIT University', 'Vellore', 'vit004', 6),
(105, 'SRM University', 'Chennai', 'srm005', 4),
(106, 'Osmania University', 'Hyderabad', 'osm006', 7),
(107, 'Kakatiya University', 'Warangal', 'kak007', 3),
(108, 'Andhra University', 'Visakhapatnam', 'and008', 5),
(109, 'KL University', 'Vijayawada', 'klu009', 4),
(110, 'Gitam University', 'Visakhapatnam', 'git010', 3),
(111, 'Bangalore University', 'Bangalore', 'ban011', 6),
(112, 'Christ University', 'Bangalore', 'chr012', 5),
(113, 'Jain University', 'Bangalore', 'jai013', 4),
(114, 'Mysore University', 'Mysore', 'mys014', 7),
(115, 'Pune University', 'Pune', 'pun015', 6),
(116, 'Mumbai University', 'Mumbai', 'mum016', 8),
(117, 'Delhi University', 'Delhi', 'del017', 5),
(118, 'Amity University', 'Noida', 'ami018', 9),
(119, 'Manipal University', 'Manipal', 'man019', 6),
(120, 'SR University', 'Warangal', 'sru020', 3);    

SELECT * FROM universites;


create table colleges(
	cid int primary key,
    cname varchar(30) not null,
    ccode varchar(6) unique,
    address varchar(50) default 'india',
    uid int ,
    foreign key (uid) 
    references universites(id)
);


-- inserting values into college table 

INSERT INTO colleges
VALUES
(1,  'APS College of Engineering',       'APS001', 'Somanahalli',     101),
(2,  'RV Institute of Technology',       'RVIT02', 'Guntur',          102),
(3,  'SM College of Engineering',        'SMCE03', 'Nelamangala',     101),
(4,  'Sathyabama Medical College',      'SMC004', 'Chennai',          103),
(5,  'VIT College of Engineering',       'VIT005', 'Vellore',          104),
(6,  'SRM Institute of Science',         'SRM006', 'Chennai',          105),
(7,  'Osmania Engineering College',      'OEC007', 'Hyderabad',        106),
(8,  'Kakatiya College of Eng',  'KCE008', 'Warangal',         107),
(9,  'Andhra Engineering College',       'AEC009', 'Visakhapatnam',    108),
(10, 'KL College of Engineering',        'KLC010', 'Vijayawada',       109),
(11, 'Gitam Institute of Technology',     'GIT011', 'Visakhapatnam',    110),
(12, 'Bangalore Inst of tech', 'BIT012', 'Bangalore',        111),
(13, 'Christ College of eng',    'CCE013', 'Bangalore',        112),
(14, 'Jain College of eng',      'JCE014', 'Bangalore',        113),
(15, 'Mysore Institute of tech',    'MIT015', 'Mysore',            114),
(16, 'Pune College of eng',      'PCE016', 'Pune',              115),
(17, 'Mumbai Institute of tech',    'MIT017', 'Mumbai',            116),
(18, 'Delhi College of eng',     'DCE018', 'Delhi',              117),
(19, 'Amity College of eng',     'ACE019', 'Noida',              118),
(20, 'Manipal Institute of tech',  'MIT020', 'Manipal',             119);



    
select c1.cname, c1.ccode  ,u1.uname , u1.ucode 
from colleges c1
INNER JOIN universites u1 
ON c1.uid=u1.id;

-- right outer join
select c1.cname, c1.ccode  ,u1.uname , u1.ucode 
from colleges c1
right outer JOIN universites u1 
ON c1.uid=u1.id;

-- left outer join
select c1.cname, c1.ccode  ,u1.uname , u1.ucode 
from colleges c1
left outer JOIN universites u1 
ON c1.uid=u1.id;


-- ---------------------------------------------------------

select uname, address from universites;
select uname as Univerity_Name, address as Address from universites;

select * from universites 
where uname='VTU';


select * from colleges 
where cname='SMCE' AND uid=100;


-- WAQTD all college details who's college address starts letter 'V'
-- WAQTD all college details who's college address end's letter 'i'



create table dept(
	deptID int primary key , 
    dName varchar(50));
    
insert into dept 
values
	(101,'R&D'),
	(102,'HR'),
    (103,'Sales'),
    (104,'Marking');
    

create table employees(
	eid int primary key , 
    name varchar(25) ,
    email varchar(30),
    dId int ,
    foreign key (dId) 
    references dept(deptID)
    );
    
insert into employees 
values 
	(1 ,'rani','rani@gmail.com',101),
    (2 ,'raju','raju@gmail.com',102),
    (3 ,'raghunatha','raghunatha@gmail.com',103),
    (4 ,'ramu','ramu@gmail.com',101),
    (5 ,'anusha','anusha@gmail.com',102),
    (6 ,'rajesh','rajesh@gmail.com',103),
    (7 ,'vivek','vivek@gmail.com',104),
    (8 ,'ayan','ayan@gmail.com',104),
    (9 ,'arun','arun@gmail.com',104),
    (10 ,'harshitha','harshitha@gmail.com',101);
    
insert into employees(eid, name ,email )
values 
    (11,'mahesh babu','mahesh@adnova.com'),
    (12,'mythri','mythri@adnova.com'),
    (13,'ramesh ','ramesg@adnova.com');
    
    
alter table employees ADD salary int;

update employees set salary=12000  where eid=2;
update employees set salary=521000  where eid=3;
update employees set salary=41800  where eid=5;
update employees set salary=95100  where eid=6;
update employees set salary=68000  where eid=7;
update employees set salary=12400  where eid=8;
update employees set salary=85000  where eid=9;
update employees set salary=512211  where eid=11;
update employees set salary=812000  where eid=12;



select MAX(e1.salary) as max_salary , e1.dId as deptID
from employees e1
INNER JOIN dept d1
ON e1.dId=d1.deptId
GROUP BY d1.dname;