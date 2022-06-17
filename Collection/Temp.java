package Collection;

public class Temp {
    @Override
    public String toString() {
        return "Temp";
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Finalize methods");
    }
}
