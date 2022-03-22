## Ant Copy Task
- 파일 또는 리소스 컬렉션을 새 파일 또는 디렉터리에 복사합니다.
- 기본적으로 원본 파일이 대상 파일보다 최신이거나 대상 파일이 존재하지 않는 경우에만 파일이 복사됩니다.
- 그러나 속성 으로 파일을 명시적으로 덮어쓸 수 있습니다 .
- 리소스 컬렉션 은 복사할 파일 그룹을 선택하는 데 사용됩니다. 
- 리소스 컬렉션을 사용하려면 todir 속성을 설정해야 합니다. 
- 일부 리소스(예: 파일 리소스 )는 절대 경로를 이름으로 반환하며 
  - 중첩 매퍼(또는 flatten 속성)를 사용하지 않고 이를 사용한 결과는 예상과 다를 수 있습니다.
- 복사 작업에 필터를 사용하는 경우 복사를 텍스트 파일로 제한해야 합니다.
- 바이너리 파일은 복사 작업으로 인해 손상됩니다.
## 매개변수
` file `
- 복사할 파일입니다.
  - Required : yes; 중첩된 리소스 컬렉션 요소가 사용되지 않는 한 

` preservelastmodified `
- 복사된 파일에 원본 소스 파일과 마지막 수정 시간을 동일하게 지정합니다.
  - Required : No; 기본값은 "false"

` tofile `
- 복사할 파일입니다. Apache Ant 1.8.2 이전에는 tofile 속성 이 복사할 파일 리소스 만 지원했습니다.
  - file 속성을 사용 하면 tofile 또는 todir 을 사용할 수 있습니다.
  - 중첩된 리소스 컬렉션 요소를 사용하여 포함된 리소스의 수가 1보다 크거나 에 dir 속성만 지정된 <fileset>경우 또는 파일 속성도 지정된 경우에는 todir 만 허용됩니다.

` todir `
- 복사할 디렉터리입니다.
  - - file 속성을 사용 하면 tofile 또는 todir 을 사용할 수 있습니다.
  - 중첩된 리소스 컬렉션 요소를 사용하여 포함된 리소스의 수가 1보다 크거나 에 dir 속성만 지정된 <fileset>경우 또는 파일 속성도 지정된 경우에는 todir 만 허용됩니다.

` overwrite `
- 대상 파일이 최신 버전인 경우에도 기존 파일을 덮어씁니다.
  - Required : No; 기본값은 "false"

` force `
- 읽기 전용 대상 파일을 덮어씁니다. 개미 1.8.2 이후
  - Required : No; 기본값은 "false"

` filtering `
- 복사하는 동안 전역 빌드 파일 필터 를 사용하는 토큰 필터링을 수행해야 하는지 여부를 나타냅니다 . 
- 참고 : 이 속성이 지정되지 않았거나 해당 값이 false , no 또는 off 인 경우에도 중첩 <filterset>요소가 항상 사용 됩니다
  - Required : No; 기본값은 "false"

` flatten `
- 소스 파일의 디렉토리 구조를 무시하고 모든 파일을 todir 속성 으로 지정된 디렉토리에 복사하십시오 
- 병합 매퍼(flatten mapper) 를 사용하여 동일한 효과를 얻을 수 있습니다 .
  - Required : No; 기본값은 "false"

` includeEmptyDirs `
- FileSet에 포함된 모든 빈 디렉터리를 복사합니다.
  - Required : No; 기본값은 "true"

` failonerror `
- false 이면 복사할 파일이 없거나 중첩된 파일 세트 중 하나가 존재하지 않는 디렉토리를 가리키거나 
- 복사하는 동안 오류가 발생하는 경우 경고 메시지를 기록하지만 빌드를 중지하지 마십시오.
  - Required : No; 기본값은 "true"

` quiet `
- true 이고 failonerror 가 false 이면 복사할 파일이 없거나 중첩된 파일 세트 중 하나가
- 존재하지 않는 디렉토리를 가리키거나 복사하는 동안 오류가 발생할 때 경고 메시지를 기록하지 마십시오. 
  - Required : No; 기본값은 "false"

` verbose `
- 복사 중인 파일을 기록합니다.(자세하게)
  - Required : No; 기본값은 "false"

