DROP TABLE EMPLOYEE;
DROP TABLE DEPARTMENT;


CREATE TABLE DEPARTMENT(
    DEPT_NO NUMBER NOT NULL,
    DEPT_NAME VARCHAR2(15 BYTE) NOT NULL,
    LOCATION VARCHAR2(15 BYTE) NOT NULL
);


CREATE TABLE EMPLOYEE(
    EMP_NO NUMBER NOT NULL,
    NAME VARCHAR2(20 BYTE) NOT NULL,
    DEPART NUMBER NULL,
    POSITION VARCHAR2(20 BYTE) NULL,
    GENDER CHAR(2) NULL,
    HIRE_DATE DATE NULL,
    SALARY NUMBER NULL
);

ALTER TABLE DEPARTMENT
    ADD CONSTRAINT DEPARTMENT_PK PRIMARY KEY (DEPT_NO);

ALTER TABLE EMPLOYEE 
    ADD CONSTRAINT EMPLOYEE_PK PRIMARY KEY(EMP_NO);
    
    
ALTER TABLE EMPLOYEE
    ADD CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY(DEPART)
        REFERENCES DEPARTMENT(DEPT_NO)
            ON DELETE SET NULL;
            



INSERT INTO DEPARTMENT
    (DEPT_NO, DEPT_NAME, LOCATION)
VALUES
    (1, '영업부','대구');
    
INSERT INTO DEPARTMENT
    (DEPT_NO, DEPT_NAME, LOCATION)
VALUES 
    (2, '인사부' , '서울');

INSERT INTO DEPARTMENT
    (DEPT_NO, DEPT_NAME, LOCATION)
VALUES
    (3, '총부무' , '대구');

INSERT INTO DEPARTMENT
    (DEPT_NO, DEPT_NAME, LOCATION)
VALUES
    (4, '개획부','서울');
    
COMMIT;  --  이거 안쓰면 머선일이 일어나는거지?


INSERT INTO 
    EMPLOYEE
VALUES
    (1001, '구창민', 1, '과장', 'M', '95/05/01', 5000000);
INSERT INTO
    EMPLOYEE
VALUES
    (1002, '김민서', 1, '사원', 'F', '17/09/01', 2000000);
INSERT INTO
    EMPLOYEE
VALUES
    (1003, '이은영', 2, '부장', NULL, '90-09-01', 5500000);
INSERT INTO
    EMPLOYEE
VALUES
    (1004, '한성일', 2, '과장', 'M', '93-04-01', 5000000);

COMMIT;






UPDATE DEPARTMENT
    SET LOCATION = '인천'
    WHERE DEPT_NO = 1;
    
UPDATE DEPARTMENT
    SET DEPT_NAME = '전략부'
    , LOCATION = '부산'
    WHERE DEPT_NO = 3;
    


ALTER TABLE EMPLOYEE
    DISABLE CONSTRAINT FK_EMPLOYEE_DEPARTMENT;
    
UPDATE EMPLOYEE
    SET DEPART = 6
WHERE DEPART = 3;



UPDATE DEPARTMENT
    SET DEPT_NO = 6
WHERE DEPT_NO = 3;


ALTER TABLE EMPLOYEE
    ENABLE CONSTRAINT FK_EMPLOYEE_DEPARTMENT;
    



UPDATE EMPLOYEE
    SET SALARY = SALARY + 100000
    WHERE DEPART = 1;
    
UPDATE EMPLOYEE
    SET SALARY = SALARY *1.1
    WHERE POSITION = '과장';










          
            
            