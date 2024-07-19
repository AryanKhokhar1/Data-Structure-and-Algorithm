import java.util.ArrayList;

public class missingNumber {

    static int num(int[] arr, int k){

        int index = 0;
        int val = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 1; i<arr[arr.length-1]; i++){
            if(arr[index] == i){
                index++;
            }else{
                arrayList.add(i);
                val++;
            }
            if(val == k){
                return i;
            }
        }
        return (arr[arr.length-1] + (k - arrayList.size()));
    }
    public static void main(String[] args) {
        int[] arr = {1,3,7,8,9};
        int k = 5;
        int ans = num(arr,k);
        System.out.println(ans);
    }
}
