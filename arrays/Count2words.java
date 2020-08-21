/**Given an array of n words. Some words are repeated twice, we need count such words. */
import java.util.HashMap; 
import java.util.Map; 
public class Count2words{
    public static void main(String[] args) {
        String[] words = {"hate", "love", "peace", "love", 
        "peace", "hate", "love", 
        "love"};
        System.out.println(count2(words));
    }

    static int count2(String[] array){
        int count = 0;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
            } 
            else {
                map.put(array[i], 1);
            }
            
        }
        for(Map.Entry<String, Integer> it : map.entrySet()){
            if(it.getValue()==2){
                count++;
            }
        }
        return count;
    }
}