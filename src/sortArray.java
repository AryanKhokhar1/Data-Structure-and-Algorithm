public class sortArray {

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,0,0,1};
        int zeros = 0;
        int one = 0;
        for(int ele:arr){
            if(ele == 0){
                zeros++;
            }else if(ele == 1){
                one++;
            }
        }
        for(int i = 0; i<zeros; i++){
            arr[i] = 0;
        }
        for(int j = zeros; j<arr.length; j++){
            arr[j] = 1;
        }
        for(int ele: arr){
            System.out.print(ele+",");
        }
    }
}
