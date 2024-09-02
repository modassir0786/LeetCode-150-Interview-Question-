import java.util.*;
public class MovingHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String hash = "";
        String rem ="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '#'){
                hash +="#";

            }else{
                rem+=s.charAt(i);
            }
        }
        String res = hash+rem;
        System.out.println(res);
    }  
}
