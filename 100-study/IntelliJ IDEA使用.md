# IntelliJ IDEA 使用

[TOC]

------

## Live Templates

| Abbreviation      | Live Templates                                              |
| ----------------- | ----------------------------------------------------------- |
| sout              | System.out.println();                                       |
| "hello".sout      | System.out.println("hello");                                |
| 10.fori           | for (int i = 0; i < 10; i++) {    }                         |
| str.length().forr | for (int length = str.length(); length > 0; length--) {   } |
|                   |                                                             |
|                   |                                                             |
|                   |                                                             |
|                   |                                                             |
|                   |                                                             |
|                   |                                                             |
|                   |                                                             |
|                   |                                                             |
|                   |                                                             |
|                   |                                                             |
|                   |                                                             |
|                   |                                                             |
|                   |                                                             |
|                   |                                                             |
|                   |                                                             |
|                   |                                                             |

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
   * @description: $description$
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