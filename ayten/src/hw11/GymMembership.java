package hw11;

public class GymMembership {

    private String memberName;
    private String membershipType;
    private int duration;

    public GymMembership(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }
    public double calFee(){
        double perMoFee=15.0;
        return perMoFee*duration;
    }
    public String checkingSpecialOrNot(){
        if(membershipType.equals("annual"))return "5% decreasing";
        else return "no decreasing";

    }
    public void showAllInfo(){
        System.out.println(memberName);
        System.out.println(membershipType);
        System.out.println(duration);
        System.out.println("total fee:"+calFee());
        System.out.println(checkingSpecialOrNot());
    }


}
