import java.util.Scanner;

public class Square {
    public static String squareLength(int side) {
        int i,j;
        String b ="";
        for(i = 1; i <= side; i++){
            for(j = 1; j <= side; j++){
                if (i == 1 || i == side || j == 1 || j == side)
                    b = b+("*");
                else
                    b = b+(" ");
            }
            b = b+"\n";
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jak velký chceš čtverec ?");
        String result = squareLength(sc.nextInt());
        System.out.println(result);
    }
}