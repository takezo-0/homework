// Delta College - CST 283 - Klingler  
// This application manages a list of jobs of various categories.

public class MyJobs
{
    public static void main(String args[])
    {
        PaintJob livingRoomPainting = new PaintJob("Kitchen Painting",2,800);
        System.out.println(livingRoomPainting);
        PaintJob officePainting = new PaintJob("Office Painting",3,400);
        System.out.println(officePainting);

        System.out.println("Total Painting:  $" +
                (livingRoomPainting.calcCost() + officePainting.calcCost()) );
        System.out.println("Total Painting Time: " +
                ( livingRoomPainting.calcTime() + officePainting.calcTime() )+ " hours");

        System.out.println();

        /*
        PlumbingJob housePlumbing = new PlumbingJob("Housewide Plumbing",2,12);
        System.out.println(housePlumbing);
        System.out.println("Cost:  $" + housePlumbing.calcCost());
        System.out.println("Time: " + housePlumbing.calcTime() + " hours");
         */

        System.out.println();

        ElectricalJob houseWiring = new ElectricalJob("Housewide Wiring",1,28);
        System.out.println(houseWiring);
        System.out.println("Cost:  $" + houseWiring.calcCost());
        System.out.println("Time: " + houseWiring.calcTime() + " hours");




    }

}
