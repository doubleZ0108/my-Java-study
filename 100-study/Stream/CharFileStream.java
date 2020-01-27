package Stream;

import java.io.*;

public class CharFileStream {
    /* 字符文件输入流 */
    public static void readFile(File f) {
        FileReader fr = null;
        try{
            fr = new FileReader(f);
            int i = 0;
            while((i = fr.read()) != -1){
                System.out.println((char) i);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* 字符文件输出流 */
    public static void writeFile(File f){
        FileWriter fw = null;
        try{
            fw = new FileWriter(f);
            fw.write("...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        File f = new File("this.txt");
    }
}
