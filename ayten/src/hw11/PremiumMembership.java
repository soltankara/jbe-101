package hw11;

public class PremiumMembership extends GymMembership {
    boolean avalibity;
    boolean spaAcces;
    public PremiumMembership(String memberName, String membershipType, int duration,boolean avalibity,boolean spaAcces) {
        super(memberName, membershipType, duration);
        this.avalibity=avalibity;
        this.spaAcces=spaAcces;

    }
//    @Override
//    public double calFee(){
//        return
//    }
//    @Override
//public double calFee(){
//        double perMoFee=super.calFee();
//        double addFee=0;
//    }
}
