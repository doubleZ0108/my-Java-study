package Stream;


import java.io.*;

public class BufferStream {

    /* 字符缓冲区输入流 */
    public static void readBuffer(File f){
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String strLine = "";
            while((strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        File f = new File("this.txt");
    }
}
