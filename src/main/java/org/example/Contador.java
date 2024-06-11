package org.example;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm;
        int parametroDois;

        System.out.println("Informe o primeiro numero: ");
        parametroUm=  terminal.nextInt();

        System.out.println("Informe o segundo numero: ");
        parametroDois = terminal.nextInt();

        try {

            contar (parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("Error : " +e.getMessage());
        }


    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }

        int contagem = parametroDois-parametroUm;
        for (int i=1; i<=contagem; i++){
            System.out.println("Imprimindo o numero : " + (contagem+i));
        }
    }
}
