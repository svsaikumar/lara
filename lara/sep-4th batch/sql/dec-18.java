CREATE TABLE TAB1(SNO NUMBER, NAME VARCHAR2(90), AGE NUMBER);
	//WE CAN INSERT NULL VALUES

INSERT INTO TAB1(SNO) VALUES(101);



INSERT INTO TAB1(NAME) VALUES('RAMU');
INSERT INTO TAB1(AGE, NAME) VALUES(22,'MANU');
SELECT * FROM TAB1;

INSERT INTO TAB1(NAME, AGE) VALUES('MURALI', 22);
INSERT INTO TAB1(NAME, AGE) VALUES('MURALI', 22);
	//be default columns allow null values
	//by default columNs allows duplicates
INSERT INTO TAB1(NAME, AGE,SNO) VALUES('MOHAN', 24, 201);
INSERT INTO TAB1(NAME, AGE,SNO) VALUES('MOHAN', 24, 201);
=================================================================
=================================================================

Avoiding duplicates and null values:
CREATE TABLE TAB2(SNO NUMBER, NAME VARCHAR2(50) NOT NULL, AGE NUMBER);
INSERT INTO TAB2(SNO, AGE) VALUES(201 , 22);//here name column is defined as not null, so we shoulds send a value to it
		//SQL Error: ORA-01400: cannot insert NULL into ("SYSTEM"."TAB2"."NAME")
		//01400. 00000 -  "cannot insert NULL into (%s)"
//in one table any number of NOT NULL columns can be developed

CREATE TABLE TAB3(SNO NUMBER NOT NULL, NAME VARCHAR2(90) NOT NULL, AGE NUMBER NOT NULL);

INSERT INTO TAB3(SNO, NAME) VALUES(202, 'MANU');
/*SQL Error: ORA-01400: cannot insert NULL into ("SYSTEM"."TAB3"."AGE")
01400. 00000 -  "cannot insert NULL into (%s)"
*/


//UNIQUE key-which didn't allow duplicates(similar to NOT NULL)
CREATE TABLE TAB4(SNO NUMBER, NAME VARCHAR2(90), AGE NUMBER UNIQUE);
INSERT INTO TAB4 VALUES(1, 'MURALI',22);
INSERT INTO TAB4 VALUES(2, 'MOHAN',22);
/*QL Error: ORA-00001: unique constraint (SYSTEM.SYS_C007100) violated
00001. 00000 -  "unique constraint (%s.%s) violated"
*Cause:    An UPDATE or INSERT statement attempted to insert a duplicate key.
           For Trusted Oracle configured in DBMS MAC mode, you may see
           this message if a duplicate entry exists at a different level.
*Action:   Either remove the unique restriction or do not insert the key.

a table can have any number of UNIQUE columns
*/
INSERT INTO TAB4(SNO, NAME)  VALUES(2, 'MOHAN');
//null values are allowed inside UNIQUE(multiple NULL also allowed in UNIQUE column)
//UNIQUE columns won't allow duplicates(but it allow multiple null values)

INSERT INTO TAB4(SNO, NAME)  VALUES(2, 'MOHAN');
INSERT INTO TAB4(SNO, NAME)  VALUES(2, 'MOHAN');
==========================================================================
==========================================================================
//a table can have any number of UNIQUE columns
CREATE TABLE TAB5(SNO NUMBER UNIQUE, NAME VARCHAR2(90) UNIQUE, AGE NUMBER UNIQUE);
INSERT INTO TAB5 VALUES(1, 'RAMU',22);
INSERT INTO TAB5 VALUES(1, 'MANU',23);
/*SQL Error: ORA-00001: unique constraint (SYSTEM.SYS_C007101) violated
00001. 00000 -  "unique constraint (%s.%s) violated"
*Cause:    An UPDATE or INSERT statement attempted to insert a duplicate key.
           For Trusted Oracle configured in DBMS MAC mode, you may see
           this message if a duplicate entry exists at a different level.
*Action:   Either remove the unique restriction or do not insert the key.
*/
INSERT INTO TAB5 VALUES(2, 'RAMU',23);
/*SQL Error: ORA-00001: unique constraint (SYSTEM.SYS_C007102) violated
00001. 00000 -  "unique constraint (%s.%s) violated"
*Cause:    An UPDATE or INSERT statement attempted to insert a duplicate key.
           For Trusted Oracle configured in DBMS MAC mode, you may see
           this message if a duplicate entry exists at a different level.
*Action:   Either remove the unique restriction or do not insert the key.
*/
INSERT INTO TAB5 VALUES(2, 'RAMU',23);

