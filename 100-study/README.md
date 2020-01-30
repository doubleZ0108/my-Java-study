# Java知识点🧀️

Table of Contents
=================

* [标识符](#标识符)
* [注释](#注释)
* [常量](#常量)
* [字面量](#字面量)
* [数据类型](#数据类型)
* [运算符](#运算符)
  * [逻辑运算符](#逻辑运算符)
* [for-each循环](#for-each循环)
* [break带标签](#break带标签)
* [字符串](#字符串)
  * [String类](#string类)
    * [定义](#定义)
    * [库函数](#库函数)
  * [StringBuffer类](#stringbuffer类)
    * [创建](#创建)
    * [库函数](#库函数-1)
  * [StringBuilder类](#stringbuilder类)
* [正则表达式](#正则表达式)
  * [Pattern类和Matcher类](#pattern类和matcher类)
    * [提取指定子串](#提取指定子串)
* [数字处理](#数字处理)
  * [随机数 | Random类](#随机数--random类)
  * [数字格式化 | DedmalFormat类](#数字格式化--dedmalformat类)
  * [大数运算 | BigInteger BigDecimal](#大数运算--biginteger-bigdecimal)
* [日期类](#日期类)
  * [Date类](#date类)
  * [Calendar类](#calendar类)
  * [日期格式化 | DateFormat SimpleDateFormat](#日期格式化--dateformat-simpledateformat)
    * [DateFormat](#dateformat)
    * [SimpleDateFormat](#simpledateformat)
* [包装类](#包装类)
  * [Object类](#object类)
  * [Integer类](#integer类)
  * [Float类](#float类)
  * [Character类](#character类)
  * [System类](#system类)
* [数组](#数组)
  * [一维数组](#一维数组)
  * [二维数组](#二维数组)
  * [数组方法](#数组方法)
* [类和对象](#类和对象)
  * [定义](#定义-1)
  * [实例化对象方法](#实例化对象方法)
  * [构造方法](#构造方法)
  * [直接输出对象 toString()](#直接输出对象-tostring)
  * [析构函数 finalize()](#析构函数-finalize)
  * [控制修饰符](#控制修饰符)
    * [类访问控制符](#类访问控制符)
    * [方法和属性访问控制符](#方法和属性访问控制符)
    * [static](#static)
    * [final](#final)
  * [可变参数](#可变参数)
  * [垃圾回收 ｜ GC](#垃圾回收--gc)
* [包](#包)
  * [系统包](#系统包)
  * [自定义包](#自定义包)
* [继承](#继承)
  * [封装](#封装)
  * [继承](#继承-1)
* [多态](#多态)
  * [方法重载](#方法重载)
  * [方法重写/覆盖](#方法重写覆盖)
  * [变量隐藏](#变量隐藏)
  * [转型](#转型)
  * [抽象类](#抽象类)
* [接口](#接口)
  * [接口定义](#接口定义)
  * [接口实现](#接口实现)
  * [接口和抽象类的区别](#接口和抽象类的区别)
* [异常处理](#异常处理)
  * [自动资源管理](#自动资源管理)
  * [声明和抛出异常](#声明和抛出异常)
  * [多异常捕获](#多异常捕获)
  * [自定义异常](#自定义异常)
  * [记录日志类](#记录日志类)
* [数据结构](#数据结构)
  * [List](#list)
  * [Set](#set)
  * [Map](#map)
  * [Collection类](#collection类)
    * [排序](#排序)
    * [查找、替换](#查找替换)
    * [复制](#复制)
    * [lambda表达式遍历Collection](#lambda表达式遍历collection)
    * [Iterator遍历Collection](#iterator遍历collection)
    * [for-each遍历Collection](#for-each遍历collection)
    * [Predicate操作Collection](#predicate操作collection)
    * [Stream操作Collection](#stream操作collection)
    * [不可变集合](#不可变集合)
  * [枚举](#枚举)
* [泛型](#泛型)
  * [泛型类](#泛型类)
  * [泛型方法](#泛型方法)
  * [高级用法](#高级用法)
    * [限制泛型可用类型](#限制泛型可用类型)
    * [使用类型通配符](#使用类型通配符)
    * [继承泛型类](#继承泛型类)
* [反射机制](#反射机制)
  * [Class类](#class类)
  * [reflect包](#reflect包)
  * [访问构造函数](#访问构造函数)
  * [访问方法](#访问方法)
  * [访问成员变量](#访问成员变量)
* [流](#流)
  * [输入流](#输入流)
  * [输出流](#输出流)
  * [系统流](#系统流)
  * [字符编码](#字符编码)
  * [File文件操作类](#file文件操作类)
  * [字节流](#字节流)
    * [字节数组流](#字节数组流)
    * [文件流](#文件流)
  * [字符流](#字符流)
    * [字符文件流](#字符文件流)
    * [字符缓冲区](#字符缓冲区)
  * [转换流](#转换流)
* [注解 | Annotation](#注解--annotation)
* [@Override](#override)
* [@Deprecated](#deprecated)
* [@SuppressWarnings](#suppresswarnings)
* [@SafeVarargs](#safevarargs)
* [@FunctionalInterface](#functionalinterface)
* [元注解](#元注解)
  * [@Documented](#documented)
  * [@Target](#target)
  * [@Retention](#retention)
  * [@Inherited](#inherited)
  * [@Repeatable](#repeatable)
  * [@Native](#native)
* [自定义注解](#自定义注解)

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

------

## 字符串

### String类

- String类是不可变类，一旦String对象被创建之后，包含这个对象中国呢的字符序列是不可变的，直至这个对象被销毁
- 由于不可变性，拼接字符串时会产生很多无用的中间对象，对性能有影响

#### 定义

- 直接定义：

  ```java
  String str = "hello world";
  
  String str2;
  str2 = "你好";
  ```

- 使用String类定义

  - String(): 创建空的String对象
  - String(String origin)：target与origin是相等的
  - String(char[] chi)：将字符数组复制变为字符串
    - 可以指定起始位置和总长度

#### 库函数

- **字符串连接：**+

- **字符串长度：**`length()`

- **去除空格：**`trim()`

- **提取子串：**`substring(int begin, int end)`

- **分隔字符串：**`split(String sign, int limit)`

  - `limit`: 分隔的次数，达到limit后其他部分不再划分

  ```java
  String colors = "red,yellow,blue,green,pink";
  String[] subcolors = colors.split(",", 3);
  for(String color : subcolors){
    System.out.println(color);
  }
  /*
  red
  yellow
  blue,green,pink
  */
  ```

- **字符串比较：**

  - `str1.equals(str2)`: 字符串要求逐字符完全相同
  - `equalsIgnoreCase()`: 忽略大小写
  - `compareTo()`: 返回一个整数（负，0，正）

- **替换：**

  - `replace(String oldstr, String newstr)`: 将指定字符串都替换成目标字符串
  - `replaceFirst(String regx, String replacement)`：匹配正则表达式的第一个字符串替换成新的字符串
  - `replaceAll(String regx, String replacement)`：匹配正则表达式的所有字符串都被替换

- **查找：**

  - `indexOf(value, int startpos)`: 如果找到返回索引值；没找到返回-1
  - `lastIndexOf()`

### StringBuffer类

- 更高效
- 可变字符串类，创建对象后可以修改字符串的内容
- 对象的容量会自动扩大

#### 创建

- `StringBuffer(int length)`: 创建空的字符串缓冲区，默认大小为16个字符
- `StringBuffer(String str)`: 内容初始化为指定的字符串内容，缓冲区容量为`16 + str`的长度

#### 库函数

- `capacity(): `返回字符串的容量大小
- `append(String str | StringBuffer sb)`：追加字符串
- `setCharAt(int index, char ch)`: 在指定索引位置替换一个字符
- `reverse()`: 反转**（直接修改对象本身，返回值也是反转后的StringBuffer对象）**
- **删除：**
  - `deleteCharAt(int index)`
  - `delete(int start, int end)`: 删除[start, end)的字符

### StringBuilder类

- 与StringBuffer基本类似
- 没有实现线程安全功能，性能略高
  - 单线程时使用StringBuilder
  - 多线程时使用StringBuffer

------

## 正则表达式

- `boolean match(String regex)`: 判断该字符串是否匹配指定的正则表达式
- `replaceAll(String regex, String replacement)`: 将所有匹配正则表达式的子串替换为另一个字符串
- `split(String regex)`: 以正则表达式作为分隔符，分隔字符串为多个子串

### Pattern类和Matcher类

- Pattern对象时正则表达式编译后在内存中的形式
- 正则表达式字符串：被编译为Pattern对象 -> 用该Pattern对象创建Matcher对象 -> 执行匹配涉及的状态保留在Matcher对象中
- 多个Matcher对象可共享同一个Pattern对象

```java
//将一个正则表达式字符串编译为Pattern对象
Pattern p = attern.compile("a*b");
//使用Pattern对象创建Matcher对象
Matcher m = p.matcher("aaab");
boolean flag = m.matches();
```

- 如果某个正则表达式仅需使用一次，可以直接使用Pattern类的静态matches方法
- 但这种方法每次都要重新编译新的Pattern对象，效率不高

```java
boolean flag = Pattern.matches("a*b", "aaaaab");
```

#### 提取指定子串

```java
while(m.find()){		//一次查找与Pattern匹配的子串，下次调用时会接着向下查找
  m.group()			//目标子串
  m.start()			//该子串的起始位置
  m.end()				//该子串的结束位置
}
```

------

## 数字处理

- `Math.E`
- `Math.PI`
- `Math.max(x, y)`
- **取整：**
  - `Math.rint(double num)`: 返回最接近num的整数，如果有两个相同接近的，取偶数
  - `Math.round(double num)`: 返回加上1/2后最近的整数
- **三角函数：**
  - `Math.toDegrees(double angrad)`: 弧度 -> 角度
  - `Math.toRadians(double angdeg)`: 角度 -> 弧度
  - $180^。$ -> $\pi$
  - 其他三角函数参数默认都是弧度
- **指数运算：**
  - `cbrt(double a)`: a的立方根

### 随机数 | Random类

**构造方法：**

- `Random()`: 使用当前系统时间作为种子
- `Random(long seed)`
- 种子相同的Random类是相同的

```java
Random r1 = new Random(1);
Random r2 = new Random(2);
r2.setSeed(1);

//产生的随机数是一样的
System.out.println(r1.nextInt());
System.out.println(r2.nextInt());
```

**产生随机数：**

- Random类的所有方法生成的随机数都是均匀分布的
- `nextBoolean()`: 生成true和false的概率相等
- `nextDouble()`: [0, 1.0)
- `nextInt(int n)`: [0, n)
- `Math.random()`: 产生[0, 1.0)之间的随机数

### 数字格式化 | DedmalFormat类

| 符号 | 说明                                                         |
| ---- | ------------------------------------------------------------ |
| 0    | 显示数字，如果位数不够则补 0                                 |
| #    | 显示数字，如果位数不够不发生变化                             |
| .    | 小数分隔符                                                   |
| -    | 减号                                                         |
| ,    | 组分隔符                                                     |
| E    | 分隔科学记数法中的尾数和小数                                 |
| %    | 前缀或后缀，乘以 100 后作为百分比显示                        |
| ?    | 乘以 1000 后作为千进制货币符显示。用货币符号代替。如果双写，用国际货币符号代替； 如果出现在一个模式中，用货币十进制分隔符代替十进制分隔符 |

```java
DecimalFormat df = new DecimalFormat("0.00");		//保留两位小数（四舍五入）
double num = 123.456;
df.format(num);				//123.46
```

### 大数运算 | BigInteger BigDecimal

**构造方法：**

- `BigInteger(String val)`

**运算：**

| 方法名称                  | 说明                                                         |
| ------------------------- | ------------------------------------------------------------ |
| add(BigInteger val)       | 做加法运算                                                   |
| subtract(BigInteger val)  | 做减法运算                                                   |
| multiply(BigInteger val)  | 做乘法运算                                                   |
| divide(BigInteger val)    | 做除法运算                                                   |
| remainder(BigInteger val) | 做取余数运算                                                 |
| compareTo(BigInteger val) | 做数字的比较运算                                             |
| equals(Object obj)        | 当参数 obj 是 Biglnteger 类型的数字并且数值相等时返回 true, 其他返回 false |

```java
BigInteger bi1 = new BigInteger("1234567890");
BigInteger bi2 = new BigInteger("9876543210");

bi1.add(bi2)
```

- `divide(BigDecimal divisor, int scale, int roundingMode)`

  - `scale`: 商小数点后的位数

  - `roundingMode`

    | 模式名称                    | 说明                                                         |
    | --------------------------- | ------------------------------------------------------------ |
    | BigDecimal.ROUND_DOWN       | 商的最后一位无论是什么数字都省略                             |
    | BigDecimal.ROUND_CEILING    | 商如果是正数，按照 ROUND_UP 模式处理；如果是负数，按照 ROUND_DOWN 模式处理 |
    | BigDecimal.ROUND_HALF_ DOWN | 对商进行五舍六入操作。如果商最后一位小于等于 5，则做舍弃操作，否则对最后 一位进行进位操作 |
    | BigDecimal.ROUND_HALF_EVEN  | 如果商的倒数第二位是奇数，则按照 ROUND_HALF_UP 处理；如果是偶数，则按 照 ROUND_HALF_DOWN 处理 |

------

## 日期类

### Date类

- 获取系统的时间信息
- 顺序：星期、月、日、小时、分、秒、年

**方法：**

- `after(Date when)`: 此日期是否在指定日期之后
- `before(Date when)`
- `toString()`: 将Date对象转换为格式：[dow mon dd hh:mm:ss zzz yyyy]

### Calendar类

- 抽象类，不能使用new
- 处理日期时间，操作日历

**创建：**

```java
Calendar c = Calendar.getInstance();
```

**方法：**

- `add(int field, int amount)`: 为指定的日期字段field添加时间量amount
- `set(int uear, int month, int data ...)`: 将日历翻到任何一个时间
- `get(Calendar.MONTH)`: 获取日历中的月份

### 日期格式化 | DateFormat SimpleDateFormat

#### DateFormat

- 抽象类，不能使用new
- 以语言无关的方式格式化并解析日期/时间

**方法：**

- `String format(Date date)`: 格式化日期/时间
- `Calendar getCalendar()`: 获取与此时间格式相关联的日历
- `Date parse(String source)`：将给定的字符串解析为日期/时间

```java
DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
String date = df.format(new Date());
```

```java
DateFormat df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CHINA);
String time = df.format(new Date());
```

#### SimpleDateFormat

- **格式化：**日期 -> 文本
- **解析：**文本 -> 日期

**构造方法：**

- `SimpleDateFormat(String pattern, Locale locale)`
  - pattern：指定格式
  - locale：指定语言环境

| 字母 | 含义                           | 示例                                                         |
| ---- | ------------------------------ | ------------------------------------------------------------ |
| y    | 年份。                         | yy：11<br />yyyy： 2011                                      |
| M    | 月份。                         | MM ：05<br />MMM ：Locale.CHINA 语言环境下，如“十月”；在 Locale.US 语言环境下，如 Oct |
| d    | 月份中的天数                   | dd ： 10                                                     |
| D    | 当天是当年的第几天， 用 D 表示 | D ：295                                                      |
| E    | 星期                           | 使E ：Locale.CHINA 语 言环境下，如“星期四”；在 Locale.US 语 言环境下，如 Thu |
| H    | 小时数（0~23)                  | HH： 18                                                      |
| h    | 小时数（1~12)                  | hh： 10 (注意 10 有 可能是 10 点，也可能是 22 点）           |
| m    | 分钟数                         | mm：29                                                       |
| s    | 秒数                           | ss： 38                                                      |
| S    | 毫秒数                         | SSS：156                                                     |

```java
Date date = new Date();
SimpleDateFormat sd = new SimpleDateFormat("「现在是 yyyy年-MM月-dd日 E HH:mm:ss:SSS」");
System.out.println(sd.format(date));
```

------

## 包装类

### Object类

- 所有类的父类

**方法：**

| 方法                   | 说明                                                         |
| ---------------------- | ------------------------------------------------------------ |
| boolean equals(Object) | 比较两对象是否相等                                           |
| String toString()      | 返回该对象的字符串表示                                       |
| Class getClass()       | 返回对象所属的类，是一个Class对象，通过该对象可以获取该类的各种信息 |
| Object clone()         | 创建与该对象的类相同的新对象                                 |
| void notify()          | 激活等待在该对象的监视器上的一个线程                         |

```java
boolean result = thisobj.equals(anotherobj);

Class c = obj.getClass();
c.getName()		//类名
getSuperclass().getName()		//父类名
for(int i=0;i<c.getInterfaces().length;++i){
  class.getInterfaces()[i];		//实现的接口
}
/*
[Output] (String Object)
java.lang.String
java.lang.Object
interface java.io.Serializable
interface java.lang.Comparable
interface java.lang.CharSequence
*/
```

------

### Integer类

**构造方法：**

- `Integer(int num)`
- `Integer(String str_num)`

**方法：**

- `byteValue()`: 以byte类型返回该Integer的值(是byte类型，不是返回这个字节)
- `Integer.parseInt(String str_num)`: 将数字字符串转换为int数值
- `Integer.toBinaryString(num)`, ``Integer.toHexString(num)`, ``Integer.toOctalString(num)`

------

### Float类

**方法：**

- `isNaN()`: 判断此Float值是不是一个非数字值

------

### Character类

- `isDigit(ch)`, `isLetter(ch)`, `isLetterOrDigit(ch)`, `isLowerCase(ch)`
- `toLowerCase(ch)`

------

### System类

- 无法创建该类的对象，也无法实例化该类

**成员变量：**

- `PrintStream out`
- `InputStream in`
- `PrintStream err`

```java
/*读取输入的字符（无法读取汉字）*/
int ch;		//必须使用int类型，否则会因为丢失精度而编译失败
ch = System.in.read();	
System.out.println((char)ch);

/*正确处理汉字*/
InputStreamReader in = new InputStreamReader(System.in, "GB2312");
c = in.read();		//可以输出汉字但是和读入的不一样emmmm
```

**成员方法：**

- `arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`: 从原数组的srcPos开始复制length个元素到目标数组的destPos（覆盖）

- `currentTimeMillis()`: 返回计算机时间

  ```java
  long start = System.currentTimeMillis();
  //TODO
  long end = System.currentTimeMillis();
  long time = end - start;
  ```

- `exit()`: 终止当前正在运行的Java虚拟机

  - 可以用在图形界面编程中程序的退出

- `gc()`: 请求系统进行垃圾回收（至于系统是否立刻回收则不一定）

- `getProperty(String key)`: 获取系统中key属性的值

  | 属性名        | 属性说明            |
  | ------------- | ------------------- |
  | java. version | Java 运行时环境版本 |
  | java.home     | Java 安装目录       |
  | os.name       | 操作系统的名称      |
  | os.version    | 操作系统的版本      |
  | user.name     | 用户的账户名称      |
  | user.home     | 用户的主目录        |
  | user.dir      | 用户的当前工作目录  |

------

## 数组

- **默认值：**
  - 数值数组：0
  - 引用元素：null

### 一维数组

```java
int[] arr;						//声明
arr = new int[10];		//分配空间

int[] arr = new int[]{1,2,3,4,5};

int[] arr = {1,2,3,4,5};
```

- 声明数组时不需要规定数组的长度
- 声明时只是得到了一个存放数组的变量，并没有为数组元素分配空间
- 数组的大小不能修改

------

### 二维数组

```java
int arr[][];
int[][] arr;
arr = new int[][]{
  {1,2},
  {3,4}
};

int arr[][] = {{1,2},{3,4}};
```

------

### 数组方法

- `Arrays.equals(arrA, arrB)`: 判断两数组是否相等（元素个数相等 && 对应位置元素相等）

- `Arrays.fill(array, value)`: 用同一个数值填充数组

- **查找：**

  - `Arrays.binarySearch(arr, key)`: 如果没查找到则返回-1或“-插入点”
    - 插入点是搜索键将要插入数组的位置，即第一个大于此键的元素索引

- **复制：**

  - `Object[] Arrays.copyOf(arr, length)`: 复制数组至指定长度 *-> 数组已经存在将会被重构*

    ```java
    int[] arr = new int[5];
    int[] fresh_arr = (int[])Arrays.copyOf(arr, 8);		//其他空余的三个元素用默认值填充
    ```

  - `Arrays.copyOfRange(arr, start_index, end_index)`: 将指定数组的指定长度复制到一个新数组中 *-> 数组已经存在将会被重构*

    ```java
    int[] fresh_arr = Arrays.copyOfRange(arr, 1,3);
    ```

  - `System.arraycopy(src_arr, src_index, dest_arr, dest_index, length)`：*-> 目标数组必须已经存在，且不会被重构，相当于替换目标数组中的部分元素*

    ```java
    int[] fresh_arr = new int[5];
    System.arraycopy(arr, 0, fresh_arr, 0, 5);
    ```

  - `clone()`: *-> 目标数组如果已经存在，将会被重构*

    ```java
    int[] fresh_arr = (int[])arr.clone();
    ```

- **排序：**

  - `Arrays.sort(arr)``: 升序排列

------

## 类和对象

- 继承只能单即成

### 定义

```java
public [abstract | final] class ClassName [extends AnotherClass]
[implements<interface_name>]
	//abstract -> 抽象类
  //final -> 不允许被继承
  //extends -> 继承其他类
  //implements -> 实现某些接口
{
  [public | protected | private | static | final] int num;
  //static -> 静态变量（类变量）
  //final -> 常量
  
  [public | protected | private | static | final] void func(){}
  //static -> 静态方法
  //final -> 该方法benign被重写或重载
}
```

### 实例化对象方法

- `new`

- `newInstance()`: 回调用无参的构造函数

  ```java
  Class cl = Class.forName("Main");
  Main m = (Main)cl.newInstance();
  ```

- `clone()`

1. 给对象分配内存

2. 将对象的实例变量自动初始化为其变量类型的默认值

3. 初始化对象，给对象实例变量赋初始值

   > 类的加载是指把类的 .class 文件中的二进制数据读入内存中，把它存放在运行时数据区的方法区内，然后在堆区创建一个 java.lang.Class 对象，用来封装类在方法区内的数据结构

**对象的状态**

- 可触及状态：当对象被创建后，程序中还有引用变量引用它
- 可复活状态：当程序不再有任何引用变量引用该对象时，该对象就进入可复活状态；垃圾回收器会准备释放它所占用的内存，在释放之前，会调用它及其他处于可复活状态的对象的 finalize() 方法，这些 <u>*finalize() 方法有可能使该对象重新转到可触及状态*</u>
- 不可触及状态：当 Java 虚拟机执行完所有可复活对象的 finalize() 方法后，如果这些方法都没有使该对象转到可触及状态，垃圾回收器才会真正回收它占用的内存

⚠️调用 System.gc() 或者 Runtime.gc() 方法也不能保证回收操作一定执行，它只是提高了 Java 垃圾回收器尽快回收垃圾的可能性。

------

### 构造方法

- 构造方法不能被 static、final、synchronized、abstract 和 native 修饰

### 直接输出对象 toString()

```java
@Override
public String toString() {
  return "这是我的方法：" + arg;
}
```

### 析构函数 finalize()

由于finalize()的不确定型，在调用析构函数之后要调用系统垃圾回收

```java
@Override
protected void finalize() throws Throwable {
    //释放对象所占资源等相关操作
  	//可能使对象复活
}

//使用
obj = null;
try{
  System.gc();
  //Runtime.gc();
}catch(InterruptedException e){
  e.printStackTrace();
}
```

------

### 控制修饰符

#### 类访问控制符

类的访问控制符只能是 <u>空</u> 或 <u>public</u>

#### 方法和属性访问控制符

| 访问范围         | private  | friendly(默认) | protected | public |
| ---------------- | -------- | -------------- | --------- | ------ |
| 同一个类         | 可访问   | 可访问         | 可访问    | 可访问 |
| 同一包中的其他类 | 不可访问 | 可访问         | 可访问    | 可访问 |
| 不同包中的子类   | 不可访问 | 不可访问       | 可访问    | 可访问 |
| 不同包中的非子类 | 不可访问 | 不可访问       | 不可访问  | 可访问 |

- **private**
  - 不能被该类的子类访问合引用
- **friendly**
  - 包访问性：定义在同一个文件夹中的所有类属于同一个包
- **protected**
  - 主要使用：允许其他包中它的子类访问父类的属性和方法

#### static

不依赖于类的特定实例，被类的所有实例共享

- **静态变量**

  - 运行时，Java 虚拟机只为静态变量分配一次内存，在加载类的过程中完成静态变量的内存分配
  - 静态变量可以被类的所有实例共享，因此静态变量可以作为实例之间的共享数据，增加实例之间的交互性

- **静态方法**

  - 静态方法不能使用this、super，只能使用static变量

- **静态代码块**

  - 类似于一个方法，但是不可以存在于任何方法之中
  - JVM会在加载类时执行静态代码块**（只会执行一次）**
  - 同样不能访问实例变量和方法

  ```java
  public class TestClass{
    public static int 
    static{
      //TODO
    }
  }
  ```

#### final

- 不可改变
  - **变量：**常量，值不可改变
    - 只能在**<u>（初始化 ｜ 构造函数）</u>**二选一
  - **方法：**方法不能被重写
    - 方法不需要扩展，并且不允许子类重写这个方法
  - **类：**该类不能被继承，该类是最终形态
    - 该类是继承树中的叶子类
    - 属性可以不为final；方法自动变成final

------

### 可变参数

```java
public void display(int fixed_args, int...args){
  System.out.println("固定参数: " + fixed_args);
  System.out.println("可变参数：");
  for(int arg : args){
    System.out.println(arg);
  }
}
```

- 可变参数必须定义在参数列表的最后

  ```java
  public void display(int fixed_args, int...int_args, String...str_args){}		//这样是不允许的
  ```

------

### 垃圾回收 ｜ GC

内存自动回收称为垃圾回收（Garbage Collection）机制，简称 GC。垃圾回收机制是指 JVM 用于释放那些不再使用的对象所占用的内存

**垃圾**

- 超出作用域的对象被视为垃圾
- 被赋值为null的对象为null

------

## 包

将类组合成单元，保护类、数据和方法。在包外不能访问该类

### 系统包

| 包                    | 说明                                                         |
| --------------------- | ------------------------------------------------------------ |
| java.lang             | Java 的核心类库，包含运行 Java 程序必不可少的系统类，如基本数据类型、基本数学函数、 字符串处理、异常处理和线程类等，系统默认加载这个包 |
| java.io               | Java 语言的标准输入/输出类库，如基本输入/输出流、文件输入/输出、过滤输入/输出流等 |
| java.util             | 包含如处理时间的 Date 类，处理动态数组的 Vector 类，以及 Stack 和 HashTable 类 |
| java.awt              | 构建图形用户界面（GUI）的类库，低级绘图操作 Graphics 类、图形界面组件和布局管理 （如 Checkbox 类、Container 类、LayoutManger 接口等），以及用 户界面交互控制和事 件响应（如 Event 类） |
| java.awt.image        | 处理和操纵来自网上的图片的 java 工具类库                     |
| java.wat.peer         | 很少在程序中直接用到，使得同一个 Java 程序在不同的软硬件平台上运行 |
| java.net              | 实现网络功能的类库有 Socket 类、ServerSocket 类              |
| java.lang.reflect     | 提供用于反射对象的工具                                       |
| java.util.zip         | 实现文件压缩功能                                             |
| java.awt.datatransfer | 处理数据传输的工具类，包括剪贴板、字符串发送器等             |
| java.sql              | 实现 JDBC 的类库                                             |
| java.rmi              | 提供远程连接与载入的支持                                     |
| java. security        | 提供安全性方面的有关支持                                     |

### 自定义包

- 建立目录，目录名与包名一致
- 在需要放入该包的类文件头写上`package 包名`

------

## 继承

### 封装

将对象的属性和方法相结合，通过方法将对象的属性和实现细节保护起来，实现对象的属性隐藏

- 可以在setter里添加对赋值对限制

------

### 继承

- 在子类中调用父类的构造函数：`super(param_list)`，必须放在子类构造函数的第一行
- 如果子类没有构造函数，默认会调用父类的无参构造函数
- java只有单继承，一个子类只能有一个父类
- 如果类声明头部没有定义任何 extends 子句，则该类隐含地继承自 java.lang.Object 类

------

## 多态

- 继承
- 重写
- 向上转型：将子类的引用赋给父类对象，只有这样该引用才既能可以调用父类的方法，又能调用子类的方法

### 方法重载

**同一个类中发生的事情**

- 重载方法的参数列表必须和被重载的方法不同，并且这种不同必须足以清楚地确定要调用哪一个方法
- 重载方法的返回值类型可以和被重载的方法相同，也可以不同，但是只有返回值类型不同不能表示为重载

------

### 方法重写/覆盖

**发生在继承体系中子类和父类中**

- 参数列表必须完全与被重写的方法参数列表相同，否则不能称其为重写

- 返回的类型必须与被重写的方法的返回类型相同，否则不能称其为重写

- 访问修饰符的限制一定要大于被重写方法的访问修饰符（public>protected>default>private）

- 重写方法一定不能抛出新的检査异常或者比被重写方法声明更加宽泛的检査型异常

  >  例如，父类的一个方法声明了一个检査异常 IOException，在重写这个方法时就不能抛出 Exception，只能拋出 IOException 的子类异常，可以抛出非检査异常。

### 变量隐藏

子类中创建了一个成员变量，而该变量的类型和名称都与父类中的同名成员变量相同

- 如果子类有属性或方法跟父类变量重名，可以使用`super.param` `super.function`来使用父类的属性和方法

------

### 转型

- **绑定：**
  - **方法：**动态绑定
  - **静态方法：**静态绑定（在编译阶段已经完成绑定，不能再变的）
  - **成员变量、静态变量：**静态绑定
- 向上转型自动完成；向下转型必须强制类型转换
  - 子类比父类东西多，向下转型不安全
- 如果两种类型没有继承关系，不允许进行类型转换

------

### 抽象类

- abstract 关键字只能用于普通方法，不能用于 static 方法或者构造方法中
- 抽象类中必须包含至少一个抽象方法，并且所有抽象方法不能有具体的实现

```java
abstract class Shape{
  protected double height;
  protected double weight;
  
  abstract public double area();	//注意这里不能手快写{}，{}就已经是方法体了
}
```

------

## 接口

接口是一种规范，封装了可以被多个类继承的公共部分（比抽象类更抽象化）

> 接口把方法的特征和实现分隔开
>
> <u>**接口**是角色，包装了角色相关的操作和属性</u>
>
> <u>**实现接口的类**是演这个角色的演员</u>
>
> 一个角色由不同的演员来演，而不同的演员除了扮演同一个角色之外，不要求其他的公共之处

### 接口定义

- **属性：**

  - 都是常量（public，static，final）
  - 接口中定义的变量必须初始化

- **方法：**

  - 必须是abstract && public（不需要写，已经隐式声明）
  - 没有构造函数（不能被实例化）

- **接口继承：**一个接口不能实现另一个接口，但可以继承多个其他接口

  - 子接口可以对父接口的方法和常量重写

  ```java
  public interface StudentInterface extends PeopleInterface{
    //...
  }
  ```

### 接口实现

```java
public class Student implements PeopleInterface,StudentInterface{
  //...
}
```

- 一个类只有一个直接父类，但可以实现多个接口
- :question: 如果一个类实现两个声明了同样方法的接口，那么相同的方法将被其中任一个接口使用
- 实现接口的方法必须声明为public

------

### 接口和抽象类的区别

并不是所有的类都是用来描绘对象的，如果一个类中没有描绘一个具体的对象，那么这样的类就是抽象类

| 接口                                                         | 抽象类                                                       |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| 接口只能是功能的定义                                         | 抽象类可以包含具体的实现方法                                 |
| implements                                                   | extends                                                      |
| 某类可以实现多个接口                                         | 某类只能实现一个抽象类                                       |
| 不关注类之间的关系：父类和子类在概念上不要求相同，只是抽取相互之间没有关系的共同特征<br /><u>接口是对一组具有相同属性和方法的逻辑上不相关的事物的一种抽象</u> | 继承关系：父类和子类在概念上是相同的<br /><u>抽象类是对一组具有相同属性和方法的逻辑上有关系的事物的一种抽象</u> |
| like a                                                       | is a                                                         |

> 例. 动物都会吃，有的动物会飞有的不会飞
>
> - 吃：放到Animal抽象类中
> - 飞：放到canFly接口中
>
> - 不会飞的动物继承Animal抽象类
> - 会飞的动物继承Animal抽象类，并实现canFly接口
>
> ```java
> abstract class Animal{
>   abstract public void eat();
> }
> 
> interface canFly{
>   void fly();
> }
> 
> class Animal_cannot_fly extends Animal{
>   @Override
>   public void eat(){
>     System.out.println("Animal_cannot_fly.eat()");
>   }
> }
> 
> class Animal_can_fly extends Animal implements canFly{
>   @Override
>   public void eat() {
>     System.out.println("Animal_can_fly.eat()");
>   }
> 
>   @Override
>   public void fly() {
>     System.out.println("Animal_can_fly.fly()");
>   }
> }
> 
> /* 使用 */
> Animal_cannot_fly an = new Animal_cannot_fly();
> an.eat();
> 
> Animal_can_fly ac = new Animal_can_fly();
> ac.eat();
> ac.fly();
> ```

------

## 异常处理

```java
try{
  //TODO
}catch(ExceptionType1 e){
  //handle
}catch(ExceptionType2 e){
  /* 对于处理不了的异常或要转型的异常，通过throws，调用上层的调用方法处理 */
  throw(e);		//抛出异常
  throws(e);	//可能会出现的异常
}finally{				//任何情况下都会执行
  //释放资源
}
```

- **输出异常信息**
  - `printStackTrace()`：之处异常的类型、性质、栈层次及出现在程序中的位置
  - `getMessage()`：输出错误性质
- 当一个catch捕获到异常时，其他catch就不再进行匹配
  - 当捕获的多个异常之间存在父子关系时，捕获异常一般先捕获子类，再捕获父类，所以**子类异常必须在父类异常的前面**
- catch, finally都是可选的，但二者至少出现一个
- 不在finally中使用return和throw等导致方法终止的语句，否则将导致try和catch中的return和throw语句失效

### 自动资源管理

```java
try(
	BufferReader br = new BufferedReader(new FileReader("xx.java"));
  PrintStream ps = new PrintStream(new FileOutputStream("a.txt"));
){
  //TODO
}
```

```java
final BufferReader br = new BufferedReader(new FileReader("xx.java"));
final PrintStream ps = new PrintStream(new FileOutputStream("a.txt"));

try(br; ps){
  //TODO
}
```

- try代码块结束时，会自动释放资源
- try中声明的资源隐式为final

### 声明和抛出异常

**throws**：声明要抛出的异常

- 一个方法产生它不处理的异常时，需要在方法的头部声明这个异常，一遍将该异常传递到方法的外部进行处理（当前不知道如何处理这种类型的异常，该异常应该由上一级的调用者处理）
- 如果main方法也不知道如何处理，则该异常交给JVM处理（打印异常的跟踪栈信息，并且终止程序）
- 子类方法声明抛出的异常不能比父类声明抛出的异常多

```java
public static void readFile() throws IOException{
  FileInputStream file = new FileInputStream("a.txt");
  //...
}

public static void main(String[] args){
  try{
    readFile();
  }catch (IOException e){
    //捕获异常
  }
}
```

**throw**：抛出异常对象

- throw语句执行时，后面的语句将不执行，返回调用者程序寻找匹配的catch，如果没有匹配的，则再向上一层找catch
- 一般只会抛出程序中已经产生的异常类的实例

### 多异常捕获

```java
try{
  //TODO
}catch(IOException | ParseException e){
  //handle
}
```

- 并列的多个异常不能有包含关系
- 多异常捕获时，异常变量隐式为final，因此不能对异常变量重新赋值

### 自定义异常

```java
public class XxxException extends Exception{
  public XxxException(){
    super();
  }
  public XxxException(String str){
    super(str);
  }
}
```

### 记录日志类

- Logger的默认级别是INFO，比它低的日志将不现实
  - `logger.setLevel(Level.FINE);`可将FINE和更高级别的都记录下来

```java
private static Logger log = Logger.getLogger(Main.class.toString());

public static void main(String[] args) {
  log.finest("this is a finest");
  log.finer("this is a finer");
  log.fine("this is a fine");
  log.config("this is a config");
  log.info("this is a info");
  log.warning("this is a warning");
  log.severe("this is a server");

}
```

------

## 数据结构

- **集合**
  - Collection
    - Queue
      - Deque：双端队列 
    - List
      - ArrayList：数组实现的List
      - LinkedList
    - Set
      - HashSet
      - TreeSet：有序Set
  - Map
- 把一个对象丢进集合中，集合会忘记这个对象的类型，所有集合元素都是Object类型?

### List

- **ArrayList**：可变数组
  - 提供基于索引访问（随机访问）
  - 插入删除效率低
  - 对尾增加和删除较好
- **LinkedList**：链表
  - 善于插入删除
  - 随机访问效果差
  - 对头尾操作方便

### Set

- **HashSet**
  - 如果多个线程同时访问或修改一个HashSet，则必须通过代码来保证其同步
  - 不会出现相同的元素
- **TreeSet**
  - 默认情况下是自然排序的
  - 只能添加相同数据类型的对象
  - **方法**
    - `subSet(fromElement, toElement)`
    - `headSet(toElement)`：toElement之前的所有对象
    - `tailSet(fromElement)`

### Map

- key不允许重复，value可以重复

- **方法**

  - `containsKey(key)`
  - `containsValue(value)`
  - `entrySet()`：所有键-值对的Set集合
  - `keySet()`：所有键对象的Set集合
  - `values()`：所有value组成的Collection

- **遍历**

  ```java
  /* 遍历key */
  for(Integer key : map.keySet()){
    System.out.println(key);
  }
  
  /* 遍历value */
  for(String value : map.values()){
    System.out.println(value);
  }
  
  /* for中使用entries遍历 */
  for(Map.Entry<Integer, String> entry : map.entrySet()){
    Integer key = entry.getKey();
    String value = entry.getValue();
    System.out.println(key + ": " + value);
  }
  
  /* 迭代器遍历 */
  Iterator<Map.Entry<Integer, String>> entryIterator = map.entrySet().iterator();
  while(entryIterator.hasNext()){
    Map.Entry<Integer, String> entry = entryIterator.next();
    Integer key = entry.getKey();
    String value = entry.getValue();
    System.out.println(key + ": " + value);
  }
  
  /* 通过键找值遍历 */
  HashMap hashmap = new HashMap();
  Iterator iter = hashmap.keySet().iterator();
  while(iter.hasNext()){
    Object key = iter.next();
    Object value = hashmap.get(key);
  }
  ```

### Collection类

#### 排序

- `sort(list)`
- `reverse(list)`：逆向排序
- `shuffle(list)：`洗牌
- `rotate(list, distance)`：将后distance个元素整体移动到前面

#### 查找、替换

- `binarySearch(list, key)`
- `frequency(collection, object)`：指定集合中指定元素出现次数
- `fill(list, object)`：使用指定obj替换指定list中的所有元素

#### 复制

- `copy(destList, srcList)`：目标集合长度要大于等于源集合长度

#### lambda表达式遍历Collection

```java
collection.forEach(obj -> System.out.println(obj));
```

#### Iterator遍历Collection

- **方法**

  - `hasNext()`

  - `next()`

  - `remove()`：删除集合里上一次next方法返回的元素

  - `forEachRemaining(lambda表达式)`

    ```java
    iter.forEachRemaining(obj -> System.out.println(obj));
    ```

    

- 当使用迭代器访问Collection集合元素时，集合里的元素不能被更改，只有`remove()`可以

- 采用快速失败机制(fail-fast)，一旦在迭代过程中检测到该集合已经被修改，程序立即引发异常，而不是现实修改后的结果，<u>这样可以避免共享资源引发的潜在问题</u>

#### for-each遍历Collection

```java
for(Object obj : objects){
  //TODO
}
```

- for-each循环中的迭代变量是值传递，因此修改无意义
- for-each循环中，集合也不能被改变

#### Predicate操作Collection

```java
objs.removeIf(ele -> ((String) ele).length() < 12)
```

- 批量删除符合filter条件的所有元素

#### Stream操作Collection

1. 使用Stream或XxxStream的`builder()`创建Stream对应的Builder
2. 重复调用Builder的`add()`向该流中添加多个元素
3. 调用Builder的`build()`获取对应的Stream
4. 调用Stream的聚集方法

- 中间方法：允许流保持打开状态，并允许直接调用后续方法

  | 方法                           | 说明                                                         |
  | ------------------------------ | ------------------------------------------------------------ |
  | filter(Predicate predicate)    | 过滤 Stream 中所有不符合 predicate 的元素                    |
  | mapToXxx(ToXxxFunction mapper) | 使用 ToXxxFunction 对流中的元素执行一对一的转换，该方法返回的新流中包含了 ToXxxFunction 转换生成的所有元素。 |
  | peek(Consumer action)          | 依次对每个元素执行一些操作，该方法返回的流与原有流包含相同的元素。该方法主要用于调试。 |
  | distinct()                     | 该方法用于排序流中所有重复的元素（判断元素重复的标准是使用 equals() 比较返回 true）。这是一个有状态的方法。 |
  | sorted()                       | 该方法用于保证流中的元素在后续的访问中处于有序状态。这是一个有状态的方法。 |
  | limit(long maxSize)            | 该方法用于保证对该流的后续访问中最大允许访问的元素个数。这是一个有状态的、短路方法。 |

- 末端方法：对流的最终操作，执行完将被消耗且不可再用

  | 方法                           | 说明                                                       |
  | ------------------------------ | ---------------------------------------------------------- |
  | forEach(Consumer action)       | 遍历流中所有元素，对每个元素执行action                     |
  | toArray()                      | 将流中所有元素转换为一个数组                               |
  | reduce()                       | 该方法有三个重载的版本，都用于通过某种操作来合并流中的元素 |
  | min()                          | 返回流中所有元素的最小值                                   |
  | max()                          | 返回流中所有元素的最大值                                   |
  | count()                        | 返回流中所有元素的数量                                     |
  | anyMatch(Predicate predicate)  | 判断流中是否至少包含一个元素符合 Predicate 条件。          |
  | allMatch(Predicate predicate)  | 判断流中是否每个元素都符合 Predicate 条件                  |
  | noneMatch(Predicate predicate) | 判断流中是否所有元素都不符合 Predicate 条件                |
  | findFirst()                    | 返回流中的第一个元素                                       |
  | findAny()                      | 返回流中的任意一个元素                                     |

#### 不可变集合

- 调用Set、List、Map的`of()`方法创建包含N个元素的不可变集合

```java
Set set = Set.of(...);
List list = List.of(...);
Map map = Map.of("first", 1, "second", 2);
Map map2 = Map.ofEntries(Map.entry("first", 1), Map.entry("second", 2));
```

### 枚举
```java
public enum SexEnum{
  male, female;
}

SexEnum.male
```

- 一组带标识符的常数
- 不能有重名
- 默认类型为int
- **方法**
  - `values()`：以数组形式返回枚举类型的所有成员
  
  - `valueOf()`：将普通字符串转换为枚举实例
  
    ```java
    SexEnum.valueOf("male");		//取出枚举成员male对应的值
    ```
  
  - `compareTo()`：比较两个枚举成员在定义时的顺序
  
    ```java
    SexEnum s = SexEnum.valueOf("male");
    s.compareTo(SexEnum.female);
    ```
  
  - `ordinal()`：获取枚举成员的索引位置

------

## 泛型

- 泛型的本质是提供类型的“**类型参数**”，可以为类、接口、方法指定一个类型参数，通过这个参数限制操作的数据类型，从而保证类型转换的绝对安全
- 泛型在编译时检查类型安全，并且所有的强制转换都是自动和隐藏的，提高代码的重用率

### 泛型类

```java
public class Student<type1, type2>{
  private type1 name;
  private type2 age;
}

Student<String, Integer> stu = new Student<String, Integer>("zz", 20);
```

### 泛型方法

- 泛型方法不一定非要在泛型类中
- 泛型方法使得该方法能独立于类而产生变化

```java
public static <T> void test(T buf){
  //TODO
}
```

### 高级用法

#### 限制泛型可用类型

```java
class Student<T extends someclass>
```

- 泛型类的类型必须实现或继承someclass这个类或接口
- 默认时使用Object类作为泛型类型

#### 使用类型通配符

- 创建泛型类对象时限制这个泛型类的类型必须实现或继承某个接口或类

```java
Student<? extends someclass>
```

#### 继承泛型类

```java
public class FatherClass<T1>{}
public class SonClass<T1,T2,T3> extends FatherClass<T1>{}
```

------

## 反射机制

- 在程序运行期，给定类名，可以通过反射机制获取类的所有信息

### Class类

| 类型           | 访问方法                  | 返回值类型         | 说明                                              |
| -------------- | ------------------------- | ------------------ | ------------------------------------------------- |
| 包路径         | getPackage()              | Package 对象       | 获取该类的存放路径                                |
| 类名称         | getName()                 | String 对象        | 获取该类的名称                                    |
| 继承类         | getSuperclass()           | Class 对象         | 获取该类继承的类                                  |
| 实现接口       | getlnterfaces()           | Class 型数组       | 获取该类实现的所有接口                            |
| 构造方法       | getConstructors()         | Constructor 型数组 | 获取所有权限为 public 的构造方法                  |
|                | getDeclaredContruectors() | Constructor 对象   | 获取当前对象的所有构造方法                        |
| 方法           | getMethods()              | Methods 型数组     | 获取所有权限为 public 的方法                      |
|                | getDeclaredMethods()      | Methods 对象       | 获取当前对象的所有方法                            |
| 成员变量       | getFields()               | Field 型数组       | 获取所有权限为 public 的成员变量                  |
|                | getDeclareFileds()        | Field 对象         | 获取当前对象的所有成员变量                        |
| 内部类         | getClasses()              | Class 型数组       | 获取所有权限为 public 的内部类                    |
|                | getDeclaredClasses()      | Class 型数组       | 获取所有内部类                                    |
| 内部类的声明类 | getDeclaringClass()       | Class 对象         | 如果该类为内部类，则返回它的成员类，否则返回 null |

- 获取Class实例
  - `String.class`
  - `str.getClass()`
- 其他方法
  - `isInterface()：
  - `isArray()`
  - `isPrimitive()`：是否为基本类型（int、char这些）

### reflect包

- Constructor类：类的构造方法
- Field类：类或借口中成员变量信息
- Method类：成员方法信息
- Array类：动态创建和访问Java数组的方法
- Modifier类：访问修饰符信息

```java
try{
  //动态家在类的运行时对象
  Class c = Class.forName("java.lang.String");

  //获取成员方法集合
  Method[] methods = c.getDeclaredMethods();
  for(Method method : methods){
    //权限修饰符 public等
    System.out.println(Modifier.toString(method.getModifiers()));
    //返回值类型名称
    System.out.println(method.getReturnType().getName());
    //方法名称
    System.out.println(method.getName());
  }
}catch (ClassNotFoundException e){
  System.out.println("找不到该类");
}
```

### 访问构造函数

- 创建`Constructor`类对象

  ```java
  getConstructor()
  ```

- `Constructor`类的方法

  | 方法名称                       | 说明                                                         |
  | ------------------------------ | ------------------------------------------------------------ |
  | isVarArgs()                    | 查看该构造方法是否允许带可变数量的参数，如果允许，返回 true，否则返回 false |
  | getParameterTypes()            | 按照声明顺序以 Class 数组的形式获取该构造方法各个参数的类型  |
  | getExceptionTypes()            | 以 Class 数组的形式获取该构造方法可能抛出的异常类型          |
  | newInstance(Object … initargs) | 通过该构造方法利用指定参数创建一个该类型的对象，如果未设置参数则表示 采用默认无参的构造方法 |
  | setAccessiable(boolean flag)   | 如果该构造方法的权限为 private，默认为不允许通过反射利用 netlnstance() 方法创建对象。如果先执行该方法，并将入口参数设置为 true，则允许创建对 象 |
  | getModifiers()                 | 获得可以解析出该构造方法所采用修饰符的整数                   |

- Modifier类

  ```java
  int modifiers = con.getModifiers();
  boolean isPublic = Modifier.isPublic(modifiers);
  ```

  | 静态方法名称         | 说明                                                     |
  | -------------------- | -------------------------------------------------------- |
  | isStatic(int mod)    | 如果使用 static 修饰符修饰则返回 true，否则返回 false    |
  | isPublic(int mod)    | 如果使用 public 修饰符修饰则返回 true，否则返回 false    |
  | isProtected(int mod) | 如果使用 protected 修饰符修饰则返回 true，否则返回 false |
  | isPrivate(int mod)   | 如果使用 private 修饰符修饰则返回 true，否则返回 false   |
  | isFinal(int mod)     | 如果使用 final 修饰符修饰则返回 true，否则返回 false     |
  | toString(int mod)    | 以字符串形式返回所有修饰符                               |

### 访问方法

- 创建`Method`类对象

  ```java
  getMethods()
  ```

- `Method`类方法

  （相同方法省略）

  | 静态方法名称                     | 说明                                                         |
  | -------------------------------- | ------------------------------------------------------------ |
  | invoke(Object obj,Object...args) | 利用 args 参数执行指定对象 obj 中的该方法，返回值为 Object 类型 |

### 访问成员变量

- 创建`Field`类对象

  ```java
  getFields()
  ```

- `Field`类方法

  | 方法名称                          | 说明                                                         |
  | --------------------------------- | ------------------------------------------------------------ |
  | get(Object obj)                   | 获得指定对象 obj 中成员变量的值，返回值为 Object 类型        |
  | set(Object obj, Object value)     | 将指定对象 obj 中成员变量的值设置为 value                    |
  | getlnt(0bject obj)                | 获得指定对象 obj 中成员类型为 int 的成员变量的值             |
  | setlnt(0bject obj, int i)         | 将指定对象 obj 中成员变量的值设置为 i                        |
  | setFloat(Object obj, float f)     | 将指定对象 obj 中成员变量的值设置为 f                        |
  | getBoolean(Object obj)            | 获得指定对象 obj 中成员类型为 boolean 的成员变量的值         |
  | setBoolean(Object obj, boolean b) | 将指定对象 obj 中成员变量的值设置为 b                        |
  | getFloat(Object obj)              | 获得指定对象 obj 中成员类型为 float 的成员变量的值           |
  | setAccessible(boolean flag)       | 此方法可以设置是否忽略权限直接访问 private 等私有权限的成员变量 |

------

## 流

- 流是一组有序的数据序列，将数据从一个地方带到另一个地方

### 输入流

- `InputStream`：字节输入流

  - 遇到错误都会引发`IOException`异常

  - **方法**：

    | 名称                               | 作用                                                         |
    | ---------------------------------- | ------------------------------------------------------------ |
    | int read()                         | 从输入流读入一个 8 字节的数据，将它转换成一个 0~ 255 的整数，返回一个整数，如果遇到输入流的结尾返回 -1 |
    | int read(byte[] b)                 | 从输入流读取若干字节的数据保存到参数 b 指定的字节数组中，返回的字节数表示读取的字节数，如果遇到输入流的结尾返回 -1 |
    | int read(byte[] b,int off,int len) | 从输入流读取若干字节的数据保存到参数 b 指定的字节数组中，其中 off 是指在数组中开始保存数据位置的起始下标，len 是指读取字节的位数。返回的是实际读取的字节数，如果遇到输入流的结尾则返回 -1 |
    | void close()                       | 关闭数据流，当完成对数据流的操作之后需要关闭数据流           |
    | int available()                    | 返回可以从数据源读取的数据流的位数。                         |
    | skip(long n)                       | 从输入流跳过参数 n 指定的字节数目                            |
    | boolean markSupported()            | 判断输入流是否可以重复读取，如果可以就返回 true              |
    | void mark(int readLimit)           | 如果输入流可以被重复读取，从流的当前位置开始设置标记，readLimit 指定可以设置标记的字节数 |
    | void reset()                       | 使输入流重新定位到刚才被标记的位置，这样可以重新读取标记过的数据 |

  - 先使用`markSupported()`判断是否可以重复读区，如果可以，使用`mark(int readLimit)`进行标记，标记完成后使用`read()`读区标记范围内的字节数，最后使用`reset()`使输入流重新定位到标记的位置，再进行重复读取

  <img src="http://c.biancheng.net/uploads/allimg/200115/5-200115145253550.png" alt="InputStream类的层次结构图" style="zoom:77%;" />

- `Read`：字符输入流

  - Java的字符是Unicode编码（双字节）

  | 方法名及返回值类型                    | 说明                                                         |
  | ------------------------------------- | ------------------------------------------------------------ |
  | int read()                            | 从输入流中读取一个字符，并把它转换为 0~65535 的整数。如果返回 -1， 则表示 已经到了输入流的末尾。为了提高 I/O 操作的效率，建议尽量使用下面两种 read() 方法 |
  | int read(char[] cbuf)                 | 从输入流中读取若干个字符，并把它们保存到参数 cbuf 指定的字符数组中。 该方 法返回读取的字符数，如果返回 -1，则表示已经到了输入流的末尾 |
  | int read(char[] cbuf,int off,int len) | 从输入流中读取若干个字符，并把它们保存到参数 cbuf 指定的字符数组中。其中， off 指定在字符数组中开始保存数据的起始下标，len 指定读取的字符数。该方法返 回实际读取的字符数，如果返回 -1，则表示已经到了输入流的末尾 |

### 输出流

- `OutputStream`

  - **方法**：

    | 名称                                 | 作用                                                     |
    | ------------------------------------ | -------------------------------------------------------- |
    | int write(b)                         | 将指定字节的数据写入到输出流                             |
    | int write (byte[] b)                 | 将指定字节数组的内容写入输出流                           |
    | int write (byte[] b,int off,int len) | 将指定字节数组从 off 位置开始的 len 字节的内容写入输出流 |
    | close()                              | 关闭数据流，当完成对数据流的操作之后需要关闭数据流       |
    | flush()                              | 刷新输出流，强行将缓冲区的内容写入输出流                 |

    <img src="http://c.biancheng.net/uploads/allimg/200115/5-200115151G3J0.png" alt="OutputStream类的层次结构图" style="zoom:77%;" />

- `Writer`

  | 方法名及返回值类型                         | 说明                                                         |
  | ------------------------------------------ | ------------------------------------------------------------ |
  | void write(int c)                          | 向输出流中写入一个字符                                       |
  | void write(char[] cbuf)                    | 把参数 cbuf 指定的字符数组中的所有字符写到输出流中           |
  | void write(char[] cbuf,int off,int len)    | 把参数 cbuf 指定的字符数组中的若干字符写到输出流中。其中，off 指定 字符数组中的起始下标，len 表示元素个数 |
  | void write(String str)                     | 向输出流中写入一个字符串                                     |
  | void write(String str, int off,int len)    | 向输出流中写入一个字符串中的部分字符。其中，off 指定字符串中的起 始偏移量，len 表示字符个数 |
  | append(char c)                             | 将参数 c 指定的字符添加到输出流中                            |
  | append(charSequence esq)                   | 将参数 esq 指定的字符序列添加到输出流中                      |
  | append(charSequence esq,int start,int end) | 将参数 esq 指定的字符序列的子序列添加到输出流中。其中，start 指定 子序列的第一个字符的索引，end 指定子序列中最后一个字符后面的字符 的索引，也就是说子序列的内容包含 start 索引处的字符，但不包括 end 索引处的字符 |

### 系统流

- `System`类
  - `System.in`：标准输入流，默认设备是键盘
  - `System.out`：默认设备是控制台
  - `System.err`：同上

```java
byte[] byteData = new byte[100];
try{
  System.in.read(byteData);
}catch(IOException e){
}
System.out.println("...");
```

### 字符编码

- **编码类型**
  - ISO8859-1
  - GBK/GB2312
  - Unicode
  - UTF
- **方法**
  - `System.getProperty("file.encoding")`：获取当前系统编码
  - `getBytes(charset)`：编码转换

### File文件操作类

- 用来操作文件和目录，但不能访问文件内容本身（输入/输出流）

- **常量**

  - `File.pathSeparator`：分割连续多个路径字符串的分隔符
  - `File.separator`：分隔统一路径字符串中的目录

- **方法**：

  | 方法名称                      | 说明                                                         |
  | ----------------------------- | ------------------------------------------------------------ |
  | boolean canRead()             | 测试应用程序是否能从指定的文件中进行读取                     |
  | boolean canWrite()            | 测试应用程序是否能写当前文件                                 |
  | boolean delete()              | 删除当前对象指定的文件                                       |
  | boolean exists()              | 测试当前 File 是否存在                                       |
  | String getAbsolutePath()      | 返回由该对象表示的文件的绝对路径名                           |
  | String getName()              | 返回表示当前对象的文件名或路径名（如果是路径，则返回最后一级子路径名） |
  | String getParent()            | 返回当前 File 对象所对应目录（最后一级子目录）的父目录名     |
  | boolean isAbsolute()          | 测试当前 File 对象表示的文件是否为一个绝对路径名。该方法消除了不同平台的差异，可以直接判断 file 对象是否为绝对路径。在 UNIX/[Linux](http://c.biancheng.net/linux_tutorial/)/BSD 等系统上，如果路径名开头是一条斜线`/`，则表明该 File 对象对应一个绝对路径；在 Windows 等系统上，如果路径开头是盘符，则说明它是一个绝对路径。 |
  | boolean isDirectory()         | 测试当前 File 对象表示的文件是否为一个路径                   |
  | boolean isFile()              | 测试当前 File 对象表示的文件是否为一个“普通”文件             |
  | long lastModified()           | 返回当前 File 对象表示的文件最后修改的时间                   |
  | long length()                 | 返回当前 File 对象表示的文件长度                             |
  | String[] list()               | 返回当前 File 对象指定的路径文件列表                         |
  | String[] list(FilenameFilter) | 返回当前 File 对象指定的目录中满足指定过滤器的文件列表       |
  | boolean mkdir()               | 创建一个目录，它的路径名由当前 File 对象指定                 |
  | boolean renameTo(File)        | 将当前 File 对象指定的文件更名为给定参数 File 指定的路径名   |

```java
File f = new File("Users" + File.separator + "test.txt");		//适配操作系统

/* 获取文件属性 */
f.getName();
f.getPath();

/* 创建和删除文件 */
if(f.exists()){
  f.delete();
}
f.createNewFile();

/* 创建和删除文件 */
if(f.exists()){
  f.delete();
}
f.mkdir();

/* 遍历目录 */
String fileList[] = f.list();

//只希望列出某些文件
//首先创建文件过滤器，并在accept()中指定允许的文件类型
public class ImageFilter implements FilenameFilter{
  @Override
  public boolean accept(File dir, String name){
    return name.endsWith(".png") || name.endsWith(".jpg");
  }
}
String imageList = f.list(new ImageFilter());
```

### 字节流

#### 字节数组流

#### 文件流

- **输入流**

  - 如果创建文件时找不到，抛出`FileNotFoundException`异常

  ```java
  try{
    FileInputStream fis1 = new FileInputStream(new File("_path_"));
    FileInputStream fis2 = new FileInputStream("_path_");
  }catch(FileNotFoundException e){
  }
  ```

- **输出流**

  - 如果指定文件不存在，则创建一个新文件；如果已存在，则清除原文件重新写入

  ```java
  try{
    FileOutputStream fos1 = new FileOutputStream(new File("_path_"));
  	FileOutputStream fos1 = new FileOutputStream(new File("_path_"), true);		//第二个参数是boolean append
  }catch(FileNotFoundException e){
  }
  ```

### 字符流

#### 字符文件流

- **输入流**
  - `FileReader(File file)`
- **输出流**
  - `FileWriter(File file)`
  - `FileWeiter(File file, boolean append)`
  - 文件不存在时回自动生成一个新文件；如果尝试打开制度文件回引发异常

#### 字符缓冲区

- **输入**
  - 主要用于辅助其他字符输入流，可以先将一批数据读到内存缓冲区，接下来的操作可以直接从缓冲区读取数据，而不需要每次都从数据源读取数据
  - `BufferedReader(Reader in)`
  - `BufferedReader(Reader in, int size)`
- **输出**
  - 同理，缓冲区写满了后，将缓冲区的数据一次性写到字符输出流
  - `BufferedWriter(Writer out)`
  - `BufferedWriter(Writer out, int size)`

### 转换流

- `InputStreamReader`：将字节输入流转换为字符输入流
- `OutputStreamWriter`：将字节输出流转换为字符输出流

> **🔍为什么没有字节流转换为字符流？**
>
> 字节流比字符流的使用范围要更广，但字符流比字节流操作方便。如果有一个流已经是字符流了，也就是说，是一个用起来更方便的流，为什么要转换成字节流呢？反之，如果现在有一个字节流，但可以确定这个字节流的内容都是文本内容，那么把它转换成字符流来处理就会更方便一些，所以 Java 只提供了将字节流转换成字符流的转换流，没有提供将字符流转换成字节流的转换流。

------

## 注解 | Annotation

- 本质上是一种数据类型，是一种接口类型

- **作用**

  - 生成帮助文档：@see, @param, @return

  - 减少配置，跟踪代码依赖性

  - 在编译时进行格式检查

    > 🌰@Override
    >
    > 没有这个注解也能正常实行，好处在于，注解相当于告诉编译器这个方法是一个重写方法，如果父类中不存在该方法，编译器就会报错，防止typo造成的错误

## @Override

- **作用**：指定方法重写，强调子类必须重写弗雷方法或实现接口方法，否则会编译错误
- **范围**：只能修饰方法

```java
public class Person{
  @Override
  public String toString(){
    return "test @Override";
  }
}
```

## @Deprecated

- **作用**：表示某个元素已过时，当其他程序使用已过时的元素时，编译器给出警告
- **范围**：类、接口、成员方法、成员变量
- 过时的API会被画上删除线
- **属性**：
  - `forRemoval`：指定该API在将来是否会被删除
  - `since`：指定该API从哪个版本被标记为过时

```java
class Test{
  @Deprecated(since = "9", forRemoval = true)
  public void display(){
    //...
  }
}
```

## @SuppressWarnings

- **作用**：指定被该注释修饰的元素取消显示指定的编译器警告，且会一直做用于该元素的所有子元素

- **属性**

  | 关键字                   | 用途                                                   |
  | ------------------------ | ------------------------------------------------------ |
  | all                      | 抑制所有警告                                           |
  | boxing                   | 抑制装箱、拆箱操作时候的警告                           |
  | cast                     | 抑制映射相关的警告                                     |
  | dep-ann                  | 抑制启用注释的警告                                     |
  | deprecation              | 抑制过期方法警告                                       |
  | fallthrough              | 抑制在 switch 中缺失 breaks 的警告                     |
  | finally                  | 抑制 finally 模块没有返回的警告                        |
  | hiding                   | 抑制相对于隐藏变量的局部变量的警告                     |
  | incomplete-switch        | 忽略不完整的 switch 语句                               |
  | nls                      | 忽略非 nls 格式的字符                                  |
  | null                     | 忽略对 null 的操作                                     |
  | rawtypes                 | 使用 generics 时忽略没有指定相应的类型                 |
  | restriction              | 抑制禁止使用劝阻或禁止引用的警告                       |
  | serial                   | 忽略在 serializable 类中没有声明 serialVersionUID 变量 |
  | static-access            | 抑制不正确的静态访问方式警告                           |
  | synthetic-access         | 抑制子类没有按最优方法访问内部类的警告                 |
  | unchecked                | 抑制没有进行类型检查操作的警告                         |
  | unqualified-field-access | 抑制没有权限访问的域的警告                             |
  | unused                   | 抑制没被使用过的代码的警告                             |

```java
class Test{
  @SuppressWarnings({"deprecation"})
  public void display(){
    //...
  }
}
```

## @SafeVarargs

- **作用**：警告泛型类型一致
- 不适用于非static或非final声明的方法，可用@SuppressWarnings替代

```java
public class Test{
  public static void main(String[] args){
    display(10, 20, 30);
    
    display("10", 20, 30);	//参数类型不一致，警告
  }
  
  @SafeVarargs
  public static <T> void display(T... args){
    for(T arg : args){
      //...
    }
  }
}
```

## @FunctionalInterface

- **作用**：指定某个接口必须是函数式接口（保证该接口只能包含一个抽象方法）
- **范围**：只能修饰接口

```java
@FunctionalInterface
public interface FunInterface{
  void test();	//只能有一个抽象方法
}
```

## 元注解

- 对其他注解进行说明的注解

### @Documented

- 被它修饰的注释类会被JavaDoc提取成文档

- 生成**JavaDoc**

  ```shell
  javac MyDocument.java DocumentTest.java
  javadoc -d doc MyDocument.java DocumentTest.java
  ```

```java
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface MyDocumented {
    public String value() default "这是@Document注解";
}
```

```java
public class DocumentedTest {
    @MyDocumented
    public String Test(){
        System.out.println("test for mydocumented");
        return "test for mydocumented";
    }
}
```

### @Target

- **作用**：指定注解的使用范围

- **属性**：

  - `value`

    | 名称           | 说明                                     |
    | -------------- | ---------------------------------------- |
    | CONSTRUCTOR    | 用于构造方法                             |
    | FIELD          | 用于成员变量（包括枚举常量）             |
    | LOCAL_VARIABLE | 用于局部变量                             |
    | METHOD         | 用于方法                                 |
    | PACKAGE        | 用于包                                   |
    | PARAMETER      | 用于类型参数（JDK 1.8新增）              |
    | TYPE           | 用于类、接口（包括注解类型）或 enum 声明 |

```java
@Target({ElementType.METHOD})
public @interface MethodTarget{
}

class Test{
  @MethodTarget
  void display(){}
}
```

### @Retention

- **作用**：描述注解的生命周期（注解被保留的时间长短）
- **value**
  - SOURCE：在源文件中有效（即源文件保留），运行时
  - CLASS：在 class 文件中有效（即 class 保留），编译时
  - RUNTIME：在运行时有效（即运行时保留）

### @Inherited

- **作用**：指定该注解可以被继承，某个类使用该注解，则其起勒将自动具有该注解

### @Repeatable

- **作用**：允许在相同的元素中重复注解

```java
public @interface Roles{
  Role[] value();
}

@Repeatable(Roles.class)
public @interface Role{
  String roleName();
}

public class RoleTest{
  @Role(roleName = "role1")
  @Role(roleName = "role2")
  public void test(){}
}
```

### @Native

- **作用**：表示该变量可以被本地代码引用
- **范围**：成员变量

## 自定义注解

```java
public @interface MyAnnotation{
  String name() default "MyAnnotation";
}

public class Test{
  @MyAnnotation(name="Test")
  public void display(){}
}
```

- 成员变量以无形参的方法形式表示
- default：默认注解
- **分类**
  - 标记注解：没有成员变量的注解
  - 元数据注解：包含成员变量的注解