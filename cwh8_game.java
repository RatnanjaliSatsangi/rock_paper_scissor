import java.util.Scanner;
import java.util.Random;
public class cwh8_game 
{
    public static void main(String args[])
    {
            
        
            System.out.println("Hi there! Are you ready?"); 
            System.out.println("press 0 if your choice is rock");
            System.out.println("press 1 if your choice is paper");
            System.out.println("press 2 of your choice is scissors.");

        
            Scanner sc = new Scanner(System.in);
            int user = sc.nextInt();   
            sc.close();
            int rock = 0, paper = 1, scissors = 2;

           
                Random rps = new Random();
                int pc = rps.nextInt(3);
                
                if(pc == 0)
                {
                    {
                       
                        if(user == 0)
                        System.out.println("Oops! it's a tie");
                        else if(user == 1)
                        System.out.println("Congratulations! you won!");
                        else if(user == 2)
                        System.out.println("Sorry, you lost");
                    }
                    System.out.println("Your pc chose rock");
                }
                else if(pc == 1)
                
                {
                    {  
                        if(user == 1)
                        System.out.println("Oops! it's a tie");
                        else if(user == 2)
                        System.out.println("Congratulations! you won!");
                        else if(user == 0)
                        System.out.println("Sorry, you lost"); 
                    }
                    System.out.println("Your pc chose paper");
                }

                else if(pc == 2)
                {
                    {
                        
                        if(user == 2)
                        System.out.println("Oops! it's a tie");
                        else if(user == 0)
                        System.out.println("Congratulations! you won!");
                        else if(user == 1)
                        System.out.println("Sorry, you lost"); 
                    }
                    System.out.println("Your pc chose scissors");
                }
                
            
                  
            
    
    }
}   

