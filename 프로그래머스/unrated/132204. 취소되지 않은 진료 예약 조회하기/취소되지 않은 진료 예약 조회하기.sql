-- 코드를 입력하세요
SELECT a.APNT_NO,p.PT_NAME, a.PT_NO, a.MCDP_CD, d.DR_NAME, a.APNT_YMD
from APPOINTMENT a join DOCTOR d on D.DR_ID = A.MDDR_ID
join PATIENT p on p.PT_NO = a.PT_NO
WHERE a.APNT_CNCL_YMD IS NULL AND a.MCDP_CD = 'CS' AND a.APNT_YMD LIKE '2022-04-13%'
ORDER BY a.APNT_YMD



# and a.APNT_CNCL_YN = 'Y' and a.MCDP_CD = 'CS'


