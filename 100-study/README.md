# Java知识点🧀️

[TOC]

------

## 标识符

- 字母
- 数字
- 下划线
- ¥
- $

------

## 注释

- 文档注释：在类、方法、变量上面，描述其作用

  - 鼠标放在类和变量上面会显示注释
  ```java
  /**
   *	文档注释
   *
   */
  ```
  - 可通过Javadoc将注释的内容生成文档，并输出到HTML中
  - 可以包含多个@标签


| 标签       | 描述                                              | 示例                                                         |
| ---------- | ------------------------------------------------- | ------------------------------------------------------------ |
| @author    | 标识一个类的作者                                  | @author description                                          |
| {@docRoot} | 指明当前文档根目录的路径                          | Directory Path                                               |
| @exception | 标志一个类抛出的异常                              | @exception exception-name explanation                        |
| @param     | 说明一个方法的参数                                | @param parameter-name explanation                            |
| @return    | 说明返回值类型                                    | @return explanation                                          |
| {@value}   | 显示常量的值，该常量必须是 static 属性。          | Displays the value of a constant, which must be a static field. |
| @version   | 指定类的版本                                      | @version info                                                |
| ...        | [完整标签](http://c.biancheng.net/view/5614.html) |                                                              |

------

## 常量

- 长整型：7890L
- 单精度浮点数：56.2f

**声明常量：**

```java
public class Main{
  //静态常量
  /*
   * 作用域是全局的
   * 在类外访问形式为 Main.PI
   */
  public static final double PI = 3.14;
  
  //成员常量
  final int HOURS = 24;
  
 	public static void main(String []args){
    //局部常量
    final double HEIGHT = 8844.43;
  }
}
```

------

## 字面量

当程序第一次使用某个字符串直接量时，Java 会使用常量池来缓存该字符串直接量，如果程序后面的部分需要用到该字符串直接量时，Java 会直接使用常量池中的字符串直接量。

- 常量池（constant pool）:在编译期被确定，并被保存在已编译的 .class 文件中的一些数据，它包括关于类、方法、接口中的常量，也包括字符串直接量。

```java
String s0 = "hello";
String s1 = "hello";
String s2 = "he" + "llo";
System.out.println(s0 == s1);		//true
System.out.println(s0 == s2);		//true

/*
Java 会确保每个字符串常量只有一个，不会产生多个副本。例子中的 s0 和 s1 中的“hello”都是字符串常量，它们在编译期就被确定了，所以 s0 = s1 返回 true。而“he”和“llo”也都是字符串常量，当一个字符串由多个字符串常量连接而成时，它本身也是字符串常量，s2 同样在编译期就被解析为一个字符串常量，所以 s2 也是常量池中“hello”的引用。因此，程序输出 s0 == s1 返回 true，s1 == s2 也返回 true。
*/
```



------

## 数据类型

- 整数
  - byte：从网络或文件中处理数据流时；或者处理未加工的二进制数据
- bollean：true/false
  - **java中布尔类型的值不能转换为任何数据类型，true常量不等于1，false常量也不等于0**，他们还能赋给boolean类型的变量
- 引用类型
  - null：空引用，**只能转换成引用类型**，不能赋给其他类型

<img src="http://c.biancheng.net/uploads/allimg/190909/5-1ZZZ91512493.jpg" style="zoom:75%;" />

------

## 运算符

### 逻辑运算符

- &&：短路与
- &：逻辑与
- ||：短路或
- |：逻辑或

------

## for-each循环

```java
int[] numbers = {1,2,3,4,5,6,7};
for (int num : numbers){
  ...			//num为临时变量
}
```

- 在for-each循环中无法改变数组本身的值

------

## break带标签

```java
label:for(int i=0;i<10;++i){
  for(int j=0;j<10;++j){
    for (int k=0;k<10;++k){
      //...
      break label;		//退出label指定的嵌套块
    }
  }
}

//break到这里
```

- 作用相当于goto
- 但保留了程序结构化的特性


