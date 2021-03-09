package sample;

import java.util.List;

public interface GymManager {

    public void addMember(DefaultMember member);
    public boolean deleteMember(String membershipNumber);
    public void printListOfMember();
    public void sort();
    public void save();
    public List<DefaultMember> getMemberList();
    public DefaultMember getMemberbymembershipNumber(String membershipNumber);

    DefaultMember getMemberbyMembershipNo(String membershipNo);

    DefaultMember getMemberbymembershi(String membershipNumber);

    public DefaultMember[] getMemberbyName(String name);

    void gui();

    void ji();
}