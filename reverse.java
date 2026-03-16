import java.util.Scanner;

class ReverseLogic {
    int number;

    
    ReverseLogic(int n) {
        this.number = n;
    }

    void reverseAndDisplay() {
        int temp = number;
        int reverse = 0;

        
        while (temp != 0) {
            int digit = temp % 10;      
            reverse = reverse * 10 + digit; 
            temp = temp / 10;           
        }

        System.out.println("original Number: " + number);
        System.out.println("reversed Number: " + reverse);
    }
}

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nter a 3 digit number to reverse: ");
        int input = sc.nextInt();
        
       
        ReverseLogic obj = new ReverseLogic(input);
        obj.reverseAndDisplay();
        
        sc.close();
    }
}