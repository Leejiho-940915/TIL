# Linux 파일(File) 관련 명령어(Command)



- ` ls ` = 디렉토리(directory) 목록 **나열**하기 (윈도우에 dir과 같은 명령어)
- ` ls -al ` = 숨김파일(hidden file)도 포함한 **상세 목록 나열**하기
- ` cd dir ` = 지정 dir(해당폴더) 로 작업 디렉토리 **이동**하기
- ` pwd ` = **현재 작업 디렉토리 보여주기**(**현재위치**)
- ` mkdir dir` = 지정 dir **생성**하기
- ` rm file ` = 지정 파일 **삭제**하기 **주의!** 삭제시에 현재위치 권한부여등 다 체크하기!
- ` rm -r dir ` = 지정 dir **삭제**하기 **주의!** 삭제시에 현재위치 권한부여등 다 체크하기!
- ` rm -rf dir ` = 지정 dir **강제로 삭제**하기. **주의!** 위에 rm 명령어는 삭제시 한번더 되묻고 삭제가 되지만 **해당 명령어는 바로 강제 삭제 된다. 리눅스는 휴지통이 없으니 명심하자!**
- ` cp file1 file2 ` = 파일1을 파일2로 **복사**하기
- ` cp -r dir1 dir2 ` = 디렉토리 dir1을 dir2로 **복사하기 만일 dir2가 없으면 파일 dir2가 자동 생성됨**
- ` mv file1 file2 ` = (**변경**) file1에서 file2로 이동, 이름변경함. 만일 file2가 존재하는 디렉터리이면, 디렉토리 fil1은 디렉토리 file2로 이동됨.
- ` touch file ` = (**생성**) file 생성 또는 갱신(update)
- ` cat > file ` = 표준입력(standard input: 키보드 입력)을 지정 file 로 지정함
- ` more file ` = 지정 file 내용을 화면에 출력함
- ` head file ` = 지정 file 의 **첫** 10줄을 화면 출력함
- ` tail file ` = 지정 file 의 **끝** 10줄을 화면 출력함
- ` tail -f file ` = 지정 file의 끝 10줄부터 10줄씩 계속 화면을 출력함, 종료명령 ctrl + C



# 파일 접근권한(File Permissions) 관련 명령어

- ` chmod octal file ` = 지정된 8진수 값(octal)으로 지정된 file의 접근권한 변경함, 추가적 옵션들은 man chmod 참조