==========================================================================
==========================================================================
//same columns can be qualified as both NOT NULL and UNIQUE

CREATE TABLE TAB6(SNO NUMBER NOT NULL UNIQUE, NAME VARCHAR2(90) UNIQUE NOT NULL);
INSERT INTO TAB6(SNO) VALUES(101);
/*QL Error: ORA-01400: cannot insert NULL into ("SYSTEM"."TAB6"."NAME")
01400. 00000 -  "cannot insert NULL into (%s)"
*/
INSERT INTO TAB6(NAME) VALUES('MANU');
INSERT INTO TAB6(NAME, SNO) VALUES('MANU', 90);
/*
SQL Error: ORA-01400: cannot insert NULL into ("SYSTEM"."TAB6"."SNO")
01400. 00000 -  "cannot insert NULL into (%s)"
*/
INSERT INTO TAB6(NAME, SNO) VALUES('RAMU', 90);
/*SQL Error: ORA-00001: unique constraint (SYSTEM.SYS_C007106) violated
00001. 00000 -  "unique constraint (%s.%s) violated"
*Cause:    An UPDATE or INSERT statement attempted to insert a duplicate key.
           For Trusted Oracle configured in DBMS MAC mode, you may see
           this message if a duplicate entry exists at a different level.
*Action:   Either remove the unique restriction or do not insert the key.
*/

INSERT INTO TAB6(NAME, SNO) VALUES('RAMU', 91);
//if we don't want duplicaes then use UNIQUE
//if we don't want null values then use NOT NULL
//a table can have multiple columns with NOT NULL and UNIQUE 

//on multiple columns we can have one UNIQUE(which is known as composite unique)

==========================================================================
==========================================================================
//constraint key=

CREATE TABLE TAB7(SNO NUMBER, NAME VARCHAR2(90), AGE NUMBER, CONSTRAINT TAB7_UK1 UNIQUE(NAME));
//we can specify any nuMber of CONSTRAINT by using ,as a separator
//we can enable or disable constraint any time if it has a name

INSERT INTO TAB7 VALUES(1, 'RAMU', 22);
INSERT INTO TAB7 VALUES(2, 'RAMU', 24);
/*SQL Error: ORA-00001: unique constraint (SYSTEM.TAB7_UK1) violated
00001. 00000 -  "unique constraint (%s.%s) violated" 
*Cause:    An UPDATE or INSERT statement attempted to insert a duplicate key.
           For Trusted Oracle configured in DBMS MAC mode, you may see
           this message if a duplicate entry exists at a different level.
*Action:   Either remove the unique restriction or do not insert the key.
*/
//CONSTRAINTS name should be unique across entire the table

CREATE TABLE TAB8(SNO NUMBER, NAME VARACAHR2(90),AGE NUMBER, CONSTRAINT TAB8_UK1 UNIQUE(SNO),
															 CONSTRAINT TAB8_UK2 UNIQUE(AGE),
															 CONSTRAINT TAB8_UK3 UNIQUE(NAME));
//here there is a specific name for constraint , so we can enable or disable constraint
//here we can't insert duplicates any of the columns

INSERT INTO TAB8 VALUES(1, 'RAMU', 22);
INSERT INTO TAB8 VALUES(1, 'MANU', 23);
/*SQL Error: ORA-00001: unique constraint (SYSTEM.TAB8_UK1) violated
00001. 00000 -  "unique constraint (%s.%s) violated"
*Cause:    An UPDATE or INSERT statement attempted to insert a duplicate key.
           For Trusted Oracle configured in DBMS MAC mode, you may see
           this message if a duplicate entry exists at a different level.
*Action:   Either remove the unique restriction or do not insert the key.
*/

