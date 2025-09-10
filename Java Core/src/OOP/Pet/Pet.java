package pet;

public class Pet {
    // 🔒 Bước 1: Đóng gói các thuộc tính
    private String name;
    private int age;
    private String species;

    // ✅ Bước 2: Constructor
    public Pet(String name, int age, String species) {
        setName(name);       // dùng setter để áp validate
        setAge(age);
        setSpecies(species);
    }

    // ✅ Bước 3: Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "Không rõ";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;  // hoặc throw lỗi nếu bạn muốn
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if (species != null && !species.trim().isEmpty()) {
            this.species = species;
        } else {
            this.species = "Không rõ";
        }
    }

    // ✅ Bước 4: Phương thức hiển thị
    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Loài: " + species);
    }
}
