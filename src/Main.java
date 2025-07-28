import java.util.*;
public class Main{
    public static String filter(List<String> passwords){
        List<String> validPassword = new ArrayList<>();

        for(String password : passwords){
            if(isvalidPassword(password)){
                validPassword.add(password);
            }
        }
        return String.join(" ",validPassword);
    }

    private static boolean isvalidPassword(String password){
        if(password.length()<8){
            return false;
        }
        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasOther = false;

        for(char c : password.toCharArray()){
            if(Character.isLetter(c)){
                hasLetter=true;
            }else if(Character.isDigit(c)){
                hasDigit = true;
            }
            else{
                hasOther = true;
            }
        }
        return (hasLetter && hasDigit) || hasOther;
    }
    public static void main(String[] args) {
        List<String> passwords = Arrays.asList("asdf123@","as12@","asdasdcw");
        String result = filter(passwords);
        System.out.println(result);
    }
}