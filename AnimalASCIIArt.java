import java.util.Scanner;

public class AnimalASCIIArt {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What animal would you like to see(cat, dog,fish or moose)?");
        String choice;
        while(true) {
            choice = scan.next();
            if(choice.toLowerCase().equals("cat") || choice.toLowerCase().equals("dog") ||
            choice.toLowerCase().equals("fish")||choice.equals("moose")) {
                break;
            } else {
                System.out.println("I don't know that one, try again.");
            }
        }

        if(choice.equals("cat")) {
            System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
        } else if(choice.equals("dog")) {
            System.out.println("           __\n      (___()\'`;\n      /,    /`\n      \\\\\"--\\\\");
        }
        else if(choice.equals("moose"))
        {
            System.out.println(
" ___            ___\n/   \\          /   \\\n\\_   \\        /  __/\n _\\   \\      /  /__\n \\___  \\____/   __/\n     \\_       _/\n       | @ @  \\_\n       |\n     _/     /\\\n    /o)  (o/\\ \\_\n    \\_____/ /\n      \\____/"
);
        }
         else {
            System.out.println("|\\   \\\\\\\\__     o\n| \\_/    o \\    o \n> _   (( <_  oo  \n| / \\__+___/      \n|/     |/");
        }
        scan.close();
    }
}
