
package com.ceep.test;
//IMPORTAR EL PAQUETE DE LA CLASE VEHICULOS
import com.ceep.domain.Vehiculo;
/**
 *
 * @author Alumno mañana
 */
public class PruebaGestion {
   
     public static void main(String[] args) {
         
       Vehiculo V1=new Vehiculo("743264L", "Seat", "Leon", "Rojo", 130.00, true);
       V1.getAtributos();
    }
}
