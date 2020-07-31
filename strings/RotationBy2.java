/**Given two strings, the task is to find if a string
 *  can be obtained by rotating another string two places. */
public class RotationBy2{
    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = "cdefgab";
        System.out.println(isRotatedBy2(str1,str2));
    }

    static boolean isRotatedBy2(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        String clockwiseRotate = "";
        String anticlockwiseRotate = "";
        int len = str2.length();

        clockwiseRotate += str2.substring(2) + str2.substring(0,2);
        anticlockwiseRotate += str2.substring(len-2,len)+ str2.substring(0,len-2);

        return (str1.equals(clockwiseRotate)) || (str1.equals(anticlockwiseRotate));
    }
}