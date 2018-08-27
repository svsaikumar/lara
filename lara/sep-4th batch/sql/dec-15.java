SELECT * FROM EMPLOYEE;
SELECT * FROM EMPLOYEE WHERE ID > 5;
SELECT * FROM EMPLOYEE WHERE ID > 5 OR AGE > 25;
		//one condition has to satisfy
SELECT * FROM EMPLOYEE WHERE ID > 5 AND AGE > 25;
		// both the conditions has to satisfy

SELECT * FROM EMPLOYEE WHERE FIRST_NAME LIKE '%T%';
		// % represents any number of characterS (including zero) after and before T
SELECT * FROM EMPLOYEE WHERE EMAIL LIKE '%GMAIL%';
SELECT * FROM EMPLOYEE WHERE (ID > 5 OR EMAIL LIKE '%GMAIL%') AND AGE > 5;
SELECT * FROM EMPLOYEE WHERE (ID > 5 OR EMAIL LIKE '%GMAIL%') AND (AGE > 30 OR LAST_NAME LIKE '%R%');
								//any one condition from here		any one condition from here

SELECT * FROM EMPLOYEE ORDER BY AGE;
SELECT * FROM EMPLOYEE ORDER BY AGE ASC;
SELECT * FROM EMPLOYEE ORDER BY AGE DESC;
SELECT * FROM EMPLOYEE ORDER BY SALARY ASC;
SELECT * FROM EMPLOYEE WHERE DEPT = 'SW' ORDER BY SALARY DESC;
SELECT * FROM EMPLOYEE WHERE SALARY BETWEEN 25000 AND 35000 ORDER BY SALARY DESC;

SELECT * FROM EMPLOYEE WHERE ID IN(3,7,9,4) ORDER BY SALARY DESC;
SELECT * FROM EMPLOYEE WHERE ID NOT IN(3,7,9,4) ORDER BY SALARY DESC;
SELECT * FROM EMPLOYEE WHERE FIRST_NAME IN('RAMU','TARUN', 'KUMAR') ORDER BY SALARY DESC;

SELECT ID FROM EMPLOYEE;
SELECT AGE, ID FROM EMPLOYEE;

	//we can modify header names
SELECT AGE AS EMP_AGE, ID, FIRST_NAME AS EMP_NAME FROM EMPLOYEE;
	//here AS is optional		here AS is optional
	SELECT AGE EMP_AGE, ID, FIRST_NAME EMP_NAME FROM EMPLOYEE;

SELECT COUNT(*) FROM EMLPOYEE;
	//COUNT is one of the buit in function.which returns number of records in the table
SELECT COUNT(*) TOTAL FROM EMPLOYEE;
SELECT COUNT(AGE) TOTAL FROM EMPLOYEE;
		//here the AGE field which has null value is not printed

SELECT SUM(AGE) TOTAL FROM EMPLOYEE;
	//SUM is another built in function which returns the total sum in the particular field(here it is AGE)

SELECT SUM(SALARY) "TOTAL SALARY" FROM EMPLOYEE;
	//use double quotes for modifying one

SELECT SUM(SALARY)/COUNT(SALARY) "AVG SALARY" FROM EMPLOYEE;

SELECT MIN(SALARY) "MINIMUM SALARY" FROM EMPLOYEE;
		//MIN is buit in function which is to find the Minimum value from the particular field(here it is SALARY)
SELECT MAX(SALARY) "MAXIMUM SALARY" FROM EMPLOYEE;
		//MAX is buit in function which is to find the Maximum value from the particular field(here it is SALARY)
SELECT AVG(SALARY) "AVERAGE SALARY" FROM EMPLOYEE;
	//AVG is buit in function which is to find the average value from the particular field(here it is SALARY)
SELECT FIRST_NAME FROM EMPLOYEE WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEE);
	//inner query or sub query should be mentined in paranthesis separately
	//first inner query will execute
SELECT FIRST_NAME FROM EMPLOYEE WHERE SALARY = (SELECT MIN(SALARY) FROM EMPLOYEE);
SELECT * FROM EMPLOYEE WHERE SALARY = (SELECT MIN(SALARY) FROM EMPLOYEE);
		//printing all details(fields) of the employee whose salaray is minimum



SELECT MAX(SALARY) FROM EMPLOYEE WHERE SALARY < (SELECT MAX(SALARY) FROM EMPLOYEE);
	//printing the second maximum salary
SELECT MIN(SALARY) FROM EMPLOYEE WHERE SALARY > (SELECT MIN(SALARY) FROM EMPLOYEE);
	//printing the second minumum salary