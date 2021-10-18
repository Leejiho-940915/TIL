##  SQL 문법

``` sql
-- 사용자 추가
create user 'study'@'localhost' identified by '1111';

create user 'study'@'%' identified by '1111';

-- 데이터를 저장할 데이터 베이스 생성
create database studydb character set utf8 collate utf8_general_ci;

create database 데이터베이스이름 character set 문자표 collate utf8_general_ci;

-- 데이터베이스를 사용할 사용자의 권한을 지정
grant all on studydb.* to 'study'@'localhost';
```





``` sql
-- 데이터 SQL

-- 회원 입력
insert into pms_member(member_no, name, email, password)
values(1, 'aaa', 'aaa@test.com', password('1111'));

insert into pms_member(member_no, name, email, password)
values(2, 'bbb', 'bbb@test.com', password('1111'));

insert into pms_member(member_no, name, email, password)
values(3, 'ccc', 'ccc@test.com', password('1111'));

insert into pms_member(member_no, name, email, password)
values(4, 'ddd', 'ddd@test.com', password('1111'));

insert into pms_member(member_no, name, email, password)
values(5, 'eee', 'eee@test.com', password('1111'));

insert into pms_member(member_no, name, email, password)
values(6, 'fff', 'fff@test.com', password('1111'));

-- 게시글 입력
insert into pms_board(board_no, title, content, member_no) values(1, '제목1', '내용', 1);
insert into pms_board(board_no, title, content, member_no) values(2, '제목2', '내용', 1);
insert into pms_board(board_no, title, content, member_no) values(3, '제목3', '내용', 1);
insert into pms_board(board_no, title, content, member_no) values(4, '제목4', '내용', 2);
insert into pms_board(board_no, title, content, member_no) values(5, '제목5', '내용', 2);
insert into pms_board(board_no, title, content, member_no) values(6, '제목6', '내용', 3);
insert into pms_board(board_no, title, content, member_no) values(7, '제목7', '내용', 4);
insert into pms_board(board_no, title, content, member_no) values(8, '제목8', '내용', 4);
insert into pms_board(board_no, title, content, member_no) values(9, '제목9', '내용', 5);
insert into pms_board(board_no, title, content, member_no) values(10, '제목10', '내용', 5);
insert into pms_board(board_no, title, content, member_no) values(11, '제목11', '내용', 5);

-- 게시글 첨부파일 입력 
insert into pms_board_file(board_file_no, filepath, board_no) values(11, 'a1.gif', 1);
insert into pms_board_file(board_file_no, filepath, board_no) values(12, 'a2.gif', 1);
insert into pms_board_file(board_file_no, filepath, board_no) values(13, 'a3.gif', 1);
insert into pms_board_file(board_file_no, filepath, board_no) values(14, 'b1.gif', 3);
insert into pms_board_file(board_file_no, filepath, board_no) values(15, 'b2.gif', 3);
insert into pms_board_file(board_file_no, filepath, board_no) values(16, 'c1.gif', 4);
insert into pms_board_file(board_file_no, filepath, board_no) values(17, 'd1.gif', 5);
insert into pms_board_file(board_file_no, filepath, board_no) values(18, 'e1.gif', 10);
insert into pms_board_file(board_file_no, filepath, board_no) values(19, 'f1.gif', 11);


-- 프로젝트 입력
insert into pms_project(project_no, title, content, start_dt, end_dt, member_no)
values(101, 'project1', 'xxx', '2021-1-1', '2021-2-2', 1);
insert into pms_project(project_no, title, content, start_dt, end_dt, member_no)
values(102, 'project2', 'xxx', '2021-2-1', '2021-3-1', 1);
insert into pms_project(project_no, title, content, start_dt, end_dt, member_no)
values(103, 'project3', 'xxx', '2021-3-1', '2021-4-1', 3);

-- 프로젝트 멤버 입력
insert into pms_project_member(project_no, member_no) 
values (101, 1), (101, 2), (101, 3);

insert into pms_project_member(project_no, member_no) 
values (102, 1), (102, 3);

insert into pms_project_member(project_no, member_no) 
values (103, 3), (103, 2), (103, 4), (103, 5);

-- 작업 상태 입력
insert into pms_task_status(task_status_no, title) values(1110, '신규');
insert into pms_task_status(task_status_no, title) values(1111, '작업중');
insert into pms_task_status(task_status_no, title) values(1112, '완료');
insert into pms_task_status(task_status_no, title) values(1113, '보류');

-- 작업 입력
insert into pms_task(task_no, content, deadline, task_status_no, project_no, member_no)
values(2001, '작업aaa1', '2021-1-20', 1110, 101, 1);
insert into pms_task(task_no, content, deadline, task_status_no, project_no, member_no)
values(2002, '작업aaa2', '2021-2-20', 1111, 101, 2);
insert into pms_task(task_no, content, deadline, task_status_no, project_no, member_no)
values(2003, '작업aaa3', '2021-3-20', 1110, 101, 3);
insert into pms_task(task_no, content, deadline, task_status_no, project_no, member_no)
values(2004, '작업ccc1', '2021-1-20', 1111, 103, 2);
insert into pms_task(task_no, content, deadline, task_status_no, project_no, member_no)
values(2005, '작업ccc2', '2021-1-20', 1111, 103, 4);
insert into pms_task(task_no, content, deadline, task_status_no, project_no, member_no)
values(2006, '작업ccc3', '2021-1-20', 1112, 103, 4);
```



