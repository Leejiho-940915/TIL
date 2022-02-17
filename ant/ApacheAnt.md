## Apache Ant
` Ant란 `
- ant는 자바 기반으로 플랫폼에 독립적으로 실행가능하다.
- 운영체제에 구애받지 않고 프로젝트 진행가능
- 미리 정의된 Task를 사용하여 쉽고 빠르게 배치 작업을 설정할 수 있다.
- 새로운 Task의 추가를 통해 배치작업의 확장이 가능하다.

` Task `
- Task는 Ant를 통해서 처리하고자 하는 작업을 나타내는것으로 파일복사,소스코드 컴파일,Javadoc API생성 등 다양한 Task가 미리 정의되어 있다.

` 기본 Build Script `
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project name="sampleproject" default="build_project" basedir=".">
<description>sampleproject build</description>
<property name="webapp.dir" value="."/>
<property name="src.dir" value="${webapp.dir}/src"/>
<property name="classes.dir" value="${webapp.dir}/webapp/WEB-INF/classes"/>
<property name="lib.dir" value="${webapp.dir}/webapp/WEB-INF/lib"/>
<property name="lib.dev.dir" value="${webapp.dir}/lib"/>
<path id="classpath">
<fileset dir="${lib.dir}" includes="**/*.jar"/>
<fileset dir="${lib.dev.dir}" includes="**/*.jar"/>
</path>
<!-- Clean classes directory -->
<target name="clean">
<delete dir="${classes.dir}" />
</target>
<!-- Compile -->
<target name="compile">
<mkdir dir="${classes.dir}" />
<javac srcdir="${src.dir}" destdir="${classes.dir}" debug="true" encoding="utf-8" classpathref="classpath" includeantruntime="false" />
</target>
<!-- Copy Properties -->
<target name="copy_prop">
<copy todir="${classes.dir}" overwrite="true" >
<fileset dir="${src.dir}">
<include name="**/*.properties" />
</fileset>
</copy>
<copy todir="${classes.dir}" overwrite="true" >
<fileset dir="${src.dir}">
<include name="**/*.properties.sample" />
</fileset>
<globmapper from="*.properties.sample" to="*.properties"/>
</copy>
<copy todir="${classes.dir}" overwrite="true" >
<fileset dir="${src.dir}">
<include name="**/*.xml" />
</fileset>
</copy>
</target>
<target name="build_project" depends="clean, compile, copy_prop" />
</project>
```

` project 및 property `
- 프로젝트의 이름을 설정할 수 있고 default build를 설정할 수 있다.
- default build라고 하는것은 Ant Script의 구성 요소 중 Job의 단위인 target이 있는데 Ant Script를 그냥 실행시켰을때 어떤 target을 수행할것인지 정해줄 수 있다.
```xml
<project name="sampleproject" default="build_dev" basedir=".">
	<description>sampleproject build</description>
		<property name="webapp.dir" value="."/>
		<property name="src.dir" value="${webapp.dir}/src"/>
		<property name="classes.dir" value="${webapp.dir}/webapp/WEB-INF/classes"/>
		<property name="lib.dir" value="${webapp.dir}/webapp/WEB-INF/lib"/>
		<property name="lib.dev.dir" value="${webapp.dir}/lib"/>
```


` Classpath `
- 클래스패스를 정의하는 역할을 한다. 
- 다른것과 달리 이건 path 태그를 사용한다. 
- 빌드를 하는데 필요한 library를 정의한다. 
- 프로젝트에 여기저기 library가 흩여져 있으면 이곳에 모두 모아서 정의를 해준다. 
```xml
<path id="classpath">
<fileset dir="${lib.dir}" includes="**/*.jar"/>
<fileset dir="${lib.dev.dir}" includes="**/*.jar"/>
</path>
```


` Clean `
- clean은 전에 빌드한 결과물에 대해서 삭제를 해주는 역할을 한다.
- 기존 빌드를 지우지 않으면 빌드 결과물이 꼬일수 있으므로 웬만하면 clean을 먼저 하고 빌드를 하는것을 권한다.
```xml
<target name="clean">
	<delete dir="${classes.dir}" />
</target>
```

` Complie `
- Java Source와 위에서 정의한 Classpath를 토대로 소스 빌드를 수행한다.
- 빌드의 결과물은 class 파일로 생성이 되고 이것을 destdir로 정의한 곳으로 보낸다.
- javac에는 아래와 같이 다양한 속성들을 설정할 수 있다.
  - ` scrdir `
    - compile할 java 파일이 위치한 경로 (필수)
  - ` destdir `
    - compile한 class파일들이 위치할 경로
  - ` debug `
    - compile시 debug정보를 출력할지 여부 (off)
  - ` encoding `
    - 소스의 encoding 설정
  - ` classpathref `
    - 참조할 classpath
  - ` includeantruntime `
    - 정의한 classpath 외에 ant의 runtime library를 추가여부
  - ` verbose `
    - compile시 진행상황을 보여줄 것인지 여부 (no)
  - ` failonerror `
    - build 실패시 에러를 표시할 것인지 여부 (true)
```xml
<target name="compile">
	<mkdir dir="${classes.dir}" />
	<javac srcdir="${src.dir}" destdir="${classes.dir}" debug="true" 
	encoding="utf-8" classpathref="classpath" includeantruntime="false" />
</target>
```


` Copy property, xml `
- property라고 써놨지만 application에서 공통으로 사용되는 외부 환경설정파일을 뜻한다.
- copy todir은 이곳에다가 복사를 하겠다라는 것이다.
  - 무엇을? fileset에 있는 properties로 끝나는 모든 파일들을 말이다.
- 즉 소스에 있는 properties로 끝나는 모든 파일들을 ${classes.dir} 로 정의한 곳으로 복사하겠다는 것이다. 
- 아래에 나오는 globmapper는 치환을 해주는 역할을 한다.
- 즉 properties.sample이라는 파일이 있으면 복사할때 이건 모두 properties로 치환해서 복사를 하라는 뜻이다. 
- 이것을 응용하여 phase (dev, qa, prd) 에 맞게 파일을 치환해서 구성을 할 수 있다. 
```xml
<target name="copy_prop">
	<copy todir="${classes.dir}" overwrite="true" >
		<fileset dir="${src.dir}">
			<include name="**/*.properties" />
		</fileset>
	</copy>
	<copy todir="${classes.dir}" overwrite="true" >
		<fileset dir="${src.dir}">
			<include name="**/*.properties.sample" />
		</fileset>
		<globmapper from="*.properties.sample" to="*.properties"/>
	</copy>
	<copy todir="${classes.dir}" overwrite="true" >
		<fileset dir="${src.dir}">
			<include name="**/*.xml" />
		</fileset>
	</copy>
</target>
```


` Build `
- 위의 여러 과정들을 엮어서 하나의 target으로 정의한다.
- depends라는 attribute가 이런 역할을 해주고 앞에서부터 순서대로 정의된 target을 실행시킨다. 
- 보통은 위처럼 clean해서 비우고 compile하고 추가로 파일을 넣어준다. 
- 그리고 다른곳에서 이 Ant Build를 활용하기 위해서는 이 build_project를 이용을 한다.
```xml
<target name="build_project" depends="clean, compile, copy_prop" />
```