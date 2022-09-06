-- 그룹(GROUP BY) 
-- 1. GROUP BY절에서 지정한 칼럼의 데이터는 하나로 모아서 한 번만 조회가 됨 


-- EMPLOYEES 테이블
-- 1. 동일한 부서번호(DEPARTMENT_ID)로 그룹화하여 조회
-- 2. SELECT절에서 조회할 칼럼은 "반드시" GROUP BY 절에 존재해야 함
SELECT  DEPARTMENT_ID
    FROM EMPLOYEES
    GROUP BY DEPARTMENT_ID;
    

-- 2. 그룹화 실패
-- EMPLOYEE_ID 를 조회하려면 GROUP_BY 절에 EMPLOYEE_ID 가 있어야 함
SELECT EMPLOYEE_ID
    FROM EMPLOYEES
    GROUP BY DEPARTMENT_ID;
    
    
-- 3. 그룹화 함수 사용
-- 집계함수(그룹함수)는 GROUP BY절에 해당 칼럼이 없어도 SELECT절에서 조회 가능함
SELECT
    DEPARTMENT_ID
   ,SUM(SALARY) AS 부서별연봉합계
   ,FLOOR(AVG(SALARY)) AS 부서별연봉평균
   ,MAX(SALARY) AS 부서별최대연봉
   ,MIN(SALARY) AS 부서별최소연봉
   ,COUNT(*) AS 부서별사원수
   
   
FROM 
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID;
    
    
--4. 조건 지정
--  1) GROUP BY로 처리할 행(ROW)은 적을수록 성능에 유리함
--  2) WHERE절 : GROUP BY 이전에 처리되므로 가능한 모든 조건은 WHERE절에서 처리함
--  3) HAVING절: WHERE절로 처리할 수 없는 조건만 HAVING절에서 처리함


-- 1) 부서번호가 100 미만인 부서들의 연봉평균을 조회하기
SELECT
    DEPARTMENT_ID
   ,FLOOR(AVG(SALARY)) AS 부서별연봉평균
FROM
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID
HAVING
    DEPARTMENT_ID < 100;




-- 2) 소속된 사원수가 10명 이상이 부서의 연봉평균 조회하기(HAVING절만 가능)
-- 소속된 사원수는 GROUP BY 이후에만 알 수 있기 때문에 WHERE절로 처리가 불가능
SELECT 
    DEPARTMENT_ID
   ,COUNT(*) AS 부서별사원수
FROM
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID
HAVING 
    COUNT(*) >=10;




-- 1. 급여평균이 1000 이상인 부서의 부서번호와 급여평균을 조회


SELECT
    DEPARTMENT_ID
   ,FLOOR(AVG(SALARY)) AS 평균연봉
FROM 
    EMPLOYEES
WHERE SALARY >= 1000
GROUP BY 
    DEPARTMENT_ID



-- 2. 동일한 부서번호(DEPARTMENT_ID)로 그룹화하기
/*
    동일한 부서번호를 가진 사원들을 직업아이디(JOB_ID)로 다시 그룹화하기
    즉, 부서별 직업아이디별로 그룹화하기
    부서별 직업아이디별로 그룹화하여 각 그룹의 사원수 조회하기
    부서번호가 없는 사원은 제외하기
*/


