import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un nome");
        String nome = scanner.nextLine();
        System.out.println("Inserisci un'azione");
        String azione = (scanner.nextLine());
        System.out.println("Inserisci un oggetto");
        String oggetto = (scanner.nextLine());

        System.out.printf("La frase uscita è : " + nome + " " + azione + " " + oggetto);
        System.out.printf("La frase inversa è : " + oggetto + " " + azione + " " + nome);

        scanner.close();
    }
}
