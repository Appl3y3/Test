import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        //1.换位测试
//        int[] arr = {1, 4, 2, 8, 5, 7};
//        Tools.twoSwitch(arr, 4, 5);
//        System.out.println(Tools.toString(arr));

//
//        String str = "aaaasb";
//        System.out.println(str.matches("a*b"));

//        //2.格式化时间
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String time = dtf.format(LocalDateTime.now());
//        //System.out.println(time);


//        Method[] methods = new Method[0];
//        try {
//            Class c = Class.forName("com.appleye.utils.Tools");
//            methods = c.getMethods();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        for (Method m : methods
//             ) {
//            System.out.println(m);
//        }

//        //3.泛型擦除测试
//        List<String> list = new ArrayList<String>();
//        list.add("asd");
//
//        try {
//            Class c = Class.forName("java.util.ArrayList");
//            Method addMethod = c.getMethod("add", Object.class);
//            addMethod.invoke(list, 123);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
//
//
//        System.out.println(list.toString());

//        //4.获取IP
//        InetAddress local = null;
//        InetAddress baidu = null;
//        try {
//            local = InetAddress.getLocalHost();
//            baidu = InetAddress.getByName("www.baidu.com");
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        }
//        System.out.println(local.getHostAddress());
//        System.out.println(baidu.getHostAddress());

//        //5.去空格（只能去前后的空格，中间的去不了）
//        String str = "asd  a   ";
//        //str = str.trim();
//        System.out.print(str.trim());
//        System.out.println("asd");

//        ThreadPoolExecutor tpe = new ThreadPoolExecutor();
        //round:+0.5再向下取整
//        System.out.println(Math.round(1.2));//1
//        System.out.println(Math.round(1.8));//2
//        System.out.println(Math.round(-1.2));//-1
//        System.out.println(Math.round(-1.8));//-2
//        System.out.println(Math.round(1.5));//2
//        System.out.println(Math.round(-1.5));//-


//        6.拼字符串，StringBuilder-append比+快15倍
//        String str = new String();
//        System.out.println(str.length());

//        Integer[] integers = {1,3,4,12,4};
//        List<Integer> list = Arrays.asList(integers);

//        7.对象序列化测试
//        TestWorker testWorker = new TestWorker(23,"年代");
//        System.out.println(testWorker.toString());
//
//        try {
//            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("TestWorker.txt"));
//            oos.writeObject(testWorker);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("TestWorker.txt"));
//            TestWorker testWorker1 = (TestWorker) ois.readObject();
//            System.out.println(testWorker1.toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


//        8.Java只有值传递(类似快递员发短信)

//        9.拉姆达表达式和双冒号用法
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        list.forEach(System.out::println);
//        list.stream().map(x -> x + 5).forEach(System.out::println);

//        10.正则表达式用法
//        List<String> phone = Arrays.asList("130681198712092019", "13068119871209201x",
//                "13068119871209201", "123456789012345", "12345678901234x",
//                "1234567890123","420626199412277512");
//
//        Pattern p1 = Pattern.compile("(\\d{17}[0-9a-zA-Z]|\\d{14}[0-9a-zA-Z])");
//        //简化写法
//        phone.forEach(x -> System.out.println(x + ":\t\t" + p1.matcher(x).matches()));
//        //复杂写法
////        for (int i = 0; i < phone.size(); i++) {
////            Matcher matcher = p1.matcher(phone.get(i));
////            System.out.println(phone.get(i) + ":" + matcher.matches());
////        }

//        Pattern p2 = Pattern.compile("\\d{6}(\\d{8}).*");//生日
//        Pattern p3 = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})");//生日拆分年月日
//        for (int i = 0; i < phone.size(); i++) {
//            Matcher matcher = p2.matcher(phone.get(i));
//            boolean b = matcher.find();
//            if (b) {
//                String s = matcher.group(1);
//                Matcher matcher2 = p3.matcher(s);
//                if (matcher2.find()) {
//                    System.out.println("生日为：" + matcher2.group(1) + "年"
//                            + matcher2.group(2) + "月"
//                            + matcher2.group(3) + "日");
//                }
//            }
//        }

//        11.自定义二叉树
//        CustomNode node = new CustomNode(21);
//        node.put(12);
//        node.put(22);
//        node.put(52);
//        node.put(21);
//        node.put(21);
//        node.put(2);
//
//        node.print();
//
//        System.out.println(node.exist(12));

//        //12.测试快速排序2
//        String[] strVoid=new String[]{"66","22","44"};
//
//        Tools.quickSort(strVoid,0,strVoid.length-1);
//        for(int i=0;i<strVoid.length;i++) {
//            System.out.println(strVoid[i] + " ");
//        }

        //13.测试自写快速排序2
//        List<Integer> list = Arrays.asList(31,321,12,35,13);
//        System.out.println(list.toString());
//        Tools.quickSort_self(list,0,list.size() - 1);
//        System.out.println(list.toString());

        Map<String, Integer> map = new HashMap<>();
        map.put("",1);
        map.put(null,3);

        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(map.size());
        System.out.println(map.toString());






    }
}