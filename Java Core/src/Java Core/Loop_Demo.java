import java.util.Scanner;

public class Loop_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  ---------- PHẦN 1: DÙNG FOR: TÍNH TỔNG SỐ TỪ 1 TỚI N ----------
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum +=i;
        }

        System.out.println("Tổng từ 1 đến " + n + " là: " + sum);

        // ---------- PHẦN 2: DÙNG WHILE: KIỂM TRA SỐ NGUYÊN TỐ ----------
        System.out.print("\nNhập số cần kiểm tra nguyên tố: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(num)){
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime) {
            System.out.println(num + " là số nguyên tố.");
        } else {
            System.out.println(num + " không là số nguyên tố.");
        }

        // ---------- PHẦN 3: DÙNG DO - WHILE: MENU LẶP CHO ĐẾN KHI THOÁT ----------
        int choice;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. In bảng cửu chương");
            System.out.println("2. Kiểm tra số chẵn/lẻ");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập số cần in bảng cửu chương");
                    int table = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(table + " x " + i + " = " + (table * i));
                    }
                    break;

                case 2:
                    System.out.println("Nhập số: ");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println("Đây là số chẵn. ");
                    } else {
                        System.out.println("Đây là số lẻ.");
                    }
                    break;

                case 0:
                     System.out.println("Thoát chương trình.");
                     break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
