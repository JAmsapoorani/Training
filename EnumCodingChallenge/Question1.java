package EnumCodingChallenge;

public class Question1 {
    enum JobStatus
    {
        SUCCESS(1),FAILURE(2),WAITING(3);
        private int code;
        JobStatus(int code) {
            this.code=code;
        }
    }
    public static void main(String[] args)
    {

        for(JobStatus js:JobStatus.values())
        {
            System.out.println(js+"["+js.code+"]");
        }
    }
}
