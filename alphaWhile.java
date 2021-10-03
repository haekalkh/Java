import java.util.Scanner;
public class alphaWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Abjad: ");
        char alpha = input.next().charAt(0);
        char i = alpha;
        while(i <= 'Z'){
            System.out.println(i);
            i++;
        }
        input.close();
    }
    
}
