package sample;

public class StudentMember extends DefaultMember {

    private String SCLNME;

    public StudentMember(String membershipNumber, String name, String startmemberShipDate, String phoneNumber, String schoolName) {
        super(membershipNumber, membershipNumber, name, startmemberShipDate,phoneNumber);
        this.SCLNME = schoolName;
    }

    public String getSchoolName() {
        return SCLNME;
    }
    public void setSchoolName(String schoolName) {
        this.SCLNME = schoolName;
    }



}