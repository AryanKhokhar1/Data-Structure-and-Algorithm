public class Right_Shift {


    public static void main(String[] args) {
        int[] arr = {3,4,1,0,6,8,9};
        int k = 3;
        int[] helper = new int[k];
        for(int i =  0 ; i<k; i++){
            helper[i] = arr[arr.length-k+i];
        }
        int a;
        int b = arr[0];
        for(int i = arr.length-1; i>=k; i--){
            a = 
            arr[i] = b;
        }
        for(int ele:arr){
            System.out.print(ele+",");
        }
    }
}
