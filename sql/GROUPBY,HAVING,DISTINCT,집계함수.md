## SELECT문의 실행 순서
- 1. FROM절 = 조회 테이블을 참조한다.
  2. WHERE절 = 조회대상 행을 조회한다.
  3. GROUP BY절 = 대상 행을 그룹화한다.
  4. HAVING절 = 그룹화한 값에서 조건에 맞는 것을 출력한다.
  5. SELECT절 = SELECT절에 기재한 컬럼이나 식을 계산한다.
  6. ORDER BY절 = 출력되는 결과집합을 정렬한다.

## DISTINCT 와 GROUP BY
` DISTINCT `
- 유니크한(중복을 제거)한 테이터를 조회하는 경우에 사욧
- SELECT를 해서 데이터를 가져올 때 중복되는 데이터 없이 가져오고 싶을때 사용된다.
- SELECT 컬럼 앞에 명시하면된다.
- DISTINCT를 사용시에 ORDER BY절 컬럼은 SELECT문의 컬럼이 포함되 있어야한다.

```sql
SELECT DISTINCT 컬럼1,컬럼2 .....
```

` GROUP BY `
- 지정한 데이터를 그룹핑해서 그 결과를 가져오는 경우에 사용
- 데이터를 원하는 그룹으로 나누는 역할
- 어떤 기준으로 그룹할 경우 다른 값들을 가져올때 역시 그룹핑하여 가져와야한다.
- 집계함수 SUM,MIN,MAX,AVG,COUNT 등이 함께 사용된다.
- 그룹을 하고자 하는 컬러명을 SELECT절과 GROUP BY절에 둘다 명시해 주어야 하나 여기서 집계함수의 경우에는 GROUP BY절에 명시할 필요는 없다.
- GROUP BY절의 위치는 WHERE 와 ORDER BY절 사이에 위치한다.

```sql
SELECT 컬럼1,컬럼2,컬럼3 FROM 테이블이름 GROUP BY 그룹핑 할 컬럼
```

- 공통점 : 중첩되는 데이터를 제거한 결과를 보여준다.

- 차이점 : DISTINCT는 단순 그룹핑 작업만 수행, GROUP BY는 그룹핑 + 정렬 작업을 같이 실행

` HAVING `
- GROUP BY 사용시에 명시해주는 조건 값
- WHERE 절에서는 집계함수를 사용할 수 없으나 HAVING절에서는 집계함수를 가지고 조건비교를 할 수 있다.
- 필수는 아니고 선택적으로 사용한다.
- WHERE절에서는 집계함수로 비교가 안되는 집계함수를 비교하고 싶다면 HAVING절을 사용하면 된다.

```sql
-- HAVING 기본 사용법
SELECT depart_no, SUM(salary), SUM(commission)
FROM emp GROUP BY depart_no HAVING SUM(commission) >= 2000 ORDER BY SUM(commission)

-- HAVING과 WHERE 동시 사용
SELECT depart_no, SUM(salary), SUM(commission), job 
FROM emp WHERE job != 'sales' 
GROUP BY depart_no HAVING SUM(commission) >= 2000 ORDER BY sum(commission) DESC;
/* 
WHERE절은 쿼리 전체에 대한 필터 역할을 하는거고, 
HAVING절은 WHERE 조건으로 한번 걸러진 결과에 대해 GROUP BY를 실행한 후 
산출된 결과에 대해 다시 조건을 걸어 데이터를 걸러내는 작업을 하는 것이다. 
*/
```


