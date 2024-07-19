public class generate_one_and_zero {
    int generate(int i, int j){
        int num = (int) Math.pow(2,i) -1;
        return num << j;
    }
    public static void main(String[] args) {
        generate_one_and_zero obj = new generate_one_and_zero();
        int a = obj.generate(4,5);
        System.out.println(a);
    }
}
