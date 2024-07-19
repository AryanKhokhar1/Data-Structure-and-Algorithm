import java.util.HashMap;

public class One {
    static int findOne(int[] arr){
        HashMap<Integer,Boolean> map = new HashMap<Integer, Boolean>();
        for(int ele: arr) {
            if (!map.containsKey(ele)) {
                map.put(ele, true);
            } else {
                map.remove(ele);
            }
        }
        return map.keySet().iterator().next();
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1,0,3,7,1,4,4};
        System.out.println(findOne(arr));
    }
}
