
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Proyecto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto1Application.class, args);
		int numero;
		int resto;
		int ceroSalir;
		String salir;

		Scanner scanner = new Scanner (System.in);

		do {
			System.out.print("Ingrese número: ");
			numero = scanner.nextInt();
			resto = numero % 2;
			if (resto == 0) {
				System.out.println("par");
			}
			else {
				System.out.println("impar");
			}

			System.out.println("Ingrese 0 para salir, cualquiera para continuar: ");
			ceroSalir = scanner.nextInt();

			if (ceroSalir == 0)
			{
				salir = "si";
			}
			else
			{
				salir = "no";
			}
		} while ( salir.equals("no"));

}



}
