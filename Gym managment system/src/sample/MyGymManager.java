package sample;

import java.io.*;
import java.util.*;

public class MyGymManager implements GymManager {

    private List<DefaultMember> list = new ArrayList<DefaultMember>();

    @Override
    public void addMember(DefaultMember member) {
        System.out.println("Number of occupied slots : "+list.size());
        System.out.println("Number of free slots : "+(100 - list.size()));

        if (list.size() < 100) {
            list.add(member);
        } else {
            System.out.println("Free slots are availabe");
        }

    }

    public boolean deleteMember(String membershipNumber) {
        boolean nmr = false;
        for (DefaultMember member: list) {
            if (member.getmembershipNumber().equals(membershipNumber)) {
                nmr = true;
                list.remove(member);
                System.out.println("Membership Number "+membershipNumber+" Successfully removed");
                System.out.println("No of occupied slots : "+list.size());
                System.out.println("No of free slots : "+(100 - list.size()));
                if (member instanceof StudentMember) {
                    System.out.println("Type of the member : Student Member");
                } else if (member instanceof Over60Member) {
                    System.out.println("Type of the member : Over60Member");
                } else {
                    System.out.println("Type of the member :s : DefaultMember");
                }
                break;
            }

        }
        if(!nmr) {
            System.out.println("---NOT FOUND.. PLEASE TRY AGAIN!---");
        }

        return nmr;

    }

    @Override
    public void printListOfMember() {
        for(DefaultMember member: list) {
            System.out.print("Membership Number : "+member.getmembershipNumber()+" ");
            if (member instanceof StudentMember) {
                System.out.print("Membership type is : StudentMember ");
            } else if (member instanceof Over60Member) {
                System.out.print("Membership type is : Over60Member ");
            } else {
                System.out.print("Membership type is : DefaultMember ");
            }
            System.out.print("Name is : "+member.getName()+" ");
            System.out.println("Membership start date is : "+member.getMembershipStartDate());
        }

        if (list.size() == 0) {
            System.out.println("Empty list");
        }

    }
    @Override
    public void sort() {
    }

    @Override
    public void save() {
        DefaultMember[] saf= list.toArray(new DefaultMember[]{});
        File file = new File("Informations.txt");
        Writer fileOut;
        try (FileWriter sd = new FileWriter(file)) {
            fileOut = new PrintWriter(sd);

            int l = list.size();
            for (int i = 0; i < l; i++) {
                fileOut.write("Membership Number is : " + list.get(i).getmembershipNumber() + "\n   Name : " + list.get(i).getName());
                System.out.println("");
                System.out.println("-----------Saved---------");
                System.out.println("");
                fileOut.flush();


            }

        } catch (IOException e) {
            System.out.println("Sorry! No data to save");
        }
    }

    @Override
    public List<DefaultMember> getMemberList() {
        return this.list;
    }

    @Override
    public DefaultMember getMemberbymembershipNumber(String membershipNumber) {
        return null;
    }

    @Override
    public DefaultMember getMemberbyMembershipNo(String membershipNo) {
        return null;
    }

    @Override
    public DefaultMember getMemberbymembershi(String membershipNumber) {

        return null;
    }

    @Override
    public DefaultMember[] getMemberbyName(String name) {

        return null;
    }

    @Override
    public void gui() {

    }


    @Override
    public void ji() {

        UIs ji = new UIs();
        //ji.setVisible();

    }
}