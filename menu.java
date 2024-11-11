import java.util.Scanner;

public class menu {
    public static void main(String[] args) {

        // Menyval för spelaren
        System.out.println("Hej och välkommen till brädspelssamlingen TicTacToe!");
        System.out.println();

        System.out.println("Du kan välja på dessa spel");
        System.out.println("1. Tre i rad");
        System.out.println("2. Fyra i rad");
        System.out.println("3. Fem i rad");
        System.out.println();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in 1,2 eller 3 beroende på vilket spel du vill spela");
        int chooseGame = scanner.nextInt();

        switch (chooseGame) {
            case 1:
                System.out.println("Du valde att spela Tre i rad!");
                //sedan ska den kalla på metoden för att komma till 3 i rad
                break;

            case 2:
                System.out.println("Du valde att spela Fyra i rad!");
                 //sedan ska den kalla på metoden för att komma till 4 i rad
                break;

            case 3:
                System.out.println("Du valde att spela Fem  i rad!");
                 //sedan ska den kalla på metoden för att komma till 3 i rad
                break;
            default:
                System.out.println("Spel med siffan " + chooseGame + " finns tyvärr inte i listan6. Välj mellan 1,2 eller 3");
                break;
        }

        scanner.close();

    }
}
