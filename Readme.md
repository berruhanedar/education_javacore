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

## Wrapper new Usage

---
If we want to create **wrapper classes** using the `new` keyword, we can write it as follows by using the **wrapper class** of each primitive type:

```java
public class WrapperExample {
    public static void main(String[] args) {
        Byte wrapperTypeByte = new Byte((byte) 127);
        wrapperTypeByte = null; // Wrapper classes can be null
        System.out.println(wrapperTypeByte);

        Short wrapperTypeShort = new Short((short) 32767);
        Integer wrapperTypeInt = new Integer(2147483647);
        Long wrapperTypeLong = new Long(9223372036854775807L);

        Float wrapperTypeFloat = new Float(14.23f);
        Double wrapperTypeDouble = new Double(14.23);

        Boolean wrapperTypeBoolean = new Boolean(true);
        Character wrapperTypeChar = new Character('a');

        System.out.println("Short: " + wrapperTypeShort);
        System.out.println("Integer: " + wrapperTypeInt);
        System.out.println("Long: " + wrapperTypeLong);
        System.out.println("Float: " + wrapperTypeFloat);
        System.out.println("Double: " + wrapperTypeDouble);
        System.out.println("Boolean: " + wrapperTypeBoolean);
        System.out.println("Character: " + wrapperTypeChar);
    }
}
```
### **Important Notes**
1. **Usage of `new` Is Not Recommended in Java 9 and Later**
    - Starting from Java 9, using `new Byte()`, `new Integer()`, etc., has been **deprecated**.
    - Instead, **direct assignment** should be used:
      ```java
      Byte wrapperTypeByte = 127;  // Recommended usage
      ```
    - **Why:** Due to the **autoboxing** mechanism in Java, these types can automatically be converted to wrapper classes without using `new`.

2. **Performance and Memory Management**
    - Using `new` **creates unnecessary objects, filling up heap memory**.
    - For example:
      ```java
      Integer a = 100;  // Autoboxing (Recommended usage)
      Integer b = new Integer(100); // Creates a new object in heap memory
      ```
    - **If you use `new Integer(100)`, a new object will be created in the heap, leading to unnecessary memory consumption.**

### **Conclusion**
- **If you're not working with older versions** and have no specific reason, you should prefer the **autoboxing** method without using `new`.
- **If you're working with Java 9+**, avoid using `new` and instead use direct assignments. 🚀

---

## Stack Memory (Primitive) vs Heap Memory (Wrapper)

---
### **Differences Between Primitive Stack Memory and Wrapper Heap Memory in Java**

In Java, **primitive data types** (**int, double, boolean, char, float, long, short, byte**) and **wrapper classes** (**Integer, Double, Boolean, Character, Float, Long, Short, Byte**) are stored in different areas of memory. The biggest difference between these two types is related to **stack and heap memory management**. Let's examine these differences **in great detail**.

---

## **1. Definition of Stack and Heap Memory**

In Java memory management, there are **two main areas**:
- **Stack Memory:** Small, fast, and easy to manage. **Primitive data types are stored here.**
- **Heap Memory:** Larger, slower, but more flexible. **Wrapper classes (data stored as objects) are stored here.**

---

## **2. Comparison of Stack and Heap Memory**

| **Feature**          | **Stack Memory**        | **Heap Memory**        |
|----------------------|-------------------------|------------------------|
| **Stored Data Types** | Primitive variables (`int, double, char`) | Objects and Wrapper classes (`Integer, Double, Character`) |
| **Memory Management** | LIFO (Last In First Out) | Managed by Garbage Collector |
| **Speed**             | Very fast               | Relatively slower       |
| **Access Time**       | Access to stack variables is **faster** | Access to heap variables is **slower** |
| **Lifetime**          | Exists during the execution of a method | Can exist as long as the program runs |
| **Memory Size**       | Smaller                 | Larger                 |
| **Multithread Usage** | Specific to each thread (each thread has its own stack) | Heap memory is **shared by all threads** |
| **Automatic Cleanup** | Automatically cleaned up, no need for Garbage Collector | Managed by Garbage Collector, cleaned when needed |

---

## **3. Memory Usage Difference Between Primitive and Wrapper**

### **A) Primitive Data Types (Stack)**

Primitive data types are **stored directly as values** in memory. For example:

```java
int x = 10;
```

- The variable `x` is stored in **stack memory**.
- The stack manages variables quickly and **automatically cleans up** when the function ends.

Memory organization in the stack looks like this:

```
Stack Memory:
+----------------------+
| int x = 10          |
+----------------------+
```

---
### **B) Wrapper Classes (Heap)**

If we use a **wrapper class** (object) instead of a primitive type:

```java
Integer y = new Integer(10);
```

In this case, the memory structure looks like this:
- The variable `y` is stored as a **reference** in the **stack**.
- The object created by `new Integer(10)` is stored in **heap memory**.
- A reference (address) is held in the stack to access the object stored in the heap.

```
Stack Memory:
+----------------------+
| Integer y (ref: 0xA) |
+----------------------+

Heap Memory:
+----------------------+
| [Integer: 10] (0xA) |
+----------------------+
```
That is, while a **primitive variable contains the value directly**, wrapper classes **store references and the actual data is kept in the heap**.

## **4. Detailed Example: Comparing Stack and Heap**

Now, let's look at the following code to understand the difference between stack and heap:

```java
public class MemoryTest {
    public static void main(String[] args) {
        int a = 5;
        Integer b = new Integer(5);
        
        modify(a, b);
        
        System.out.println("a: " + a);  // 5
        System.out.println("b: " + b);  // 5
    }
    
    public static void modify(int x, Integer y) {
        x = 10;       // Stack içindeki x değişir
        y = new Integer(10); // Yeni bir nesne oluşturulur (Heap)
    }
}
```

### **Code Execution Logic**
1. `int a = 5;` → **The value 5 is stored directly in the stack.**
2. `Integer b = new Integer(5);` → **A new Integer object is created in the heap. The reference is stored in the stack.**
3. When calling the `modify(a, b);` method:
    - `x` → a new stack variable that **copies the value 5** (pass by value).
    - `y` → a reference that **receives a new Integer object**.
4. `x = 10;` → **A new variable is created in the stack and the value is changed.**
5. `y = new Integer(10);` → **A new Integer object is created in the heap, but it only affects the `modify` method and does not affect the `b` variable in the main method.**
6. When the `main` method finishes, `a` remains `5` and `b` remains `5`.

This happens because **primitives cannot be modified (pass-by-value) and wrapper objects lose their references when a new object is created**.

---

## **5. Wrapper Classes and Automatic Boxing / Unboxing**
Java provides automatic conversion between primitive types and wrapper classes. This is known as **Autoboxing and Unboxing**.

### **Autoboxing (Primitive → Wrapper)**
```java
int primitiveValue = 100;
Integer wrapperValue = primitiveValue; // Autoboxing
```

- Here, **`primitiveValue`** is automatically converted to an `Integer` object and stored in the heap.

### **Unboxing (Wrapper → Primitive)**
```java
Integer wrapperValue = 200;
int primitiveValue = wrapperValue; // Unboxing
```

- `wrapperValue` is retrieved from the heap and assigned to the `primitiveValue` variable stored on the stack.

These conversions can lead to **performance losses** because primitive types are faster due to no heap access.

---

