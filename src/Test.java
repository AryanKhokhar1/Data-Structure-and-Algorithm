import java.util.ArrayList;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arl = new ArrayList<>();
        arl.add("Arayn");
        arl.add("Ara");
        int a = 1;
        boolean res = arl.remove("Ara");
        System.out.println(res);
        System.out.println(arl);

    }
}
