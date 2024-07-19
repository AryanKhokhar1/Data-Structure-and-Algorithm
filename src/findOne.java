import java.util.Arrays;
public class findOne {

    static int findOne(int[] arr){
        Arrays.sort(arr);
        for(int i = 2; i<=arr.length-1; i+= 3){
            if(arr[i] != arr[i-1] || arr[i-1] != arr[i-2] || arr[i-2] != arr[i]){
                return arr[i-2];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,3,3,1,5,1};
        System.out.println(findOne(arr));
    }
}
