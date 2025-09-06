import java.util.Scanner;

public class Condition_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ---------- PHẦN 1: DÙNG IF - ELSE ĐỂ PHÂN LOẠI BMI ----------
        System.out.print("Nhập cân nặng (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Nhập chiều cao (m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Chỉ số BMI của bạn là: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Bạn bị thiếu cân.");
        } else if (bmi < 25) {
            System.out.println("Bạn có cân nặng bình thường.");
        } else if (bmi < 30) {
            System.out.println("Bạn đang thừa cân.");
        } else {
            System.out.println("Bạn béo phì.");
        }

        // ---------- PHẦN 2: DÙNG SWITCH ĐỂ HIỂN THỊ THỨ TRONG TUẦN ----------
        scanner.nextLine();

        System.out.print("\nNhập số từ 1 tới 7 để chọn thứ (1 = Chủ Nhật, 2 = Thứ Hai, ...): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Hôm nay là Chủ Nhật.");
                break;
            case 2:
                System.out.println("Hôm nay là Thứ Hai.");
                break;
            case 3:
                System.out.println("Hôm nay là Thứ Ba.");
                break;
            case 4:
                System.out.println("Hôm nay là Thứ Tư.");
                break;
            case 5:
                System.out.println("Hôm nay là Thứ Năm.");
                break;
            case 6:
                System.out.println("Hôm nay là Thứ Sáu.");
                break;
            case 7:
                System.out.println("Hôm nay là Thứ Bảy.");
                break;
            default:
                System.out.println("Số không hợp lệ. Phải từ 1 đến 7.");
        }
        scanner.close();
    }
}
