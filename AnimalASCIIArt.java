import java.util.Scanner;

public class AnimalASCIIArt {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What animal would you like to see(cat or dog)?");
        String choice;
        while(true) {
            choice = scan.next();
            if(choice.toLowerCase().equals("cat") || choice.toLowerCase().equals("dog")) {
                break;
            } else {
                System.out.println("I don't know that one, try again.");
            }
        }

        if(choice.equals("cat")) {
            System.out.println("CAT ASCII ART HERE");
        } else {
            System.out.println("DOG ASCII ART HERE");
        }
    }
}
