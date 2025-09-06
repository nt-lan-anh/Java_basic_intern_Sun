package Pet;
import java.util.Scanner;

public class PetMain {
    public static void main(String[] args) {
        // Tạo các đối tượng thú cưng
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhâp tên thú cưng: ");
        String name  = scanner.nextLine();

        System.out.print("Nhâp tuổi thú cưng: ");
        String age  = scanner.nextLine();

        System.out.print("Nhâp loài : ");
        String species  = scanner.nextLine();

        // Hiển thị thông tin
        Pet pet1 = new Pet(name, age, species);
        System.out.println("\nThông tin thú cưng vừa nhập:");
        pet1.displayInfo();
    }
}
