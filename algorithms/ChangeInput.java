//Given an integer as input and replace all the ‘0’ with ‘5’ in the integer.
public class ChangeInput{
    public static void main(String[] args) {
        int n = 107;
        System.out.println(change0to5(n));
    }

    static int change0to5(int n){
        String str = Integer.toString(n);
        char[] chArray = str.toCharArray();

        for(int i=0;i<chArray.length;i++){
            if (chArray[i]=='0'){
                chArray[i] = '5';
            }
        }
        String strNew = new String(chArray);

        return Integer.valueOf(strNew);
    }
}