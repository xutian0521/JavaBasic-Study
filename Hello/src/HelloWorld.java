import java.text.SimpleDateFormat;
import java.util.*;

public class HelloWorld {
    public static void main(String[] var0) throws InterruptedException {
        Class1 c =new Class1();
        System.out.println("hello world");
        System.out.println(c.SayHello());

        //线程睡眠
        Thread.sleep(1000 *3);
        System.out.println("------------------时间格式化------------------------");
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为: " + ft.format(dNow));

        System.out.println("----------------StringBuilder----------------------");
        StringBuilder sb= new StringBuilder();
        sb.append("123");
        sb.append("ABC");
        System.out.println(sb.toString());

        System.out.println("-------------------ArrayList-----------------------");
        ArrayList<String> list = new ArrayList<String>(); //集合可重复 类似于C# List<T>
        list.add("ArrayList1");
        list.add(0, "ArrayList2");
        for (String item: list) { //foreach
            System.out.println(item);
        }
        list.forEach( item -> System.out.println(item));

        System.out.println("-------------------HashSet-----------------------");
        HashSet<Integer> sets = new HashSet<Integer>(); //集合不能重复 C#也叫 HashSet<T>
        sets.add(1);
        sets.add(2);
        for (int item : sets) {
            System.out.println(item);
        }


        System.out.println("-------------------HashMap-----------------------");
        HashMap<String, Integer> maps = new HashMap<String, Integer>();
        maps.put("Tom", 18);
        maps.put("Jack", 20);
        for (Map.Entry<String, Integer> item: maps.entrySet() ) {
            System.out.println("name:" + item.getKey() +"  age:" + item.getValue());
        }
        maps.forEach((k, v) ->{
            System.out.println("name:" + k +"  age:" + v);
        });

    }
}
