import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        //hashSet does not retain order
        Set<String> set1=new HashSet<String>();
        //linkedHashSet rememebers the order you added items in
        // treeset sorts in natural orders.
        set1.add("dog");
        set1.add("d");
        set1.add("ddafog");
        set1.add("ddfdog");
        set1.add("dodfdfg");
        set1.add("doadffteg");

        set1.add("dog");

        System.out.println(set1);

        //iteration////

        for(String element: set1){
            System.out.println(element);

            //Deos set contains a given item?
            if(set1.contains("dddfd")){
                System.out.println("Contains cat");
            }
        }

    }
}