` encoding `
- 파일을 필터 복사할 때 가정할 인코딩입니다. ant 1.5 이후 .
  - Required : No; 기본값은 기본 JVM 문자 인코딩입니다.

` outputencoding `
- 파일을 쓸 때 사용할 인코딩입니다. 
  - Required : No; 설정되어 있으면 기본적으로 인코딩 으로, 그렇지 않으면 기본 JVM 문자 인코딩으로 설정됩니다 .

` enablemultiplemappings `
- true 인 경우 작업은 지정된 소스 경로에 대한 모든 매핑을 처리합니다.
- false 인 경우 작업은 첫 번째 파일 또는 디렉터리만 처리합니다.
- 이 속성은 하위 요소가 있는 경우에만 관련이 있습니다 mapper. ant 1.6 이후
  - Required : No; 기본값은 "false"

` granularity `
- 파일이 오래되었다고 결정하기 전에 허용할 수 있는 시간(밀리초)입니다.
- 이것은 모든 파일 시스템이 마지막 수정 시간을 밀리초 수준으로 추적하는 것을 지원하지 않기 때문에 필요합니다. 
- 이는 소스 및 대상 파일이 동기화되지 않은 클록과 함께 별도의 시스템에 있는 경우에도 유용할 수 있습니다.
- Ant 1.6.2부터 .
  - Required : No; 기본값은 1초 또는 DOS 시스템의 경우 2초입니다.


` 단일 파일 복사 `
```xml
<copy file="myfile.txt" tofile="mycopy.txt"/>
```

` 디렉토리를 다른 디렉토리로 복사 `
```xml
<copy file="myfile.txt" todir="../some/other/dir"/>
```

` 파일 세트를 디렉토리에 복사 `
```xml
<copy todir="../new/dir">
  <fileset dir="src_dir"/>
</copy>
```

` 파일 세트를 디렉토리에 복사하여 다음을 추가합니다..bak즉석에서 파일 이름으로 `
```xml
<copy todir="../dest/dir">
  <fileset dir="src_dir">
    <exclude name="**/*.java"/>
  </fileset>
</copy>

<copy todir="../dest/dir">
  <fileset dir="src_dir" excludes="**/*.java"/>
</copy>
```

` 파일 세트를 디렉토리에 복사하고 다음으로 바꿉니다 @TITLE@.푸 바모든 파일에서. `
```xml
<copy todir="../backup/dir">
  <fileset dir="src_dir"/>
  <globmapper from="*" to="*.bak"/>
</copy>
```

` 현재 CLASSPATH설정의 모든 항목을 대상 디렉토리로 수집하여 디렉토리 구조를 평면화합니다. `
```xml
<copy todir="../backup/dir">
  <fileset dir="src_dir"/>
  <filterset>
    <filter token="TITLE" value="Foo Bar"/>
  </filterset>
</copy>
```

` 일부 리소스를 지정된 디렉토리에 복사합니다. `
- flatten 속성을 사용하지 않은 경우 <file> 리소스는 전체 경로를 소스 및 대상 이름으로 반환하고 전혀 복사되지 않았을 것입니다.
- 일반적으로 절대 경로를 이름으로 사용하는 리소스와 함께 명시적 매퍼를 사용하는 것이 좋습니다.
```xml
<copy todir="dest" flatten="true">
  <path>
    <pathelement path="${java.class.path}"/>
  </path>
</copy>
```

` 두 개의 최신 리소스를 대상 디렉터리에 복사합니다. `
```xml
<copy todir="dest" flatten="true">
  <resources>
    <file file="src_dir/file1.txt"/>
    <url url="https://ant.apache.org/index.html"/>
  </resources>
</copy>
```

` 단일 파일을 디렉토리에 복사 `
```xml
<copy todir="dest" flatten="true">
  <first count="2">
    <sort>
      <date xmlns="antlib:org.apache.tools.ant.types.resources.comparators"/>
      <resources>
        <file file="src_dir/file1.txt"/>
        <file file="src_dir/file2.txt"/>
        <file file="src_dir/file3.txt"/>
        <url url="https://ant.apache.org/index.html"/>
      </resources>
    </sort>
  </first>
</copy>
```

