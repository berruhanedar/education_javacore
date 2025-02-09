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

Without JDK, you cannot write or run Java code.

---

### **4. What is JRE (Java Runtime Environment) ?**
**JRE (Java Runtime Environment)**, is the environment required to run Java applications. It includes:
- **JVM (Java Virtual Machine)** - Executes Java bytecode
- **Java Kütüphaneleri** – Essential libraries for running Java programs
- **Çalışma zamanı dosyaları** – Necessary files for Java execution


If you only need to run Java programs, you can install JRE instead of JDK. However, JRE **is not sufficient for writing or compiling Java code.**.

---


### **5. What is JVM (Java Virtual Machine) ?**
**JVM (Java Virtual Machine)**,  is a virtual machine that runs Java programs. Thanks to the JVM, Java is platform-independent because Java code is converted into **bytecode** (.class files) that can run on any operating system.

Functions of the JVM:
- **Executes bytecode**
- **Manages memory (Garbage Collection)**
- **Supports multithreading**
- **Ensures platform independence**
---

### **6. What is Compiler ?**
**Compiler** , s a program that translates high-level programming languages written by humans into machine code or bytecode. In Java, the compiler is called `javac`.

**Java Compilation Process:**
1. **Write Java code:** `MyClass.java`
2. **Run the compiler (`javac`) :** `javac MyClass.java`
3. **Generate bytecode (`.class` file) :** `MyClass.class`
4. **JVM executes the bytecode**
---

### **7. What is Interpreter ?**
**Interpreter ,**  is a program that executes code line by line instead of compiling it all at once.
In Java, the **interpreter within the JVM** runs bytecode **line by line**.
**Compiler vs. Interpreter :**
- **Compiler**: Compiles the entire code into an executable format in one go.
- **Interpreter**: Executes the code line by line without compiling it first.

Java uses both a **compiler** (`javac`) and an **interpreter (within the JVM)**. 

### **8. What is Java ?**
Java is an **object-oriented (OOP), platform-independent, secure, multithreaded, and portable** programming language.

1. It was developed by **Sun Microsystems in 1995.**
2. It follows the principle of **"Write Once, Run Anywhere" (WORA).**
3. Java is used in **mobile, web, desktop, and large-scale systems.**
---

### **9. What Are the Features of Java?**
- **Platform Independent:** (Works everywhere thanks to the JVM)
- **Supports Object-Oriented Programming (OOP)** 
- **Secure:** (Includes memory management and security mechanisms)
- **Supports Multithreading** (Simultaneous thread execution)
- **Automatic Memory Management (Garbage Collection)** 
- **Supports Distributed and Network-Based Applications**
---



### **10. What is Primitive Types ?**
In Java, primitive types are simple data types that store values directly in memory.

| Data Type | Size | Default Value  | Range              |
|-----------|------|----------------|--------------------|
| `byte`    | 1B   | 0              | -128 to 127        |
| `short`   | 2B   | 0              | -32,768 to 32,767  |
| `int`     | 4B   | 0              | -2^31 to 2^31-1    |
| `long`    | 8B   | 0L             | -2^63 to 2^63-1    |
| `float`   | 4B   | 0.0f           | ~7 digits          |
| `double`  | 8B   | 0.0d           | ~15 digits         |
| `char`    | 2B   | '\u0000'       | Unicode characters |
| `boolean` | 1B   | `false`        | `true` or `false`  |
---

# **11. Java Primitive Types - Detailed Explanation**
In Java, **Primitive Types** are basic and lightweight data types. They are used for **memory management, fast processing, and low memory consumption.** Primitive types are stored directly in memory and are not objects (`Object`).

There are **8 primitive types** in Java:
- **Integer types:** `byte`, `short`, `int`, `long`
- **Floating-point numbers:** `float`, `double`
- **Character type:** `char`
- **Boolean type:** `boolean`

Wrapper classes are used in **Java Collections API** because collections can only store objects.

----
**`javac` (Java Compiler) and the bytecode process** can affect the compilation time and the size of the generated `.class` file. Below is a detailed explanation of how this happens.
---

## **1. `javac` Compiler and Compilation Time**
### **Factors Affecting Compilation Time**
- **Complexity of Code:**
    - Projects containing more **classes, methods, and lines of code** take longer to compile.
    - In large projects, dependencies and `import`ed libraries can extend compilation time.