## **6. When to Use Primitive vs Wrapper Types?**
| Use Case | Use Primitive (Stack) | Use Wrapper (Heap) |
|----------|-----------------------|---------------------|
| **Memory Efficiency** | ✅ | ❌ (Heap uses more memory) |
| **Performance (Faster Access)** | ✅ | ❌ (Heap access is slower) |
| **Object-Oriented Programming (OOP)** | ❌ | ✅ (Can be used with object properties) |
| **Nullable Values (Null Assignment)** | ❌ | ✅ (Primitive can't be null, wrapper can) |
| **Collection (List, Set, Map)** | ❌ | ✅ (Primitive types can't be used in collections) |

If **memory and speed are important**, we should use **primitive types**.  
If **object-oriented programming, null value storage, or working with collections (List, Set, Map) is required**, we should use **wrapper classes**.

---


## **Conclusion**
- **Primitive variables are stored in stack memory, hold their values directly, and are faster.**
- **Wrapper classes are stored in heap memory, accessed via references, and use more memory.**
- **Automatic Boxing/Unboxing allows for conversions, but performance considerations should be kept in mind.**

Based on this information, it is important to choose the most appropriate memory usage strategy according to the project's requirements. 🚀

---

## Wrapper `new` Usage
```sh 
Short wrapperTypeShort = new Short((short) 32767); 
bununla Short wrapperTypeShort 2=32767 arasındaki far nedir ?
```
---

In Java, let's examine the difference between the following two lines:

```java
Short wrapperTypeShort1 = new Short((short) 32767); //Explicit Object Creation - new
Short wrapperTypeShort2 = 32767; // Autoboxing
```

The fundamental differences between these two approaches are:

---

## **1. `new Short((short) 32767)` Usage (Creates a New Object in Heap Memory)**

```java
Short wrapperTypeShort1 = new Short((short) 32767);
```

- Since the `new` keyword is not used, **no new object is created** each time.
- **Autoboxing** occurs, and Java internally uses cached wrapper objects for values within certain ranges (like `-128` to `127` for `Short`).
- **Heap memory usage is minimized**, and **performance improves** due to reused cached objects.
- **Comparing using `==`** will return `true` when both references point to the same cached object.
- This approach is preferred and recommended for performance and memory efficiency.

---

## **2. `Short wrapperTypeShort2 = 32767;` Usage (Autoboxing - Cached Object Usage)**
```java
Short wrapperTypeShort2 = 32767;
```

- **Autoboxing** automatically converts the primitive `short` value to a `Short` object.
- **Java uses a caching mechanism** for `Integer` and `Short` types.
- For small number ranges (between `-128` and `127`), **objects are fetched from the cache**.
- **It is more performant** because it doesn't create a new object each time.

---

## **Proof of Differences: Comparison Test**
We can observe the difference by running the following code:

```java
public class ShortComparison {
    public static void main(String[] args) {
        Short wrapperTypeShort1 = new Short((short) 127);
        Short wrapperTypeShort2 = 127; // Autoboxing
        
        Short wrapperTypeShort3 = new Short((short) 127);
        Short wrapperTypeShort4 = 127; // Autoboxing
        
        System.out.println(wrapperTypeShort1 == wrapperTypeShort3); // false (Heap'te farklı nesneler)
        System.out.println(wrapperTypeShort2 == wrapperTypeShort4); // true (Cache mekanizması sayesinde aynı nesne)
        
        Short wrapperTypeShort5 = 32767;
        Short wrapperTypeShort6 = 32767;

        System.out.println(wrapperTypeShort5 == wrapperTypeShort6); // false (Çünkü cache dışında)
    }
}
```

---

## **Results**
1. **If you use `new`**, a **new object** is created in heap memory, and the `==` operator returns `false` because they are different objects.
2. **If you write `Short wrapperTypeShort2 = 32767;`**, Java **uses autoboxing**.
3. **Java caches values between `-128` and `127**, so for these values, `==` comparison might return `true`. However, for larger values like `32767`, new objects are created because they are outside the cache range.

---

## **Which Approach Should We Prefer?**
✔ **For performance reasons, `Short wrapperTypeShort = 32767;` (Autoboxing) should be preferred.**  
❌ **Using `new Short((short) 32767)` causes unnecessary memory consumption and is not recommended.**

Therefore, **avoiding object creation with `new` and preferring autoboxing is the best practice.**

---

## Java Life-Cycles

---
### **Compiler or Interpreter First in Java?**
The execution process of Java programs involves **both a compiler and an interpreter**, but **the compiler runs first, followed by the interpreter**.

1. **Compiler Runs First:**
    - Java source code (`.java` files) is converted into **Bytecode** (`.class` files) by the **Javac (Java Compiler)**.
    - Bytecode is **platform-independent**, meaning it can run on any environment.

2. **Interpreter Runs Next:**
    - The **Java Virtual Machine (JVM)** takes the Bytecode and uses the **Just-In-Time (JIT) Compiler** to convert it into executable machine code.
    - The JVM **interprets and executes the Bytecode line by line**.

### **Java Program Life-Cycle**
Let's break down the life cycle of a Java program step by step:

---

## **1. Software Phase (Source Code - `.java` File)**
The developer writes the **Java source code** (`.java` files).  
For example:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

---
## **2. Compilation Phase (Derleme Aşaması)**
The Java **compiler** (`javac`) converts the source code into **Bytecode**.

### **What happens during this phase:**
- **Syntax check:** The compiler (`javac`) checks the syntax errors in the code.
- **Optimization:** The code is optimized for better performance.
- **Bytecode generation:** A **machine-independent** `.class` file is created.


### **Compilation (Derleme) Command:**
```sh
javac HelloWorld.java
```

 **After the Compilation Command, the Following File is Created:**
```
HelloWorld.class
```
**This `.class` File Contains Java Bytecode:**

## **3. ClassLoader Stage**
Java **ClassLoader** loads `.class` files into the JVM.

- **Bootstrap ClassLoader:** Loads Java's core classes (`java.lang.*`).
- **Extensions ClassLoader:** Loads additional libraries (those in the `lib/ext` directory).
- **Application ClassLoader:** Loads the user-written classes.

---

## **4. Bytecode Verification**
- **JVM checks the security of Bytecode.**
- **Prevents the execution of faulty or malicious code.**
- **Blocks memory overflow or illegal memory access.**

---

## **5. Interpreter Stage**
- **Java Interpreter** reads and executes Bytecode **line by line**.
- However, **constant interpretation can be slow**, which is why the **JIT (Just-In-Time) Compiler** comes into play.

---

## **6. Just-In-Time (JIT) Compiler Stage**
- The JIT Compiler takes **repeated code and converts it directly into machine code**.
- **Improves JVM performance**, as it prevents the need to repeatedly interpret the same code.

---

## **7. Runtime**
- **Garbage Collector (GC):** Cleans up unused objects from memory.
- **Thread Management:** Manages scheduling between multiple processes.
- **Exception Handling:** Catches errors that occur during runtime.

---

## **8. Program Exit**
If everything goes correctly, the program’s output is printed to the screen:
```sh
Hello, World!
```

---

### **General Summary: Java Execution Cycle**
1. **Source Code (`.java`) is written.**
2. **Java Compiler (`javac`) converts the code into Bytecode (`.class`).**
3. **ClassLoader** loads the `.class` file into the JVM.
4. **Bytecode Verification** performs a security check.
5. **Interpreter** interprets and runs Bytecode **line by line**.
6. **JIT Compiler** converts frequently used code into **machine code** (improves performance).
7. **Garbage Collector** cleans up unused memory.
8. **Program output is printed to the screen.**

---

### **Compiler vs. Interpreter: Which Comes First?**
✅ **The Compiler (`javac`) runs first → Then the Interpreter (`JVM`) runs.**  
🚀 **Result:** Java is both a **compiled** and **interpreted** language.


### **What are Java Core Escape Sequences?**
In Java, **escape sequences** are special characters that start with a backslash (`\`) and allow us to use special characters inside a String. They represent characters that cannot be written directly.

💡 **For example:**
- `"` double quote cannot be written directly in a String. (`"This is a "sample" text"`) → Incorrect
- Solution: Use the escape sequence `\"`. (`"This is a \"sample\" text"`) → Correct

---

## **Escape Sequences in Java**
| **Escape Sequence** | **Meaning** | **Example Usage** |
|---------------------|-------------|-------------------|
| `\n` | New line | `"Line 1\nLine 2"` |
| `\t` | Tab | `"Name:\tJohn"` |
| `\'` | Single quote | `char c = '\'';` |
| `\"` | Double quote | `"This is a \"sample\" text"` |
| `\\` | Backslash | `"C:\\Users\\Documents"` |
| `\r` | Carriage return | `"Hello\rWorld"` |
| `\b` | Backspace | `"ABC\bD"` (Result: "ABD") |
| `\f` | Form feed (page break) | `"Page break\fNew Page"` |
| `\uXXXX` | Unicode character | `"\u00E7"` (ç character) |

---

## **Examples**
### **1. `\n` → New Line r**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya!\nBu bir alt satıra geçti.");
    }
}
```
**Output:**
```
Merhaba Dünya!
Bu bir alt satıra geçti.
```
---

### **2. `\t` → Tab**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Name:\tAhmet");
        System.out.println("Surname:\tYılmaz");
    }
}
```
**Output:**
```
İsim:     Ahmet
Soyisim:  Yılmaz
```

