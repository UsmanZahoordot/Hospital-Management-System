import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Hospital hospital=Hospital.getInstance();
        hospital.addStaffMember("Children","doctor","Johny",new date(9,12,1201),"Male",new date(9,12,1201),"PHD");
        hospital.addStaffMember("Children","doctor","Bravo",new date(8,12,2101),"Male",new date(9,12,1201),"PHD");
        System.out.println("-------------Faisal Hospital--------------\n");
        Scanner scanner=new Scanner(System.in);
        Person person= new Doctor(++Hospital.staffId,"Qwerty", "male",new date(8,12,2101),new date(8,12,2101),"MS");
        hospital.enterPerson(person);
        while (true)
        {
            System.out.println("1- Make Appointment ");
            System.out.println("2- Exit ");
            int input = scanner.nextInt();
            if (input == 1)
                hospital.makeAppointment();
            else
                break;
        }
    }

}
