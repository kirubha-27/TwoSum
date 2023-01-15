import java.util.HashMap;
import java.util.Map;
/*
* Given an array of integers nums and an integer target,
* return indices of the two numbers such that they add up to target.
* */
public class Main {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int i=0;
        int[] a = new int[2];
        while(i<nums.length){
            if(map.containsKey(target-nums[i])){
                a[0]=map.get(target-nums[i]);
                a[1] = i;
                return a;
            }
            map.put(nums[i],i);
            i++;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = twoSum(new int[]{2,3,7,8,3},9);
    }
}
