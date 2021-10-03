import java.util.Scanner;
public class alphaFor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan huruf : ");
        char alpha = input.next().charAt(0);
        for(char i=alpha; i <='Z'; i++){
            System.out.println(i + " ");
        }
        input.close();
    } 

}