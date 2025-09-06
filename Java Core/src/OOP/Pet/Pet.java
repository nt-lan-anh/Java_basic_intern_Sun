package Pet;

public class Pet {
    // Thuộc tính (fields)
    String name;
    String age;
    String species;

    // Constructor
    public Pet(String name, String age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    //  Phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Loài: " + species);
    }
}
