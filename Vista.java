/*************************************************************************************************************
Vista.java
Autor: Jeremy Mejía
Fecha de Creación: Septiembre de 2021
Última Modificación: Septiembre de 2021

Laboratorio No. 2 Memoria RAM
Vista
*************************************************************************************************************/

/*************************************************************************************************************
Librería
*************************************************************************************************************/

import java.util.Scanner;

/*************************************************************************************************************
Clase Vista
*************************************************************************************************************/


class Vista {

/*************************************************************************************************************
Variables globales
*************************************************************************************************************/

    Scanner scan = new Scanner(System.in);

    private int eleccion = 0;
    private int opcion = 0;
    private int tamanoMemoria = 0;
    private int prog = 0; 
    private int cant = 0;
    String[] programas = {"Zoom", "Chrome", "Safari", "Word", "Power Point"};
    
    
/*************************************************************************************************************
Métodos
*************************************************************************************************************/



    //private int TamanoMemoria = tamanoMemoria; 

    public void vista(){ 

        System.out.println(
        "\n*********************** Memoria RAM *********************** \n" +
        "En este programa se simulará una memoria RAM \n" +
        "Elige una opción: \n" + 
        "\n1. Crear una memoria RAM \n" +
        "2. Ver la cantidad total de memoria RAM \n" +
        "3. Ver la cantidad de memoria RAM disponible \n" +
        "4. Ver la cantidad de memoria RAM en uso \n" +
        "5. Ver los programas en ejecución \n" +
        "6. Ver los programas en cola \n" +
        "7. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "8. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "9. Realizar un ciclo de reloj" );
        eleccion = scan.nextInt();
        

    
        if (eleccion == 1){
            System.out.println(
            "\nElige que tipo de Memoria deseas: \n" +
            "\n1. DDR = dos operaciones en cada ciclo de reloj \n" +
            "2. SDR = una operación de lectura o escritura en cada ciclo de reloj");
            opcion = scan.nextInt();

            if (opcion == 1){
                System.out.println("\nLa memoria RAM tipo DDR iniciará con una memoria de 4GB y puede incrementar según se necesite. \n");
                System.out.println("Los programas disponibles a utilizar son: \n" +
                "1. ZOOM\n" +
                "2. CHROME\n" +
                "3. SAFARI\n" +
                "4. WORD\n" + 
                "5. POWER POINT\n" +
                "\n¿Deseas agregar algún otro programa? \n1. Si \n2. No \nElige un número: ");
                prog = scan.nextInt();

                if (prog == 1){
                    System.out.println("\n¿Cuántos programas vas a agregar?" );
                    cant = scan.nextInt();
                    String[] numero = new String[cant]; 
                    int[] numero2 = new int [cant]; 

                    for(int i=0; i<cant; i++){
                        System.out.println("\nEscribe el nombre del programa:");
                        numero[i] = scan.next().strip();
                    }
                    for(int i=0; i<cant; i++){
                        System.out.println("\nEscribe el espacio de memoria que ocupa el programa " + numero[i] + " en MB:");
                        numero2[i] = scan.next().indexOf(0);
                    }

                    System.out.println("\nNueva lista" + "\nLos programas disponibles a utilizar son: \n" +
                    "1. ZOOM\n" +
                    "2. CHROME\n" +
                    "3. SAFARI\n" +
                    "4. WORD\n" + 
                    "5. POWER POINT");
                    for(int i=0; i<cant; i++){
                        System.out.println((i+6) + ". " + numero[i]);
                        
                    }

                }
                else if (prog == 2){
                    System.out.println("\nContinuemos...");
                }

                System.out.println("¿Con cuántos programas vas a trabajar?" );
                cant = scan.nextInt();
                char[] numero = new char[cant]; 

                System.out.println("\nElige con números los programas: ");
                for(int i=0; i<cant; i++){
                    System.out.print("Programa No. ");
                    numero[i] = scan.next().charAt(0);
                    
                }
                if (cant == 1){
                    Vista vs = new Vista();
                    vs.despues3();
                }
                if (cant == 2){
                    Vista vs = new Vista();
                    vs.despues2();
                }
                if (cant == 3){
                    Vista vs = new Vista();
                    vs.despues4();
                }
                if (cant == 4){
                    Vista vs = new Vista();
                    vs.despues5();
                }
                if (cant == 5){
                    Vista vs = new Vista();
                    vs.despues6();
                }
            }
            else if(opcion == 2){
                System.out.println("\nLa memoria RAM tipo SDR necesita ser definida en su tamaño inicial, esta puede ser de: " +
                "4GB, 8GB, 12GB, 16GB, 32GB, 64GB" +
                "\nElige el tamaño de la memoria (número): ");
                tamanoMemoria = scan.nextInt();
            

                if (tamanoMemoria == 4){
                    System.out.println("\nMemoria de 4GB ");
                    System.out.println("Los programas disponibles a utilizar son: \n" +
                    "1. ZOOM\n" +
                    "2. CHROME\n" +
                    "3. SAFARI\n" +
                    "4. WORD\n" + 
                    "5. POWER POINT\n" +
                    "\n¿Deseas agregar algún otro programa? \n1. Si \n2. No \nElige un número: ");
                    prog = scan.nextInt();

                    if (prog == 1){
                        System.out.println("\n¿Cuántos programas vas a agregar?" );
                        cant = scan.nextInt();
                        String[] numero = new String[cant]; 
                        int[] numero2 = new int [cant]; 

                        for(int i=0; i<cant; i++){
                            System.out.println("\nEscribe el nombre del programa:");
                            numero[i] = scan.next().strip();
                        }
                        for(int i=0; i<cant; i++){
                            System.out.println("\nEscribe el espacio de memoria que ocupa el programa " + numero[i] + " en MB:");
                            numero2[i] = scan.next().indexOf(0);
                        }

                        System.out.println("\nNueva lista\n" + "Los programas disponibles a utilizar son: \n" +
                        "1. ZOOM\n" +
                        "2. CHROME\n" +
                        "3. SAFARI\n" +
                        "4. WORD\n" + 
                        "5. POWER POINT");
                        for(int i=0; i<cant; i++){
                            System.out.println((i+6) + ". " + numero[i]);
                        }

                    }
                    else if (prog == 2){
                        System.out.println("\nContinuemos...");
                    }
                    System.out.println("¿Con cuántos programas vas a trabajar?" );
                    cant = scan.nextInt();
                    char[] numero = new char[cant]; 
        
                    System.out.println("\nElige con números los programas: ");
                    for(int i=0; i<cant; i++){
                        System.out.print("Programa No. ");
                        numero[i] = scan.next().charAt(0);
                    }  
                    if (cant == 1){
                        Vista vs = new Vista();
                        vs.despues();
                    }
                    if (cant == 2){
                        Vista vs = new Vista();
                        vs.despuesSDR2();
                    }
                    if (cant == 3){
                        Vista vs = new Vista();
                        vs.despuesSDR3();
                    }
                    if (cant == 4){
                        Vista vs = new Vista();
                        vs.despuesSDR4();
                    }
                    if (cant == 5){
                        Vista vs = new Vista();
                        vs.despuesSDR5();
                    }
                }          
                if (tamanoMemoria == 8){
                    System.out.println("\nMemoria de 8GB ");
                    System.out.println("Los programas disponibles a utilizar son: \n" +
                    "1. ZOOM\n" +
                    "2. CHROME\n" +
                    "3. SAFARI\n" +
                    "4. WORD\n" + 
                    "5. POWER POINT\n" +
                    "\n¿Deseas agregar algún otro programa? \n1. Si \n2. No \nElige un número: ");
                    prog = scan.nextInt();

                    if (prog == 1){
                        System.out.println("\n¿Cuántos programas vas a agregar?" );
                        cant = scan.nextInt();
                        String[] numero = new String[cant]; 
                        int[] numero2 = new int [cant]; 

                        for(int i=0; i<cant; i++){
                            System.out.println("\nEscribe el nombre del programa:");
                            numero[i] = scan.next().strip();
                        }
                        for(int i=0; i<cant; i++){
                            System.out.println("\nEscribe el espacio de memoria que ocupa el programa " + numero[i] + " en MB:");
                            numero2[i] = scan.next().indexOf(0);
                        }

                        System.out.println("\nNueva lista\n" + "Los programas disponibles a utilizar son: \n" +
                        "1. ZOOM\n" +
                        "2. CHROME\n" +
                        "3. SAFARI\n" +
                        "4. WORD\n" + 
                        "5. POWER POINT");
                        for(int i=0; i<cant; i++){
                            System.out.println((i+6) + ". " + numero[i]);
                        }

                    }
                    else if (prog == 2){
                        System.out.println("\nContinuemos...");
                    }
                    System.out.println("¿Con cuántos programas vas a trabajar?" );
                    cant = scan.nextInt();
                    char[] numero = new char[cant]; 
        
                    System.out.println("\nElige con números los programas: ");
                    for(int i=0; i<cant; i++){
                        System.out.print("Programa No. ");
                        numero[i] = scan.next().charAt(0);
                    }
                    if (cant == 1){
                        Vista vs = new Vista();
                        vs.despues8SDR();
                    }
                    if (cant == 2){
                        Vista vs = new Vista();
                        vs.despues8SDR2();
                    }
                    if (cant == 3){
                        Vista vs = new Vista();
                        vs.despues8SDR3();
                    }
                    if (cant == 4){
                        Vista vs = new Vista();
                        vs.despues8SDR4();
                    }
                    if (cant == 5){
                        Vista vs = new Vista();
                        vs.despues8SDR5();
                    }
                }
                if (tamanoMemoria == 12){
                    System.out.println("\nMemoria de 12GB ");
                    System.out.println("Los programas disponibles a utilizar son: \n" +
                    "1. ZOOM\n" +
                    "2. CHROME\n" +
                    "3. SAFARI\n" +
                    "4. WORD\n" + 
                    "5. POWER POINT\n" +
                    "\n¿Deseas agregar algún otro programa? \n1. Si \n2. No \nElige un número: ");
                    prog = scan.nextInt();

                    if (prog == 1){
                        System.out.println("\n¿Cuántos programas vas a agregar?" );
                        cant = scan.nextInt();
                        String[] numero = new String[cant]; 
                        int[] numero2 = new int [cant]; 

                        for(int i=0; i<cant; i++){
                            System.out.println("\nEscribe el nombre del programa:");
                            numero[i] = scan.next().strip();
                        }
                        for(int i=0; i<cant; i++){
                            System.out.println("\nEscribe el espacio de memoria que ocupa el programa " + numero[i] + " en MB:");
                            numero2[i] = scan.next().indexOf(0);
                        }

                        System.out.println("\nNueva lista\n" + "Los programas disponibles a utilizar son: \n" +
                        "1. ZOOM\n" +
                        "2. CHROME\n" +
                        "3. SAFARI\n" +
                        "4. WORD\n" + 
                        "5. POWER POINT");
                        for(int i=0; i<cant; i++){
                            System.out.println((i+6) + ". " + numero[i]);
                        }

                    }
                    else if (prog == 2){
                        System.out.println("\nContinuemos...");
                    }
                    System.out.println("¿Con cuántos programas vas a trabajar?" );
                    cant = scan.nextInt();
                    char[] numero = new char[cant]; 
        
                    System.out.println("\nElige con números los programas: ");
                    for(int i=0; i<cant; i++){
                        System.out.print("Programa No. ");
                        numero[i] = scan.next().charAt(0);
                    }

                    if (cant == 1){
                        Vista vs = new Vista();
                        vs.despues12SDR();
                    }
                    if (cant == 2){
                        Vista vs = new Vista();
                        vs.despues12SDR2();
                    }
                    if (cant == 3){
                        Vista vs = new Vista();
                        vs.despues12SDR3();
                    }
                    if (cant == 4){
                        Vista vs = new Vista();
                        vs.despues12SDR4();
                    }
                    if (cant == 5){
                        Vista vs = new Vista();
                        vs.despues12SDR5();
                    }
                }
                if (tamanoMemoria == 16){
                    System.out.println("\nMemoria de 16GB ");
                    System.out.println("Los programas disponibles a utilizar son: \n" +
                    "1. ZOOM\n" +
                    "2. CHROME\n" +
                    "3. SAFARI\n" +
                    "4. WORD\n" + 
                    "5. POWER POINT\n" +
                    "\n¿Deseas agregar algún otro programa? \n1. Si \n2. No \nElige un número: ");
                    prog = scan.nextInt();

                    if (prog == 1){
                        System.out.println("\n¿Cuántos programas vas a agregar?" );
                        cant = scan.nextInt();
                        String[] numero = new String[cant]; 
                        int[] numero2 = new int [cant]; 

                        for(int i=0; i<cant; i++){
                            System.out.println("\nEscribe el nombre del programa:");
                            numero[i] = scan.next().strip();
                        }
                        for(int i=0; i<cant; i++){
                            System.out.println("\nEscribe el espacio de memoria que ocupa el programa " + numero[i] + " en MB:");
                            numero2[i] = scan.next().indexOf(0);
                        }

                        System.out.println("\nNueva lista\n" + "Los programas disponibles a utilizar son: \n" +
                        "1. ZOOM\n" +
                        "2. CHROME\n" +
                        "3. SAFARI\n" +
                        "4. WORD\n" + 
                        "5. POWER POINT");
                        for(int i=0; i<cant; i++){
                            System.out.println((i+6) + ". " + numero[i]);
                        }

                    }
                    else if (prog == 2){
                        System.out.println("\nContinuemos...");
                    }
                    System.out.println("¿Con cuántos programas vas a trabajar?" );
                    cant = scan.nextInt();
                    char[] numero = new char[cant]; 
        
                    System.out.println("\nElige con números los programas: ");
                    for(int i=0; i<cant; i++){
                        System.out.print("Programa No. ");
                        numero[i] = scan.next().charAt(0);
                    }
                    if (cant == 1){
                        Vista vs = new Vista();
                        vs.despues16SDR();
                    }
                    if (cant == 2){
                        Vista vs = new Vista();
                        vs.despues16SDR2();
                    }
                    if (cant == 3){
                        Vista vs = new Vista();
                        vs.despues16SDR3();
                    }
                    if (cant == 4){
                        Vista vs = new Vista();
                        vs.despues16SDR4();
                    }
                    if (cant == 5){
                        Vista vs = new Vista();
                        vs.despues16SDR5();
                    }
                }
                if (tamanoMemoria == 32){
                    System.out.println("\nMemoria de 32GB ");
                    System.out.println("Los programas disponibles a utilizar son: \n" +
                    "1. ZOOM\n" +
                    "2. CHROME\n" +
                    "3. SAFARI\n" +
                    "4. WORD\n" + 
                    "5. POWER POINT\n" +
                    "\n¿Deseas agregar algún otro programa? \n1. Si \n2. No \nElige un número: ");
                    prog = scan.nextInt();

                    if (prog == 1){
                        System.out.println("\n¿Cuántos programas vas a agregar?" );
                        cant = scan.nextInt();
                        String[] numero = new String[cant]; 
                        int[] numero2 = new int [cant]; 

                        for(int i=0; i<cant; i++){
                            System.out.println("\nEscribe el nombre del programa:");
                            numero[i] = scan.next().strip();
                        }
                        for(int i=0; i<cant; i++){
                            System.out.println("\nEscribe el espacio de memoria que ocupa el programa " + numero[i] + " en MB:");
                            numero2[i] = scan.next().indexOf(0);
                        }

                        System.out.println("\nNueva lista\n" + "Los programas disponibles a utilizar son: \n" +
                        "1. ZOOM\n" +
                        "2. CHROME\n" +
                        "3. SAFARI\n" +
                        "4. WORD\n" + 
                        "5. POWER POINT");
                        for(int i=0; i<cant; i++){
                            System.out.println((i+6) + ". " + numero[i]);
                        }

                    }
                    else if (prog == 2){
                        System.out.println("\nContinuemos...");
                    }
                    System.out.println("¿Con cuántos programas vas a trabajar?" );
                    cant = scan.nextInt();
                    char[] numero = new char[cant]; 
        
                    System.out.println("\nElige con números los programas: ");
                    for(int i=0; i<cant; i++){
                        System.out.print("Programa No. ");
                        numero[i] = scan.next().charAt(0);
                    }
                    if (cant == 1){
                        Vista vs = new Vista();
                        vs.despues32SDR();
                    }
                    if (cant == 2){
                        Vista vs = new Vista();
                        vs.despues32SDR2();
                    }
                    if (cant == 3){
                        Vista vs = new Vista();
                        vs.despues32SDR3();
                    }
                    if (cant == 4){
                        Vista vs = new Vista();
                        vs.despues32SDR4();
                    }
                    if (cant == 5){
                        Vista vs = new Vista();
                        vs.despues32SDR5();
                    }
                }
                if (tamanoMemoria == 64){
                    System.out.println("\nMemoria de 64GB ");
                    System.out.println("Los programas disponibles a utilizar son: \n" +
                    "1. ZOOM\n" +
                    "2. CHROME\n" +
                    "3. SAFARI\n" +
                    "4. WORD\n" + 
                    "5. POWER POINT\n" +
                    "\n¿Deseas agregar algún otro programa? \n1. Si \n2. No \nElige un número: ");
                    prog = scan.nextInt();

                    if (prog == 1){
                        System.out.println("\n¿Cuántos programas vas a agregar?" );
                        cant = scan.nextInt();
                        String[] numero = new String[cant]; 
                        int[] numero2 = new int [cant]; 

                        for(int i=0; i<cant; i++){
                            System.out.println("\nEscribe el nombre del programa:");
                            numero[i] = scan.next().strip();
                        }
                        for(int i=0; i<cant; i++){
                            System.out.println("\nEscribe el espacio de memoria que ocupa el programa " + numero[i] + " en MB:");
                            numero2[i] = scan.next().indexOf(0);
                        }

                        System.out.println("\nNueva lista\n" + "Los programas disponibles a utilizar son: \n" +
                        "1. ZOOM\n" +
                        "2. CHROME\n" +
                        "3. SAFARI\n" +
                        "4. WORD\n" + 
                        "5. POWER POINT");
                        for(int i=0; i<cant; i++){
                            System.out.println((i+6) + ". " + numero[i]);
                        }

                    }
                    else if (prog == 2){
                        System.out.println("\nContinuemos...");
                    }
                    System.out.println("¿Con cuántos programas vas a trabajar?" );
                    cant = scan.nextInt();
                    char[] numero = new char[cant]; 
        
                    System.out.println("\nElige con números los programas: ");
                    for(int i=0; i<cant; i++){
                        System.out.print("Programa No. ");
                        numero[i] = scan.next().charAt(0);
                    }
                    if (cant == 1){
                        Vista vs = new Vista();
                        vs.despues64SDR();
                    }
                    if (cant == 2){
                        Vista vs = new Vista();
                        vs.despues64SDR2();
                    }
                    if (cant == 3){
                        Vista vs = new Vista();
                        vs.despues64SDR3();
                    }
                    if (cant == 4){
                        Vista vs = new Vista();
                        vs.despues64SDR4();
                    }
                    if (cant == 5){
                        Vista vs = new Vista();
                        vs.despues64SDR5();
                    }
                }
            }
            
        }

        if (eleccion == 2){
            System.out.println("\nAún no se ha creado una memoria, procede a crearla." + "\nPresiona 1 para continuar.");
            eleccion = scan.nextInt();
            if (eleccion == 1){
                Vista vs = new Vista();
                vs.vista();
            }
            
        }

        if (eleccion == 3){
            System.out.println("\nAún no se ha creado una memoria, procede a crearla." + "\nPresiona 1 para continuar.");
            eleccion = scan.nextInt();
            if (eleccion == 1){
                Vista vs = new Vista();
                vs.vista();
            }
            
        }

        if (eleccion == 4){
            System.out.println("\nAún no se ha creado una memoria, procede a crearla." + "\nPresiona 1 para continuar.");
            eleccion = scan.nextInt();
            if (eleccion == 1){
                Vista vs = new Vista();
                vs.vista();
            }
            
        }

        if (eleccion == 5){
            System.out.println("\nAún no se ha creado una memoria, procede a crearla." + "\nPresiona 1 para continuar.");
            eleccion = scan.nextInt();
            if (eleccion == 1){
                Vista vs = new Vista();
                vs.vista();
            }
            
        }

        if (eleccion == 6){
            System.out.println("\nAún no se ha creado una memoria, procede a crearla." + "\nPresiona 1 para continuar.");
            eleccion = scan.nextInt();
            if (eleccion == 1){
                Vista vs = new Vista();
                vs.vista();
            }
            
        }

        if (eleccion == 7){
            System.out.println("\nZoom ocupa 64MB aproximadamente, esto equivale a 1 bloque dentro de la RAM" +
            "\nChrome ocupa 120MB aproximadamente, esto equivale a 2 bloques dentro de la RAM" +
            "\nSafari ocupa 64MB aproximadamente, esto equivale a 1 bloque dentro de la RAM" +
            "\nWord ocupa 1024MB aproximadamente, esto equivale a 16 bloques dentro de la RAM" +
            "\nPower Point ocupa 256MB aproximadamente, esto equivale a 4 bloques dentro de la RAM" +
            "\nTodo depende de la cantidad de información dentro de cada programa" );
            System.out.println("\nPresiona 1 para continuar.");
            eleccion = scan.nextInt();
            if (eleccion == 1){
                Vista vs = new Vista();
                vs.vista();
            }
            
        }

        if (eleccion == 8){
            System.out.println("\nAún no se ha creado una memoria, procede a crearla." + "\nPresiona 1 para continuar.");
            eleccion = scan.nextInt();
            if (eleccion == 1){
                Vista vs = new Vista();
                vs.vista();
            }
            
        }

        if (eleccion == 9){
            System.out.println("\nRealizar ciclo de reloj" + "\nPresiona 1 para continuar.");
            eleccion = scan.nextInt();
            if (eleccion == 1){
                Vista vs = new Vista();
                vs.vista();
            }
            
        }
    }

