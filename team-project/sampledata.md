상태 = 승인여부로 바꾸기

신청일 등록

목표금액  = 롱타입으로 바꾸기



``` sql
-- 모금함 (1.아동 2.청소년 3.노인 4.장애인 5.동물 6.환경 7.기타), (1.승인대기 2.승인 3.반려)
insert into ftp_funding(funding_no,funding_category_no, user_org_no,title, content, tel, email, start_dt,end_dt, goal, status)
values(1, 4, 1, 1, '장애인을 도와주세요', '내용: 장애인을 도와주세요!', '010-1234-5555', 'sysout@test.com','2021-10-18','2021-11-11', 10000000, 3);

insert into ftp_funding(funding_no,funding_category_no, user_org_no,title, content, tel, email, start_dt,end_dt, goal, status)
values(2, 1, 1, 1, '아동을 도와주세요', '내용: 아동을 도와주세요!', '010-1234-6666', 'sysout@test.com','2021-11-18','2021-12-11', 20000000, 3);

insert into ftp_funding(funding_no,funding_category_no, user_org_no,title, content, tel, email, start_dt,end_dt, goal, status)
values(3, 2, 1, 1, '청소년을 도와주세요', '내용: 청소년을 도와주세요!', '010-1234-7777', 'sysout@test.com','2022-1-18','2022-2-11', 30000000, 3);

insert into ftp_funding(funding_no,funding_category_no, user_org_no,title, content, tel, email, start_dt,end_dt, goal, status)
values(4, 3, 1, 1, '노인을 도와주세요', '내용: 노인을 도와주세요!', '010-1234-8888', 'sysout@test.com','2022-3-18','2022-4-11', 40000000, 3);


-- 모금함카테고리 (1.아동 2.청소년 3.노인 4.장애인 5.동물 6.환경 7.기타)
insert into ftp_donation_category(funding_category_no, category_title)
values(1,'아동');

insert into ftp_donation_category(funding_category_no, category_title)
values(2,'청소년');

insert into ftp_donation_category(funding_category_no, category_title)
values(3,'노인');

insert into ftp_donation_category(funding_category_no, category_title)
values(4,'장애인');

insert into ftp_donation_category(funding_category_no, category_title)
values(5,'동물');

insert into ftp_donation_category(funding_category_no, category_title)
values(6,'환경');

insert into ftp_donation_category(funding_category_no, category_title)
values(7,'기타');
```

