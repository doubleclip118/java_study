package scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요:");
        String a=scanner.nextLine();
        System.out.print("당신의 나이을 입력하세요:");
        int b= scanner.nextInt();

        System.out.println("당신의 이름은:"+a+"당신의 나이는:"+b);
    }
}
