import java.util.HashMap;

public class listAnagram {

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
        String[] arr = {"axaya","axyaa","axxy","ayxx","xayx","abxyz","zbxya","axxy","yaxx","xayx"};
        int ans = 0;
        int val = 0;
        for(int i= 1; i<arr.length; i++){
            if(!makeMap(arr[i-1]).equals(makeMap(arr[i]))){
                System.out.println(arr[i-1]+"is equals to "+arr[i]+": "+makeMap(arr[i-1]).equals(makeMap(arr[i])));
                if(val>0){
                    ans++;
                }
            }else{
                val++;
                System.out.println(arr[i-1]+"is equals to "+arr[i]+": "+makeMap(arr[i-1]).equals(makeMap(arr[i])));
            }
        }
        System.out.println(ans+1);
    }
}