---

### **3. `\'` ve `\"` → ' and " **
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Bu bir \"Java\" programıdır.");
        System.out.println("Tek tırnak: \'A\' karakteri");
    }
}
```
**Output:**
```
Bu bir "Java" programıdır.
Tek tırnak: 'A' karakteri
```

---

### **4. `\\` → \ **
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Dosya yolu: C:\\Users\\Documents\\file.txt");
    }
}
```
**Output**
```
Dosya yolu: C:\Users\Documents\file.txt
```

---
### **5. `\r` → Carriage Return**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Merhaba\rDünya!");
    }
}
```
**Output**
```
Dünya!
```
📌 `\r`, moves the cursor to the beginning of the line, and "World!" overwrites "Hello".

---

### **6. `\b` → Backspace**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("ABC\bD");
    }
}
```
**Output:**
```
ABD
```
📌 `\b`  escape sequence represents backspace, which deletes the last character.

---

### **7. `\f` → Form Feed (Sayfa Sonu)**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Sayfa sonu\fYeni Sayfa");
    }
}
```

📌  In most modern systems**, the \f (form feed) character is invisible, but it was traditionally used as a page break or form feed command in printers and old terminals.

---

### **8. `\uXXXX` → Unicode **
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Türkçe karakter: \u00E7, \u011F, \u015F");
    }
}
```
**Output:**
```
Türkçe karakter: ç, ğ, ş
```
📌 **Unicode** allows special characters to be used in all languages.

---

## **Conclusion**
- In Java, **escape sequences** allow us to use special characters within a String.
- The most commonly used ones: `\n` (new line), `\t` (tab), `\"` (double quote), `\\` (backslash).
- **Advanced usage:** With Unicode (`\uXXXX`), we can write special characters inside a String.

📌 **In summary:** If you want to write special characters inside a text, you need to use **escape sequences**! 🚀

----
# **Java Scanner Class (java.util.Scanner) – Detailed Explanation**

## **1. What is Scanner?**
**Scanner** is a class in Java used for **reading input from the user**, **reading data from files**, and **parsing strings**. It is found in the **java.util.Scanner** package.

In Java, it is used for operations like **taking input from System.in (keyboard input), reading from files (File), reading from strings**, and more.

---
## **2. Uses of the Scanner Class**
| **Use Case**                 | **Description**                                                                |
|------------------------------|--------------------------------------------------------------------------------|
| **Getting input from the user** | With `Scanner`, we can take input from the keyboard.                          |
| **Reading from files**        | We can read data from files line by line or word by word.                     |
| **String parsing**            | We can split string expressions based on a specific delimiter.                |
| **Converting data types**     | We can convert string values into types like `int`, `double`, `boolean`, etc. |


---
## **3. Importing the Scanner Class**
Since the Scanner class is located in the **java.util** package, it needs to be **imported** before use:
```java
import java.util.Scanner;
```

💡 **If we don’t write `import java.util.Scanner;`, Java won’t recognize this class and will throw an error!**

---

## **4. Taking Input from the User with Scanner**
Using the Scanner class, we can take **different types of input**:

### **4.1. Reading String Data (`next()` and `nextLine()`)**
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String ad = scanner.next();  // Tek kelime okur

        System.out.print("Soyadınızı girin: ");
        String soyad = scanner.next();  // Tek kelime okur

        System.out.print("Cümlenizi girin: ");
        scanner.nextLine(); // Önceki enter'ı temizler
        String cumle = scanner.nextLine(); // Bütün satırı okur

        System.out.println("Adınız: " + ad);
        System.out.println("Soyadınız: " + soyad);
        System.out.println("Girdiğiniz cümle: " + cumle);

        scanner.close();
    }
}
```
---
### **Differences:**
| **Method** | **Description** |
|------------|-----------------|
| `next()`   | Reads **a single word**. It stops reading when it encounters a space. |
| `nextLine()` | Reads the **entire line**. It waits until the Enter key is pressed. |

💡 **Note:** If methods like `next()` or `nextInt()` are used before `nextLine()`, a `scanner.nextLine();` line should be added to clear the Enter key character.

---

### **4.2. Reading Numeric Data (`nextInt()`, `nextDouble()`, `nextFloat()`, `nextLong()`)**
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        System.out.print("Boyunuzu girin: ");
        double boy = scanner.nextDouble();

        System.out.print("Ağırlığınızı girin: ");
        float agirlik = scanner.nextFloat();

        System.out.println("Yaşınız: " + yas);
        System.out.println("Boyunuz: " + boy);
        System.out.println("Kilonuz: " + agirlik);

        scanner.close();
    }
}
```
### **Methods and Data Types**
| **Method**         | **Accepted Data Type**     |
|--------------------|----------------------------|
| `nextInt()`        | `int` (Integer)            |
| `nextDouble()`     | `double` (Decimal number)  |
| `nextFloat()`      | `float` (Small decimal)    |
| `nextLong()`       | `long` (Large integer)     |
| `nextShort()`      | `short` (Small integer)    |
| `nextByte()`       | `byte` (Very small integer)|
| `nextBoolean()`    | `boolean` (true/false)     |

📌 **Note:** If the user enters incorrect input (for example, entering `a` when `nextInt()` expects a number), it will result in an error (`InputMismatchException`).

