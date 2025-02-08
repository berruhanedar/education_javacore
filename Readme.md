# Java Core
[Github](https://github.com/berruhanedar/education_javacore)

[Git](https://git-scm.com/downloads)

[JDK](https://www.oracle.com/tr/java/technologies/downloads/#jdk23-windows)

[Intellij Idea Community](https://www.jetbrains.com/idea/download/?section=windows)



## Git
```sh
git init
git add .
git git commit -m "add message"
git push -u origin master

git clone https://github.com/berruhanedar/education_javacore
```
---


## Java Common Rules
```sh
Class names : are written in Pascal Case.
Class names : should not be verbs.
Class : In Java, there is only one public class per file (excluding inner classes).
Class : Java does not have static classes at the top level (except for inner classes).

Package names : are written in lowercase.
Package names : should not be verbs.
Package names : should be short and concise.

In Java, every statement must end with a semicolon(;).

```
---


## Java Core Information
```sh
Java is case-sensitive, meaning it distinguishes between uppercase and lowercase letters.
```
---


## 1. What is Maven?

Maven is a **build automation** tool used for building, managing, and automating Java projects. Developed by Apache, it simplifies dependency management, compilation, testing, and deployment processes, particularly in Java-based projects. Maven uses an XML-based configuration file called `pom.xml` to define project settings and dependencies.

### **Key Features of Maven:**
- **Dependency Management:** Automatically downloads required libraries for the project.
- **Project Structure Standardization:** Organizes projects in a standard format.
- **Automated Compilation:** Compiles the project (`mvn compile`).
- **Test Execution:** Runs tests using tools like JUnit and TestNG (`mvn test`).
- **Packaging:** Packages the project as a `jar` or `war` file (`mvn package`).
- **Deployment Management:** Deploys applications to remote servers or repositories (`mvn deploy`).

---


### **2. What is `pom.xml`?**
`pom.xml` (**Project Object Model**) file is the central configuration file for Maven projects. It defines project dependencies, versioning, plugins, and configurations.

Example `pom.xml` File:
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>my-app</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>2.7.4</version>
        </dependency>
    </dependencies>
</project>
```
What This File Contains:
- Project Identity  (`groupId`, `artifactId`, `version`)
- Dependencies (`dependencies`)
- Build Configurations
---

### **3. What is JDK (Java Development Kit)?**
**JDK (Java Development Kit)**, is a development environment used for building Java applications. It includes:
- **JRE (Java Runtime Environment)** : Runtime environment for executing Java applications
- **JVM (Java Virtual Machine)** : The virtual machine that runs Java bytecode
- **Java Compiler (javac)** : Compiles Java source code into bytecode
- **Java Debugger (jdb)** : Debugging tool for Java applications
- **Java API ve kütüphaneleri** :Essential libraries for Java development

JDK olmadan Java kodu yazılamaz ve çalıştırılamaz.
---


## Java Core
```sh


```
---


## Java Core
```sh


```
---