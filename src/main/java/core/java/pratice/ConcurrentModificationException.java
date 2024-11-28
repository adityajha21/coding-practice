package core.java.pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("A", "B", "C"));
       /* for (String item : list) {
            list.remove(item); // Throws ConcurrentModificationException
        }*/
        // thorws concurrent modifcation exception
        /* list.stream().filter(item -> item != null)  // .filer(Object :: nonNull)
                .forEach( item -> {
                    if(item.equals("A")){
                        list.remove(item);
                    }
                });

                System.out.println(list);*/

                // Handle concurrent Modification exception
        list.removeIf(item -> item.equals("A"));
        System.out.println(list);
    }
}
