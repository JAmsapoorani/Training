package Collection;

public class Data<T> implements IData<T>{
   private String vales;

    public Data(String vales) {
        this.vales = vales;
    }

    public String getVales() {
        return vales;
    }

    public void setVales(String vales) {
        this.vales = vales;
    }

    @Override
    public String toString() {
        return "Data{" +
                "vales='" + vales + '\'' +
                '}';
    }
}
