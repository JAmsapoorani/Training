package oopsconcepts;

public class MembershipTest {
    public static void main(String[] args)
    {
        GymMembershipPromotion g=new GymMembershipPromotion("neha",6,3000);
        System.out.println(g);
        System.out.println(g.getTotalCost());
        GymMembershipPromotion g1=new GymMembershipPromotion("iru",6,3000);
        System.out.println(g1);
        System.out.println(g1.getTotalCost());
    }
}