---

## **5. Reading from Files with Scanner**
The Scanner class is used not only for **reading input from the keyboard**, but also for **reading data from files**.
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerExample {
    public static void main(String[] args) {
        try {
            File file = new File("veri.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String satir = scanner.nextLine();
                System.out.println(satir);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı!");
        }
    }
}
```
### **Explanations:**
- `new File("data.txt")` → Opens the `"data.txt"` file.
- `hasNextLine()` → **Continues reading as long as there are lines left in the file.**
- `nextLine()` → **Reads the file line by line.**
- If the file doesn't exist, a `FileNotFoundException` will be thrown.

---

## **6. Splitting Strings Based on a Delimiter with Scanner**
Scanner can be used to split strings based on **commas, spaces, or special characters**.

```java
import java.util.Scanner;

public class ScannerDelimiterExample {
    public static void main(String[] args) {
        String veri = "Ahmet,Mehmet,Ayşe,Fatma";
        Scanner scanner = new Scanner(veri);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        scanner.close();
    }
}
```
### **Output:**
```
Ahmet
Mehmet
Ayşe
Fatma
```

📌 **Summary:** We set **comma** as the delimiter with `scanner.useDelimiter(",")`.

---

## **7. Closing the Scanner (`close()`)**
The Scanner object must be **closed after use**, otherwise, a resource leak may occur.

```java
scanner.close();
```

💡 **If the Scanner is not closed, it can cause a memory leak!**

---

## **8. Repeatedly Getting Input from the User with Scanner**
If we need to **continuously get input** from the user, we can use a **loop**.

```java
import java.util.Scanner;

public class ScannerLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (Enter -1 to exit): ");
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Exiting.");
                break;
            }

            System.out.println("You entered: " + number);
        }

        scanner.close();
    }
}

```

📌 **The user can continue inputting data until they enter `-1`.**

---

## **9. Summary**
- **Scanner** is used for **getting input from the user**, **reading files**, and **parsing strings**.
- Different data types can be read using methods like `nextInt()`, `nextDouble()`, `nextLine()`, `next()`.
- **To read data from files**, `Scanner(File file)` can be used.
- **To split by a specific character**, `useDelimiter()` can be applied.
- It should be closed with `scanner.close();` to prevent resource leaks.

🚀 **Scanner is one of the most commonly used classes for input in Java!**

---
## Conditional

---
# **What are Conditional Statements in Java?**

**Conditional statements** allow a program to follow different paths based on specific conditions. We control the execution of certain blocks using **logical comparisons and conditions**.

The main conditional statements used in Java are:

1. `if` and `if-else` statements
2. `else if` (multiple conditions)
3. `switch-case` structure
4. **Ternary (`?:`) operator**
5. **Short-Circuit (`&&` and `||`) operators**

---

## **1. `if` and `if-else` Structure**
### **1.1 `if` Statement**
- **The code is executed when the condition is true.**
- **If false, nothing happens.**

**Example 1: Simple `if` usage**
```java
public class IfExample {
    public static void main(String[] args) {
        int number = 10;

        if (number > 5) { // Is the condition true? Yes!
            System.out.println("The number is greater than 5.");
        }
    }
}

```

**Output:**
```
The number is greater than 5.
```
- The if block executed because `number > 5`.

---
### **1.2 `if-else` Structure**
- **If the condition is `true`, the `if` block is executed.**
- **If the condition is `false`, the `else` block is executed.**

**Example 1: Simple `if-else` usage**
```java
public class IfElseExample {
    public static void main(String[] args) {
        int number = 3;

        if (number > 5) {
            System.out.println("The number is greater than 5.");
        } else {
            System.out.println("The number is less than or equal to 5.");
        }
    }
}

```
**Output:**
```
The number is less than or equal to 5.
```
- Since `number = 3` the `if` block did not execute, and the , `else`  block executed.
---
## **2. `else if` (Multiple Conditions)**
- **`else if` is used to test multiple conditions.**
- **The first true condition is executed, and the others are skipped.**

**Example 3: Usage of `else if`**
```java
public class ElseIfExample {
    public static void main(String[] args) {
        int grade = 75;

        if (grade >= 90) {
            System.out.println("Letter Grade: A");
        } else if (grade >= 80) {
            System.out.println("Letter Grade: B");
        } else if (grade >= 70) {
            System.out.println("Letter Grade: C");
        } else {
            System.out.println("Letter Grade: F");
        }
    }
}

```
**Output:**
```
Letter Grade: C
```
- Since `grade = 75`, meaning `grade >= 70`, **only "Letter Grade: C"** was printed.
---
## **3. `switch-case` Structure**
- **Checks if a variable is equal to specific values.**
- **The corresponding `case` is executed based on the condition.**
- **If no `case` matches, the `default` block is executed.**
- **If `break` is not used after each case, all subsequent cases will execute.**

### **Example 4: Day Name with `switch-case`**
```java
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}

```
**Output:**
```
Wednesday
```
- When `day = 3`, `case 3` was executed.

---
## **4. Ternary (`?:`) Operator**
- **Used to shorten conditional statements.**
- **Provides `if-else` logic in a single line.**
- **Usage:**
```java
    (condition) ? "executes if true" : "executes if false"
```
### **Example 5: Usage of the Ternary Operator**
```java
public class TernaryExample {
    public static void main(String[] args) {
        int number = 10;
        String sonuc = (sayi > 5) ? "Big" :  "Small or equal";
        System.out.println(result);
    }
}
```
**Output:**
```
Big
```
- Since `number > 5`, the value `Big` is assigned.

---
## **5. Short-Circuit (`&&` and `||`) Operators**
**Short-circuiting** is an optimization used to **avoid unnecessary calculations**.

| Operator | Description |
|----------|------------|
| `&&` (AND) | If the first condition is `false`, it **does not evaluate** the second condition. |
| `||` (OR) | If the first condition is `true`, it **does not evaluate** the second condition. |
---
### **Example 6: Using Short-Circuit with `&&`**
```java
public class ShortCircuitExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a > 10 && ++b > 15) { // `a > 10` is already false, so it doesn't check the second condition
            System.out.println("Condition met.");
        }
        System.out.println("b: " + b); // b was not incremented!
    }
}
```
**Output:**
```
b: 10
```
- Since `a > 10` is **false**, `++b` does not execute, and `b` remains the same.
---
### **Example 7: Using Short-Circuit with `||`**
```java
public class ShortCircuitExample2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if (x < 10 || ++y > 15) { // `x < 10` is true, so the second condition is not evaluated!
            System.out.println("Condition met.");
        }
        System.out.println("y: " + y); // y was not incremented!
    }
}
```
**Output:**
```
Condition met.
y: 10
```
- Since`x < 10` **is true** `++y` does not execute.

---
## **Conclusion**
| Structure | Purpose |
|-----------|---------|
| `if` | Test a specific condition |
| `if-else` | Execute an alternative block if the condition is false |
| `else if` | Check multiple conditions |
| `switch-case` | Execute based on matching specific values |
| `?:` (Ternary) | Short `if-else` expressions |
| `&&`, `||` | Prevent unnecessary operations with short-circuit logic |

These conditional structures are the building blocks for creating **decision-making mechanisms** in Java programs. 🚀

---

## Loop

# **What is a Loop in Java?**
Loops are used to **repeat an operation until a specific condition is met**. The most commonly used loops in Java are:

1. **for** loop
2. **while** loop
3. **do-while** loop
4. **for-each (enhanced for loop)**

Along with these loops, control statements like **`break` and `continue`** can be used to manage the flow of the loop.

---
## **1. `for` Loop**
The `for` loop is used for performing operations when the **number of repetitions is known**. **Before the loop runs, the condition and the increment/decrement values are defined.**

**Structure:**
```java
for (initial_value; condition; increment/decrement) {
    // Loop block
}
```
### **Example 1: Print from 1 to 5**
```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }
    }
}
```
**Output:**
```
i: 1
i: 2
i: 3
i: 4
i: 5
```
- Starts with `i = 1` 
- Runs as long as `i <= 5`
- In each iteration, `i` is incremented with `i++`.

---
### **Example 2: Print Even Numbers**
```java
public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even number: " + i);
        }
    }
}
```
**Output:**
```
Even number: 2
Even number: 4
Even number: 6
Even number: 8
Even number: 10
```
- Starts with `i = 2`.
- Runs as long as `i <= 10`.
- `i` is **increased by 2** in each iteration with `i += 2`.

---
## **2. `while` Loop**
The `while` loop is a loop that runs **as long as the condition is true**. It is used in situations where the number of iterations is **not known in advance**.

**Structure:**
```java
while (condition) {
    // Loop block
}
```
### **Örnek 3: `while` ile Sayı Yazdırma**
```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        
        while (i <= 5) {
            System.out.println("i: " + i);
            i++; // i is incremented, otherwise it would be an infinite loop.
        }
    }
}
```

**Output:**
```
i: 1
i: 2
i: 3
i: 4
i: 5
```
- **Starts with `i = 1`**.
- **Runs as long as the condition `i <= 5` is true**.
- **In each iteration, `i++` is incremented**.
---

### **Example 4: Get User Input with `while` Loop**
```java
import java.util.Scanner;

