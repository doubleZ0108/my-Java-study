package Stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStream {
    /* 字节数组输入流 */
    public static void ByteArrayInput(byte[] bytes){
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes, 0, 5);	//字节数组输出流

        int i = bais.read();
        while(i != -1){
            System.out.println(i);
            i = bais.read();	//从输入流中读取下一个字节，并转换为int
        }
    }

    /* 字节数组输出流 */
    public static void ByteArrayOutput(byte[] bytes){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(bytes, 0, 5);
        byte[] newByteArray = baos.toByteArray();	//将输出流中的内容转换为字节数组
    }

    public static void main(String[] args) {
        byte[] bytes = new byte[]{1,2,3,4,5};

        ByteArrayInput(bytes);
        ByteArrayOutput(bytes);

    }

}
