//foreign key constraint = to give the relationship between the tables
//instead to storing entire data in a single table it is advisable(organize the data across the table) to use foreign key


CREATE TABLE PERSON(ID NUMBER , NAME VARCHAR2(90), AGE NUMBER, EMAIL VARCHAR2(90),CONSTRAINT PERSON_UK UNIQUE(ID));


CREATE TABLE ADDRESS(HOUSE_NO VARCHAR2(90), STREET_NAME VARCHAR2(90), CITY VARCHAR2(90), STATE VARCHAR2(90),
PERSON_ID NUMBER, CONSTRAINT ADDRESS_FK FOREIGN KEY(PERSON_ID) REFERENCES PERSON(ID));

//no duplicates are allowed, but null values will be allowed
//FOREIGN KEY referring to base column one table(that base column should be UNIQUE OR PRIMARY)

INSERT INTO PERSON VALUES(1,'RAMU', 22,'R@GMAIL.COM');
//THERE SHOULD NOT ANY DUPLICATES UNDER ID COLUMN OF PERSON TABLE
INSERT INTO ADDRESS VALUES('123/B', 'BTN', 'BANGLORE', 'KARNATAKA', 1);

INSERT INTO PERSON VALUES(2,'MANU', 24,'M@GMAIL.COM');
INSERT INTO ADDRESS VALUES('125/B', 'JP COLONY', 'MANGALORE', 'KARNATAKA', 2);

INSERT INTO ADDRESS VALUES('125/4', 'JAYA COLONY', 'MANGALORE', 'KARNATAKA', 3);
/*SQL Error: ORA-02291: integrity constraint (SYSTEM.ADDRESS_FK) violated - parent key not found
02291. 00000 - "integrity constraint (%s.%s) violated - parent key not found"
*Cause:    A foreign key value has no matching primary key value.
*Action:   Delete the foreign key or add a matching primary key.
*/
//here there is not column with id 3 in person table
//address table is depending on person table

DELETE FROM PERSON WHERE ID = 2;
/*SQL Error: ORA-02292: integrity constraint (SYSTEM.ADDRESS_FK) violated - child record found
02292. 00000 - "integrity constraint (%s.%s) violated - child record found"
*Cause:    attempted to delete a parent key value that had a foreign
           dependency.
*Action:   delete dependencies first then parent or disable constraint.
*/
//we can't delete the parent record if it is having a child record

DELETE FROM ADDRESS WHERE PERSON_ID = 2;
//but we can delete the child record

DELETE FROM PERSON WHERE ID = 2;
//WE CAN DELETE PARENT RECORD IF CHILD RECORD IS DELETED

//WE CAN'T DROP PARENT TABLE WITOUT DROPPING CHILD RECORD
//HERE WE CAN'T REMOVE PERSON TABLE WITHOUT REMOVING ADDRESS TABLE
DROP TABLE PERSON;
/*SQL Error: ORA-02449: unique/primary keys in table referenced by foreign keys
02449. 00000 -  "unique/primary keys in table referenced by foreign keys"
*Cause:    An attempt was made to drop a table with unique or
           primary keys referenced by foreign keys in another table.
*Action:   Before performing the above operations the table, drop the
           foreign key constraints in other tables. You can see what
           constraints are referencing a table by issuing the following
           command:
           SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = "tabnam";
		   */

DROP TABLE ADDRESS;
DROP TABLE PERSON;



===============================================================================================
===============================================================================================

CREATE TABLE PERSON(ID NUMBER , NAME VARCHAR2(90), AGE NUMBER, EMAIL VARCHAR2(90));

CREATE TABLE ADDRESS(HOUSE_NO VARCHAR2(90), STREET_NAME VARCHAR2(90), CITY VARCHAR2(90), STATE VARCHAR2(90),
PERSON_ID NUMBER, CONSTRAINT ADDRESS_FK FOREIGN KEY(PERSON_ID) REFERENCES PERSON(ID));
/*SQL Error: ORA-02270: no matching unique or primary key for this column-list
02270. 00000 -  "no matching unique or primary key for this column-list"
*Cause:    A REFERENCES clause in a CREATE/ALTER TABLE statement
           gives a column-list for which there is no matching unique or primary
           key constraint in the referenced table.
*Action:   Find the correct column names using the ALL_CONS_COLUMNS
           catalog view
		   */

 //WE CAN'T CRATE CHILD TABLE IF PARENT DIDN'T HAVA UNIQUE OR PRIMARY KEY

DROP TABLE PERSON;

CREATE TABLE PERSON(ID NUMBER , NAME VARCHAR2(90), AGE NUMBER, EMAIL VARCHAR2(90),CONSTRAINT PERSON_PK PRIMARY KEY (ID));

CREATE TABLE ADDRESS(HOUSE_NO VARCHAR2(90), STREET_NAME VARCHAR2(90), CITY VARCHAR2(90), STATE VARCHAR2(90),
PERSON_ID NUMBER, CONSTRAINT ADDRESS_FK FOREIGN KEY(PERSON_ID) REFERENCES PERSON(ID));

//we can't insert a child record if parent record is not available
//FIRST CHIDL REMOVE CHILD TABLE , THEN ONLHY WE CAN ABLE TO DELETE PERENT TABLE


===============================================================================================
===============================================================================================
CREATE TABLE PERSON(ID NUMBER ,NAME VARCHAR2(90), AGE NUMBER, EMAIL VARCHAR2(90),
                  CONSTRAINT PERSON_UK UNIQUE(ID));

CREATE TABLE ADDRESS(HOUSE_NO VARCHAR2(90), STREET_NAME VARCHAR2(90), CITY VARCHAR2(90), STATE VARCHAR2(90),
PERSON_ID NUMBER, CONSTRAINT ADDRESS_FK FOREIGN KEY(PERSON_ID) REFERENCES PERSON(ID));

INSERT INTO PERSON(NAME, AGE, EMAIL) VALUES ('RAMU', 22,'R@GMAIL.COM');


INSERT INTO ADDRESS(HOUSE_NO, STREET_NAME, CITY, STATE) VALUES('123/B', 'BTM', 'BANGALORE', 'KARNATAKA');

//we can't map null record of one tabe with null record of another table

UPDATE PERSON SET ID = 1 WHERE ID = NULL;
								//HERE WE SHOUKD NOT USE '='
UPDATE PERSON SET ID = 1 WHERE ID IS NULL;

UPDATE ADDRESS SET PERSON_ID = 1;
//foreign key allows null values , except PRIMARY KEY and NOT NULL column in all other places NULL can be inserted
//inside foreign key column nulls can be inserted
//foreign key itself is a  primary
//to achieve one to one mapping FOREIGN KEY should be UNIQUE or PRIMARY