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
 * @version 1.1
 * 
 */
public class Reloj {

    //Atributos de la clase Reloj modificados
    
/** Descripción de la clase 
*    
*    Tras la refactorización las variables hora, minuto y segundo pasan a ser HH MM SS respectivamente.
*    El cambio de nombre se variable se ha realizado limitándose a lo solicitado en la taréa, manteniéndose, conscientemente
*    el nombre hora, minuto, segundo en los parámetros que pasamos al constructor.
* 
*    Añadimos las variables dd y mm, que contendrán el día y el mes
*    
*    Creamos los métodos asignarDia, asignarMes, obtenerDia, obtenerMes para los nuevos parámetros.
*    
*    Y modificamos el constructor de la clase para pasar los nuevos parametros
*   
*    Y encapsulamos los atributos añadiendo el "private" en la declaración de las variables.
*    
*
*/
    
    private int HH, MM, SS,dd,mm; // Añadimos las variables dd y mm que contendran el día y el mes

    //Constructor con parámetros
    public Reloj(int hora, int minuto, int segundo, int dia, int mes) {
        this.HH = hora;
        this.MM = minuto;
        this.SS = segundo;
        this.dd = dia;
        this.mm = mes;
    }
    
    
    
    // Y si añadimos algo muestra lo mismo en verde...
    
    
/*
*   Insertamos los métodos getter y setter para los nuevos atributos dd y mm
*/


    public void asignarDia(int dd) {
        this.dd = dd;
    }
    
    public void asignarMes(int mm) {
        this.mm = mm;
    }

    public int obtenerDia() {
        return dd;
    }

    public int obtenerMes() {
        return mm;
    }

 /** 
  * Métodos para asignar valores a los atributos hora, minuto y segundo
 */   
    public void asignarHora(int hora) {
        this.HH = hora;
    }

    public void asignarMinuto(int minuto) {
        this.MM = minuto;
    }

    
    public void asignarSegundo(int segundo) {    
        this.SS = segundo;
    }
 //Métodos para devolver valores de los atributos hora, minuto y segundo

    public int obtenerHora() {
        return HH;
    }

    public int obtenerMinuto() {
        return MM;
    }

    public int obtenerSegundo() {
        return SS;
    }
    
    //Método que incrementa 1 segundo la hora
    public void incrementa() {
        boolean cambio_m, cambio_h;
        cambio_m = (SS + 1 > 59) ? true : false;
        cambio_h = ((cambio_m) && (MM + 1 > 59)) ? true : false;
        MM = (cambio_m) ? MM + 1 : MM;
        MM = (MM > 59) ? 0 : MM;
        HH = (cambio_h) ? HH + 1 : HH;
        HH = (HH > 23) ? 0 : HH;
        SS = (SS + 1 > 59) ? 0 : SS + 1;
    }
    //Método que decrementa un segundo la hora
    public void decrementa() {
        boolean cambio_m, cambio_h;

        cambio_m = (SS - 1 < 0) ? true : false;
        cambio_h = ((cambio_m) && (MM - 1 < 0)) ? true : false;

        MM = (cambio_m) ? MM - 1 : MM;
        MM = (MM < 0) ? 59 : MM;
        HH = (cambio_h) ? HH - 1 : HH;
        HH = (HH < 0) ? 23 : HH;

        SS = (SS - 1 < 0) ? 59 : SS - 1;

    }
    //Método que da la hora en formato 12H
    public String hora12() {
        
        String mediodia, cadena;
        int hora12;
        mediodia = (HH >= 12) ? "PM" : "AM";
        hora12 = (HH > 12) ? HH - 12 : HH;

    //Forma de poner un 0 en los minutos y segundos si es menor de 10
        cadena = hora12 + ":";
        cadena += (MM < 10) ? "0" : "";
        cadena += MM + ":";
        cadena += (SS < 10) ? "0" : "";
        cadena += SS;
        cadena += " " + mediodia;
        return cadena;

    }
    //Método que da la hora en formato 24H
    public String hora24() {
        
        String cadena;

        //Forma de poner un 0 en los minutos y segundos si es menor de 10
        cadena = HH + ":";
        cadena += (MM < 10) ? "0" : "";
        cadena += MM + ":";
        cadena += (SS < 10) ? "0" : "";
        cadena += SS;
        return cadena;

    }
}
