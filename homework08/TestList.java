// Delta College - CST 283 - Klingler                  
// This application demonstrates basic linked list operations
// Version 2

public class TestList
{     
    public static void main(String [] args)
    {
        LinkedList<String> theList = new LinkedList<String>();

        theList.add("Harry");
        theList.add("Hermione");
        theList.add("Ron");
        theList.add("Voldemort");
        
        System.out.println("The members of the list are:");
        System.out.print(theList + "\n");
        
        String removed;
        
        removed = "Voldemort";
        if (theList.remove(removed))
            System.out.println(removed + " removed");
        else
            System.out.println(removed + " not removed; not in list");
        
        removed = "Dude";
        if (theList.remove(removed))
            System.out.println(removed + " removed");
        else
            System.out.println(removed + " not removed; not in list");
       
        System.out.println("\nThe members of the list are:");
        System.out.print(theList + "\n");
        
        theList.append("Dumbledore");
        theList.add("Snape");
        System.out.println("The members of the list are:");
        System.out.print(theList + "\n");
        
        System.out.println("The members of the list are:");
        System.out.print(theList + "\n");    
        
        String target = "Harry";
        if (theList.contains(target))
            System.out.println(target + " is in the list");
        else
            System.out.println(target + " is NOT in the list");        
        
        target = "Hermione";
        if (theList.contains(target))
            System.out.println(target + " is in the list");
        else
            System.out.println(target + " is NOT in the list");

        theList.add("Harry");

    }  
}
