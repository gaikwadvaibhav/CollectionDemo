import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by melayer on 21/8/17.
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        list.add("Vaibhav");
        list.add("Codekul");
        list.add("Vaibhav1");
        list.add("Gaikwad");
        list.add("Vaibhav2");
        list.add("Gaikwad3");

        for (String obj:list)
            System.out.println(obj);

//        Iterator itr=list.iterator();

//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
    }
}
