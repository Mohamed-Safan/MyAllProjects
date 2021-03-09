package sample;

public class DefaultMember implements Comparable<DefaultMember> {

    private String membershipNumber;
    private String name;
    private String phoneNumber;
    private String startmemberShipDate;


    public DefaultMember(String s, String number, String membershipNumber, String name, String startmemberShipDate) {
        super();
        this.membershipNumber = membershipNumber;
        this.name = name;
        this.phoneNumber=phoneNumber;
        this.startmemberShipDate = startmemberShipDate;
    }

    public DefaultMember(String membershipNumber, String membershipNumber1, String name, String membershipStartDate) {

    }


    public String getmembershipNumber() {
        return membershipNumber;
    }


    public void setmembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getMembershipStartDate() {
        return startmemberShipDate;
    }



    public void setMembershipStartDate(String membershipStartDate) {
        this.startmemberShipDate = membershipStartDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(DefaultMember o) {
        return this.name.compareTo(o.getName());
    }


}

