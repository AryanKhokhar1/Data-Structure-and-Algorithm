public class validParanthesis {

    static boolean checkParanthesis(StringBuilder str,int openBrac, int closeBrac ){
        if(0 == str.length() && openBrac == closeBrac) {
            return true;
        }else if(str.length() == 0 && openBrac != closeBrac){
            return  false;
        }
        boolean a = true;
        boolean b = true;
        if(str.charAt(0) == '('){
            str.deleteCharAt(0);
            a = checkParanthesis(str, openBrac+1, closeBrac);
        }else{
            str.deleteCharAt(0);
            b = checkParanthesis(str, openBrac, closeBrac+1);
        }
        if(a||b == true) return true; else return false;
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("()(()))");
        System.out.println(checkParanthesis(str,0,0));
    }
}
