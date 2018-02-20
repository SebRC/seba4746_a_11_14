import java.util.Map;
import java.util.TreeMap;

public class Exercise14
{
    public static void main(String[] args)
    {
        //initializes the two maps needed for method
        Map<String, Integer> map1 = new TreeMap<>();
        Map<String, Integer> map2 = new TreeMap<>();

        //fills both lists with elements
        map1.put("Janet", 87);
        map1.put("Logan", 62);
        map1.put("Whitaker", 46);
        map1.put("Alyssa", 100);
        map1.put("Stefanie", 80);
        map1.put("Jeff", 88);
        map1.put("Kim", 52);
        map1.put("Sylvia", 95);

        map2.put("Logan", 62);
        map2.put("Kim", 52);
        map2.put("Whitaker", 52);
        map2.put("Jeff", 88);
        map2.put("Stefanie", 80);
        map2.put("Brian", 60);
        map2.put("Lisa", 83);
        map2.put("Sylvia", 87);

        //initialized class as to be able to access methods of class
        Exercise14 exercise14 = new Exercise14();

        //method call and printout
        System.out.println(exercise14.intersect(map1, map2));
    }

    //method takes two maps with strings for keys and integers for values
    //and returns a new map with all the key/value pairings they share
    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2)
    {
        //initializes new map to be used for storing the shared pairings
        //and which will also be returned at the end of method
        Map<String, Integer> intersectMap = new TreeMap<>();

        //for each loop examining each entry of map1
        for(Map.Entry<String, Integer> entry: map1.entrySet())
        {
            //if map2 contains the current entry from map1, add the pairing to intersectmap
            if(map2.entrySet().contains(entry))
            {
                //adds the key and value to intersectmap
                intersectMap.put(entry.getKey(), entry.getValue());
            }
        }

        //returns the new map with shared pairings
        return intersectMap;
    }
}
