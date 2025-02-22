import java.util.HashMap;
import java.util.Map;
public class Map2{
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put( "Nitesh", 50);
        students.put( "Likhi", 70);
        students.put("Nitesh", 80);


        System.out.println(students);
        System.out.println(students.keySet());
        for(String key: students.keySet()){
            System.out.println(key + ":" +students.get(key));
        }
    }}
