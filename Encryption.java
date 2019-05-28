
package cryptography;

/**
 *
 * @author Titan
 */
public class Encryption {
    private int data,
                firstDigit,
                secondDigit,
                thirdDigit,
                fourthDigit;
    
    public Encryption(int data){
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
    
     private void printEncryptedData(){
        System.out.printf("Encrypted data: %d%d%d%d%n", firstDigit, secondDigit, thirdDigit, fourthDigit);
    }
    
    public void encrypt(){
    
        splitDigits();
        
        //Replace each digit with the result of adding 7 to the digit
        //Get the remainder after dividing new value by 10
        firstDigit = (firstDigit + 7) % 10;
        secondDigit = (secondDigit + 7) % 10;
        thirdDigit = (thirdDigit + 7) % 10;
        fourthDigit = (fourthDigit + 7) % 10;
        
        //Swap the first digit with the third, and swap the second digit with 
        //the fourth.
        swap();
        
        //Print the encypted integer
        printEncryptedData();
    }
    
}//END ENCRYPTION

