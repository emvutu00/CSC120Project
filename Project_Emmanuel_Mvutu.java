import java.util.Scanner;

public class Project_Emmanuel_Mvutu
{
   public static void main(String[] args)
   {
      int GPUClockSpeed = 0;//to hold the GPU clock speed
      int CPUClockSpeed = 0;//to hold the CPU clock speed
      int numOfCores = 0;//to hold the number of cores
      
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
      
      
   }
}