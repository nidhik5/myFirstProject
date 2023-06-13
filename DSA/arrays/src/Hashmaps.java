import java.util.*;
public class Hashmaps {
    public static void main (String []args)
    {
        // for country and population
        HashMap<String,Integer> mp= new HashMap<>();

        //insertion
        mp.put("India",120);
        mp.put("usa",220);
        mp.put("sa",320);

        //System.out.println(mp);

        //search
        //if(mp.containsKey("usa"))
        //    System.out.println("key present");
        //else
        //    System.out.println("key absent");

        // get value
        //System.out.println(mp.get("sa"));

        // iterating through an array
        int a[]={23,45,67};
        for(int var:a)
        {
            //System.out.println(var);
        }

        // iterating in hashmap
        //for(Map.Entry<String,Integer> e : mp.entrySet())

        mp.remove("usa");
        for(Map.Entry<String,Integer> e : mp.entrySet())
            System.out.println(e);
    }
}
