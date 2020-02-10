import java.util.Date;

public class Doctor extends MedicalStaff {
    Ward speciality;
    int docID;
    public Doctor(int id, String name, String gender, date dateOfBirth,date joiningDate, String education) {
        super(id, name, gender, dateOfBirth,joiningDate,education);
    }
    void assignWard(Ward speciality)
    {
        this.speciality=speciality;
    }
}
