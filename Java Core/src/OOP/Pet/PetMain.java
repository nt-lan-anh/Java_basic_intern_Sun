package Pet;

import java.util.Scanner;

public class PetMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin thú cưng từ bàn phím
        System.out.print("Nhập tên thú cưng: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi thú cưng: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.print("Nhập loài thú cưng: ");
        String species = scanner.nextLine();

        // Tạo đối tượng Pet với constructor
        pet.Pet myPet = new pet.Pet(name, age, species);

        // In thông tin thú cưng
        System.out.println("\nThông tin thú cưng vừa tạo:");
        myPet.displayInfo();

        // Thử cập nhật thông tin bằng setter
        System.out.println("\nCập nhật tuổi mới cho thú cưng:");
        System.out.print("Nhập tuổi mới: ");
        int newAge = scanner.nextInt();
        myPet.setAge(newAge);

        // In lại thông tin sau cập nhật
        System.out.println("\nThông tin sau khi cập nhật:");
        myPet.displayInfo();

        scanner.close();
    }
}
