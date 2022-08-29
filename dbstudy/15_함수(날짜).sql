-- 날짜 함수






-- 1. 현재 날짜와 시간
SELECT SYSDATE, SYSTIMESTAMP FROM DUAL;


-- 2. 원하는 형식으로 날짜와 시간 조회
--    TO_CHAR 함수 : 문자로 변환해서 조회

SELECT
    TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS')   --12시간
   ,TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') --24시간
    FROM
        DUAL;
        
        
    
        