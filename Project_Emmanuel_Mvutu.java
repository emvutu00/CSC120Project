import java.util.Scanner;

public class Project_Emmanuel_Mvutu
{
   public static void main(String[] args)
   {
      int GPUClockSpeed = 0;//to hold the place of GPU clock speed
      int CPUClockSpeed = 0;//to hold the place of CPU clock speed
      int numOfCores = 0;//to hold the place of the number of cores
      int resolution = 0;//to hold the place of resolution
      double multiplier = 0;//to hold the place of resolution multiplier
      double performanceScore = 0;//to hold the place of performance score
      String recommendedGraphicQuality;
      
      //represents the resolution options
      final int RESOLUTION_1 = 1;
      final int RESOLUTION_2 = 2;
      final int RESOLUTION_3 = 3;
      final int RESOLUTION_4 = 4;
      
      Scanner keyboard = new Scanner(System.in);//creating a Scanner object for  the user's input
      
      //ask the user for the clock speed of their GPU
      System.out.print("Enter the clock speed(in Megahertz) of their graphics card (GPU): ");
      GPUClockSpeed = keyboard.nextInt();
      
      //ask the user for the clock speed of the CPU
      System.out.print("Enter the clock speed(in Megahertz) of their processor (CPU): ");
      CPUClockSpeed = keyboard.nextInt();
      
      //ask the user for the number of cores in their processor
      System.out.print("Enter the number of cores that their processor(CPU) has: ");
      numOfCores = keyboard.nextInt();
      
      //Display the monitor resolution
      System.out.println("What is the resolution of your monitor?");
      System.out.println("1. 1280 x 720");
      System.out.println("2. 19280 x 1080");
      System.out.println("3. 2560 x 1440");
      System.out.println("4. 3840 x 2160");
      
      //ask the user to select their resolution
      System.out.print("\nPlease select your resolution from above: ");
      resolution = keyboard.nextInt();
      
      //using an if/else if statement to handle the user's resolution selection
      if(resolution == RESOLUTION_1)
         {
            multiplier = 1;
         }
      else if(resolution == RESOLUTION_2)
         {
            multiplier = .75;
         }
      else if(resolution == RESOLUTION_3)
         {
            multiplier = .55;
         }
      else
         {
            multiplier = .35;
         }
         
      //calculate the performance score from the given inputs from the user
      performanceScore = ((5 * GPUClockSpeed) + (numOfCores * CPUClockSpeed)) * multiplier;
      
      //
      if(performanceScore >= 17000)
         {
            recommendedGraphicQuality = "Ultra";
         }
      else if(performanceScore >= 15000 && performanceScore <= 17000)
         {
            recommendedGraphicQuality = "High";
         }
      else if(performanceScore >= 13000 && performanceScore <= 15000)
         {
            recommendedGraphicQuality = "Medium";
         }
      else if(performanceScore >= 11000 && performanceScore <= 13000)
         {
            recommendedGraphicQuality = "Low";
         }
      else
         {
            recommendedGraphicQuality = "Unable to play";
         }
      
   }
}