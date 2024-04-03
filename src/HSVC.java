import java.util.Scanner;

public class HSVC {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] quantidadeDinheiro = new int[10];

        System.out.print("Dinheiro que foi confessado: ");
        int dinheiroConfessado = input.nextInt();
        int soma = 0;

        for (int i = 0; i < quantidadeDinheiro.length; i++){
            System.out.print("Notas de Dinheiro: ");
            quantidadeDinheiro[i] = input.nextInt();
            if (quantidadeDinheiro[i] >= dinheiroConfessado){
                if (quantidadeDinheiro[i] % 10 == 0){
                   soma+=quantidadeDinheiro[i];
                }
            }

        }
        System.out.println("O dinheiro roubado foi "+soma+" Reais");
    }
}
