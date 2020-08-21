/**Find uncommon characters of the two strings */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Uncommon{
    public static void main(String[] args) {
        String a = "characters"; 
        String b = "alphabets";
        List<Character> list = uncommon(a,b);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    static List<Character> uncommon(String a, String b){
        List<Character> list = new ArrayList<Character>();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<a.length();i++){
            if(!map.containsKey(a.charAt(i))){
                map.put(a.charAt(i),1);
            }
        }
        for(int i=0;i<b.length();i++){
            if(map.containsKey(b.charAt(i))&&
            (map.get(b.charAt(i))==1||map.get(b.charAt(i))==0)){
                map.put(b.charAt(i),0);
            }
             else {
                map.put(b.charAt(i),2);
            }
        }
        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            System.out.print(set.getKey());
            System.out.print(" ");
            System.out.println(set.getValue());
        }
        for (Map.Entry<Character, Integer> set : map.entrySet()) {
		    if(set.getValue()==1||set.getValue()==2){
                list.add(set.getKey());
            }
        }
        return list;
    }
}