import java.util.HashMap;
import java.util.Map;

public class mostOccuredChar {

    public static void main(String[] args) {
        String s= "cbcaazada";
        HashMap<Character,Integer> map = new HashMap<>();
        int val = 0;
        for(int i = 0; i<s.length(); i++){
            if(map.get(s.charAt(i)) == null){
                map.put(s.charAt(i), 1);
            }else{
                val = map.get(s.charAt(i));
                map.put(s.charAt(i),val+1);
            }
        }
        System.out.println(map);
        int max  = 0;
        char letter = '1';
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(max<entry.getValue()){
                max = entry.getValue();
                letter = entry.getKey();
            }
        }
        System.out.println(letter);
    }
}
