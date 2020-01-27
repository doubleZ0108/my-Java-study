package Stream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 输入输出综合案例
 *
 * 图书存储读取系统
 */
class Book {
    private int no;
    private String name;
    private double price;

    public Book() {
    }

    public Book(int no, String name, double price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }

}
public class Library {
    private List books = new ArrayList();

    public int size(){
        return books.size();
    }

    public Book get(int index){
        return (Book) books.get(index);
    }

    public void add(Book book){
        books.add(book);
    }

    public void write(){
        FileWriter fw = null;
        try{
            fw = new FileWriter("_store_filename_.txt");
            for(int i=0;i<this.size();++i){
                fw.write(this.get(i).toString());
            }
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

    public void read(){
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("_store_filename_.txt");
            br = new BufferedReader(fr);
            String str = "";
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book(1001, "C语言中文网Java教程", 159);
        Book book2 = new Book(1002, "C语言中文网C++教程", 259);

        Library library = new Library();
        library.add(book1);
        library.add(book2);
        library.write();
        library.read();
    }
}
