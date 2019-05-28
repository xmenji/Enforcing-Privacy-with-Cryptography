
package cryptography;

import java.util.Scanner;
/**
 *
 * @author Titan
 */
public class Cryptography {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userData;
        
        //Get user data
        System.out.print("Enter 4-digit number: ");
        userData = input.nextInt();
        
        Encryption data1 = new Encryption(userData);
        
        //Encrypt user data        
        data1.encrypt();
    }
    
}
