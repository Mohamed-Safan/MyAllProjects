package sample;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        super();
        if (day < 31 && month<12 && year<3000) {
            this.day = day;
            this.month = month;
            this.year = year;

        } else {
            System.out.println("Invalid Date");
        }



        }
    }