- **Optimized Compilation (`javac` Options):**
    - **Incremental Compilation:**
        - If only the modified classes are compiled, the `javac` time is reduced.
    - **Debugging Options (`-g:none`):**
        - The `javac -g:none` command generates bytecode without debugging information, which can shorten compilation time.
    - **Multithreading Support:**
        - In large projects, build systems like **Gradle** provide multithreading support, which reduces compilation time.

- **Hardware and JVM Configuration:**
    - Systems using faster CPUs and SSDs will have reduced compilation time.
    - Insufficient RAM or low processing power can increase compilation time.

---

## **2. Bytecode and File Size**
**Bytecode** is a **platform-independent intermediate code** generated by `javac` and stored in `.class` files.

### **Factors Affecting Bytecode File Size**
1. **Content and Complexity of the Code:**
    - Long methods, more lines of code, and additional `class` definitions increase the file size.

2. **Local Variables and Constant Pool:**
    - Java’s **String Constant Pool** and other constant variable management mechanisms can increase the `.class` file size in code with a **large number of strings or constants**.

3. **Used Optimizations:**
    - **JVM Optimizations:**
        - The JVM performs optimizations when running bytecode using techniques like the **Just-In-Time (JIT) Compiler**.
    - **Inline Code Usage:**
        - Replacing `final` and `static` variables at compile-time can increase the bytecode size.

4. **Lombok, Annotation Processing, and Libraries:**
    - Libraries like **Lombok and Spring** that perform **automatic code generation** can increase the `.class` file size.
    - **Annotation Processing** can generate additional code at compile-time, leading to a larger file size.

5. **Obfuscation and Minification:**
    - If the code is **shrunk using optimization tools like ProGuard or R8**, the bytecode file size will decrease.
    - The use of **R8 and ProGuard in Android projects** is a common technique for reducing bytecode size.

---
## **3. The Effect of Sample Code on Compilation Time and Bytecode Size**
Let's compare the following two codes:

### **Code 1 – Simple Java Code**
```java
public class SimpleClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

```
- **Compilation Time::** Very short (~milliseconds)
- **Bytecode Size:** Small (~1-2 KB)

---

### **Code 2 – Larger and More Complex Code**
```java
import java.util.ArrayList;

public class ComplexClass {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(i);
        }
        System.out.println(numbers.size());
    }
}

```
- **Compilation Time::** Longer (~milliseconds to seconds)
- **Bytecode Size:** Larger (~10-20 KB)

---

## **4. Conclusion**
- **The complexity of the code and the structures used affect both the compilation time and the bytecode size.**
- **Optimized compilation (`javac -g:none`, tools like ProGuard) can reduce bytecode size.**
- **In large projects, compilation time can vary depending on hardware and multithreading support.**
- **A large number of classes, long methods, and a big constant pool increase both compilation time and bytecode size.**

**Summary:** More lines of code, large classes, extra library usage, and complex structures not only extend compilation time but also increase the size of `.class` files.

---

# **Java Variable Naming Rules and Best Practices**
In Java, variable naming rules are divided into **syntax rules** and **best practices**. Failing to follow syntax rules results in compilation errors, while not following best practices makes the code harder to read and maintain.

---

## **1. Java Variable Naming Syntax Rules**
In Java, variable naming must follow these mandatory rules:

### ✅ **Valid Variable Naming Rules**
1. **Letters** from the alphabet (`a-z`, `A-Z`) can be used.  
2. **Digits** (`0-9`) can be used, but the variable name cannot start with a digit.  
3. **Underscore** `_` and **dollar sign** `$` can be used.  
4. **Java reserved keywords** (such as `int`, `class`, `static`, `for`, `if`) cannot be used as variable names.


### ❌ **Invalid Variable Naming Examples**
| **Invalid Variable** | **Reason** |
|------------------------|-----------------|
| `1number`             | Cannot start with a digit |
| `int`                 | Reserved Java keyword |
| `first-name`          | Hyphen - is not allowe|
| `@value`              | Special character @ is not allowed |
| `my variable`         | Cannot contain spaces |

---

### ✅ **1. Camel Case Usage (Recommended)**
In Java, **camelCase** is used for variable names:
• The first word starts with a **lowercase letter**, and the following words start with **uppercase letters**.

