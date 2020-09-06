import java.util.*;




class Person{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id + ": " + name;
    }
}
public class MapEx1 {
    public static void main(String[] args) {
        Person p1=new Person(0, "Bob");
        Person p2=new Person(1, "sd");
        Person p3=new Person(2, "Bosdfb");
        Person p4=new Person(3, "gagsdfg");
        Map<Person,Integer> map= new LinkedHashMap<Person, Integer>();
        map.put(p1,1);
        map.put(p2,2);
        map.put(p3,3);
        map.put(p4,4);
        for (Person key:map.keySet()){
           System.out.println(key +": " + map.get(key));
      }


//        Map<String, Integer> map=new LinkedHashMap<String, Integer>();
//        map.put("one",11);
//        map.put("wl ",10);
//        map.put("one",18);
//        map.put("dfd",17);
//        map.put("dfa",14);
//        map.put("one",19);
//        for (String key:map.keySet()){
//            System.out.println(key +": " + map.get(key));
//        }
        System.out.println("//////////////////////////");

        Set<String> set=new LinkedHashSet<String>();
        set.add("o4ne");
        set.add("o6ne");
        set.add("on8e");
        set.add("o9ne");
        System.out.println(set);

        }


    }
