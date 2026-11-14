use apsce_students_db;
create table universites(
                      id int primary key,
                      uname varchar(35) not null,
                      address varchar(50) default 'bengalore',
                      ucode varchar(7) unique ,
                      numbersOfBranch int check(numbersOfBranch>0) );
    
insert into universites values
	(102, 'JNTU', 'Vijayawada','vij003',8),
	(103, 'sathyabama' ,'chennai', 'sat004',2);

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
insert into colleges values
	(1, 'APSCE','APS001','Somanahalli',100),
    (2,'RVIT','RVIT02','Guntur',102),
	(3,'SMCE','SMCE03','Nelamangala',100),
    (4,'sathayabam medical college','SMC004','Chennai',103);

insert into colleges(cid, cname,ccode) values
	(5,'ramaya college','RAM001'),
    (6,'Dhayandha sagar','DHA002');
    
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