**Example:**
```java
int studentAge;
double accountBalance;
String firstName;
boolean isActive;
```

### ✅ **2. Choose Meaningful and Descriptive Names**
- Avoid short and meaningless variable names.
- Use names that describe what the variable does or what data it holds.

❌ Bad Example:
```java
int x;
double y;
```

✅ Good Example:
```java
int studentCount;
double totalSalary;
```

---

### ✅ **3. Variable Names Should Start with a Lowercase Letter**
- In Java, **variables start with a lowercase letter**, and subsequent words start with uppercase letters.

❌ Bad Example:
```java
int StudentCount;
```
✅ Good Example:
```java
int studentCount;
```

---

### ✅ **4. `UPPER_CASE` for Constant Values **
- `final` variables should be written in uppercase letters with underscores (_).

✅ **Good Example (for Constants)**:
```java
final double PI = 3.14159;
final int MAX_USERS = 100;
```

---

### ✅ **5. No Spaces or Special Characters**
Variable names should not contain spaces or special characters  (`@`, `#`, `!`, `-`, `%`)** kullanılamaz.

❌ Invalid:
```java
int my variable;
String first-name;
```

✅ Valid:
```java
int myVariable;
String firstName;
```

---

### ✅ **6. Usage of  `_` and `$` (Generally Not Recommended)**
- **`_`** and **`$`**  can be used, but they are generally not recommended for variable names.
- **Special cases:**
    - `_` is generally used for **constant values** (`final static`) 
    - `$` is typically used in **automatically generated code** (e.g., internal Java mechanisms).

✅ Valid:
```java
String _privateVar;  //  Generally avoided  
String $generatedCode;  // Usable but not recommended
```

---

### **What is Data Types ?**
In Java, data types refer to the types of values that variables can hold. They are divided into two main categories:
1. **Primitive Types**
2. **Reference Types**
---


## **1. General Characteristics of Java Primitive Types**
1. **They Are Not Objects**

   - Primitive variables are stored directly in memory.
   - **Wrapper classes** like `Integer`, `Double` are objects, while **primitive types** like `int`, `double` are not.

2. **More Efficient:**
  - Since they are stored directly in memory instead of objects, operations are performed faster.
  - If `Integer` is used instead of `int`, extra objects are created in heap memory.
 
3. **They Have Default Values:**
  - Primitive variables start with **default values** (e.g., `0` for `int`, `false` for `boolean`).

4. **They Store Values, Not References:**

  - Primitive types are **value-based,** meaning the value is stored directly inside the variable.
  - When `int x = 10;` is declared, the value `10` is stored in `x`.

---

# **2. Java Primitive Data Types**
Below is a detailed explanation of **Java's 8 primitive data types.**

## **A. Integer Types**
These data types store **whole numbers (integers).**

| **Type** | **Size** | **Range**         | **Default Value** |
|----------|----------|-------------------|-------------------|
| `byte`   | 1 byte   | -128 to 127       | 0                 |
| `short`  | 2 byte   | -32,768 to 32,767 | 0                 |
| `int`    | 4 byte   | -2³¹ to (2³¹-1)   | 0                 |
| `long`   | 8 byte   | -2⁶³ to (2⁶³-1)   | 0L                |

### **1. `byte` (1 Byte - Small Integers)**
- Used for **memory efficiency.**
- Suitable for **small values.**
- Useful for storing **a list of 100 students' IDs, for example.**

```java
byte smallNumber = 100;
byte minByte = -128;
byte maxByte = 127;
```

### **2. `short` (2 Bytes - Medium-Sized Integers)**
- Bigger than `byte`, smaller than `int`.
- Used to **optimize memory usage.**

```java
short shortNumber = 32000;
short minShort = -32768;
short maxShort = 32767;
```

### **3. `int` (4 Bytes - Standard Integers)**
- The **most commonly used** integer type in Java.
- By default, **integer values are of type** `int`.

```java
int myAge = 25;
int totalUsers = 500000;
int minInt = -2147483648;
int maxInt = 2147483647;
```

### **4. `long`(8 Bytes - Large Integers)**
- Used for very **large numbers.**
- **Requires an `L` suffix** (`long number = 10000000000L;`).

```java
long population = 7800000000L; // World population
long distanceToSun = 149600000000L; // Distance to the sun (km)

```

---

## **B.  Floating-Point Types**
Used for **decimal numbers (floating-point arithmetic).**

