package sample;

public class Over60Member extends DefaultMember {

    private int Age;

    public Over60Member(String membershipNumber, String name, String membershipStartDate, String age) {
        super(membershipNumber, membershipNumber, name, membershipStartDate);
        setAge(Age);
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if (age >= 60) {
            this.Age = age;
        } else {
            System.out.println("Invalid age...");
            System.out.println("");
        }
    }
}