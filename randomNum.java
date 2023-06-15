import javax.swing.*;  
import java.util.*;
public class RandomNumber
{  
    public static void main( String args[] )   
    {  
        Scanner sc = new Scanner(System.in);
        int min = 1;  
        int max = 100;
        Random random = new Random();   
        System.out.println("Random value of type double between "+min+" to "+max+ ":");  
        int  gen_num = random.nextInt(max-min+1)+min;
        int rounds = 3;  
        int score = 0;
       
        int attempt_in = 5;
        System.out.println("You have 3 rounds");
        for (int i=rounds;i>0;i--){
            System.out.println("You are in "+(rounds-(i-1))+"round");
            for (int j=attempt_in;j>0;j--){
                System.out.println("You are in "+(attempt_in-(j-1))+"attempt");   
                JFrame f=new JFrame();   
                String user_input=JOptionPane.showInputDialog(f,"Enter Number should be in range 1 to 100");
                int guess_num = Integer.parseInt(user_input); 
                if (guess_num==gen_num){
                    System.out.println("You are guessing "+guess_num+" is correct");
                    score = j*i;
                    break;
                }
                else if (guess_num>gen_num){
                    System.out.println("You are guessing is "+ guess_num + " is larger number to generating number");
                }
                else{
                    System.out.println("You are guessing is "+ guess_num +" is smaller number to generating number");
                }
            }
            if (score!=0 || i==1) 
            {
                break;
            }
        }
        System.out.println("Your total score is="+ score);
    }
}     
