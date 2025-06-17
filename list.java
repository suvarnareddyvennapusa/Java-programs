import java.util.*;

class Geeks {

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("DSA");
        list.add("C++");
        System.out.println("Elements of List are:");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Element at Index 1: "+ list.get(1));  
        list.set(1, "JavaScript");
        System.out.println("Updated List: " + list);
        list.remove("C++");
        System.out.println("List After Removing Element: " + list);
    }
}
