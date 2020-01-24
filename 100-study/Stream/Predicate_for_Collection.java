import java.util.Collection;
import java.util.HashSet;

public class Predicate_for_Collection {

    public static void main(String[] args) {
        Collection objs = new HashSet();
        objs.add(new String("C语言中文网Java教程"));
        objs.add(new String("C语言中文网C++教程"));
        objs.add(new String("C语言中文网C语言教程"));
        objs.add(new String("C语言中文网Python教程"));
        objs.add(new String("C语言中文网Go教程"));

        // 统计集合中出现“C语言中文网”字符串的数量
        System.out.println(objs.stream().filter(ele -> ((String) ele).contains("C语言中文网")).count());

        // 统计集合中出现“Java”字符串的数量
        System.out.println(objs.stream().filter(ele -> ((String) ele).contains("Java")).count());

        // 统计集合中出现字符串长度大于 12 的数量
        System.out.println(objs.stream().filter(ele -> ((String) ele).length() > 12).count());

        // 遍历
        System.out.println("");
        objs.stream().mapToInt(ele -> ((String) ele).length()).forEach(System.out::println);    //先转换为IntStream
    }

}
