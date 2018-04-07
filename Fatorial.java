import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int fat, cont;
        fat=1;
        System.out.println("Numero para calcular o fatorial? ");
        fat = input.nextInt();
        cont = fat;
        for (int i=1; i!=cont; i++){
            fat = fat * i;
        }
        System.out.println(fat);
    }
    
}