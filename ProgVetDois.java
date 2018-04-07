package progvetdois;
import java.util.Scanner;
public class ProgVetDois {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vet [][] = new int [4][3];
        int result [] = new int [4];
        for(int i = 0;i<4;i++){
            for(int j = 0;j<3;j++){
                System.out.println("Prateleira "+ i + " compartimento "+ j + " :");
                vet[i][j]= entrada.nextInt();
                result[i]=0;
            }
        }
        
        for(int i = 0;i<4;i++){
            for(int j = 0;j<3;j++){
                result[i] += vet[i][j];
            }
            System.out.println("Prateleira "+ i+1 +" possui "+result[i]+" pecas");
        }
    }
    
}
