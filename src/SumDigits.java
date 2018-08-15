import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số để tính tổng các chữ só: ");
        int number = sc.nextInt();
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Tổng các chữ số của số bạn vừa nhập là: " + sum);
    }
}
