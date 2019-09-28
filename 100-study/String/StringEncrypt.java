public class StringEncrypt {

    public static String Encrypt(String origin, char secret){
        return encrypt_and_decrypt(origin, secret);
    }

    public static String Decrypt(String origin, char secret){
        return encrypt_and_decrypt(origin, secret);
    }

    public static String encrypt_and_decrypt(String origin, char secret){
        byte[] bt = origin.getBytes();      //获取字节数组，对每个字节进行运算

        for(int i=0;i<bt.length;++i){
            bt[i] = (byte)(bt[i] ^ (int)secret);    //通过异或运算进行字符串加密
        }

        String cipher_text = new String(bt, 0, bt.length);
        return cipher_text;
    }

    public static void main(String[] args) {
        String origin_text = "hello world!";
        char secret = '7';

        String ciper_text = Encrypt(origin_text, secret);
        String plain_text = Decrypt(ciper_text, secret);

        System.out.println("Origin Test: " + origin_text);
        System.out.println("Ciper Text: " + ciper_text);        //_R[[X@XE[S
        System.out.println("Plain Text: " + plain_text);        //hello world!
    }
}
