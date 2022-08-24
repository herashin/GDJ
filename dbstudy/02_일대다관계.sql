

/*
    일대다 관계의 테이블 생성
    
    1. 명칭
        1) 부모 테이블 : 일(1), PK를 가진 테이블
        2) 자식 테이블 : 다(M), FK를 가진 테이블
    2. 생성
        부모 테이블을 먼저 생성하고, 자식 테이블을 나중에 생성
        
    3. 삭제
        자식 테이블을 먼저 삭제하고, 부모 테이블을 나중에 삭제

*/


-- 학교 테이블
-- 부모 테이블 : PK를 가진 테이블

DROP TABLE SCHOOL;
CREATE TABLE SCHOOL(
    SCH_CODE NUMBER(1) NOT NULL PRIMARY KEY,
    SCH_NAME VARCHAR2(20 BYTE) NOT NULL
);


DROP TABLE SCHOOL;
CREATE TABLE SCHOOL(
    SCH_CODE NUMBER(1) NOT NULL,
    SCH_NAME VARCHAR2(20 BYTE) NOT NULL,
    PRIMARY KEY(SCH_CODE)
);



DROP TABLE SCHOOL;
CREATE TABLE SCHOOL(
    SCH_CODE NUMBER(1) NOT NULL CONSTRAINT PK_SCHOOL PRIMARY KEY,
    SCH_NAME VARCHAR2(20 BYTE) NOT NULL
);


DROP TABLE SCHOOL;
CREATE TABLE SCHOOL(
    SCH_CODE NUMBER(1) NOT NULL,
    SCH_NAME VARCHAR2(20 BYTE) NOT NULL,
    CONSTRAINT PK_SCHOOL PRIMARY KEY(SCH_CODE)
);

-- 학생 테이블
-- 자식 테이블 : FK를 가진 테이블
DROP TABLE STUDENT;
CREATE TABLE STUDENT(
    STU_NO CHAR(5 BYTE) NOT NULL PRIMARY KEY,
    SCH_CODE NUMBER(1) NOT NULL REFERENCES SCHOOL(SCH_CODE),
    STU_NAME VARCHAR2(20 BYTE) NULL 
);

DROP TABLE STUDENT;
CREATE TABLE STUDENT(
    STU_NO CHAR(5 BYTE) NOT NULL,
    SCH_CODE NUMBER(1) NOT NULL,
    STU_NAME VARCHAR2(20 BYTE) NULL ,
    PRIMARY KEY(STU_NO),
    FOREIGN KEY(SCH_CODE) REFERENCES SCHOOL(SCH_CODE)
);



DROP TABLE STUDENT;
CREATE TABLE STUDENT(
    STU_NO CHAR(5 BYTE) NOT NULL,
    SCH_CODE NUMBER(1) NOT NULL,
    STU_NAME VARCHAR2(20 BYTE) NULL ,
    CONSTRAINT PK_STUDENT PRIMARY KEY(STU_NO),
    CONSTRAINT FK_STUDENT_SCHOOL FOREIGN KEY(SCH_CODE) REFERENCES SCHOOL(SCH_CODE)
);


-- 최종 정리

-- 생성 - 부모먼저, 자식나중
-- 삭제 - 자식 먼저 , 부모나중


 DROP TABLE SCHOOL;
CREATE TABLE SCHOOL(
    SCH_CODE NUMBER(1) NOT NULL,
    SCH_NAME VARCHAR2(20 BYTE) NOT NULL,
    CONSTRAINT PK_SCHOOL PRIMARY KEY(SCH_CODE)
);




DROP TABLE STUDENT;
CREATE TABLE STUDENT(
    STU_NO CHAR(5 BYTE) NOT NULL,
    SCH_CODE NUMBER(1) NOT NULL,
    STU_NAME VARCHAR2(20 BYTE) NULL ,
    CONSTRAINT PK_STUDENT PRIMARY KEY(STU_NO),
    CONSTRAINT FK_STUDENT_SCHOOL FOREIGN KEY(SCH_CODE) REFERENCES SCHOOL(SCH_CODE)
);

DROP TABLE STUDENT_SUGANG;
CREATE TABLE STUDENT_SUGANG(
    STU_NO NUMBER(5) NOT NULL,
    STU_NAME VARCHAR2(20 BYTE) NULL,
    STU_AGE NUMBER(3) NULL,
    CONSTRAINT PK_STUDENT2 PRIMARY KEY(STU_NO)
);





DROP TABLE SCHCLASS;
CREATE TABLE SCHCLASS(
    CLASS_CODE VARCHAR2(10 BYTE)NOT NULL,
    CLASS_NAME VARCHAR2(30 BYTE)NOT NULL,
    CLASS_TICH VARCHAR2(30 BYTE) NULL,
    PRIMARY KEY(CLASS_CODE)
    
  --  CONSTRAINT PK_CLASS PRIMARY KEY(CLASS_CODE)
    

);

DROP TABLE STUDY_TABLE;
CREATE TABLE STUDY_TABLE(
    
    CLASS_INPUT_NUM NUMBER(1) NOT NULL,
    CLASS_INPUT_STU_NO NUMBER(5) NOT NULL,
    CLASS_INPUT_CODE VARCHAR2(10 BYTE) NOT NULL,
    PRIMARY KEY(CLASS_INPUT_NUM),
    FOREIGN KEY(CLASS_INPUT_STU_NO)REFERENCES STUDENT_SUGANG (STU_NO),
    FOREIGN KEY(CLASS_INPUT_CODE) REFERENCES SCHCLASS(CLASS_CODE)


);











