package day38_arraylist03;
import java.util.ArrayList;
public class RawArrayList {
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Saturday");
        list.add("Java day");
        list.add(1000);
        list.add(234.4);
        list.add(true);
        list.add(false);
        
        System.out.println(list);//automatically call toString()
        String allValues = list.toString();
        System.out.println(allValues);
        
        String str = list.get(0).toString();
        System.out.println(list.get(0));
        System.out.println(str);
        Integer i = (Integer) list.get(2);//downcasting
        System.out.println(i);
        //System.out.println(Integer.parseInt(list.get(3)));
        //All values are stored as a raw type. We can also call it,
        //as a General Object type
    }
}