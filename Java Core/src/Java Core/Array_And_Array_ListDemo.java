import java.util.ArrayList;
import java.util.Scanner;

public class Array_And_Array_ListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ===== 1. Dùng MẢNG =====

        System.out.print("Nhập số lượng phần tử (dùng mảng): ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Nhập mảng
        System.out.println("Nhập các số nguyên: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Tính tổng và tìm max
        int sum = 0;
        int max = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Tổng các phần tử trong mảng: " + sum);
        System.out.println("Số lớn nhất trong mảng: " + max);

        // ===== 2. Dùng ARRAYLIST =====
        System.out.print("\nNhập số lượng phần tử (dùng ArrayList: ");
        int m = scanner.nextInt();
        scanner.nextLine(); //clear buffer

        ArrayList<String> names = new ArrayList<>();

        // Nhập danh sách tên
        for (int i = 0; i < m; i ++) {
            System.out.print("Tên thứ " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

        // In danh sách
        System.out.println("\nDanh sách tên vừa nhập: ");
        for (String name : names) {
            System.out.println("- " + name);
        }

        // Xoá tên bất kỳ
        System.out.print("\nNhập tên muốn xoá: ");
        String nameToRemove = scanner.nextLine();
        if (names.remove(nameToRemove)) {
            System.out.println("Đã xoá tên: " + nameToRemove);
            System.out.println("Danh sách sau khi xoá: ");
            for (String name : names) {
                System.out.println("- " + name);
            }
        } else {
            System.out.println("Không tìm thấy tên: " + nameToRemove);
        }

        scanner.close();;
    }
}