public class WhileUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter numbers until you input 5:");

        while (true) {  // Infinite loop
            number = scanner.nextInt();
            if (number == 5) {
                System.out.println("Loop ended.");
                break; // The loop breaks when 5 is entered.
            }
        }
    }
}
```
**Example Input/Output:**
```
Enter numbers until you input 5: 
1
2
3
5
Loop ended.

```
- **The user enters data until 5 is input**.
- **When 5 is entered, the loop ends with `break;`**.

---

## **3. `do-while` Loop**
The `do-while` loop, **executes the loop first and then checks the condition**. **It runs at least once, even if the condition is false.**

**Structure:**
```java
do {
    // Loop block
} while (condition);
```
---

### **Example 5: Get Password from User with `do-while` Loop**
```java
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;

        do {
            System.out.print("Enter the password (1234): ");
            password = scanner.nextInt();
        } while (password != 1234);

        System.out.println("Login successful!");
    }
}
```
**Example Input/Output:**
```
Enter the password (1234): 1111 
Enter the password (1234): 2222 
Enter the password (1234): 1234 
Login successful!
```
- **It repeats until the correct password is entered**.
- **It runs at least once because the `do` block runs first**.

---

## **4. `for-each` Loop**
`for-each` is used to iterate through **arrays and collections** (Array, List, Set, etc.) more easily.

**Syntax:**
```java
for (DataType element : Array/Collection) {
    // Loop body
}
```

---

### **Example 6:  Printing Array Elements with for-each**
```java
public class ForEachExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}

```
**Output:**
```
Number: 10
Number: 20
Number: 30
Number: 40
Number: 50

```

- **`for-each` is more readable compared to the `for` loop.**
- **It is ideal for iterating over arrays, lists, and sets.**
---

## **5. Using `break` and `continue` in Loops**
### **`break`: Terminates the loop completely.**
### **`continue`: Skips the current iteration and moves to the next one.**

---

### **Example 7: Terminating the Loop with `break`**
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // The loop ends when i equals 5.
            }
            System.out.println("i: " + i);
        }
    }
}
```
**Output:**
```
i: 1
i: 2
i: 3
i: 4
```
---

### **Example 8: Skipping with `continue`**
```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip 3
            }
            System.out.println("i: " + i);
        }
    }
}
```
**Output:**
```
i: 1
i: 2
i: 4
i: 5
```
---

## What is the difference between for and while loops?

Java `for` and `while` loops are used to perform repetitive tasks. However, they differ in terms of their intended use and how they operate. Here are the key differences:

---

## **1. Key Differences**
| **Feature**         | **for Loop** | **while Loop** |
|---------------------|--------------|----------------|
| **Purpose**          | Used when the number of iterations is known. | Used when the number of iterations is unknown or dependent on a condition. |
| **Syntax**           | Has a more structured and compact format. | Is more flexible and condition-focused. |
| **Condition Location**| Defined at the beginning (`for` itself). | Can be changed at the beginning or inside the loop. |
| **Counter Usage**    | The counter variable is defined at the beginning of the loop. | The counter can be defined outside and incremented within the loop. |
| **Readability**      | Shorter and more organized. | More flexible, but can sometimes be complex. |
| **Performance**      | Same, but can be optimized depending on usage. |

---

## **2. Syntax and Usage Examples**

### **2.1. `for` Loop**
- Suitable for loops that work with a counter.
- The initialization, condition, and increment are specified on the same line.

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i value: " + i);
}
```
✅ **Advantage**: The loop variable (`i`) is defined within the loop, so it remains **local** and the code is easier to read.

---
### **2.2. `while` Loop**
- Runs as long as the condition is true, and is preferred when the **number of iterations is unknown**.
- The loop variable is usually defined outside.

```java
int i = 0;
while (i < 5) {
        System.out.println("i value: " + i);
i++;
        }
```
✅ **Advantage**: It is **flexible**, as the condition can be modified from elsewhere.

⚠️ **Note!** If the counter is forgotten, there is a risk of entering an **infinite loop**.

---

## **3. Loop Usage Scenarios**

| **Condition** | **for** | **while** |
|---------------|---------|-----------|
| Is the number of iterations known? | ✅ **Yes** | ❌ No |
| Will a counter variable be used? | ✅ Yes | ❌ No |
| Should the usage be compact? | ✅ Yes | ❌ No |
| Can the condition change inside the loop? | ❌ No | ✅ Yes |
| Is there a higher risk of entering an infinite loop? | ❌ Less | ✅ More |

---
## **4. Special Case: `do-while` Loop**
- Similar to the `while` loop, but the **condition is checked at the end**.
- The **loop runs at least once**.

```java
int i = 0;
do {
    System.out.println("i value: " + i);
    i++;
} while (i < 5);

