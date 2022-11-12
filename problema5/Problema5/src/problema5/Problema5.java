/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cbhas
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double litrosConsumidos;
        double costroLitro;
        double valorAgua;
        double minutosGastados;
        double costoMinuto;
        double valorTelefono;
        double sumaServicios;
        double descuento = 20;
        int añosPersona;

        System.out.println("Ingrese su edad::");
        añosPersona = entrada.nextInt();

        //Agua
        System.out.println("Ingrese el número de litros de agua consumidos en el mes:");
        litrosConsumidos = entrada.nextDouble();
        System.out.println("Ingrese el  costo del litro de agua:");
        costroLitro = entrada.nextDouble();
        valorAgua = (litrosConsumidos * costroLitro);

        //Telefono
        System.out.println("Ingrese el número de minutos gastados en el mes:");
        minutosGastados = entrada.nextDouble();
        System.out.println("Ingrese el costo por minuto:");
        costoMinuto = entrada.nextDouble();
        valorTelefono = (minutosGastados * costoMinuto);

        sumaServicios = (valorAgua + valorTelefono);

        System.out.println("El valor a pagar mensual es de:" + sumaServicios);

        if (añosPersona > 20 && añosPersona < 100) {
            sumaServicios = (valorAgua + valorTelefono);
            System.out.println("El valor a cancelar es:\n" + sumaServicios);

        } else {

            if (añosPersona > 0 && añosPersona < 20) {
                descuento = (sumaServicios * descuento) / 100;
                sumaServicios = (sumaServicios - descuento);
                System.out.println("El valor a cancelar con el descuento es:\n"
                        + sumaServicios);
            }

        }
    }
}
