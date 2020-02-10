import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MedicalStaff extends Staff{
    public static List<Record> dailyRecord=new ArrayList<>();

    public MedicalStaff(int id, String name, String gender, date dateOfBirth,date joiningDate, String Education) {
        super(id, name, gender, dateOfBirth, joiningDate, Education);
    }

    public static int checkValidity( String name, date dob)
    {
        for(Record i: dailyRecord)
        {
            if(i.visitingDate.getDay()== Calendar.DAY_OF_WEEK_IN_MONTH
                    && i.visitingDate.getMonth()==Calendar.MONTH
                    &&i.visitingDate.getYear()==Calendar.getInstance().get(Calendar.YEAR)
                    && name.equals(i.person.getName()) && dob.getYear()==i.person.getDateOfBirth().getYear()
                    && dob.getMonth()==i.person.getDateOfBirth().getMonth()
                    && dob.getDay()==i.person.getDateOfBirth().getDay())
            {
                return i.person.getId();
            }
        }
        return 0;
    }
}
