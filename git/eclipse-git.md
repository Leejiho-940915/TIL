` git `

##### eclipse 에서 git add, commit, push하기

- ` Window`  ->  ` Show view `  ->  ` Other  `  ->  ` Git `  ->  `  Git Repositories `, ` Git Staging` 
- ` Git Staging` 
  - 1. 파일 변경하고 저장하면 ` Unstaged Changes ` 로 올라가져서 목록을 볼 수있다.
    2.  ` Unstaged Changes ` 의 목록을  ` Staged Changes `  로 옮긴다.  
       ===> 커맨드창에서 ` git add . ` 한것과 같다.
    3. ` Commit Message `에 커밋메세지 입력후 ` Commit `클릭
       ===> 커맨드창에서 ` git commit -m "커밋메세지" ` 한것과 같다.
       - ` Commit and Push `를 클릭하게 되면 커밋과 동시에 바로 푸쉬가 가능하다.
       - 커밋을 하는것은 백업한 명단을 스냅샷(다같이 사진을 찍는다는 개념) 한다
- `  Git Repositories `
  - 최상위 폴더만 보여진다.
    - 예) bitcamp-study 라는 폴더안에 java-basic과 study-project 폴더가 있지만 bitcamp-study 가 최상위 폴더로써 하위 폴더는 보이지않는다.
    - 깃 커밋을 할때 최상위폴더안에서 커밋푸쉬를 하게되면 하위폴더안에 모든내용이 푸쉬된다.
    - 하지만, 모든폴더를 커밋하고 싶지 않다면 하위폴더에서 깃커밋을하게되면 해당폴더포함한 그 밑의 하위폴더만 푸쉬가 된다.
  - 해당폴더 마우스 우클릭후  ` push to  origin `
    - ` user ` : Leejiho-940915
    - ` Password ` : 깃허브 토큰
    - ` Store in Secure Store `  체크시 아이디 비밀번호 저장
      - 내컴퓨터에만 체크해놓을것.

` 이클립스 폴더명 아이콘 `

` > `

- 꺽새는 백업된이후 변경된것

` ? `

- ?는 한번도 백업이 안된것

