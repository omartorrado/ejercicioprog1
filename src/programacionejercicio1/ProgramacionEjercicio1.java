/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionejercicio1;
import java.util.Scanner;
/**
 *
 * @author otorradomiguez
 */
public class ProgramacionEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Calculadora de area de rectangulos");
        int base,altura;
        System.out.println("Introduzca la base del rectangulo"); 
        base = input.nextInt();
        System.out.println("Introduzca la altura del rectangulo");
        altura= input.nextInt();
        System.out.println("El area es igual a "+base*altura);
    }
        
}
