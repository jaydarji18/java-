
class Personingettersetter {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name.");
        }
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }
}

public class gettersetter {
    public static void main(String[] args) {
        Personingettersetter person = new Personingettersetter();

        person.setName("Jay Darji");
        person.setAge(20);

        System.out.println("Person's Name: " + person.getName());
        System.out.println("Person's Age: " + person.getAge());

        person.setName("");
        person.setAge(-5);
    }
}
