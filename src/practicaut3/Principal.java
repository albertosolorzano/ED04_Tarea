/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaut3;

/** Declaración de la clase principal
 * 
 * @author alberto solórzano mirones
 * Tarea04 ED AG LINARES 2014-15 
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto de la clase Reloj
        Reloj miReloj=new Reloj(7,7,59,0,0); // Modificamos los valores que pasamos al constructor
        //Mostramos la hora en formato 24H
        System.out.println("La hora que marca miReloj en formato 24H es:");
        System.out.println(miReloj.hora24());
        //Mostramos la hora en formato 12H
        System.out.println("La hora que marca miReloj en formato 12H es:");
        System.out.println(miReloj.hora12());
        //Sumamos un segundo a la hora que marca miReloj
        miReloj.incrementa();
        //Mostramos la hora tras aumentar un segundo la hora
        System.out.println("La hora tras sumar un segundo en formato 24H es: ");
        System.out.println(miReloj.hora24());
        System.out.println("La hora tras sumar un segundo en formato 12H es: ");
        System.out.println(miReloj.hora12());
        //Cambio la hora a las 7:7:00
        System.out.println("Cambio la hora a 7:00:00");
        miReloj.asignarMinuto(0);
        miReloj.asignarSegundo(0);
        //Restamos un segundo
        miReloj.decrementa();
        //Mostramos la hora tras restar un segundo la hora
        System.out.println("La hora tras restar un segundo en formato 24H es: ");
        System.out.println(miReloj.hora24());
        System.out.println("La hora tras restar un segundo en formato 12H es: ");
        System.out.println(miReloj.hora12());
        
    }
    
}
