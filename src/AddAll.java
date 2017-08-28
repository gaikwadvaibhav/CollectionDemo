import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by melayer on 21/8/17.
 */
public class AddAll {
    public static void main(String[] args) {

        ArrayList<String> al1= new ArrayList<String>();
        al1.add("Rohan");
        al1.add("Hrishi");
        al1.add("Vaibhav");
        al1.add("Vaibhav");
        al1.add("Vaibhav");

        ArrayList<String> al2=new ArrayList<String>();
        al2.add("CodeKul");
        al2.add("Pune");

        al1.addAll(al2);
        // Adding Second list

//        al1.removeAll(al2);
        // Removing Second list

        al1.retainAll(al2);
        //iterating the elements




        Iterator itr = al1.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
