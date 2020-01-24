import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        IntStream intStream = IntStream.builder().add(20).add(-13).add(5).build();

        //最大值
        System.out.println(intStream.max().getAsInt());

        //总和
        System.out.println(intStream.sum());

        //总数
        System.out.println(intStream.count());

        //平均值
        System.out.println(intStream.average());

        //所有平方和大于25的
        System.out.println(intStream.allMatch(ele -> ele * ele > 25));

        //是否存在平方和大于25的
        System.out.println(intStream.anyMatch(ele -> ele * ele > 25));

        //map
        System.out.println(intStream.map(ele -> ele * 2 + 1));

        //遍历
        intStream.forEach(System.out::println);

    }
}
