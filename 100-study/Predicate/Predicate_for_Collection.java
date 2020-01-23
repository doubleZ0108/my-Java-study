import java.util.*;
import java.util.function.Predicate;

/**
 * 1. 统计集合中出现“C语言中文网”字符串的数量。
 * 2. 统计集合中出现“Java”字符串的数量。
 * 3. 统计集合中出现字符串长度大于 12 的数量。
 */
public class Predicate_for_Collection{
    public static int calAll(Collection collection, Predicate predicate){
        int total = 0;
        for(Object object : collection){
            if(predicate.test(object)){
                ++total;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Collection objs = new HashSet();
        objs.add(new String("C语言中文网Java教程"));
        objs.add(new String("C语言中文网C++教程"));
        objs.add(new String("C语言中文网C语言教程"));
        objs.add(new String("C语言中文网Python教程"));
        objs.add(new String("C语言中文网Go教程"));

        System.out.println(calAll(objs, ele -> ((String) ele).contains("C语言中文网")));
        System.out.println(calAll(objs, ele -> ((String) ele).contains("Java")));
        System.out.println(calAll(objs, ele -> ((String) ele).length() > 12));
    }
}