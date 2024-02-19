import java.util.ArrayList;
import java.util.List;

public class Stream {

    List<String> list = new ArrayList();


    public void qqq (List<String> list) {

        Object[] objects  = list.stream()
                .filter(s -> s.equals("qwerrty"))
                .map(s -> s.getBytes())
                .toArray();

        for (String str: list ) {
          if(  !str.equals("qwerrty")) {
              list.remove(str);
        }

        list.stream().toArray();
    }
    }
}
