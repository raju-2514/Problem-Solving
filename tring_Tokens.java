package HackerRank_CP;

import java.util.Scanner;
import java.util.StringTokenizer;

public class tring_Tokens {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        StringTokenizer st=new StringTokenizer(s,"!,?._'@");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