```
✅ **Advantage**: Ideal for taking input from the user or for tasks that need to run at least once.

---

### **Conclusion**
- The **`for` loop** is ideal for situations that require a **specific number of iterations**.
- The **`while` loop** is suitable for tasks that need to run **based on a condition**.
- The **`do-while` loop** is used for cases where the loop is **guaranteed to run at least once**.

**Which loop you choose depends on your needs!** 🚀

---

## **Summary**
| Loop Type   | Purpose                              |
|-------------|--------------------------------------|
| `for`       | Repeats a fixed number of times.     |
| `while`     | Repeats as long as the condition is true. |
| `do-while`  | Runs at least once, then checks the condition. |
| `for-each`  | Used to iterate over arrays and collections. |
---

## break, return, continue

---

### **What are `break`, `return`, and `continue` in Java?**
These three keywords are related to control flow and are used in structures such as loops, methods, and conditional statements. Let's explain how each of them works with detailed examples.

---

## **1. `break` Keyword**
The `break` keyword is typically used to **break (terminate) loops**. It is also used in **`switch-case`** structures.

**How it works:**
- When `break` is called, it **completely terminates the associated loop**.
- When used in nested loops, it only **breaks the loop it is directly inside**.

---

### **Example 1: Breaking the Loop**
```java
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Loop reached 5 and was terminated.");
                break; // Loop ends here.
            }
            System.out.println("i: " + i);
        }
    }
}
```
**Output:**
```
i: 1
i: 2
i: 3
i: 4
Loop reached 5 and was terminated.
```
- When `i == 5`, `break` is executed, and the loop completely terminates.

---

### **Example 2: Using `break` in Nested Loops**
```java
public class NestedBreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break; // Only breaks the inner loop
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}

```

**Output:**
```
i: 1, j: 1
i: 2, j: 1
i: 3, j: 1
```
- - When `j == 2`, the inner loop ends, but the outer loop continues.

---

## **2. `return` Keyword**
The `return` statement is used to return a value from a method or terminate the method completely.

**How it Works:**
- If a method's return type is **`void`**, `return;` will **terminate the method early**.
- If the method's return type is a value (e.g., **int, String, boolean, etc.**), it is mandatory to return a value using `return`.

### **Example 1: Terminating a Method with `return`**
```java
public class ReturnExample {
    public static void main(String[] args) {
        System.out.println("Method is called...");
        testMethod();
        System.out.println("This line does not execute because the method was terminated with return.");
    }

    public static void testMethod() {
        System.out.println("Method started.");
        return;  // Method terminates here.
        // System.out.println("This line never runs."); // This would cause an error
    }
}

```
**Output:**
```
Method is called... 
Method started.
```
- As soon as `return;` is called, the method terminates.

---

### **Example 2: Returning a Value with `return`**
```java
public class SumExample {
    public static void main(String[] args) {
        int result = addition(5, 10);
        System.out.println("Sum: " + result);
    }

    public static int addition(int a, int b) {
        return a + b; // Returns the sum of a + b
    }
}
```
**Sum:**
```
Toplam: 15
```
- The method returns the result of the addition using `return a + b;`.

---

## **3. `continue` Keyword**
`continue` is used to skip the current iteration within a loop and proceed to the next one. It **does not break the loop**, it just **skips that specific step when a condition is met**.

**How it Works:**
- When `continue` is called, the remaining code in the loop is not executed, and **the next iteration begins**.
- It is commonly used to **skip specific conditions**.

---

### **Example 1: Skipping Odd Numbers**
```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // For odd numbers
                continue; // Skip the remaining code and move to the next iteration.
            }
            System.out.println("Even number: " + i);
        }
    }
}
```
**Output:**
```
Even number: 2 
Even number: 4 
Even number: 6 
Even number: 8 
Even number: 10
```
- When `i` is an odd number, `continue` is executed and the remaining part of that iteration is skipped.

### **Example 2: Using `continue` in Nested Loops**
```java
public class NestedContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue; // When `j == 2`, this iteration of the inner loop is skipped.
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}

```
**Output:**
```
i: 1, j: 1
i: 1, j: 3
i: 2, j: 1
i: 2, j: 3
i: 3, j: 1
i: 3, j: 3
```
- When `j == 2`, `continue` is triggered, skipping the operations for that iteration.

---

## **Result Comparison**
| Keyword      | Usage Area                                    | Effect                               |
|--------------|-----------------------------------------------|--------------------------------------|
| `break`      | To break loops and `switch` blocks            | Completely ends the loop.            |
| `return`     | To exit from methods                          | Ends the method and returns a value. |
| `continue`   | To skip a specific iteration in a loop        | Skips the current iteration, loop continues. |


## Cast
# **📌 What is Casting in Java? (Detailed Explanation)**

## **🔹 1. What is Casting?**
In Java, **Casting** refers to the process of **converting a variable or object from one data type to another**.

Casting can be divided into **two main categories:**
1. **Converting Between Primitive Types**
    - **Widening Cast (Implicit Cast)**
    - **Narrowing Cast (Explicit Cast)**

2. **Converting Between Reference Types (Objects)**
    - **Upcasting**
    - **Downcasting**
   
---
# **🔹 2. Converting Between Primitive Types**
## **✅ 2.1 Widening Cast (Implicit Cast)**
- **A smaller data type can be automatically assigned to a larger data type.**
- **No data loss occurs.**
- **This conversion is done automatically (implicitly).**

### **📌 Example**
```java
public class WideningExample {
    public static void main(String[] args) {
        int number = 100;
        double wideNumber = number; // Automatic conversion (int → double)
        
        System.out.println("int value: " + number);
        System.out.println("converted to double: " + wideNumber);
    }
}
```
**Output:**
```
int value: 100 
converted to double: 100.0
```


📌 **Important Notes:**
- **Conversions from `byte → short → int → long → float → double` are automatic.**
- **There is no data loss, as the widening type can hold more data.**

---

## **✅ 2.2 Narrowing Cast (Explicit Cast)**
- **A larger data type is converted to a smaller data type.**
- **There may be data loss or precision loss.**
- **It must be done manually (Explicit Cast).**

### **📌 Example**
```java
public class NarrowingExample {
    public static void main(String[] args) {
        double largeNumber = 9.78;
        int smallNumber = (int) largeNumber; // Explicit conversion (double → int)

        System.out.println("double value: " + largeNumber);
        System.out.println("converted to int: " + smallNumber);
    }
}
```

**Output:**
```
double value: 9.78
converted to int: 9
```

📌 **Important Notes:**
- **There may be data loss in conversions from `double → float → long → int → short → byte`.**
- **When converting fractional numbers to integer types like `int`, the decimal part is lost.**

---

## **✅ 2.3 `char` and `int` Conversion**
📌 **`char` and `int` types can be converted to each other based on their ASCII values.**

```java
public class CharToIntExample {
    public static void main(String[] args) {
        char character = 'A';
        int ascii = character; // ASCII code of the character 'A'

        System.out.println("Character: " + character);
        System.out.println("ASCII Code: " + ascii);
    }
}
```

**Output:**
```
Character: A 
ASCII Code: 65
```

---

**Reverse Conversion:**
```java
int code = 97;
char character = (char) code; // ASCII 97 → 'a'

System.out.println("ASCII Code: " + code);
System.out.println("Character: " + character);

