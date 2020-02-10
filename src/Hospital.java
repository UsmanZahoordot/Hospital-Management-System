import java.text.SimpleDateFormat;
import java.util.*;

public class Hospital {
    private static int patientsId=0;
    public static int staffId=0;
    private static Hospital instance =new Hospital();
    private List<Person> allVisits;
    private List<Ward> allWards;
    private List<Staff> staffList;
    private Hospital()
    {
        staffList=new ArrayList<>();
        allVisits=new ArrayList<>();
        allWards=new ArrayList<>();
        wards();
    }
    void enterPerson(Person p )
    {
        allVisits.add(p);
    }
    public void addStaffMember(String ward, String memberType,String name , date dob, String gender,date joiningdate, String education)
    {
        if(ward.equals("Children")) {

            if(memberType.equals("doctor"))
                allWards.get(0).staff.add(new Doctor(++staffId,name, gender,dob,joiningdate,education));
            else if(memberType.equals("nurse"))
                allWards.get(0).staff.add(new Nurse(++staffId,name, gender,dob,joiningdate,education));
            else if (memberType.equals("technician"))
                allWards.get(0).staff.add(new Technician(++staffId,name, gender,dob,joiningdate,education));
        }
        else if(ward.equals("Orthopedic")) {

            if(memberType.equals("doctor"))
                allWards.get(1).staff.add(new Doctor(++staffId,name, gender,dob,joiningdate,education));
            else if(memberType.equals("nurse"))
                allWards.get(1).staff.add(new Nurse(++staffId,name, gender,dob,joiningdate,education));
            else if (memberType.equals("technician"))
                allWards.get(1).staff.add(new Technician(++staffId,name, gender,dob,joiningdate,education));
        }
        else if(ward.equals("Surgical")) {

            if(memberType.equals("doctor"))
                allWards.get(2).staff.add(new Doctor(++staffId,name, gender,dob,joiningdate,education));
            else if(memberType.equals("nurse"))
                allWards.get(2).staff.add(new Nurse(++staffId,name, gender,dob,joiningdate,education));
            else if (memberType.equals("technician"))
                allWards.get(2).staff.add(new Technician(++staffId,name, gender,dob,joiningdate,education));
        }
    }
    private void wards()
    {
        allWards.add(new ChildrenWard());
        allWards.add(new OrthopedicWard());
        allWards.add(new SurgicalWard());
    }
    public void makeAppointment()
    {
        date dob=new date();
        Scanner input =new Scanner(System.in);
        String name, gender, date ;
        System.out.println("Enter Patient Details Here \n \n Enter Name of the Patient");
        name =input.nextLine();

        System.out.println("Enter M for male or F for Female \n");
        gender=input.nextLine();
        gender= gender.equals("M") || gender.equals("m") ? "Male":"Female";
        dob.input();
            int id=MedicalStaff.checkValidity(name,dob);
            if(id==0)
            {
                Person p=new Patient(++patientsId, name,gender,dob);
                allVisits.add(p);
                MedicalStaff.dailyRecord.add(new Record(new date(Calendar.DAY_OF_WEEK_IN_MONTH,Calendar.MONTH,Calendar.getInstance().get(Calendar.YEAR)), p));
                System.out.println("Patient " +name+ " with Patient id "+ patientsId+ " is allowed to visited the doctor.");
            }
            else
                System.out.println("Patient " +name+ " with Patient id "+ id+ " has already visited the doctor today ");

    }
    public static Hospital getInstance()
    {
        if(instance!=null)
            return instance;
        else
            return new Hospital();
    }

}
