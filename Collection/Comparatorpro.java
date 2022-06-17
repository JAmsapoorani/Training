package Collection;

import java.util.Comparator;

public class Comparatorpro implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
      Integer obj=(Integer) o1;
      Integer obj1=(Integer) o2;
      if(obj>obj1)
      {
          return -1;
      }
      if(obj<obj1)
      {
          return 1;
      }
      else {
          return 0;
      }
    }


}