```
**Output:**
```
ASCII Code: 97
Character: a
```

---

# **📌 String ⇄ int Conversion in Java (Casting)**
In Java, **`String` ⇄ `int` conversion** can be done using different methods.

---

## **✅ 1. Converting `String` to `int`**
📌 **`Integer.parseInt(String)`** and **`Integer.valueOf(String)`** are used.

### **📌 Example 1: Converting String to int using `parseInt()`**
```java
public class StringToIntExample {
    public static void main(String[] args) {
        String numberStr = "123"; // String data
        int number = Integer.parseInt(numberStr); // String → int conversion
        
        System.out.println("String: " + numberStr);
        System.out.println("int: " + number);
    }
}
```

**Output:**
```
String: 123 
int: 123
```

📌 **Important:**
- `parseInt()` can only convert **strings containing integers**.
- Invalid strings like `"123abc"` will throw a `NumberFormatException`.

🚨 **Incorrect Usage:**
```java
String invalidStr = "123abc";
int number = Integer.parseInt(invalidStr); // ERROR! NumberFormatException
```

---

### **📌 Example 2: Converting String to int using `valueOf()`**
📌 **`Integer.valueOf(String)`** returns an **`Integer` (Wrapper Class)** instead of `int`.
```java
public class ValueOfExample {
    public static void main(String[] args) {
        String numberStr = "456";
        int number = Integer.valueOf(numberStr); // String → Integer
        
        System.out.println("int value: " + number);
    }
}
```
📌 **Difference between `parseInt()` and `valueOf()`:**
- **`parseInt()`** → returns `int`.
- **`valueOf()`** → returns `Integer`.

---

## **✅ 2. Converting `int` to `String`**
📌 **`String.valueOf(int)`** and **`Integer.toString(int)`** are used.

### **📌 Example 3: Converting int to String using `String.valueOf(int)`**
```java
public class IntToStringExample {
    public static void main(String[] args) {
        int number = 789;
        String numberStr = String.valueOf(number); // int → String
        
        System.out.println("int: " + number);
        System.out.println("String: " + numberStr);
    }
}

```
📌 **This method can also convert types like, `double`, `float`, `boolean` to `String`.**

---

### **📌 Example 4: Converting int to String using `Integer.toString(int)`**
```java
public class IntToStringExample2 {
    public static void main(String[] args) {
        int number = 1234;
        String numberStr = Integer.toString(number); // int → String
        
        System.out.println("String value: " + numberStr);
    }
}
```
📌 Difference between `String.valueOf()` and `Integer.toString()`:

- **`String.valueOf(int)`** → Works for all data types (`boolean`, `double`, etc.).
- **`Integer.toString(int)`** → Used only for `int` type.

---

## **✅ 3. Alternative: Using `+ ""`**
📌 **We can use `+ ""` to convert an `int` type number to a `String`.**
```java
public class PlusStringExample {
    public static void main(String[] args) {
        int number = 500;
        String numberStr = number + ""; // int → String
        
        System.out.println("String value: " + numberStr);
    }
}
```
📌 **This method is less efficient, and it is recommended to use `toString()` or `valueOf()` instead.**

---

# **📌 4. Summary**
| **Conversion** | **Method** | **Example Usage** |
|----------------|------------|-------------------|
| **`String` → `int`** | `Integer.parseInt(String)` | `int number = Integer.parseInt("123");` |
| **`String` → `Integer`** | `Integer.valueOf(String)` | `Integer number = Integer.valueOf("456");` |
| **`int` → `String`** | `String.valueOf(int)` | `String str = String.valueOf(789);` |
| **`int` → `String`** | `Integer.toString(int)` | `String str = Integer.toString(1234);` |
| **`int` → `String`** | `+ ""` method | `String str = 500 + "";` |

📌 **By using these methods, you can perform safe conversions between `String` and `int` in Java! 🚀**

--- 

## ## Java String Pool Concept

---
No, when **`String word = "";`** is written, **`new String()` is not called in the background**. This is because **Java utilizes the String Constant Pool (String Pool) mechanism**.

---

## **1. Java String Pool Concept**
- When **`String word = "";`** is written, literal strings like `"Hello"` are stored in the **String Constant Pool**.
- If a **`String` with the same value already exists** in the pool, a new object is not created, and the existing object is referenced.
- **This ensures memory optimization** and works more efficiently compared to using `new String()`.

### **Example and Explanation**
```java
String word1 = "Hello"; // Stored in the String Pool
String word2 = "Hello"; // Uses the same reference (does not create a new object)

System.out.println(word1 == word2); // true (They point to the same object)
```
Here, the value `"Hello"` is added to the String Pool the first time it's used, and `word2` references the same object.

---

## **2. What Happens When Using `new String()`?**
If we use **`new String("Hello")`**:
- A **new `String` object is created in the Heap each time**.
- **String Pool is not used**, so even if the values are the same, different objects may be created.

```java
String word1 = new String("Hello");
String word2 = "Hello";

System.out.println(word1 == word2); // false (Different objects)
System.out.println(word1.equals(word2)); // true (Contents are the same)
```
The **`==` operator** compares memory addresses, so it returns false.

The **`equals()` method** compares the contents, so it returns true.

---

## **3. Using the `intern()` Method with String Pool**
If we want to **add an object created with `new String("Hello")`** to the String Pool, we can use the `.intern()` method.

```java
String word1 = new String("Hello").intern();
String word2 = "Hello";

System.out.println(word1 == word2); // true (References the same object in the pool)
```
The `.intern()` method uses the `String` from the pool if one with the same value exists, otherwise it adds it.

---

## **4. Summary and Conclusion**
| **Code** | **What Happens in the Background?** | **Memory Usage** |
|----------|------------------------------------|------------------|
| `String word = "";` | Uses the String Pool, **does not create a new object**. | **Memory efficient** |
| `String word = new String("");` | Creates a **new object in the Heap**, String Pool is not used. | **Unnecessary memory consumption** |
| `String word = new String("").intern();` | Added to the String Pool and the object from the pool is used. | **Memory is optimized** |

✅ **The best practice is generally using literals like `"..."`.**  
⚠️ **`new String("")` should be avoided as it is unnecessary.** 🚀


## What's the difference between `String word = new String();` and `String word = "";`?

---

In Java, `String` objects can be created in two different ways:

1. **Creating with `new String()`**
2. **Creating directly with `""` (literal)**

Let's explore the differences between these two approaches.

---

## **1. Using `new String()`**
```java
String word1 = new String("Hello");
```
Creates a new `String` object in the Heap memory.  
Does not use the String pool, and creates a new object each time.  
May consume more memory and lead to unnecessary object creation.

---

## **2. Using `String` Literal**
```java
String word2 = "Hello";

```
Stored in the String pool, meaning if the same string has been created before, it can be reused.  
Works more memory efficiently.  
The JVM uses the String Constant Pool mechanism to avoid creating String objects with the same value repeatedly.

---

## **3. Memory Management Difference**
### **Heap vs. String Pool**
| **Method** | **Where is it Stored?** | **Does a New Object Get Created?** | **Performance** |
|------------|-------------------------|-----------------------------------|-----------------|
| `new String("Hello")` | Heap (New object each time) | **Yes** | Slower |
| `"Hello"` (Literal) | **String Pool** | **No (If it exists in the pool)** | Faster |

---

## **4. Comparison (`==` vs. `equals()`)**
- `==` compares **references**.
- `equals()` compares **contents (values)**.

---

Example:
```java
String str1 = new String("Hello");
String str2 = "Hello";

System.out.println(str1 == str2); // false (Different objects)
System.out.println(str1.equals(str2)); // true (Content is the same)

