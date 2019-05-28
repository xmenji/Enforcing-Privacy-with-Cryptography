
package cryptography;

/**
 *
 * @author Titan
 */
public class Decryption {
    private int data,
                firstDigit,
                secondDigit,
                thirdDigit,
                fourthDigit;
    
    public Decryption(int data){
        this.data = data;
    }
    
    public int getData(){
        return data;
    }
    
    private void splitDigits(){
        firstDigit = ((data % 10000) / 1000);
        secondDigit = ((data % 1000) / 100);
        thirdDigit = ((data % 100) / 10);
        fourthDigit = (data % 10);
    }
    
    private void swap(){
        int temp;
        
        temp = firstDigit;
        firstDigit = thirdDigit;
        thirdDigit = temp;
        
        temp = secondDigit;
        secondDigit = fourthDigit;
        fourthDigit = temp;
    }
    
     private void printDecryptedData(){
        System.out.printf("Decrypted data: %d%d%d%d%n", firstDigit, secondDigit, thirdDigit, fourthDigit);
    }
    
     public void Decrypt(){
         //First split the digits 
         splitDigits();
         
         //swap digits
         swap();
         
         //Reverse encryption process by adding 10 if digit is less than 7
         //then subtracting 7 from all digits
        firstDigit = (firstDigit >= 7)? firstDigit - 7: (firstDigit + 10) - 7;
        secondDigit = (secondDigit >= 7)? secondDigit - 7: (secondDigit + 10) - 7;
        thirdDigit = (thirdDigit >= 7)? thirdDigit - 7: (thirdDigit + 10) - 7;
        fourthDigit = (fourthDigit >= 7)? fourthDigit - 7: (fourthDigit + 10) - 7;
         
        //print out final decrypted data
        printDecryptedData();
     }
     
}//End Decryption