CREATE TABLE TAB9(SNO NUMBER, NAME VARCHAR2(90),AGE NUMBER, CONSTRAINT TAB9_UK1 UNIQUE(NAME, AGE));
//here the combination of NAME and AGE can't be duplicate(we can insert individual duplicates)

INSERT INTO TAB9 VALUES(1, 'RAMU', 22);
INSERT INTO TAB9 VALUES(1, 'RAMU', 23);
/*SQL Error: ORA-00001: unique constraint (SYSTEM.TAB8_UK2) violated
00001. 00000 -  "unique constraint (%s.%s) violated"
*Cause:    An UPDATE or INSERT statement attempted to insert a duplicate key.
           For Trusted Oracle configured in DBMS MAC mode, you may see
           this message if a duplicate entry exists at a different level.
*Action:   Either remove the unique restriction or do not insert the key.
*/
//more than one record should not have a combination ofsame  name and age

INSERT INTO TAB9 VALUES(1, 'RAMU', 22);
INSERT INTO TAB9 VALUES(2, 'RAMU', 22);
/*SQL Error: ORA-00001: unique constraint (SYSTEM.TAB9_UK1) violated
00001. 00000 -  "unique constraint (%s.%s) violated"
*Cause:    An UPDATE or INSERT statement attempted to insert a duplicate key.
           For Trusted Oracle configured in DBMS MAC mode, you may see
           this message if a duplicate entry exists at a different level.
*Action:   Either remove the unique restriction or do not insert the key.
*/
INSERT INTO TAB9 VALUES(1, 'RAMU', 23);
INSERT INTO TAB9 VALUES(1, 'MANU', 22);
/*SQL Error: ORA-00001: unique constraint (SYSTEM.TAB9_UK1) violated
00001. 00000 -  "unique constraint (%s.%s) violated"
*Cause:    An UPDATE or INSERT statement attempted to insert a duplicate key.
           For Trusted Oracle configured in DBMS MAC mode, you may see
           this message if a duplicate entry exists at a different level.
*Action:   Either remove the unique restriction or do not insert the key.
*/
//ON TOP OF ANY COLUMN WE CAN create composite unique
//SQL will not worry about null combinations
//a table can any number of composite unique key
//unique column allows any number of nulls
//while supplying a value then only nuique key comes into picture
//



//primary key
CREATE TABLE TAB10(SNO NUMBER PRIMARY KEY, NAME VARCHAR2(90), AGE NUMBER);
//primary key is a combination of NOT NULL and UNIQUE

INSERT INTO TAB10(NAME, AGE) VALUES('RAMU',22);
//trying to insert NULL into primary key
INSERT INTO TAB10(SNO) VALUES(100);
//primary key won't allow duplicates and null values

//in one table we can't create more than one PRIMARY KEY
=============================================================
=============================================================
CREATE TABLE TAB11(SNO NUMBER PRIMARY KEY ,NAME VARCHAR2(90) PRIMARY KEY);
//a table can't have more than one primary key


CREATE TABLE TAB12(SNO NUMBER,NAME VARCHAR2(90),AGE NUMBER, CONSTRAINT TAB12_PK PRIMARY KEY(AGE));
//CONSTRAINT = NAME ,CONSTRAINT TYPE,COLUMN;
//HERE AGE COLUMN WON;T ALLOW DUPLICATES
//SIMILAR TO COMPOSITE UNIQUE KEY WE CAN DEVELOP WE CAN DEVELOP ONE COMPOSITE PRIMARY COLUMUNS CONSIDERING ANY NUMBER OF COLUMNS)
CREATE TABLE TAB13(SNO NUMBER,NAME VARCHAR2(90),AGE NUMBER, CONSTRAINT TAB13_PK PRIMARY KEY(SNO, AGE));
//combination should not be same for 2 records, primary key on top of 2 columns