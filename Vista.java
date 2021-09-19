/*************************************************************************************************************
Vista.java
Autor: Jeremy Mejía
Fecha de Creación: Septiembre de 2021
Última Modificación: Septiembre de 2021

Laboratorio No. 2 Memoria RAM
Vista
*************************************************************************************************************/

import java.util.Scanner;

class Vista {

    Scanner scan = new Scanner(System.in);

    int eleccion = 0;

    public void Vista(){

        System.out.println("
        \n******************** Memoria RAM ******************** \n" +
        "En este programa se simulará una memoria RAM \n" +
        "Elige una opción: \n" +
        "1. Crear una memoria RAM \n" +
        "2. Ingresar programas a utilizar en la memoria RAM \n" +
        "3. Ver la cantidad total de memoria RAM \n" +
        "4. Ver la cantidad de memoria RAM disponible \n" +
        "5. Ver la cantidad de memoria RAM en uso \n" +
        "6. Ver los programas en ejecución \n" +
        "7. Ver los programas en cola \n" +
        "8. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "9. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "10. Realizar un ciclo de reloj\n" );
        eleccion = scan.nextInt();
    }
    
}