``` sql
-- 회원
DROP TABLE IF EXISTS pms_member RESTRICT;

-- 게시판
DROP TABLE IF EXISTS pms_board RESTRICT;

-- 프로젝트
DROP TABLE IF EXISTS pms_project RESTRICT;

-- 프로젝트멤버
DROP TABLE IF EXISTS pms_project_member RESTRICT;

-- 작업
DROP TABLE IF EXISTS pms_task RESTRICT;

-- 좋아요
DROP TABLE IF EXISTS pms_like RESTRICT;

-- 첨부파일
DROP TABLE IF EXISTS pms_board_file RESTRICT;

-- 내관심게시글
DROP TABLE IF EXISTS pms_mylist RESTRICT;

-- 댓글
DROP TABLE IF EXISTS pms_comment RESTRICT;

-- 작업상태
DROP TABLE IF EXISTS pms_task_status RESTRICT;

-- 회원
CREATE TABLE pms_member (
  member_no  INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
  name       VARCHAR(80)  NOT NULL COMMENT '이름', -- 이름
  email      VARCHAR(50)  NOT NULL COMMENT '이메일', -- 이메일
  password   VARCHAR(100) NOT NULL COMMENT '암호', -- 암호
  photo      VARCHAR(255) NULL     COMMENT '사진', -- 사진
  tel        VARCHAR(30)  NULL     COMMENT '전화', -- 전화
  created_dt DATE         NOT NULL DEFAULT curdate() COMMENT '등록일', -- 등록일
  active     INTEGER      NULL     DEFAULT 1 COMMENT '탈퇴' -- 탈퇴
)
COMMENT '회원';

-- 회원
ALTER TABLE pms_member
  ADD CONSTRAINT PK_pms_member -- 회원 기본키
    PRIMARY KEY (
      member_no -- 회원번호
    );

-- 회원 유니크 인덱스
CREATE UNIQUE INDEX UIX_pms_member
  ON pms_member ( -- 회원
    email ASC -- 이메일
  );

-- 회원 인덱스
CREATE INDEX IX_pms_member
  ON pms_member( -- 회원
    name ASC -- 이름
  );

ALTER TABLE pms_member
  MODIFY COLUMN member_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '회원번호';

-- 게시판
CREATE TABLE pms_board (
  board_no   INTEGER      NOT NULL COMMENT '게시글번호', -- 게시글번호
  title      VARCHAR(255) NOT NULL COMMENT '제목', -- 제목
  content    TEXT         NOT NULL COMMENT '내용', -- 내용
  member_no  INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
  created_dt DATETIME     NOT NULL DEFAULT now() COMMENT '등록일', -- 등록일
  view_cnt   INTEGER      NULL     DEFAULT 0 COMMENT '조회수' -- 조회수
)
COMMENT '게시판';

-- 게시판
ALTER TABLE pms_board
  ADD CONSTRAINT PK_pms_board -- 게시판 기본키
    PRIMARY KEY (
      board_no -- 게시글번호
    );

ALTER TABLE pms_board
  MODIFY COLUMN board_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '게시글번호';

-- 프로젝트
CREATE TABLE pms_project (
  project_no INTEGER      NOT NULL COMMENT '프로젝트번호', -- 프로젝트번호
  title      VARCHAR(255) NOT NULL COMMENT '제목', -- 제목
  content    TEXT         NOT NULL COMMENT '내용', -- 내용
  start_dt   DATE         NOT NULL COMMENT '시작일', -- 시작일
  end_dt     DATE         NOT NULL COMMENT '종료일', -- 종료일
  member_no  INTEGER      NOT NULL COMMENT '회원번호' -- 회원번호
)
COMMENT '프로젝트';

-- 프로젝트
ALTER TABLE pms_project
  ADD CONSTRAINT PK_pms_project -- 프로젝트 기본키
    PRIMARY KEY (
      project_no -- 프로젝트번호
    );

-- 프로젝트 인덱스
CREATE INDEX IX_pms_project
  ON pms_project( -- 프로젝트
    title ASC -- 제목
  );

ALTER TABLE pms_project
  MODIFY COLUMN project_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '프로젝트번호';

-- 프로젝트멤버
CREATE TABLE pms_project_member (
  project_no INTEGER NOT NULL COMMENT '프로젝트번호', -- 프로젝트번호
  member_no  INTEGER NOT NULL COMMENT '회원번호' -- 회원번호
)
COMMENT '프로젝트멤버';

-- 프로젝트멤버
ALTER TABLE pms_project_member
  ADD CONSTRAINT PK_pms_project_member -- 프로젝트멤버 기본키
    PRIMARY KEY (
      project_no, -- 프로젝트번호
      member_no   -- 회원번호
    );

-- 작업
CREATE TABLE pms_task (
  task_no        INTEGER NOT NULL COMMENT '작업번호', -- 작업번호
  project_no     INTEGER NOT NULL COMMENT '프로젝트번호', -- 프로젝트번호
  member_no      INTEGER NOT NULL COMMENT '회원번호', -- 회원번호
  content        TEXT    NOT NULL COMMENT '내용', -- 내용
  deadline       DATE    NOT NULL COMMENT '마감일', -- 마감일
  task_status_no INTEGER NOT NULL COMMENT '작업상태번호' -- 작업상태번호
)
COMMENT '작업';

-- 작업
ALTER TABLE pms_task
  ADD CONSTRAINT PK_pms_task -- 작업 기본키
    PRIMARY KEY (
      task_no -- 작업번호
    );

ALTER TABLE pms_task
  MODIFY COLUMN task_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '작업번호';

-- 좋아요
CREATE TABLE pms_like (
  member_no INTEGER NOT NULL COMMENT '회원번호', -- 회원번호
  board_no  INTEGER NOT NULL COMMENT '게시글번호' -- 게시글번호
)
COMMENT '좋아요';

-- 좋아요
ALTER TABLE pms_like
  ADD CONSTRAINT PK_pms_like -- 좋아요 기본키
    PRIMARY KEY (
      member_no, -- 회원번호
      board_no   -- 게시글번호
    );

-- 첨부파일
CREATE TABLE pms_board_file (
  board_file_no INTEGER      NOT NULL COMMENT '첨부파일번호', -- 첨부파일번호
  filepath      VARCHAR(255) NOT NULL COMMENT '첨부파일명', -- 첨부파일명
  board_no      INTEGER      NOT NULL COMMENT '게시글번호' -- 게시글번호
)
COMMENT '첨부파일';

-- 첨부파일
ALTER TABLE pms_board_file
  ADD CONSTRAINT PK_pms_board_file -- 첨부파일 기본키
    PRIMARY KEY (
      board_file_no -- 첨부파일번호
    );

ALTER TABLE pms_board_file
  MODIFY COLUMN board_file_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '첨부파일번호';

-- 내관심게시글
CREATE TABLE pms_mylist (
  member_no INTEGER NOT NULL COMMENT '회원번호', -- 회원번호
  board_no  INTEGER NOT NULL COMMENT '게시글번호' -- 게시글번호
)
COMMENT '내관심게시글';

-- 내관심게시글
ALTER TABLE pms_mylist
  ADD CONSTRAINT PK_pms_mylist -- 내관심게시글 기본키
    PRIMARY KEY (
      member_no, -- 회원번호
      board_no   -- 게시글번호
    );

-- 댓글
CREATE TABLE pms_comment (
  comment_no INTEGER  NOT NULL COMMENT '댓글번호', -- 댓글번호
  content    TEXT     NOT NULL COMMENT '내용', -- 내용
  created_dt DATETIME NOT NULL DEFAULT now() COMMENT '작성일', -- 작성일
  member_no  INTEGER  NOT NULL COMMENT '회원번호', -- 회원번호
  board_no   INTEGER  NOT NULL COMMENT '게시글번호' -- 게시글번호
)
COMMENT '댓글';

-- 댓글
ALTER TABLE pms_comment
  ADD CONSTRAINT PK_pms_comment -- 댓글 기본키
    PRIMARY KEY (
      comment_no -- 댓글번호
    );

ALTER TABLE pms_comment
  MODIFY COLUMN comment_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '댓글번호';

-- 작업상태
CREATE TABLE pms_task_status (
  task_status_no INTEGER     NOT NULL COMMENT '작업상태번호', -- 작업상태번호
  title          VARCHAR(80) NOT NULL COMMENT '상태명' -- 상태명
)
COMMENT '작업상태';

-- 작업상태
ALTER TABLE pms_task_status
  ADD CONSTRAINT PK_pms_task_status -- 작업상태 기본키
    PRIMARY KEY (
      task_status_no -- 작업상태번호
    );

-- 작업상태 유니크 인덱스
CREATE UNIQUE INDEX UIX_pms_task_status
  ON pms_task_status ( -- 작업상태
    title ASC -- 상태명
  );

ALTER TABLE pms_task_status
  MODIFY COLUMN task_status_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '작업상태번호';

-- 게시판
ALTER TABLE pms_board
  ADD CONSTRAINT FK_pms_member_TO_pms_board -- 회원 -> 게시판
    FOREIGN KEY (
      member_no -- 회원번호
    )
    REFERENCES pms_member ( -- 회원
      member_no -- 회원번호
    );

-- 프로젝트
ALTER TABLE pms_project
  ADD CONSTRAINT FK_pms_member_TO_pms_project -- 회원 -> 프로젝트
    FOREIGN KEY (
      member_no -- 회원번호
    )
    REFERENCES pms_member ( -- 회원
      member_no -- 회원번호
    );

-- 프로젝트멤버
ALTER TABLE pms_project_member
  ADD CONSTRAINT FK_pms_member_TO_pms_project_member -- 회원 -> 프로젝트멤버
    FOREIGN KEY (
      member_no -- 회원번호
    )
    REFERENCES pms_member ( -- 회원
      member_no -- 회원번호
    );

-- 프로젝트멤버
ALTER TABLE pms_project_member
  ADD CONSTRAINT FK_pms_project_TO_pms_project_member -- 프로젝트 -> 프로젝트멤버
    FOREIGN KEY (
      project_no -- 프로젝트번호
    )
    REFERENCES pms_project ( -- 프로젝트
      project_no -- 프로젝트번호
    );

-- 작업
ALTER TABLE pms_task
  ADD CONSTRAINT FK_pms_project_member_TO_pms_task -- 프로젝트멤버 -> 작업
    FOREIGN KEY (
      project_no, -- 프로젝트번호
      member_no   -- 회원번호
    )
    REFERENCES pms_project_member ( -- 프로젝트멤버
      project_no, -- 프로젝트번호
      member_no   -- 회원번호
    );

-- 작업
ALTER TABLE pms_task
  ADD CONSTRAINT FK_pms_task_status_TO_pms_task -- 작업상태 -> 작업
    FOREIGN KEY (
      task_status_no -- 작업상태번호
    )
    REFERENCES pms_task_status ( -- 작업상태
      task_status_no -- 작업상태번호
    );

-- 좋아요
ALTER TABLE pms_like
  ADD CONSTRAINT FK_pms_member_TO_pms_like -- 회원 -> 좋아요
    FOREIGN KEY (
      member_no -- 회원번호
    )
    REFERENCES pms_member ( -- 회원
      member_no -- 회원번호
    );

-- 좋아요
ALTER TABLE pms_like
  ADD CONSTRAINT FK_pms_board_TO_pms_like -- 게시판 -> 좋아요
    FOREIGN KEY (
      board_no -- 게시글번호
    )
    REFERENCES pms_board ( -- 게시판
      board_no -- 게시글번호
    );

-- 첨부파일
ALTER TABLE pms_board_file
  ADD CONSTRAINT FK_pms_board_TO_pms_board_file -- 게시판 -> 첨부파일
    FOREIGN KEY (
      board_no -- 게시글번호
    )
    REFERENCES pms_board ( -- 게시판
      board_no -- 게시글번호
    );

-- 내관심게시글
ALTER TABLE pms_mylist
  ADD CONSTRAINT FK_pms_member_TO_pms_mylist -- 회원 -> 내관심게시글
    FOREIGN KEY (
      member_no -- 회원번호
    )
    REFERENCES pms_member ( -- 회원
      member_no -- 회원번호
    );

-- 내관심게시글
ALTER TABLE pms_mylist
  ADD CONSTRAINT FK_pms_board_TO_pms_mylist -- 게시판 -> 내관심게시글
    FOREIGN KEY (
      board_no -- 게시글번호
    )
    REFERENCES pms_board ( -- 게시판
      board_no -- 게시글번호
    );

-- 댓글
ALTER TABLE pms_comment
  ADD CONSTRAINT FK_pms_member_TO_pms_comment -- 회원 -> 댓글
    FOREIGN KEY (
      member_no -- 회원번호
    )
    REFERENCES pms_member ( -- 회원
      member_no -- 회원번호
    );

-- 댓글
ALTER TABLE pms_comment
  ADD CONSTRAINT FK_pms_board_TO_pms_comment -- 게시판 -> 댓글
    FOREIGN KEY (
      board_no -- 게시글번호
    )
    REFERENCES pms_board ( -- 게시판
      board_no -- 게시글번호
    );
```

