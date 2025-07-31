import java.util.Scanner;

public class Variable_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Nhập thông tin cá nhân
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();

        System.out.print("Nhập chiều cao (m): ");
        double height = scanner.nextDouble();

        System.out.print("Nhập cân nặng (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Bạn có phải sinh viên không?: ");
        boolean isStudent = scanner.nextBoolean();

        // 2. Hiển thị lại thông tin đã nhập
        System.out.println("\n=== THÔNG TIN CÁ NHÂN ===");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height + "m");
        System.out.println("Cân nặng: " + weight + "kg" );
        System.out.println("Sinh viên: " + isStudent);

        // 3. Tính BMI
        double bmi = weight / (height * height);
        System.out.printf("Chỉ số BMI của bạn là: %.2f\n", bmi);

        // 4. Toán tử logic: kiểm tra BMI
        boolean isHealthy = (bmi >= 18.5) && (bmi <= 24.9);
        System.out.println("Bạn có đang ở mức cân nặng hợp lý hay không? " + isHealthy);

        scanner.close();
    }
}

