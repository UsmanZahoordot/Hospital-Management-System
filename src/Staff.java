import java.util.Date;

public abstract class Staff extends Person {

    date joiningDate;
    String education;

    public Staff(int id, String name, String gender, date dateOfBirth, date joiningDate, String education) {
        super(id, name, gender, dateOfBirth);
        this.joiningDate = joiningDate;
        this.education = education;
    }
}
