/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Declaración de variables
        String empleado;
        double ht, th, sb, d, sn;

        // Creando el objeto lectura
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Nombre de empleado: ");
        empleado = lectura.next();

        System.out.print("Horas trabajadas: ");
        ht = lectura.nextDouble();

        System.out.print("Tarifa por hora: ");
        th = lectura.nextDouble();

        // Proceso de datos
        sb = ht * th;
        d = sb * 0.13;
        sn = sb - d;

        // Salida de datos
        System.out.println("Sueldo bruto: " + sb);
        System.out.println("Descuento: " + d);
        System.out.println("Sueldo Neto: " + sn);
    }
    
}
