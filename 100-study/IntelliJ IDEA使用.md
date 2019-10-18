# IntelliJ IDEA 使用

[TOC]

------

## Live Templates

- **sout:** System.out.println();

  - "hello".sout

    ```java
    System.out.println("hello");
    ```

- **for**

  - **fori**：顺序遍历

    - 10.fori

    - str.length().fori

      ```java
      for (int i = 0; i < 10; i++) {
      
      }
      
      String str;
      for (int i = 0; i < str.length(); i++) {
      
      }
      ```

  - forr: 逆序遍历

    ```java
    for (int i = li.size() - 1; i >= 0; i--) {
    
    }
    ```

  - for：遍历容器

    ```java
    for (Object o : li) {
    
    }
    ```

- **.var**：定义局部变量

  - 10.var

  - "tongji".var

  - new Object().var

    ```java
    int i = 10;
    String tongji = "tongji";
    Object o = new Object();
    ```

- **.field:** 定义成员变量

  - "tongji".field

    <img src="ScreenShots/IntelliJ IDEA/field.png" alt="image-20191018135333757" style="zoom:50%;" />

- **.format:** **格式化字符串**

  - "name=%s".format

    ```java
    String.format("name=%s", )
    ```

- **.notnull / .nn  | .null**

  - o.notnull / .nn

    ```java
    if (o != null) {
    
    }
    ```

  - .null

    ```java
    if (o == null) {
    
    }
    ```

- **.if:** 生成if判断语句

  - flag.if

  - flag.not -> .if

    ```java
    if (flag) {
        
    }
    if (!flag) {
        
    }
    ```

- **.return:** 返回值

  - "hello".return

    ```java
    return "hello";
    ```

- **.synchronized:** 生成同步锁

  - o.synchronized

    ```java
    synchronized (o) {
    
    }
    ```

- **.lambda:** Lambda语句

  - System.out.println(1).lambda

    ```java
    () -> System.out.println(1)
    ```

- **.opt：**Optional语句

  ```java
  Optional.of(() -> System.out.println(1))
  ```

  

------

## 自动注释

### File and Code Templates

#### 新建class时自动添加comment

- Preference -> Editor -> File and Code Templates -> Class

- 直接在最右边代码框中修改

  ```java
  #if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
  #parse("File Header.java")
  
  /**
  * @program: ${PROJECT_NAME}
  *
  * @description: 
  *
  * @author: doubleZ
  *
  * @create: ${YEAR}/${MONTH}/${DAY} 
  **/
  public class ${NAME} {
  
  }
  ```

<img src="ScreenShots/IntelliJ IDEA/File&CodeTemplate.png" alt="image-20191015234654571" style="zoom:50%;" />

**效果**

<img src="ScreenShots/IntelliJ IDEA/File&CodeTemplate result.png" alt="image-20191015234925383" style="zoom:50%;" />

- 如果上面写

  ```java
  * @description: ${description}
  ```

  则在创建class 的时候，输入完classname后会弹出对话框让自己输入description

  <img src="ScreenShots/IntelliJ IDEA/File&CodeTemplate description.png" alt="image-20191015235208205" style="zoom:50%;" />

  <img src="ScreenShots/IntelliJ IDEA/File&CodeTemplate result2.png" alt="image-20191015235401610" style="zoom:50%;" />

------

### Live Templates

- Preference -> Editor -> Live Templates

- 点击右边➕ -> 2，先创建一个Template Group(随便命名)

  <img src="ScreenShots/IntelliJ IDEA/Live Template class.png" alt="image-20191016000022190" style="zoom:50%;" />

- 点击新建的Group -> 右边➕ -> Live Templates

  <img src="ScreenShots/IntelliJ IDEA/Live Template class2.png" alt="image-20191015235850732" style="zoom:50%;" />

#### class

- 添加快捷名 -> 添加描述

  <img src="ScreenShots/IntelliJ IDEA/Live Template class3.png" alt="image-20191016000505687" style="zoom:50%;" />

- 模板注释

  ```java
  /**
  * @program: $program$
  *
  * @description: $description$
  *
  * @author: doubleZ
  *
  * @create: $date$
  **/
  ```

- 应用到全部：Define -> ☑️勾选Everywhere

  <img src="ScreenShots/IntelliJ IDEA/Live Template class4.png" alt="image-20191016000657980" style="zoom:50%;" />

- 点击Edit variables -> 配置相关的属性

  <img src="ScreenShots/IntelliJ IDEA/Live Template class5.png" alt="image-20191016000930598" style="zoom:50%;" />

**效果**

输入cc tab

<img src="ScreenShots/IntelliJ IDEA/Live Template class result1.png" alt="image-20191016001150426" style="zoom:50%;" />

<img src="ScreenShots/IntelliJ IDEA/Live Template class result2.png" alt="image-20191016001219520" style="zoom:50%;" />

------

#### method

- 注释模板

  ```java
  /**
   * @description: 
   *
  $params$
   *
  $return$
   **/
  ```

- 配置变量

  - param

    ```groovy
    groovyScript("if(\"${_1}\".length() == 2) {return '';} else {def result=''; def params=\"${_1}\".replaceAll('[\\\\[|\\\\]|\\\\s]', '').split(',').toList();for(i = 0; i < params.size(); i++) {if(i<(params.size()-1)){result+=' * @param ' + params[i] + ' : ' + '\\n'}else{result+=' * @param ' + params[i] + ' : '}}; return result;}", methodParameters()); 
    ```

  - return

    ```groovy
    groovyScript("def returnType = \"${_1}\"; def result = ' * @return : ' + returnType; return result;", methodReturnType());
    ```

  <img src="ScreenShots/IntelliJ IDEA/Live Template method1.png" alt="image-20191016001613631" style="zoom:50%;" />

**效果**

必须要在函数内部使用Live Template才能正确处理param和return

<img src="ScreenShots/IntelliJ IDEA/Live Template method result1.png" alt="image-20191016001744277" style="zoom:50%;" />

否则默认为null

<img src="ScreenShots/IntelliJ IDEA/Live Template method2.png" alt="image-20191016001855324" style="zoom:50%;" />