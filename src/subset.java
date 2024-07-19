public class subset {
    public static void main(String[] args) {
        int[] arr = {17,-5, 3};
        int answer = 0;
        int num = (int) Math.pow(2,arr.length);
        int val = 0;
        for(int i =0; i<num; i++){
            for(int a = 0; a<arr.length; i++){
                val += arr[a];
            }
            if(answer < val){
                answer = val;
            }
        }
    }
}
