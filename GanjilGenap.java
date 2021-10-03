import java.util.Scanner;
public class GanjilGenap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        int myNum = input.nextInt();
        for(int i = 0; i <= myNum; i++){
            if (i % 2 == 0) {
            System.out.println(i + " " + " Adalah bilangan genap");
        } else{
            System.out.println(i + " " + " Adalah bilangan ganjil");
        }
    }
    input.close();
}
}