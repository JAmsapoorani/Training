package oopsconcepts;

public class GymMembership {
    private String MemberName;
    private double duration;
    private double monthlyfee;

    public GymMembership(String memberName, double duration, double monthlyfee) {
        MemberName = memberName;
        this.duration = duration;
        this.monthlyfee = monthlyfee;
    }
    public String getMemberName()
    {
        return MemberName;
    }
    public double getTotalCost()
    {
        return duration*monthlyfee;
    }

    @Override
    public String toString() {
        return "GymMembership{" +
                "MemberName='" + MemberName + '\'' +
                ", duration=" + duration +
                ", monthlyfee=" + monthlyfee +
                '}';
    }
}
