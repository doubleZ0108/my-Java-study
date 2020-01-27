package Stream;

import java.io.*;

/**
 * @program: study
 * @description:
 * @author: Zhe Zhang
 * @create: 2020/01/27
 **/
public class FileStream {

    /* 文件输入流 */
    public static void FileInput(File f){
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(f);
            byte[] bytes = new byte[1024];
            int n = 0;      //世纪读取到到字节数
            while((n = fis.read(bytes)) != -1){
                String s = new String(bytes, 0, n);
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* 文件输出流 */
    public static void FileOutput(File f){
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(f);
            byte[] bytes = new byte[1024];
            fos.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        File f = new File("this.txt");

        FileInput(f);
        FileOutput(f);
    }

}
