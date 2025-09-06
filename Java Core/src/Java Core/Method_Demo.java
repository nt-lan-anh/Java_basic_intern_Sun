import java.util.Scanner;

public class Method_Demo {

    // 1. Hàm chào người dùng
    public static void greet(String name) {
        System.out.println("Xin chào, " + name + "!");
    }

    // 2. Hàm tính tổng từ 1 đến n
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum +=i;
        }
        return sum;
    }
    // 3. Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++ )
        {
            if (num % i == 0) return false;
        }
        return true;
    }
    // 4. Hàm in bảng cửu chương
    public static void printMultiplicaitonTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên và chàp
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        greet(name);

        // Tính tổng từ 1 tới n
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        int total = sumToN(n);
        System.out.println("Tổng từ 1 tới " + n + " là: " + total);

        // Kiểm tra số nguyên tố
        System.out.print("Nhập số cần kiểm tra: ");
        int num = scanner.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " là số nguyên tố ");
        }
        else {
            System.out.println(num + " không là số nguyên tố ");
        }
        // In bảng cửu chương
        System.out.print("Nhập số cần in bảng cửu chương: ");
        int table = scanner.nextInt();
        printMultiplicaitonTable(table);
    }
}