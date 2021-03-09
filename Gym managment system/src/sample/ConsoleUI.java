package sample;

import javafx.application.Application;

import java.util.Scanner;

import static javafx.scene.input.KeyCode.Z;

public class ConsoleUI {
    private final static MyGymManager owner = new MyGymManager();
    private static int count = 0;
    private static String startmemberShipDate;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (count < 100) {
            System.out.println("<-----------GYM MANAGMENT SYSTEM-------------->");
            System.out.println(" ");
            System.out.println("PLEASE CHOOSE ANY OPTION (1-8):");
            System.out.println(" ");
            System.out.println("Add----------------------> 1");
            System.out.println("Remove (Delete)----------> 2");
            System.out.println("Print -------------------> 3");
            System.out.println("Save---------------------> 4");
            System.out.println("Sort---------------------> 5");
            System.out.println("GUI----------------------> 6");
            System.out.println("Quit---------------------> 7");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    insertMember();
                    break;
                case 2:
                    deleteMember();
                    break;
                case 3:
                    owner.printListOfMember();
                    break;

                case 4:
                   owner.save();
                   break;

                case 5:
                    owner.sort();
                    break;

                case 6:
                    Application.launch(UIs.class,args);
                    break;



                case 7:
                    System.out.println("Quit..");
                    break;




                default:
                    System.out.println("Invalid Input");

            }

            if (choice == 8) {
                input.close();
                System.exit(0);
            }
        }
    }
    private static void saveMember() {


    }

    private static void deleteMember() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the membership No : ");
        String membershipNumber = input.next();
        boolean result = owner.deleteMember(membershipNumber);
        if (result) {
            count--;
            System.out.println("Member Successfully Deleted");
        }
    }
    private static void insertMember() {
        Scanner input = new Scanner(System.in);
        if (count < 100) {
            System.out.println("Enter the membership Number : ");

            String membershipNumber = input.next();
            System.out.println("Please enter the name : ");
            String name = input.next();
            while(!name.matches("[a-zA-Z]+")){
                System.out.println("don't use integer values or Symbols! Please enter the name again...");

                System.out.println("Please enter the name : ");
                name = input.next();

            break;
            }



            System.out.println("Please Enter the day ");
            int day = Integer.parseInt(input.next());
            while (!(day>0 && day<32)){
                System.out.println("Please enter a valid Day");
                System.out.println("Please Enter the day ");
                day = Integer.parseInt(input.next());
            }



            System.out.println("Please Enter the Month ");
            int month = Integer.parseInt(input.next());
            while (!(month>0 && month<13)){
                System.out.println("Please enter a valid Month");
                System.out.println("Please Enter the Month ");
                month = Integer.parseInt(input.next());
            }


            System.out.println("Please Enter the Year ");
            int year = Integer.parseInt(input.next());
            while (!(year>1900 && year<2022)){
                System.out.println("Please enter a valid Year");
                System.out.println("Please Enter the Year ");
                year = Integer.parseInt(input.next());
            }



            System.out.println("Please Choose any Option");
            System.out.println("");
            System.out.println("Default Member--------->D");
            System.out.println("Student Member--------->S");
            System.out.println("Over60 Member---------->O");

            String type = input.next();


            DefaultMember member = null;

            switch(type) {
                case "D":
                case "d":
                    member = new DefaultMember(membershipNumber, membershipNumber, membershipNumber, name, startmemberShipDate);
                    break;
                case "S":
                case "s":
                    System.out.println("Please enter the School Name:");
                    String schoolName = input.next();
                    member = new StudentMember(membershipNumber, name, startmemberShipDate, schoolName, schoolName);
                    break;
                case "O":
                case "o":


                    String age;
                    input = new Scanner(System.in);
                    System.out.println("Please enter the age:");
                    age = input.nextLine();
                    while (!age.matches("[0-9]+")) {
                        System.out.println("Invalid age");
                    }

                    System.out.println("Please enter the age : ");

                    member = new Over60Member(membershipNumber, name, startmemberShipDate, age);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            owner.addMember(member);
            count++;
            System.out.println("");
        } else {
            System.out.println("No slots are available...");
        }
    }
}