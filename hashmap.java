import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[])
    {
        HashMap<Integer, String> hashmap1 = new HashMap<>();
        HashMap<Integer, String> hashmap2
            = new HashMap<Integer, String>();
        hashmap1.put(1, "one");
        hashmap1.put(2, "two");
        hashmap1.put(3, "three");

        hashmap2.put(4, "four");
        hashmap2.put(5, "five");
        hashmap2.put(6, "six");
        System.out.println("Mappings of HashMap hashmap1 are : "
                           + hashmap1);
        System.out.println("Mapping of HashMap hashmap2 are : "
                           + hashmap2);
    }
}
