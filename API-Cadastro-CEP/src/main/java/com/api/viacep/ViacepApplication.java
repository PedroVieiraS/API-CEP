package com.api.viacep;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import classes.Cliente;

@SpringBootApplication
public class ViacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViacepApplication.class, args);

		Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar novo cliente");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
				try {
					Cliente.addCliente();
		
				} catch (Exception e) {
					System.out.println("Erro: " + e.getMessage());
					Cliente.addCliente();
				}
                    break;
                case "2":
                    rodando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
	}
}