| **Type** | **Size** | **Precision** | **Default Value** |
|----------|----------|---------------|-------------------|
| `float`  | 4 byte   | ~7 decimal places   | 0.0f              |
| `double` | 8 byte   | ~15 decimal places | 0.0d              |

### **1. `float` (4 Bytes - Less Precise)**
Takes **less memory** but may have **precision loss.**
Requires an`f` **suffix** (`float pi = 3.14f;`).

```java
float pi = 3.14159f;
float gravity = 9.81f;
```

### **2. `double` (8 Bytes - More Precise)**
- Used for **precise mathematical calculations**.
- **Default floating-point type** in Java.

```java
double precisePi = 3.141592653589793;
double speedOfLight = 299792458.0;
```

---

## **C. `char` (Character Type)**
- Stores a **single character.**
- Supports **Unicode**, meaning it can store characters from all languages and symbols.

```java
char letter = 'A';
char digit = '5';
char symbol = '@';
char smiley = '\u263A'; // ☺ Unicode character
```

---

## **D. `boolean`  (Logical Data Type)**
- Can store **only two values:** `true` or `false`
Commonly used in **control structures (if, while, for).**

```java
boolean isJavaFun = true;
boolean isRaining = false;
```

---

# **3. Default Values of Primitive Types**
If a primitive variable is **not initialized,** it takes the following **default values:**

| **Data Type** | **Default Value** |
|---------------|-----------------|
| `byte`        | 0               |
| `short`       | 0               |
| `int`         | 0               |
| `long`        | 0L              |
| `float`       | 0.0f            |
| `double`      | 0.0d            |
| `char`        | '\u0000'  (Empty character) |
| `boolean`     | false           |

---

# **4. Difference Between Primitive and Wrapper Classes**
Java provides **Wrapper Classes** for primitive types, allowing them to be used as objects.

| **Primitive Type** | **Wrapper Class** |
|-------------------|-----------------|
| `byte`           | `Byte`           |
| `short`          | `Short`          |
| `int`            | `Integer`        |
| `long`           | `Long`           |
| `float`          | `Float`          |
| `double`         | `Double`         |
| `char`           | `Character`      |
| `boolean`        | `Boolean`        |

Örneğin:
```java
int x = 10;
Integer y = Integer.valueOf(x); // Primitive -> Wrapper (Boxing)
int z = y.intValue(); // Wrapper -> Primitive (Unboxing)

```

---

# Differences Between **Primitive Types** and **Wrapper Types** in Java

---

## 1. **What are Primitive Types and Wrapper Types?**
- **Primitive Types**: These are the most basic data types in Java. They store values directly in memory and are **more memory efficient**.
- **Wrapper Types**: These are Java classes that allow primitive types to be used as objects. Since Java collections (like List, Set, Map) work with objects, primitive types need their object counterparts (wrapper types) when used with collections.

---

## 2. **Comparison Between Primitive Types and Wrapper Types**

| **Feature**              | **Primitive Types**          | **Wrapper Types**          |
|--------------------------|------------------------------|----------------------------|
| **Definition**           | Types that store values directly. | Classes that wrap primitive types. |
| **Memory Usage**         | Uses less memory and is more efficient. | Consumes more memory (extra object creation). |
| **Storage**              | Stored in the stack memory.  | Stored in the heap memory (as objects). |
| **Value Type**           | Value type.                  | Reference type (object).   |
| **Can Be Null?**         | **No** (cannot be null).     | **Yes** (can be null).     |
| **Default Value**        | `int` → 0, `double` → 0.0, `boolean` → false, etc. | `null` (if the object is not initialized). |
| **Object Behavior**      | Not an object, performs calculations directly. | Is an object, has methods. |
| **Usage in Collections** | **Cannot be used directly** (e.g., `List<int>` is not allowed). | **Can be used** (e.g., `List<Integer>` is valid). |
| **Conversion Process**   | Requires boxing & unboxing.  | Can be converted to primitive types via boxing & unboxing. |

---

## 3. **Primitive Types and Their Corresponding Wrapper Types**

| **Primitive Type** | **Wrapper Class** |
|--------------------|-------------------|
| `byte`             | `Byte`            |
| `short`            | `Short`           |
| `int`              | `Integer`         |
| `long`             | `Long`            |
| `float`            | `Float`           |
| `double`           | `Double`          |
| `char`             | `Character`       |
| `boolean`          | `Boolean`         |

