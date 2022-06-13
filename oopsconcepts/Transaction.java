package oopsconcepts;

import java.util.Objects;

public class Transaction {
    private int id;
    private String desc;
    public Transaction(int id)
    {
        this.id=id;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                '}';
    }

    public int getId()
    {
        return id;
    }
    public String getDesc()
    {
        return desc;
    }
    public void setDet(String desc)
    {
        this.desc=desc;
    }

    @Override
    public boolean equals(Object o) {
      if(o instanceof Transaction)
      {
          Transaction t=(Transaction) o;
          if(this.id==t.id)
          {
              return true;
          }
      }
      return false;
    }


}
