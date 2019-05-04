# simple-test
Simple Automation Test

## required binaries
	- java - download java from https://www.java.com/en/download/manual.jsp
	- eclipse - download eclipse from https://www.eclipse.org/downloads/
	- maven - https://maven.apache.org/download.cgi?Preferred=ftp://mirror.reverse.net/pub/apache/
	- git - https://git-scm.com/download/win

1. To clone a project from git source repository
 
git clone https://github.com/amalalex/simple-test.git

1. download maven
	i. ftp://mirror.reverse.net/pub/apache/maven/maven-3/3.6.1/binaries/apache-maven-3.6.1-bin.zip
	ii. extract it c:/soft/apache-maven-3.6.1/bin
	iii. right click This PC -> properties -> evirnoment Variable -> System Variables -> edit Path -> C:\Soft\apache-maven-3.6.1\bin

2. convert the project to a maven project 

     >	c:\temp\simple-test

     > cd ..

     > mvn archetype:generate -DgroupId=com.some.prog -DartifactId=simple-test -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

3.   Java project structure - production - src/main/ (java, resources) and src/test/ (java, resources)	
			
			project-root
				- src
				    main
				      java
				      resources
				    test
				      java
				      resources
				- pom.xml

4. convert the project to eclipse compatible
	
		mvn eclipse:eclipse


5. Go To Eclipse -> Import Project -> General -> Existing Projects into Workspace


6. Add selenium dependencies in pom.xml

	// https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-server

	<!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>3.3.0</version>
    <scope>test</scope>
</dependency>

7. setting up development workspace is done

6. Create a Page Object

		-LoginPage
		-HomePage

7. create a test class

		-LoginTest

8. download and chromedriver

		- http://chromedriver.chromium.org/downloads
		- copy chromedriver to src/test/resources folder
		

9. commit and push to github

		- git add .      #include all the files for commit 
		- git commit -m "login test suite added"  #commit the changes to local repo
		- git push # push to remote source repository like github, bitbucket or internal git source repository
 
