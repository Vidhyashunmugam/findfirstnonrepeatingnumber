import java.util.Scanner;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        char result = findFirstNonRepeatedChar(str);

        
        if (result != '\0') {
            System.out.println("First non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character ");
        }
        
        scanner.close(); 
    }
   
    public static char findFirstNonRepeatedChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean isRepeated = false;
            for (int j = 0; j < str.length(); j++) {
              if (i != j && str.charAt(i) == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
               if (!isRepeated) {
                return str.charAt(i);
            }
        }
        return '\0'; 
    }
}







