package Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the amount : ");
        double price = s.nextDouble();

        System.out.print("Enter the Card Number :");
        String cardNumber = s.next();

        System.out.print("Enter the Card Expiry Date :");
        String expiryDate = s.next();

        System.out.print("Enter the Card CVC :");
        String cvc = s.next();

        System.out.println("1. Bank A");
        System.out.println("2. Bank B");
        System.out.println("3. Bank C");

        System.out.println("Please Select Bank :");
        int selectBank = s.nextInt();

        switch (selectBank){
            case 1 :
                BankA posA = new BankA("A BANK","27805065","6598787");
                posA.connect("127.1.1.1");
                posA.payment(price,cardNumber,expiryDate,cvc);
            break;
            case 2 :
                BankB posB = new BankB("B BANK","75895044","2541254");
                posB.connect("127.2.1.1");
                posB.payment(price,cardNumber,expiryDate,cvc);
            break;
            case 3 :
                BankC posC = new BankC("C BANK","9823546","5637812");
                posC.connect("127.3.1.1");
                posC.payment(price,cardNumber,expiryDate,cvc);
            break;
            default:
                System.out.println("Please enter Valid Bank !!");
            break;
        }
    }
}
