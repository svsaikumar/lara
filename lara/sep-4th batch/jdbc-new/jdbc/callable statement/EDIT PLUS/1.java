CREATE OR REPLACE PROCEDURE P1 AS BEGIN
INSERT INTO PERSON VALUES(2001, 'ABC', 22);
INSERT INTO PERSON VALUES(2002, 'XYZ', 24);

INSERT INTO PERSON VALUES(2003, 'TEST', 25);

INSERT INTO BOOK VALUES(3001, 'JAVA MADE EASY', 'VIJAY', 500);
INSERT INTO BOOK VALUES(3002, 'J2EE MADE EASY', 'VIJAY', 600);
INSERT INTO BOOK VALUES(3003, 'ANGULAR MADE EASY', 'VIJAY', 300);
END;

//stored procedure
//creating one container in the data base with multiple commands by using ; as a separator
//every command is independent
//NOt only to one table , we can do it for different tables 
//after END there should be a semicolon
//while creating stored procedure , sql comamnd is not executhg , tshety area simply storign sql commands in data base
//here P1 is name of stored procedure
//when we call to p1 using java , then all the commands in p1 are trigered


CREATE OR REPLACE PROCEDURE P2 AS BEGIN
INSERT INTO PERSON VALUES(2004, 'ABC', 22);
INSERT INTO PERSON VALUES(2005, 'XYZ', 24);

INSERT INTO PERSON VALUES(2006, 'TEST', 25);

INSERT INTO BOOK1 VALUES(3004, 'JAVA MADE EASY', 'VIJAY', 500);
INSERT INTO BOOK1 VALUES(3005, 'J2EE MADE EASY', 'VIJAY', 600);
INSERT INTO BOOK1 VALUES(3006, 'ANGULAR MADE EASY', 'VIJAY', 300);
END;

select * from book1;
select * from person;

===================================
CREATE OR REPLACE PROCEDURE P3(ARG1 NUMBER,
                              ARG2 VARCHAR,
                              ARG3 VARCHAR,
                              
                              ARG4 NUMBER) AS BEGIN


INSERT INTO BOOK1 VALUES(ARG1, ARG2, ARG3, ARG4);

END;
//P3 taking 4 arguments
//call of p3 sending 4 values
================================================
CREATE OR REPLACE PROCEDURE P4(ARG1 NUMBER,
                              ARG2 OUT VARCHAR) AS BEGIN
                            
                              
SELECT NAME INTO ARG2 FROM PERSON WHERE ID = ARG1;
END;
//be defdault arg1 is IN
//arg2 is for getting output from proceure
//in stored procedure there are 3 types of parameters(IN , OUT, INOUT)
//by defautl arg is IN







