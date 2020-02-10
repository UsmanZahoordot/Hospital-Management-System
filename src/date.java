import java.util.Scanner;

public class date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public date()
    {

    }
    public void input()
    {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter you date of birth \n");
        System.out.println("Enter date  \n");
        this.day=input.nextInt();
        System.out.println("Enter Month  \n");
        this.month=input.nextInt();
        System.out.println("Enter Year  \n");
        this.year=input.nextInt();
    }
}
