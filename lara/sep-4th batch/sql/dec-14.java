CREATE TABLE EMPLOYEE(ID NUMBER, FIRST_NAME VARCHAR2(90), AGE NUMBER, EMAIL VARCHAR2(90), SALARY NUMBER);
	//any number of columns can be used using commma(,) as a separator
	//while specifying varchar2 we need to specify size also
	//2 types of columns(number type and string type)
	//for string type we use varchar2

table EMPLOYEE created.

INSERT INTO EMPLOYEE VALUES(1, 'RAMU', 22,'R@GMAIL.COM', 50000);
	//varchar2 column value should be enclosed with single quote
	1 rows inserted.
INSERT INTO EMPLOYEE VALUES(2, 'MANU', 24,'M@GMAIL.COM,' 60000);
	1 rows inserted
INSERT INTO EMPLOYEE VALUES(3, 'ANU', 27,'A@GMAIL.COM,' 40000);
INSERT INTO EMPLOYEE VALUES(4, 'RAVI', 21,'R@GMAIL.COM,' 20000);
	1 rows inserted.
	1 rows inserted.
INSERT INTO EMPLOYEE(AGE, ID, SALARY, FIRST_NAME, EMAIL) VALUES(22, 5, 45000, 'KIRAN', 'K@YAHOO.COM');
	//if we want insert only some columns then we have to specify that particular names
	1 rows inserted.
INSERT INTO EMPLOYEE(AGE, ID, SALARY, FIRST_NAME) VALUES(26, 6, 35000, 'KUMAR');
	//here the default value for not having a value columns is NULL
	1 rows inserted.

UPDATE EMPLOYEE SET EMAIL = 'KU@HOTMAIL.COM' WHERE ID = 2;
	//any number of colums can be updated by using , as a separator in a particualr row
	1 rows updated.
UPDATE EMPLOYEE SET AGE = 35, FIRST_NAME ='MANOHAR' WHERE ID = 5;
	1 rows updated.
	//multiple records can be updated throgh a single command
UPDATE EMPLOYEE SET ID = 10, FIRST_NAME = 'MURALI' WHERE AGE < 25;
	3 rows updated.
UPDATE EMPLOYEE SET AGE = 40, EMAIL = 'A@A.COM;
	//here every record is updated(not reomended as updating will be effectinG to all the records)
	6 rows updated.
DELETE FROM EMPLOYEE WHERE ID = 1;
	0 rows deleted.
DELETE FROM EMPLOYEE WHERE ID = 2;
	0 rows deleted.
DELETE FROM EMPLOYEE WHERE ID = 5;
	1 rows deleted.
DELETE FROM EMPLOYEE WHERE SALARY > 50000;
	//don't go for delete WITHOUT a where condition.if so , it will delete every record and table will be empty

DELETE FROM EMPLOYEE;
	//it deletes all the rows from the table(but we can roll back them)


TRUNCATE FROM EMPLOYEE
	//it deletes all the records from the table permanently
DROP TABLE EMPLOYEE;
	//removing the table(if records are also they will be deleted).drop command can be used in any table
	table EMPLOYEE dropped



//for deleting a column
ALTER TABLE EMPLOYEE DROP COLUMN SALARY;


//for adding a column
ALTER TABLE EMPLOYEE ADD COLUMN REMARKS NUMBER;
======================================================================
======================================================================



CREATE TABLE EMPLOYEE(ID NUMBER, FIRST_NAME VARCHAR2(90), LAST_NAME VARCHAR2(90), AGE NUMBER,
						SALARY NUMBER, EMAIL VARCHAR2(90), DEPT VARCHAR2(90));

//underscore is recomended if there are morethan one word(in order to use space we have to go through double quotes 
//which leads to lenghty coding

	table EMPLOYEE created.

INSERT INTO EMPLOYEE VALUES(1,'RAMU','RAO', 22, 50000, 'R@GMAIL.COM', 'SW');
INSERT INTO EMPLOYEE VALUES(2,'RAMANA','KUMAR', 25, 45000, 'K@GMAIL.COM', 'SW');
INSERT INTO EMPLOYEE VALUES(3,'MANU','HARI', 28, 48000, 'M@GMAIL.COM', 'SW');
INSERT INTO EMPLOYEE VALUES(4,'SWATHI','SAR', 24, 28000, 'S@GMAIL.COM', 'HW');
INSERT INTO EMPLOYEE VALUES(5,'PAVAN','P', 21, 25000, 'P@GMAIL.COM', 'HW');
INSERT INTO EMPLOYEE VALUES(6,'TARUN','K', 35, 35000, 'M@GMAIL.COM', 'HR');
INSERT INTO EMPLOYEE VALUES(7,'MANASA','S', 25, 38000, 'T@GMAIL.COM', 'HR');
INSERT INTO EMPLOYEE VALUES(8,'KIRAN','K', 29, 49000, 'K@GMAIL.COM', 'HR');
INSERT INTO EMPLOYEE VALUES(9,'KUMAR','K', 26, 19000, 'K@YAHOO.COM', 'SALES');
INSERT INTO EMPLOYEE VALUES(10,'KRISHNA','KR', 29, 18000, 'K@HOTMAIL.COM', 'SALES');

	1 rows inserted.
	1 rows inserted.
	1 rows inserted.
	1 rows inserted.
	1 rows inserted.
	1 rows inserted.
	1 rows inserted.
	1 rows inserted.
	1 rows inserted.
	1 rows inserted.

SELECT * FROM EMPLOYEE;
		//* represents every column
SELECT * FROM EMPLOYEE WHERE ID = 5;
SELECT * FROM EMPLOYEE WHERE DEPT = 'SW';
SELECT * FROM EMPLOYEE WHERE SALARY > 40000;
SELECT ID, DEPT, LAST_NAME, SALARY FROM EMPLOYEE;
	//we can display our required columns by using comma(,) as a separator
SELECT ID, DEPT, LAST_NAME, SALARY FROM EMPLOYEE WHERE ID < 5;
	//WHERE conditin  is for any column



CREATE TABLE STUDENT ID NUMBER,NAME VARCHAR2(90),AGE NUMBER;









