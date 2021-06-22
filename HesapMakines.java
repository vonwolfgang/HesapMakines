import java.util.Scanner;

public class HesapMakines {
    public static void main(String[] args){

        double s1, s2;

        Scanner inp = new Scanner(System.in);
        
        System.out.println("please login your first number : ");
        s1 = inp.nextDouble();

        System.out.println("please login your second number : ");
        s2 = inp.nextDouble();

        System.out.println("Please choice your function\n1-sum\n2-extraction\n3-time\n4-divide");
        int choice = inp.nextInt();

        switch (choice) {
           
            case 1:
                System.out.println("Sum up : " + (s1+s2));         
            break;   
            
            case 2:
                System.out.println("Extraction : " + (s1-s2));

            break;
            
            case 3:
                System.out.println("Times : " + (s1*s2));
            break;
            
            case 4:
                System.out.println("Divided : " + (s1/s2));
            break;

            default:
                System.out.println("run the program again for calculating again");
            break;
        }
    }
    
}
