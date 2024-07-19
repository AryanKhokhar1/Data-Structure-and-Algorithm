class divideTwoNumber {
    public int divide(int dividend, int divisor) {

        int ans = 0;
        long answer = 0L;
        long divid = (dividend);
        long divis = (divisor);

        if(dividend <0){
            divid *= -1;
        }
        if(divisor <0){
            divis *= -1;
        }
        System.out.println(divid);
        System.out.println(divis);

        while(divid>= divis){
            answer++;
//            System.out.println(divid+" / "+divis+" = "+answer);
            divid -= divis;
        }


        // System.out.println(dividend<0);
        // System.out.println(divisor<0);

        if(dividend < 0 && divisor < 0 || dividend > 0 && divisor > 0 ){
            if(answer == 2147483648L){
                return Integer.MAX_VALUE;
            }else{
                return (int) answer;
            }
        }else{
            if((-1)*answer == Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            } else{
                return (-1)*((int) answer);
            }
        }
    }

    public static void main(String[] args) {
        divideTwoNumber obj = new divideTwoNumber();
        int ans = obj.divide(-2147483648,4);
        System.out.println("Answer: "+ans);
    }
}