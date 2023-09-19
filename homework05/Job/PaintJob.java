// This class manages the time and cost requirements for painting
// interior walls.

public class PaintJob extends Job
{
   private double area;

   private final double COST_PER_SQ_FT = 0.85;   // Dollars
   private final double TIME_PER_SQ_FT = 0.012;  // Hours per square foot

   public PaintJob()
   {
      super();
      area = 0;
   } 
   
   public PaintJob(String d, int p, double a)
   {
      super(d, p);   // Pass description and priority to superclass
      area = a;
   } 

   public void setArea(double a)
   {
      area = a;
   }
   public double getArea() {  return area;  }

   public double calcCost()
   {
      return area * COST_PER_SQ_FT;
   }

   public double calcTime()
   {
      return area * TIME_PER_SQ_FT;
   }

   public String toString()
   {
      return  super.toString() + " - " + "Paint area: " + area;
   }
} 

