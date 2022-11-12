/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cbhas
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double gradosCentigrados;
        double gradosFarenheit;
        double gradosKelvin;

        System.out.println("Ingrese el valor de grados centı́grados");
        gradosCentigrados = entrada.nextDouble();

        if (gradosCentigrados > 0 && gradosCentigrados <= 100) {
            gradosFarenheit = (9 / 5.0) * gradosCentigrados + 32;
            gradosKelvin = gradosCentigrados + 273.15;

            System.out.printf("Valor en grados Farenheit %.2f\n",
                    gradosFarenheit);

            System.out.printf("Valor en grados Kelvin %.2f\n",
                    gradosKelvin);

        } else {
            System.out.printf("Valor %.2f en grados centígrados, "
                    + "está fuera de rango\n", gradosCentigrados);
        }
    }
}
