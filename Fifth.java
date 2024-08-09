public class Fifth {
    public static void main(String[] args) {
        char[] ch = {'Z', 'X', 'C'};
        char tmp;
        for (int i = 0; i < 5; i++) {
            tmp = ch[0];      // tmp = 'Z'
            ch[0] = ch[2];    // ch[0] = 'C'
            ch[1] = tmp;      // ch[1] = 'Z'
            ch[2] = ch[1];    // ch[2] = 'Z' (this line causes issues)
        }
        System.out.print(ch);
    }
}