## 대표적인 집계 함수
- ` COUNT(*) ` 	  	= NULL 값을 포함한 행의 수를 출력한다.
  - ` COUNT(표현식) `= 표현식의 값이 NULL이 아닌 행의 수를 출력한다.
    - ` SUM(표현식) ` = 표현식이 NULL 값인 것을 제외한 **합계**를 출력한다.
    - ` AVG(표현식) ` = 표현식이 NULL 값인 것을 제외한 **평균**을 출력한다.
    - ` MAX(표현식) ` = 표현식이 NULL 값인 것을 제외한 **최대값**을 출력한다.
    - ` MIN(표현식) ` = 표현식이 NULL 값인 것을 제외한 **최소값**을 출력한다.
  - ` STDDEV(표현식) ` = 표현식이 NULL 값인 것을 제외한 **표준편차**를 출력한다.
  - ` VARIAN(표현식) ` = 표현식이 NULL 값인 것을 제외한 **분산**을 출력한다.
```sql
SELECT
	 COUNT(*)  AS "전체총합"
	,MAX(표현식) AS  "최대값"
	,MIN(표현식) AS  "최소값"
FROM 테이블명;
```

## 순위 함수

` RANK 함수 `
- RANK 함수는 동일한 값이면 중복 순위를 부여하고, 다음 순위는 해당 개수만큼 건너뛰고 반환합니다. 
- RANK 함수를 사용해서 조회한 결과를 보면 값이 동일한 경우에는 순위 값이 '동일한 순위'로 중복 순위를 부여합니다.
- 예) 1등 1명, 2등 2명 일 경우 다음 등수는 4등이 된다. 1>2>2>4
```sql
SELECT 컬럼1, 컬럼2, 컬럼3,
RANK() OVER (ORDER BY 기준_컬럼 DESC) AS 별명
FROM 테이블;
```

` DENSE_RANK 함수 `
- DENSE_RANK 함수는 동일한 값이면 중복 순위를 부여하고, 다음순위는 중복 순위와 상관없이 순차적으로 반환한다.
- DENSE_RANK 함수를 사용해서 조회한 결과를 보면, 값이 동일한 경우에는 순위 값에 중복 순위를 부여합니다.
- 예) 1등 1명, 2등 2명 일 경우 다음 등수는 3등이 된다. 1>2>2>3
```sql
SELECT 컬럼1, 컬럼2, 컬럼3,
DENSE_RANK() OVER (ORDER BY 기준_컬럼 DESC) AS 별명
FROM 테이블;
```

` ROW_NUMBER 함수 `
- ROW_NUMBER 함수는 중복 관계없이 순차적으로 순위를 반환합니다. 그렇기 때문에 동일한 점수여도 중복 순위가 없습니다.
- 예) 1등 1명, 2등 2명 일 경우  1>2>3>4 순차적으로 반환.

` 그룹별 순위 `
- RANK 함수(또는 DENSE_RANK, ROW_NUMBER)를 이용해서 그룹별 순위를 매길 수 있다.
- 어떤 순위 함수를 쓰는지에 따라 순위 결과 값은 다르게 나온다.
```sql
SELECT 컬럼1, 컬럼2, 컬럼3,
RANK() OVER (PARTITION BY 기준_컬럼 DESC) AS 별명
FROM 테이블;
```

` NTILE 함수 `
- NTILE 함수도 순위함수로 사용되지만 위에서 사용된 함수와는 약간 다르게 느껴질 수 있다.
- NTILE 함수 뒤에 함께 적어주는 숫자 만큼 등분을하는 함수이다.
- 만약 4등분으로 하고자 한다면 순차적으로 1등4명 2등4명 3등4명 1>1>1>1>2>2>2>2>3>3>3> 

```sql
SELECT 컬럼1, 컬럼2, 컬럼3,
NTILE(등분하고자하는숫자) OVER (ORDER BY 기준_컬럼 DESC) AS 별명
FROM 테이블명;
```

` PARTITION BY 함수 `
- 그룹 별로 순위를 부여하고 싶을때 사용된다.
```sql
SELECT 컬럼1, 컬럼2, 컬럼3,
RANK() OVER (PARTITION BY 그룹_컬럼 ORDER BY 기준_컬럼 DESC) AS 별명
FROM 테이블명;
```



