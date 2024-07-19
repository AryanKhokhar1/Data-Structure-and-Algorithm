public class mostFrequentElement {

    static int mostFrequent(int[] arr,int target){
        int n = 0;
        for(int i = 0; i<arr.length && arr[i]<= target; i++){
           if(arr[i] == target) {
               n++;
           }
           if(arr[i]>target){
               break;
           }
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(mostFrequent(new int[]{1,2,3,3,3,4,4,4,4,7},4));
    }
}
