public class minStep {

    static int Steps(int s){
        if(s == 1) return 1;
        else if(s == 0) return 0;
        else return 1 + Steps(s - 2);
    }

    public static void main(String[] args) {
        System.out.println("Steps: " + Steps(7));
    }
}
