public class setBit {
    public static void main(String[] args) {
        int num = 11;
        int setBit = 0;
        while(num != 0){
            if((num & 1) == 1){
                setBit++;
            }
            num = num>>1;
        }
        System.out.println(setBit);
    }
}
