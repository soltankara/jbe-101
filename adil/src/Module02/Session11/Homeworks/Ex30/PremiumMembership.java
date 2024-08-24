package Module02.Session11.Homeworks.Ex30;

public class PremiumMembership extends GymMembership{
    private boolean trainer;
    private boolean spaAccess;

    public PremiumMembership(String name, String membershipType, int duration, boolean trainer, boolean spaAccess) {
        super(name, membershipType, duration);
        this.trainer = trainer;
        this.spaAccess = spaAccess;
    }

    @Override
    public double membershipFees() {
        double additionalFee = 0;
        if(trainer) additionalFee += 50 * getDuration();
        if(spaAccess) additionalFee += 10 * getDuration();
        return additionalFee + super.membershipFees();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Personal Trainer Available: " + (trainer ? "Yes" : "No"));
        System.out.println("Spa Access: " + (spaAccess ? "Yes" : "No"));
    }

    public boolean isTrainer() {
        return trainer;
    }

    public void setTrainer(boolean trainer) {
        this.trainer = trainer;
    }

    public boolean isSpaAccess() {
        return spaAccess;
    }

    public void setSpaAccess(boolean spaAccess) {
        this.spaAccess = spaAccess;
    }
}
