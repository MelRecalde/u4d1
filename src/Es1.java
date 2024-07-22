import java.util.Arrays;

public class Es1 {
    public static void main(String[] args) {
        int num1;
        int num2;
        num1 = 3;
        num2 = 13;

        int x = num1 * num2;

        System.out.println("ESERCIZIO 1 : ");
        System.out.println("3*13 = " + x);

        String s = "This is my favorite number : " + 3;

        System.out.println("ESERCIZIO 2 : ");
        System.out.println(s);

        String[] colors = {"white","black","red","blue","yellow"};
        String color = "green";
        String[] addingColor = Arrays.copyOf(colors,colors.length + 1);
        String [] newColors = new String[6];
        newColors[0] = "white";
        newColors[1] = "black";
        newColors[2] = color;
        newColors[3] = "red";
        newColors[4] = "blue";
        newColors[5] = "yellow";

        System.out.println("ESERCIZIO 3 : " );
        for (String newColor : newColors) {
            System.out.println(newColor);
        }
    }
}
