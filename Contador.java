package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int n1 = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Digite o segundo número");
        int n2 = entrada.nextInt();


        try {
            contar(n1,n2);

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        entrada.close();
    }

    static void contar (int n1, int n2) throws ParametrosInvalidosException {
        if (n1 > n2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int cont = n2 - n1;

        for (int i = 1; i <= cont; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
