package Module02.Session11.Homeworks.Ex30;

public class GymMembership {
    //30. Write a Java program to create a class called "GymMembership" with attributes for member name,
    // membership type, and duration. Create a subclass "PremiumMembership" that adds attributes for personal
    // trainer availability and spa access. Implement methods to calculate membership fees and check for special
    // offers based on membership type.
    private String name;
    private String membershipType;
    private int duration;

    public GymMembership(String name, String membershipType, int duration) {
        this.name = name;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    public double membershipFees() {
        int price = 100;
        return price * duration;
    }

    public void displayDetails() {
        System.out.println("Member Name: " + name);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Membership Fees: $" + membershipFees());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
