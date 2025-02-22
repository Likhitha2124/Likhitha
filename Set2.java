import java.util.Set;
import java.util.HashSet;
public class Set2{
    public static void main(String[]args){
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(62);
        nums.add(54);
        nums.add(79);

        for(int n : nums){
            System.out.println(n);
        }
    }
}