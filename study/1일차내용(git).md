Web Application 구성요소
 Java App- 출력할 데이터를 가공
```java
- 입력한    "        저장/조회/변경/삭제				
- 사용자 인증(Authenticaion):로그인
- 사용자 권한(Authorization):관리자,일반,손님
```


HTML	- 화면구성<Java App 에서 준비한 데이터를가지고

CSS	- 화면의 모양을 제어(색상,크기,위치 등)

Java Script -화면의 동작 제어 오후 9:26 2021-06-28



깃허브
cd 주소(들어가기)
cd ..  (방에서나가기)
cd git(git방 들어가기)
dir(디렉터리 확인하기)
git clone {주소} (주소의공간으로이동)
git add . (백업할파일의 명단작성)
git config하기(최초 1번만)
git commit -m "백업에대한설명"  (명단에등록된파일을 백업하기)
git push
:user name=Leejiho-940915
:password = 메일로보낸 토큰 복사

내파일올리고 수정해서 올렸을때			
1번 add 
2번 commit
3번 git push
다른방의 파일가져오기
그방으로 이동후 git pull

깃허브 사용법
1. 깃허브 계정 생성 github.com
2. git 클라이언트 설치  git-scm.com  
   (설치도중 업데이트 관련해서 none이라고 나오는거 표시 그외에는 그대로 진행)
3. github>Settings>Developer settings(보안을 위한 임시암호) >Personal access tokens>Generate new token
   (프로젝트 시 생성하기)
4. 명령 프롬프트 실행
5. $git clone {주소} 주소의 공간으로 이동
6. $git config --glodal user.name    최초 한번만 하기
   $git config --glodal user.email
7. $git add . (백업할 파일의 명단작성)
8. $git commit -m "백업에 대한 설명"  (명단에 등록된 파일을 백업하기)
9. git push

-다른사람이올리 소스코드 가져오기 해당주소 이동후
-  $git pull