---

## 4. **Examples and Explanations**

### 4.1 **Using Primitive Types**
```java
public class PrimitiveExample {
    public static void main(String[] args) {
        int x = 10;
        double y = 20.5;
        boolean isJavaFun = true;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Is Java fun? " + isJavaFun);
    }
}
```
In this case, x, y, and isJavaFun are stored directly in memory, and no objects are created.

---

### 4.2 Using Wrapper Types
```java
public class WrapperExample {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(10);
        Double y = Double.valueOf(20.5);
        Boolean isJavaFun = Boolean.TRUE; // Or new Boolean(true) (older usage)

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Is Java fun? " + isJavaFun);
    }
}
```
Here, x, y, and isJavaFun are stored as objects in the heap memory.

---

### 5. Autoboxing and Unboxing (Conversion Between Primitive and Wrapper Types)
Java 5 introduced **Autoboxing and Unboxing**, which allow automatic conversion between primitive and wrapper types.

#### 5.1 Autoboxing (Primitive → Wrapper)
Primitive types are automatically converted into wrapper objects.
```java
public class AutoboxingExample {
    public static void main(String[] args) {
        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue; // Autoboxing

        System.out.println("Wrapper Integer: " + wrapperValue);
    }
}
```
This code is equivalent to: `Integer wrapperValue = Integer.valueOf(primitiveValue);`

---

#### 5.2 Unboxing (Wrapper → Primitive)
Wrapper types are automatically converted back into primitive values.
```java
public class UnboxingExample {
    public static void main(String[] args) {
        Integer wrapperValue = 200;
        int primitiveValue = wrapperValue; // Unboxing

        System.out.println("Primitive int: " + primitiveValue);
    }
}

```
This code is equivalent to: `int primitiveValue = wrapperValue.intValue();`

## 6. **Use Case Scenarios for Primitive Types vs. Wrapper Types**

| **Scenario**                        | **Primitive Usage**  | **Wrapper Usage**   |
|-------------------------------------|----------------------|---------------------|
| **Performance & Speed Important**   | ✅ Faster            | ❌ Slower           |
| **Memory Efficiency**               | ✅ Uses less memory  | ❌ Uses more memory |
| **Usage in Collections (List, Set, Map)** | ❌ Cannot be used    | ✅ Can be used      |
| **Can Assign Null Values**          | ❌ Not possible      | ✅ Possible         |
| **Object-Oriented Programming**     | ❌ Not suitable      | ✅ Can be used as an object |
| **Method Operations**               | ❌ No methods        | ✅ Has methods (e.g., `Integer.parseInt()`, `Double.valueOf()`) |

---

## 7. **When to Use Which Type?**
- **If performance is critical and you're not using collections → Primitive types should be used.**
- **If working with collections (List, Map, Set) or need an object-oriented structure → Wrapper types should be used.**
- **If null values are required → Wrapper types should be preferred.**
- **For calculations → Primitive types are faster and more efficient.**

---

## 8. **Conclusion**

| **Topic**                          | **Primitive Type**    | **Wrapper Type**     |
|-------------------------------------|-----------------------|----------------------|
| **Memory Usage**                    | Uses less memory      | Uses more memory     |
| **Speed**                           | Faster                | Slower               |
| **Can Be Null?**                    | ❌ No                 | ✅ Yes               |
| **Is an Object?**                   | ❌ No                 | ✅ Yes               |
| **Can Be Used in Collections?**     | ❌ No                 | ✅ Yes               |

📌 **In summary**, use **primitive types** when performance is required, and **wrapper types** when working with collections or object-oriented structures.

💡 **Question:** Why is `List<int> list = new ArrayList<>();` incorrect?  
📌 Because **primitive types cannot be used in collections**. You should use **wrapper types** like `List<Integer> list = new ArrayList<>();`.

This detailed explanation will help you clearly understand the differences between primitive and wrapper types! 🚀

---

# **Conclusion**
- **Primitive types** are stored directly in memory and are not objects.
- **They are faster and consume less memory**.
- **There are 8 basic types:** `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.
- **They offer the most efficient methods for mathematical operations and control.**

**Primitive types form the core of Java and provide significant performance advantages! 🚀**




















