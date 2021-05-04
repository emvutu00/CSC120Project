import java.util.Scanner;

public class Project_Emmanuel_Mvutu
{
   public static void main(String[] args)
   {
      int numOfComputers = 0;//to hold the place of the number of computers
      int GPUClockSpeed = 0;//to hold the place of GPU clock speed
      int CPUClockSpeed = 0;//to hold the place of CPU clock speed
      int numOfCores = 0;//to hold the place of the number of cores
      double resolution = 0;//to hold the place of resolution
      double multiplier = 0;//to hold the place of resolution multiplier
      double performanceScore = 0;//to hold the place of performance score
      boolean firstComputer = true;//this variable is keep track of whether or not this is the first computer
      boolean anotherFirstComputer = true;//this variable is keep track of whether or not this is the first computer
      double highestPerformanceScore = 0;//this variable is to keep track of the highest performance score
      double lowestPerformanceScore = 0;//this variable is to keep track of the lowest performance score
      
      String recommendedGraphicQuality;//the results of the performance score
      String monitor;//resolution written out
      
      //represents the resolution options
      final int RESOLUTION_1 = 1;
      final int RESOLUTION_2 = 2;
      final int RESOLUTION_3 = 3;
      final int RESOLUTION_4 = 4;
      
      Scanner keyboard = new Scanner(System.in);//creating a Scanner object for  the user's input
      
      //ask the user for the number of computers that they wish to enter information for
      System.out.print("Enter the number of computers that they wish to enter information for: ");
      numOfComputers = keyboard.nextInt();
      
      //validate the user's input with a while loop
      while(numOfComputers < 1)
      {
         System.out.println("Number of computers should be at least one. please enter a valid number");//display invalid input message
         numOfComputers = keyboard.nextInt();//let user enter a valid number
      }
      
      //calling the title method for displaying the title
      displayTitle();
      
      //use a for loop to get the user's information
      //computer is the loop control variable
      for(int computerNum = 0; computerNum < numOfComputers; computerNum++)
      {
         //ask the user for the clock speed of their GPU
         System.out.print("Enter the clock speed(in Megahertz) of their graphics card (GPU): ");
         GPUClockSpeed = keyboard.nextInt();
         
         //validate the clock speed of the GPU with a while loop
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
         
         //validate the clock speed for the CPU with a while loop
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
         
         //validate the number of cores with a while loop
         while(numOfCores < 1 || numOfCores > 16)
         {
            //display invalid message if the input isnt valid
            System.out.println("Invalid input. The number of cores should range between 1 to 16."
                              + " Enter a valid input: ");
            numOfCores = keyboard.nextInt();//let user enter a valid number
         }
      
         //calling the resolution method to get the user's choice of resollution
         getResolutionString();
         
         //validate the resolution choice with a while loop
         while(resolution < 1 || resolution > 4)
         {
            //display invalid message if the input isnt valid
            System.out.println("Invalid input. The resolution choice should range between 1 to 4."
                              + " Enter a valid input: ");
            resolution = keyboard.nextDouble();//let user enter a valid number
         }
      
         //calling the multiplier method returns the value of the multiplier to the main method
         multiplier = getMultiplierValue(resolution);
                  
         //calling the performance score method to calculate the performance score from the given inputs from the user
         performanceScore = calculatePerformanceScore(GPUClockSpeed, numOfCores, CPUClockSpeed, multiplier);
      
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
            
         //if this is the first computer then it automatically have the highest preformance because it's the only computer so far
         if(firstComputer)
         {
            highestPerformanceScore = performanceScore;
            firstComputer = false;//now we made the first computer to false in order to check on the other computers
         }
         else
         {
            //this is to check if the current computer has the highest performance score
            if(performanceScore > highestPerformanceScore)
            {
               //if true then the highest performance score has been updated
               highestPerformanceScore = performanceScore;
            }
         }
         
         //if this is the first computer then it automatically have the lowest preformance because it's the only computer so far
         if(anotherFirstComputer)
         {
            lowestPerformanceScore = performanceScore;
            anotherFirstComputer = false;//now we made the first computer to false in order to check on the other computers
         }
         else
         {
            //this is to check if the current computer has the lowest performance score
            if(performanceScore < lowestPerformanceScore)
            {
               //if true then the lowest performance score has been updated
               lowestPerformanceScore = performanceScore;
            }
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
      }//end of the for loop
      
      //display the highest performance score
      System.out.printf("The highest performance score was: %,.3f", highestPerformanceScore);
      
      //display the lowest performance score
      System.out.printf("\nThe lowest performance score was: %,.3f", lowestPerformanceScore);
      
   }//end of main 
     
   //this method displays the title
   public static void displayTitle()
   {
      String title = "Computer Hardware Graphics Quality Recommendation Tool";//title of the outputs
      
      System.out.println("\n" + title + "\n");//diplaying the title
   }//end of displayTitle method
   
  //this method asks for the resolution
   public static void getResolutionString()
   {
      int resolution = 0;//to hold the place of resolution
      
      Scanner keyboard = new Scanner(System.in);//creating a Scanner object for  the user's input
      
      //Display the monitor resolution
      System.out.println("What is the resolution of your monitor?");
      System.out.println("1. 1280 x 720");
      System.out.println("2. 19280 x 1080");
      System.out.println("3. 2560 x 1440");
      System.out.println("4. 3840 x 2160");
      
      //ask the user to select their resolution
      System.out.print("\nPlease select your resolution from above: ");
      resolution = keyboard.nextInt();
   }//end of getResolutionString method
   
   //this method returns the multiplier value
   public static double getMultiplierValue(double monResolution)
   { 
     double resMultiplier = 0;// to hold the place of the multiplier
      
      //represents the resolution options
      final double RESOLUTION_1 = 1;
      final double RESOLUTION_2 = 2;
      final double RESOLUTION_3 = 3;
      final double RESOLUTION_4 = 4;
     
      //using an if/else if statement to handle the user's resolution selection
         if(monResolution == RESOLUTION_1)
            {
               resMultiplier = 1;
            }
         else if(monResolution == RESOLUTION_2)
            {
               resMultiplier = .75;
            }
         else if(monResolution == RESOLUTION_3)
            {
               resMultiplier = .55;
            }
         else if(monResolution == RESOLUTION_4)
            {
               resMultiplier = .35;
            }
         else
            {
               System.out.println("invalid input, type the monitor resolution.");
            } 
            
         //return the multiplier value back to the main method
         return resMultiplier;
   }//end of getMultiplierValue
   
   //this method calculates the performance score than returns it to the method
   public static double calculatePerformanceScore(double GPU, double numCores, double CPU, double multiConstant)
   {
      double performanceScore = 0;//to hold the place of performance score
      
      performanceScore = ((5 * GPU) + (numCores * CPU)) * multiConstant;
      
      //returning the value of the performance scare back to the main method
      return performanceScore;
   }// end of calculatePerformanceScore method

}//end of class