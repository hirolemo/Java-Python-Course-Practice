//LL of countries to visit in Australia

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        System.out.println("hello");
        addInOrder(placesToVisit, "Sydney");
        //        placesToVisit.add("Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaiade");
        addInOrder(placesToVisit,"Darwin");

        printList(placesToVisit);
//        //add at index 1 AND SHIFTS everything offer by 1, inserted node AUTOMATICALY
//        //LINKS to next one!!
//        placesToVisit.add(1, "Alice Springs");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4); //remove at index 4
//        printList(placesToVisit);
   }

    private static void printList(LinkedList<String> linkedlist) {
        Iterator<String> i = linkedlist.iterator(); // equivalent to for loop

        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next()); //prints first and THEN
        }
        System.out.println("=========");
    }

    private static boolean addInOrder(LinkedList<String> llist, String newCity) {
        ListIterator<String> stringListIterator = llist.listIterator(); //DOES NOT POINT TO FIRST NODE!

        while(stringListIterator.hasNext()) { // MUST USE ".next()" to point to first entry!!!
            int comparison = stringListIterator.next().compareTo(newCity);
            //if equal, do not add to linked list...
            if(comparison == 0) {
                System.out.println(newCity + " is already included as a destination");
                return false;
            }

            else if(comparison > 0) {
                //new city should appear before this one
                stringListIterator.previous(); //cause we said 'next' above^^
                stringListIterator.add(newCity); //now add!
                //we use this iterator to GO BACK! Normal iterators don't allow that!
            }
            else if(comparison < 0) {
                // move on to next city, above next has done that for us
            }
        }
        stringListIterator.add(newCity); // goes at list end!
        return true;
    }

}
//.isEmpty(); // checks if linked list is empty
