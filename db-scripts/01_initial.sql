create database employee_management;

use employee_management;

CREATE TABLE EMPLOYEE(
employee_id   	int	  	primary key, 
email_id 		varchar(50) unique,
employee_name   varchar(50) ,
date_of_joining timestamp,
designation 	varchar(50) ,
modified_by 	varchar(50),
modified_on 	timestamp,
created_by  	varchar(50),
created_on  	timestamp,
status			int
);

CREATE TABLE DOCUMENT(
document_id 	int		primary key auto_increment,
employee_id 	int		references EMPLOYEE(employee_id),
document_type 	int		referenceS DOCUMENT_MASTER(document_type),
file_path 		varchar(500),
verified 		boolean,
uploaded		boolean,
modified_by 	varchar(50),
modified_on 	timestamp,
created_by  	varchar(50),
created_on  	timestamp,
status			int
);

CREATE TABLE CHECKLIST(
checklist_id	 int 	primary key auto_increment,
employee_id 	 int 	references EMPLOYEE(employee_id),
checklist_type   int 	references CHECKLIST_MASTER(checklist_type),
checlist_value	 varchar(100),
completed		 boolean default false,
modified_by 	 varchar(50),
modified_on 	 timestamp,
created_by  	 varchar(50),
created_on  	 timestamp,
status 			 int
);

CREATE TABLE VISA_DETAILS (
visa_id			int 	primary key auto_increment,
employee_id 	int 	references EMPLOYEE(employee_id),
visa_status		boolean,
expiry_date		timestamp,
country			varchar(50),
visa_type		varchar(20),
modified_by 	varchar(50),
modified_on 	timestamp,
created_by  	varchar(50),
created_on  	timestamp,
status			int

);

CREATE TABLE PERSONAL_DETAILS(
employee_id		int		primary key references EMPLOYEE(employee_id),
phone_number	varchar(10),
address			varchar(100),
blood_group		varchar(10),
modified_by 	varchar(50),
modified_on 	timestamp,
created_by  	varchar(50),
created_on  	timestamp,
status			int
);

CREATE TABLE DOCUMENT_MASTER(
document_type 	int  	primary key auto_increment,
document_name	varchar(20),
modified_by 	varchar(50),
modified_on 	timestamp,
created_by  	varchar(50),
created_on  	timestamp,
status			int
);

CREATE TABLE CHECKLIST_MASTER(
checklist_type 	int  primary key auto_increment,
checklist_name	varchar(20),
modified_by 	varchar(50),
modified_on 	timestamp,
created_by  	varchar(50),
created_on  	timestamp,
status			int
);

CREATE TABLE SKILLS(
skill_id int primary key auto_increment,
employee_id int references EMPLOYEE(employee_id),
skill_type int references SKILLS_MASTER(skill_type),
modified_by 	varchar(50),
modified_on 	timestamp,
created_by  	varchar(50),
created_on  	timestamp,
status			int
);


CREATE TABLE SKILLS_MASTER(
skill_type int primary key auto_increment,
skill_description varchar(50),
modified_by 	varchar(50),
modified_on 	timestamp,
created_by  	varchar(50),
created_on  	timestamp,
status			int
)