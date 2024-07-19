import java.util.HashMap;

public class checkAnagrams {
    static HashMap<Character,Integer> makeMap(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        int val;
        for(int i = 0; i<str.length(); i++){
            if(map.get(str.charAt(i)) == null){
                map.put(str.charAt(i),1);
            }else{
                val = map.get(str.charAt(i));
                map.put(str.charAt(i),val+1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bca";
        HashMap<Character,Integer> map1 = makeMap(str1);
        HashMap<Character,Integer> map2 = makeMap(str2);
        System.out.println(map1.equals(map2));
    }
}
