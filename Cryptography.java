
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
        System.out.print("Enter 4-digit number for encryption: ");
        userData = input.nextInt();
        
        Encryption dataToEncrypt = new Encryption(userData);
        
        //Encrypt user data        
        dataToEncrypt.encrypt();
       
        System.out.print("Enter 4-digit number for decryption: ");
        userData = input.nextInt();
        
        Decryption dataToDecrypt = new Decryption(userData);
        
        //Decrypt user data
        dataToDecrypt.Decrypt();
    }
    
}
