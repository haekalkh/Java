import java.util.Scanner;
public class prima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka :");
        int myNum = input.nextInt();
        int angkaPrima = 0;
        for(int i = 2; i <= myNum; i++){
            if(myNum % i == 0){
                angkaPrima++;
                }
            }
            if(angkaPrima == 1){
                System.out.println(myNum + " " + " Adalah bilangan prima");
            } else{
                System.out.println(myNum + " " + " Bukan bilangan prima");
            }
            input.close();
            }
            
        }

    