String str3 = "Hello";
System.out.println(str2 == str3); // true (They share the same String Pool)
```
str1 is a new object in the heap, while str2 and str3 are shared within the same pool.

---

## **5. When Should We Use Which Method?**
| **Scenario** | **Recommended Method** |
|--------------|------------------------|
| **General string usage** | `"Hello"` (**Using the String pool is more efficient**) |
| **When a mutable string is required** | `StringBuilder` or `StringBuffer` |
| **When `String` objects need to be created in different memory areas** | `new String("Hello")` |

✅ **Generally, the `"String"` literal is preferred because the String Pool optimizes memory.**  
⚠️ **`new String()` can lead to unnecessary memory usage and is not recommended.** 🚀

## What is the difference between `vocabulary1 == vocabulary2` and `vocabulary1.equals(vocabulary2)` in Java Strings?

In Java, the `==` operator and `.equals()` method work differently when comparing `String` objects. **To understand this difference, it's important to first know how memory management works in Java and how `String` objects are stored.**

---

## **1. Comparison with `==` Operator (Reference Comparison)**
The `==` operator compares **the memory addresses (references) of two objects**.  
**It checks whether the two `String` objects are the same object in memory.**

### **Example 1: String Literal Usage (Comparison with `==`)**
```java
String vocabulary1 = "Hello";
String vocabulary2 = "Hello";

System.out.println(vocabulary1 == vocabulary2); // true (They are using the same reference)
```
**Why?**

- The value `"Hello"` is stored in the **String Pool**.
- `vocabulary1` and `vocabulary2` reference the same object, so the `==` operator returns `true`.

---

### **Example 2: Using `new String()` (`==` Comparison)**

```java
String vocabulary1 = new String("Merhaba");
String vocabulary2 = new String("Merhaba");

System.out.println(vocabulary1 == vocabulary2); // false (Different objects)
```

🔹 **Why?**
- `new String("Merhaba")` creates a new `String` object in the **Heap Memory** each time it is called.
- The two `String` objects have **different memory addresses**, so `==` returns **false**.

---

## **2. `.equals()` Method Comparison (Content Comparison)**
The `.equals()` method compares the **contents (values)** of `String` objects.

### **Example 3: Content Comparison using `equals()`**
```java
String vocabulary1 = new String("Merhaba");
String vocabulary2 = new String("Merhaba");

System.out.println(vocabulary1.equals(vocabulary2)); // true (Contents are the same)
```

✅ When using `.equals()`, the **content of the String objects** is compared.  
This is why `"Merhaba".equals("Merhaba")` returns **true**.

---

## **3. Adding to the `String` Pool with `intern()`**
If you want to add a `String` object created with `new String()` to the **String Pool**, you can use the `.intern()` method:

```java
String vocabulary1 = new String("Merhaba").intern();
String vocabulary2 = "Merhaba";

System.out.println(vocabulary1 == vocabulary2); // true (Both are in the String Pool)
```

- The `.intern()` method uses the **object from the String Pool** as a reference.
- The `==` comparison will return **true**.

---

## **4. Summary: Differences Between `==` and `.equals()`**
| **Comparison** | **`==` (Reference Comparison)** | **`.equals()` (Content Comparison)** |
|----------------|--------------------------------|------------------------------------|
| **Type of Comparison** | Compares **memory addresses** | Compares **content (values)** |
| **String Pool Usage** | Returns **true if using String Pool**, otherwise **false** | Always compares content, Pool does not matter |
| **When `new String("...")` is used** | Creates a **new object in Heap**, so returns **false** | Returns **true if contents are the same** |
| **Recommended Usage** | Used for comparing **memory addresses** | Used for **String content comparisons** (Correct usage) |

✅ **The `.equals()` method is generally recommended**, as `"Merhaba" == "Merhaba"` may **not always be correct**. 🚀

---

## String Concatenation Types: `concat()`, `StringBuilder`, `StringBuffer`

In Java, there are different methods for **String concatenation**. These include the **`+` operator**, the **`concat()` method**, **`StringBuilder`**, and **`StringBuffer`**. Let's examine the differences between them in terms of performance, operation, and usage.

---

## **1. String Concatenation Methods**
| **Method**        | **Description** | **Thread-Safe** | **Speed** | **Mutability** |
|-------------------|-----------------|-----------------|-----------|----------------|
| `+` Operator      | Easy to use, uses `StringBuilder` in the background. | ❌ No | Medium | ❌ Immutable |
| `concat()`        | Combines with a `String` object. | ❌ No | Medium | ❌ Immutable |
| `StringBuilder`   | High performance, not thread-safe. | ❌ No | **Fast** | ✅ Mutable |
| `StringBuffer`    | Thread-safe, but slower than `StringBuilder`. | ✅ Yes | Slow | ✅ Mutable |

---

## **2. Details of String Concatenation Methods**

### **2.1 Concatenation with `+` Operator**
- **Simple and understandable**, but performance can be low because **it creates a new `String` object with each concatenation**.

```java
String str1 = "Hello";
String str2 = " World";
String result = str1 + str2;
System.out.println(result); // "Hello World"
```

🔴 **Disadvantage:** The `+` operator creates a **new `String` object** with each concatenation, and the old object is garbage collected. This can lead to performance issues in large loops.

---

### **2.2 Concatenation with `concat()` Method**
- Belongs to the `String` class and serves as an **alternative** to the `+` operator.
- **Creates a new `String` object**, and the original `String` remains unchanged (`immutable`).

```java
String str1 = "Hello";
String str2 = " World";
String result = str1.concat(str2);
System.out.println(result); // "Hello World"
```

🔴 **Disadvantage:** It is not different from the `+` operator because it still **creates a new `String` object**.

---

### **2.3 Concatenation with `StringBuilder` (Preferred Method)**
- **It is the best method in terms of performance** because `StringBuilder` is a **mutable** object.
- **It is not thread-safe** (not safe when multiple threads are operating at the same time).

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb.toString()); // "Hello World"
```

✅ **Advantages:**
- Unlike `+` or `concat()`, it does not **create a new `String` object**.
- It works **faster** by modifying the **same object in memory**.

---

### **2.4 Concatenation with `StringBuffer`**
- It is almost identical to `StringBuilder`, but it uses **synchronized** to make it **thread-safe**.
- **It is preferred in concurrent (multithreading) scenarios**, but it is **slower** than `StringBuilder`.

```java
StringBuffer sbf = new StringBuffer("Hello");
sbf.append(" World");
System.out.println(sbf.toString()); // "Hello World"
```

✅ **Advantage:** It is **safe** for use in multi-thread environments.  
🔴 **Disadvantage:** It is **slower** than `StringBuilder`.

---

## **3. Performance Test**
Now, let's test the performance differences between `+`, `StringBuilder`, and `StringBuffer` for large string concatenation.

### **Performance Test Results (Concatenating 100,000 Characters)**:
- **`+` Operator Time**: ≈ **0.3561 seconds** (Slow)
- **`StringBuilder` Time**: ≈ **0.0086 seconds** (Fast)
- **`StringBuffer` Time**: ≈ **0.0081 seconds** (Fast, but thread-safe)

---

## **4. Which One Should We Use?**
| **Scenario** | **Recommended Method** |
|--------------|------------------------|
| Small-scale string concatenation | `+` operator or `concat()` |
| **Large data processing or string concatenation inside loops** | **`StringBuilder`** (Fast and efficient) |
| **Multi-threaded environment (Multithreading)** | **`StringBuffer`** (Thread-safe) |

🔹 **For small operations, you can use `+`, but for large loops, always use `StringBuilder`!** 🚀




















































