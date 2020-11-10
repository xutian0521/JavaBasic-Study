import java.text.SimpleDateFormat;
import java.util.*;

public class HelloWorld {
    public static void main(String[] var0) throws InterruptedException {
        Class1 c =new Class1();
        System.out.println("hello world");
        System.out.println(c.SayHello());

        //线程睡眠
        //Thread.sleep(1000 *3);
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

        //-------------------数组初始化(和C#一样)-----------------------
        int[] arr1 = new int[]{ 1, 2, 3 };
        int[] arr2 = {6, 7, 8};
        System.out.println("-------------------数组for循环(和C#一样)-----------------------");
        for (int i=0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println("-------------------String-----------------------");
        String s1 = new String();
        System.out.println(s1);

        char[] chs ={'a','b','c'};
        String s2 = new String(chs);
        System.out.println(s2);

        byte[] bys= {97,98,99};
        String s3 = new String(bys);
        System.out.println(s3);

        String s4="abc";
        String s5="abc";
        System.out.println(s4);

        System.out.println( s4 == s5 );
        System.out.println(s4.equals(s5));

        System.out.println("-------------------循环字符串--------------------");
        for (int i =0; i < s5.length(); i++){
            System.out.println(s5.charAt(i));
        }
    }
}