    int cant1 = cant; 
    public void despues(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 4GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta4GB(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + ".5GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso4GB(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "MB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 1 espacios ocupados y 1 en uso" );
            
        }
        


        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues();
        }
        
    }   
    
    public void despuesSDR2(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 4GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta4GB2(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso4GB2(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB"
            + "\n" + programas[1] + " 512MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 2 espacios ocupados y 2 en uso" );
            
        }
        


        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despuesSDR2();
        }
        
    }

    public void despuesSDR3(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 4GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta4GB3(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + ".5GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso4GB3(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + ".5GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1]
            + "\n" + programas[2]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 64MB"
            + "\n" + programas[1] + " 512MB" + "\n" + programas[2] + " 924MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 3 espacios ocupados y 2 en uso" );
            
        }

        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despuesSDR3();
        }
        
    }

    public void despuesSDR4(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 4GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta4GB4(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso4GB4(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1]
            + "\n" + programas[2] + "\n" + programas[3]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 64MB"
            + "\n" + programas[1] + " 512MB" + "\n" + programas[2] + " 924MB" + "\n" + programas[3] + " 512MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 4 espacios ocupados y 2 en uso" );
            
        }

        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despuesSDR4();
        }
        
    }

    public void despuesSDR5(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 4GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta4GB5(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso4GB5(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1]
            + "\n" + programas[2] + "\n" + programas[3] + "\n" + programas[4]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 64MB"
            + "\n" + programas[1] + " 512MB" + "\n" + programas[2] + " 924MB" + "\n" + programas[3] + " 512MB"
            + "\n" + programas[4] + " 1024MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 4 espacios ocupados y 2 en uso" );
            
        }

        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despuesSDR5();
        }
        
    }

    public void despues2(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad de la memoria es: 4GB de manera inicial por ser DDR" );
        }
        if (eleccion == 2){
            
            DDR ddr = new DDR();
            int incremento = ddr.resta4GB2(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
            
        }
        if (eleccion == 3){
            
            DDR ddr = new DDR();
            int incremento = ddr.uso4GB2(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
            
        }

        if (eleccion == 4){
            
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1]);
            
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 500MB"
            + "\n" + programas[1] + " 500MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 2 espacios ocupados y 2 en uso" );
            
        }

        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues2();
        }
    }

    public void despues3(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad de la memoria es: 4GB de manera inicial por ser DDR" );
        }
        if (eleccion == 2){
            
            DDR ddr = new DDR();
            int incremento = ddr.resta4GB(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
            
        }
        if (eleccion == 3){
            
            DDR ddr = new DDR();
            int incremento = ddr.uso4GB(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "MB");
            
        }
        if (eleccion == 4){
            
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0]);
            
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 64MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 1 espacios ocupados y 1 en uso" );
            
        }

        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues3();
        }
        
    }

    public void despues4(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad de la memoria es: 4GB de manera inicial por ser DDR" );
        }
        if (eleccion == 2){
            
            DDR ddr = new DDR();
            int incremento = ddr.resta4GB3(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
            
        }
        if (eleccion == 3){
            
            DDR ddr = new DDR();
            int incremento = ddr.uso4GB3(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
            
        }
        if (eleccion == 4){
            
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1]
            + "\n" + programas[2]);
            
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 64MB"
            + "\n" + programas[1] + " 704MB" + "\n" + programas[2] + " 256MB" );
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 3 espacios ocupados y 2 en uso" );
            
        }

        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues4();
        }
        
    }

    public void despues5(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad de la memoria es: 4GB de manera inicial por ser DDR" );
        }
        if (eleccion == 2){
            
            DDR ddr = new DDR();
            int incremento = ddr.resta4GB4(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
            
        }
        if (eleccion == 3){
            
            DDR ddr = new DDR();
            int incremento = ddr.uso4GB4(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
            
        }
        if (eleccion == 4){
            
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1]
            + "\n" + programas[2] + "\n" + programas[3]);
            
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 64MB"
            + "\n" + programas[1] + " 512MB" + "\n" + programas[2] + " 384MB" + "\n" + programas[3] 
            + " 64MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 4 espacios ocupados y 2 en uso" );
            
        }

        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues5();
        }
        
    }

    public void despues6(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad de la memoria es: 4GB de manera inicial por ser DDR" );
        }
        if (eleccion == 2){
            
            DDR ddr = new DDR();
            int incremento = ddr.resta4GB5(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
            
        }
        if (eleccion == 3){
            
            DDR ddr = new DDR();
            int incremento = ddr.uso4GB5(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
            
        }
        if (eleccion == 4){
            
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1]
            + "\n" + programas[2] + "\n" + programas[3] + "\n" + programas[4]);
            
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 64MB"
            + "\n" + programas[1] + " 512MB" + "\n" + programas[2] + " 512MB" + "\n" + programas[3] 
            + " 64MB" + "\n" + programas[4] + "896MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 5 espacios ocupados y 3 en uso" );
            
        }

        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues6();
        }
        
    }

    public void despues8SDR(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 8GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta8GB(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso8GB(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 1GB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 1 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues8SDR();
        }
        
    }   

    public void despues8SDR2(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 8GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta8GB2(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso8GB2(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 2 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues8SDR2();
        }
        
    }   

    public void despues8SDR3(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 8GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta8GB3(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso8GB3(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 1024MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 3 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues8SDR3();
        }
        
    }   

    public void despues8SDR4(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 8GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta8GB4(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso8GB4(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2] + "\n" + programas[3]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 512MB"  + "\n" + programas[3] + " 512MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 4 espacios ocupados y 2 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues8SDR4();
        }
        
    }   

    public void despues8SDR5(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 8GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta8GB5(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso8GB5(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2] + "\n" + programas[3] + "\n" + programas[4]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 512MB"  + "\n" + programas[3] + " 256MB" + programas[4] + " 256MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 5 espacios ocupados y 3 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues8SDR5();
        }
        
    }   

    public void despues12SDR(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 12GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta12GB(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso12GB(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 1GB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 1 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues12SDR();
        }
        
    }   

    public void despues12SDR2(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 12GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta12GB2(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso12GB2(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 2 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues12SDR2();
        }
        
    }   

    public void despues12SDR3(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 12GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta12GB3(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso12GB3(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 1024MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 3 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues12SDR3();
        }
        
    }   

    public void despues12SDR4(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 12GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta12GB4(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso12GB4(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2] + "\n" + programas[3]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 512MB"  + "\n" + programas[3] + " 512MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 4 espacios ocupados y 2 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues12SDR4();
        }
        
    }   

    public void despues12SDR5(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 12GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta12GB5(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso12GB5(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2] + "\n" + programas[3] + "\n" + programas[4]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 512MB"  + "\n" + programas[3] + " 256MB" + programas[4] + " 256MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 5 espacios ocupados y 3 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues12SDR5();
        }
        
    }   

    public void despues16SDR(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 16GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta16GB(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso16GB(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 1GB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 1 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues16SDR();
        }
        
    }   

    public void despues16SDR2(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 16GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta16GB2(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso16GB2(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 2 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues16SDR2();
        }
        
    }   

    public void despues16SDR3(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 16GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta16GB3(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso16GB3(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 1024MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 3 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues16SDR3();
        }
        
    }   

    public void despues16SDR4(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 16GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta16GB4(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso16GB4(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2] + "\n" + programas[3]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 512MB"  + "\n" + programas[3] + " 512MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 4 espacios ocupados y 2 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues16SDR4();
        }
        
    }   

    public void despues16SDR5(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 16GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta16GB5(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso16GB5(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2] + "\n" + programas[3] + "\n" + programas[4]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 512MB"  + "\n" + programas[3] + " 256MB" + programas[4] + " 256MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 5 espacios ocupados y 3 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues16SDR5();
        }
        
    }   
    public void despues32SDR(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 32GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta32GB(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso32GB(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 1GB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 1 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues32SDR();
        }
        
    }   

    public void despues32SDR2(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 32GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta32GB2(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso32GB2(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 2 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues32SDR2();
        }
        
    }   

    public void despues32SDR3(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 32GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta32GB3(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso32GB3(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 1024MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 3 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues32SDR3();
        }
        
    }   

    public void despues32SDR4(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 32GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta32GB4(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso32GB4(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2] + "\n" + programas[3]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 512MB"  + "\n" + programas[3] + " 512MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 4 espacios ocupados y 2 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues32SDR4();
        }
        
    }   

    public void despues32SDR5(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 32GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta32GB5(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso32GB5(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2] + "\n" + programas[3] + "\n" + programas[4]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 512MB"  + "\n" + programas[3] + " 256MB" + programas[4] + " 256MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 5 espacios ocupados y 3 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues32SDR5();
        }
        
    }   

    public void despues64SDR(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 64GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta64GB(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso64GB(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 1GB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 1 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues64SDR();
        }
        
    }   

    public void despues64SDR2(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 64GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta64GB2(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso64GB2(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 2 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues64SDR2();
        }
        
    }   

    public void despues64SDR3(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 64GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta64GB3(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso64GB3(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 1024MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 3 espacios ocupados y 1 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues64SDR3();
        }
        
    }   

    public void despues64SDR4(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 64GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta64GB4(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso64GB4(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2] + "\n" + programas[3]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 512MB"  + "\n" + programas[3] + " 512MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 4 espacios ocupados y 2 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues64SDR4();
        }
        
    }   

    public void despues64SDR5(){
        System.out.println("\n¿Qué deseas hacer ahora?\n" +
        "1. Ver la cantidad total de memoria RAM \n" +
        "2. Ver la cantidad de memoria RAM disponible \n" +
        "3. Ver la cantidad de memoria RAM en uso \n" +
        "4. Ver los programas en ejecución \n" +
        "5. Ver los programas en cola \n" +
        "6. Ver los espacios que ocupa un programa en particular en la RAM \n" +
        "7. Ver estado de la memoria (espacios ocupados y en uso) \n" +
        "8. Realizar un ciclo de reloj");
        eleccion = scan.nextInt();

        if (eleccion == 1){
            System.out.println("\nLa cantidad total de la memoria es: 64GB");
        }
        if(eleccion ==  2){
            SDR sdr = new SDR();
            int incremento = sdr.resta64GB5(); 
            System.out.println("\nCantidad de Memoria RAM disponible: " + incremento + "GB");
        }
        if(eleccion ==  3){
            SDR sdr = new SDR();
            int incremento = sdr.uso64GB5(); 
            System.out.println("\nCantidad de Memoria RAM en uso: " + incremento + "GB");
        }
        if(eleccion ==  4){
            System.out.println("\nLos programas en uso son: " + "\n" + programas[0] + "\n" + programas[1] 
            + "\n" + programas[2] + "\n" + programas[3] + "\n" + programas[4]);
        }
        if (eleccion == 5){
            
            System.out.println("\nNo hay programas en cola");
            
        }
        if (eleccion == 6){
            
            System.out.println("\nEspcacio que ocupan los programas: " + "\n" + programas[0] + " 512MB" + "\n" + programas[1] + " 512MB"
            + "\n" + programas[2] + " 512MB"  + "\n" + programas[3] + " 256MB" + programas[4] + " 256MB");
            
        }
        if (eleccion == 7){
            
            System.out.println("\nEstado de la Memoria: 5 espacios ocupados y 3 en uso" );
            
        }
        
        System.out.println("Presiona 1 para continuar");
        eleccion = scan.nextInt();
        if (eleccion == 1){
            Vista vs = new Vista();
            vs.despues64SDR5();
        }
        
    }   

}
