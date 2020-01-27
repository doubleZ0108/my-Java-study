package Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 【转换流】
 * 获取键盘输入
 * Java 使用 System.in 代表标准输出，即键盘输入，但这个标准输入流是 InputStream 类的实例，使用不太方便，而且键盘输入内容都是文本内容
 * 所以可以使用 InputStreamReader 将其转换成字符输入流
 * 普通的 Reader 读取输入内容时依然不太方便，可以将普通的 Reader 再次包装成 BufferedReader，利用 BufferedReader 的 readLine() 方法可以一次读取一行内容
 */
public class InputStream2Reader {
    public static void main(String[] args) {
        try{
            //将System.in对象转换为Reader对象
            InputStreamReader reader = new InputStreamReader(System.in);
            //将普通的Reader包装成BufferedReader
            BufferedReader br = new BufferedReader(reader);
            String line = null;
            while((line = br.readLine()) != null){
                if(line.equals("exit")){
                    System.exit(1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
