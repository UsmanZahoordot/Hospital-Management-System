import java.util.Date;

public class Person {
    private String name;
    private String gender;
    private date dateOfBirth;
    private int id;
    public Person(int id,String name, String gender, date dateOfBirth) {
        this.name = name;
        this.id=id;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }
}
