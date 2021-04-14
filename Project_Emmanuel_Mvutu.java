import java.util.Scanner;

public class Project_Emmanuel_Mvutu
{
   public static void main(String[] args)
   {
      int numOfComputers = 0;//to hold the place of the number of computers
      int GPUClockSpeed = 0;//to hold the place of GPU clock speed
      int CPUClockSpeed = 0;//to hold the place of CPU clock speed
      int numOfCores = 0;//to hold the place of the number of cores
      int resolution = 0;//to hold the place of resolution
      double multiplier = 0;//to hold the place of resolution multiplier
      double performanceScore = 0;//to hold the place of performance score
      
      String recommendedGraphicQuality;//the results of the performance score
      String results = "Computer Hardware Graphics Quality Recommendation Tool";//title of the outputs
      String monitor;//resolution written out
      
      //represents the resolution options
      final int RESOLUTION_1 = 1;
      final int RESOLUTION_2 = 2;
      final int RESOLUTION_3 = 3;
      final int RESOLUTION_4 = 4;
      
      Scanner keyboard = new Scanner(System.in);//creating a Scanner object for  the user's input
      
      //ask the user for the number of computers that they wish to enter information for
      System.out.println("Enter the number of computers that they wish to enter information for.");
      numOfComputers = keyboard.nextInt();
      
      //validate the user's input
      while(numOfComputers < 1)
      {
         System.out.println("Number of computers should be at least one. please enter a valid number");//display invalid input message
         numOfComputers = keyboard.nextInt();//let user enter a valid number
      }
      
      //showing the title
      System.out.println("\n" + results + "\n");
      
      //use a for loop to get the user's information
      //computer is the loop control variable
      for(int computerNum = 0; computerNum < numOfComputers; computerNum++)
      {
         //ask the user for the clock speed of their GPU
         System.out.print("Enter the clock speed(in Megahertz) of their graphics card (GPU): ");
         GPUClockSpeed = keyboard.nextInt();
         
         //validate the clock speed of the GPU
         while(GPUClockSpeed < 800 || GPUClockSpeed > 2000)
         {
            //display invalid message if the input isnt valid
            System.out.println("Invalid input. GPU clock speed should range between 200 to 2000 MHz."
                              + " Enter a valid input");
            GPUClockSpeed = keyboard.nextInt();//let user enter a valid number
         }
      
         //ask the user for the clock speed of the CPU
         System.out.print("Enter the clock speed(in Megahertz) of their processor (CPU): ");
         CPUClockSpeed = keyboard.nextInt();
         
         //validate the clock speed for the CPU
         while(CPUClockSpeed < 1000 || CPUClockSpeed > 5500)
         {
            //display invalid message if the input isnt valid
            System.out.println("Invalid input. CPU clock speed should range between 1000 to 5500 MHz."
                              + " Enter a valid input");
            CPUClockSpeed = keyboard.nextInt();//let user enter a valid number
         }
      
         //ask the user for the number of cores in their processor
         System.out.print("Enter the number of cores that their processor(CPU) has: ");
         numOfCores = keyboard.nextInt();
         
         //validate the number of cores
         while(numOfCores < 1 || numOfCores > 16)
         {
            //display invalid message if the input isnt valid
            System.out.println("Invalid input. The number of cores should range between 1 to 16."
                              + " Enter a valid input");
            numOfCores = keyboard.nextInt();//let user enter a valid number
         }
      
         //Display the monitor resolution
         System.out.println("What is the resolution of your monitor?");
         System.out.println("1. 1280 x 720");
         System.out.println("2. 19280 x 1080");
         System.out.println("3. 2560 x 1440");
         System.out.println("4. 3840 x 2160");
      
         //ask the user to select their resolution
         System.out.print("\nPlease select your resolution from above: ");
         resolution = keyboard.nextInt();
         
         //validate the resolution choice
         while(resolution < 1 || resolution > 4)
         {
            //display invalid message if the input isnt valid
            System.out.println("Invalid input. The resolution choice should range between 1 to 4."
                              + " Enter a valid input");
            resolution = keyboard.nextInt();//let user enter a valid number
         }
      
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
         else if(resolution == RESOLUTION_4)
            {
               multiplier = .35;
            }
         else
            {
               System.out.println("invalid input, type the monitor resolution.");
            }
         
         //calculate the performance score from the given inputs from the user
         performanceScore = ((5 * GPUClockSpeed) + (numOfCores * CPUClockSpeed)) * multiplier;
      
         //using an if/else if statement to handle the user's recommended graphic quality
         if(performanceScore > 17000)
            {
               recommendedGraphicQuality = "Ultra";
            }
         else if(performanceScore > 15000 && performanceScore <= 17000)
            {
               recommendedGraphicQuality = "High";
            }
         else if(performanceScore > 13000 && performanceScore <= 15000)
            {
               recommendedGraphicQuality = "Medium";
            }
         else if(performanceScore > 11000 && performanceScore <= 13000)
            {
               recommendedGraphicQuality = "Low";
            }
         else
            {
               recommendedGraphicQuality = "Unable to play";
            }
         
            //this if/else if statement is for the output of the monitor resolution display
            if(resolution == RESOLUTION_1)
            {
               monitor = "1280 x 720";
            }
         else if(resolution == RESOLUTION_2)
            {
               monitor = "1920 x 1080";
            }
         else if(resolution == RESOLUTION_3)
            {
               monitor = "2560 x 1440";
            }
         else 
            {
               monitor = "3840 x 2160";
            }
    
         //Display the outputs of the whole code
         System.out.println("\nThe GPU clock speed: " + GPUClockSpeed + "MHz");
         System.out.println("The CPU clock speed: " + CPUClockSpeed + "MHz");
         System.out.println("The number of cores: " + numOfCores);
         System.out.println("The monitor of resolution: " + monitor);
         System.out.printf("The Performance Score: %,.3f",performanceScore);
         System.out.println("\nThe Recommended Graphic Quality: " + recommendedGraphicQuality);
         
         //make space for the next information and output for the next computer
         System.out.println();
      }
   }
}