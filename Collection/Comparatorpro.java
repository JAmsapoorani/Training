package Collection;

import java.util.Comparator;

public class Comparatorpro implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
      Character obj=(Character) o1;
      Character obj1=(Character) o2;
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
