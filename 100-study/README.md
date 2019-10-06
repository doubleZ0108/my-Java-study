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
{
  //abstract -> 抽象类
  //final -> 不允许被继承
  //extends -> 继承其他类
  //implements -> 实现某些接口
}
```


