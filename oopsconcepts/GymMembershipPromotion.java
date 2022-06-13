package oopsconcepts;

public class GymMembershipPromotion extends GymMembership{
    public GymMembershipPromotion(String name, double duration, double monthlyFee) {
        super(name,duration,monthlyFee);
    }
    @Override
    public double getTotalCost() {
        double cost = super.getTotalCost();
        return cost - (cost * getPromoDiscount());
    }
    private double getPromoDiscount() {
        double discount = 0.0;
        String name = super.getMemberName();
        if (name != null && name.trim().length() > 0) {
            name = name.toUpperCase();
            char ch = name.charAt(0);
            switch (ch) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    discount = 0.5;
                    break;
                default:
                    discount = 0.2;
            }
        }
        return discount;

        }

    @Override
    public String toString() {
        return super.toString()+","+this.getPromoDiscount()+".";
    }
}
