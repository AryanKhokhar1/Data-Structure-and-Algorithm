public class primeNumber {

    static boolean isPrime(int num,int i){
        boolean ans = true;
        if(num<=0){
            return false;
        } else if(num <= i){
            return ans;
        }
        if(num%i == 0){
            return false;
        }
        return isPrime(num, i+1);
    }

    static void rangePrime(int N){
        if(N== 1){
            return;
        }
        if(isPrime(N,2)){
            if(N<3){
                System.out.printf("Is %d a Prime Number: %b",N,isPrime(N,2));
            }else{
                System.out.printf("Is %d a Prime Number: %b",N,isPrime(N,N/2));
            }
            System.out.println();
        }
        rangePrime(N-1);
    }
    public static void main(String[] args) {
//        System.out.printf("Is %d a Prime Number: %b",5,isPrime(5,2));
        rangePrime(10);
    }

}
