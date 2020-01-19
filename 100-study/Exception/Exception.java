import java.util.Scanner;

/**
 * 用户名必须为8位以上数字和字母组成
 */
public class Exception {

    public static boolean validateUserName(String username){
        boolean judge = false;
        if(username.length()>8){
            for(int i=0;i<username.length();++i){
                char ch = username.charAt(i);
                if((ch>'0' && ch<'9') || (ch>'a' && ch<'z') || (ch>'A' && ch<'Z')){
                    judge = true;
                }else{
                    judge = false;
                    throw new IllegalArgumentException("用户名只能由数字和字母组成");
                }
            }
        }else{
            throw new IllegalArgumentException("用户名必须大于8位");
        }
        return judge;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = input.next();
        try{
            boolean judge = validateUserName(username);
            if(judge){
                System.out.println("用户名正确!");
            }
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }

}
