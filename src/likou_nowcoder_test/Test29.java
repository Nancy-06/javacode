package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/11
 */

//计算糖果
public class Test29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();
            int n4 = scanner.nextInt();
            int a = (n1 + n3) / 2;
            int b = a - n1;
            int c = b - n2;
            if (b + c == n4) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println("No");
            }
        }
        scanner.close();
    }
}

