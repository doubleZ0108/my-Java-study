/**
 * 需要输入用户名和密码
 * 其中用户名只能由 6~10 位数字组成
 * 密码只能有 6 位
 * 任何不符合用户名或者密码要求的情况都视为异常
 * 并且需要捕获并处理该异常。
 */

class LoginException extends Exception{
    public LoginException(){
        super();
    }
    public LoginException(String str){
        super(str);
    }
}

public class LoginSystem {
    public static boolean validateUsername(String username) throws LoginException {
        boolean judge_username = false;
        if(username.length()>=6 && username.length()<=10){
            for(int i=0;i<username.length();++i){
                char ch = username.charAt(i);
                if(ch>='0' && ch<='9'){
                    judge_username = true;
                }else{
                    judge_username = false;
                    throw new LoginException("用户名必须由数字组成");
                }
            }
        }else{
            throw new LoginException("用户名必须是6～10位");
        }
        return judge_username;
    }

    public static boolean validatePassword(String password) throws LoginException {
        boolean judge_password = false;
        if(password.length()==6){
            judge_password = true;
        }else{
            throw new LoginException("密码必须为6位");
        }
        return judge_password;
    }

    public static boolean validateLogin(String username, String password){
        boolean judge_validate = false;
        try{
            boolean judge_username = validateUsername(username);
            boolean judge_password = validatePassword(password);
            if(judge_username && judge_password){
                judge_validate = true;
            }
        }catch (LoginException e){
            System.out.println(e.getMessage());
        }
        return judge_validate;
    }

    public static void main(String[] args) {
        String username = "1112345";
        String password = "123abc";
        if(validateLogin(username, password)){
            System.out.println("用户名、密码均有效");
        }
    }
}
