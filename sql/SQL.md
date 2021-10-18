## SQL

``` sql
-- 데이터베이스 삭제
> drop database 데이터베이스명;

-- 데이터베이스 변경
> alter database 데이터베이스명 옵션들...;

-- 테이블 생성
> create table 테이블명 (
  컬럼명 타입 NULL여부 옵션,
  컬럼명 타입 NULL여부 옵션,
  ...
  컬럼명 타입 NULL여부 옵션
  );
  
  예)
> create table test01 (
    name varchar(50) not null,
    kor int not null,
    eng int not null,
    math int not null,
    sum int not null,
    aver float not null
  );
  
-- 테이블 정보 보기
> describe 테이블명;
> desc 테이블명;
예) describe test01;
예) desc test01;

-- 테이블 삭제하기
> drop table 테이블명;
예) drop table test01;

-- 연락처 테이블 생성 
create table test1 (
  no int not null,
  name varchar(20) not null,
  tel varchar(20) not null,
  fax varchar(20),
  pstno varchar(5),
  addr varchar(200)
);

-- PK 컬럼 지정
alter table test1
  add constraint test1_pk primary key (no);

-- 자동 증가 컬럼 지정
alter table test1
  modify column no int not null auto_increment;
  
  
-- select
- 테이블의 데이터를 조회할 때 사용하는 명령이다.

-- 모든 컬럼 값 조회하기. 컬럼 순서는 테이블을 생성할 때 선언한 순서이다.
select * from 테이블;
select * from test1;

-- 특정 컬럼의 값만 조회할 때 => "프로젝션(projection)"이라 부른다.
select 컬럼명,컬럼명 from 테이블;
select no, name, tel from test1;

-- 가상의 컬럼 값을 조회하기
select no, concat(name,'(',class,')') from test1;  
```

