
import java.util.Random;
import java.util.Scanner;

public class Practica {

    public static boolean salir;//Declaramos una variable para el menu con valor falso
    public static int opccion;//variabe que se utliza para dar como opccion una accion o metodo

    public static void main(String[] args) {
        System.out.println("Bienvenido a este programa");
        menu();

    }

    //este procedimiento muestra el menu
    public static void menu() {
        System.out.println("");
        //boolean salir = false; //Declaramos una variable con valor falso
        //int opccion; //variabe que se utliza para dar como opccion una accion o metodo
        Scanner miScanner = new Scanner(System.in);
        while (!salir) {//salir es diferente
            System.out.println("Elige una opciòn con el numero que desees");
            System.out.println("1.Juego del ahorcado");
            System.out.println("2.Baloncesto");
            System.out.println("3.Juego de cartas");
            System.out.println("4.Hanoi");
            System.out.println("5.Descripción de juegos");
            System.out.println("6.Salir");

            opccion = miScanner.nextInt();
            System.out.println("Haz elegido la opccion " + opccion);

            //switch permite al programador ingresar una condicion que devuelve diferentes casos.
            switch (opccion) {
                case 1:
                    System.out.println("AHORCADO");
                    ahorcado();
                    break;
                case 2:
                    System.out.println("BALONCESTO");
                    baloncesto();
                    break;
                case 3:
                    System.out.println("JUEGO DE CARTAS");
                    cartas();
                    break;
                case 4:
                    System.out.println("TORRE DE HANOI");
                    hanoi();
                    break;
                case 5:
                    System.out.println("DESCRIPCION");
                    descripcion();
                    break;
                case 6:
                    salir = true; //aqui damos como valor verdadero y termina con el while
                    break;
                default://funciona cuando el usuario ingrese una occion diferente, informa al usuario el error
                    System.out.println("Opcion invalida, vuelve a elegir");
            }
        }
    }

    private static void ahorcado() {
        boolean regresar = false;
        int segundaOpccion;
        Scanner unoScanner = new Scanner(System.in);
        while (!regresar) {
            System.out.println("");
            System.out.println("");
            System.out.println("1.Jugar");
            System.out.println("2.Regresar al menu");

            segundaOpccion = unoScanner.nextInt();

            switch (segundaOpccion) {
                case 1:
                    espacios();
                    System.out.println("Bienvenido al juego del ahorcado");
                    boolean adivinar;                    
                    int conteoFallos;
                    char Palabara;
                    System.out.println("Ingresa la palabra a adivinar");
                    
                    
                    break;
                case 2:
                    regresar = true;
                    break;
                default:
                    System.out.println("Vuelve a elegir");
            }
        }
    }

    private static void baloncesto() {
        boolean regresar = false;
        int segundaOpccion;
        Scanner unoScanner = new Scanner(System.in);
        while (!regresar) {
            System.out.println("");
            System.out.println("");
            System.out.println("1.Jugar");
            System.out.println("2.Regresar al menu");

            segundaOpccion = unoScanner.nextInt();

            switch (segundaOpccion) {
                case 1:
                    espacios();
                    System.out.println("Bienvenido al juego de baloncesto");
                    break;
                case 2:
                    regresar = true;
                    break;
                default:
                    System.out.println("Vuelve a elegir");
            }
        }
    }

    private static void cartas() {
        boolean regresar = false;  //valor para el sub menu
        int segundaOpccion; //variable para la seleccion del sub menu
        Scanner unoScanner = new Scanner(System.in);
        Scanner unScanner = new Scanner(System.in);
        while (!regresar) {
            System.out.println("");
            System.out.println("");
            System.out.println("1.Jugar");
            System.out.println("2.Regresar al menu");

            segundaOpccion = unoScanner.nextInt();

            switch (segundaOpccion) {
                case 1:
                    espacios();
                    System.out.println("Bienvenido al juego de cartas");
                    Random Carta = new Random();
                    int cantidadCarta;
                    int rangoMenor;
                    int rangoMayor;
                    int apuestaInicial;
                    String nombre;

                    cantidadCarta = 2;
                    rangoMenor = 2;
                    rangoMayor = 14;

                    System.out.println("Ingrese su Nombre");
                    nombre = unScanner.nextLine();
                    System.out.println("Ingrese su apuesta inicial");
                    apuestaInicial = unScanner.nextInt();

                    if (0 < apuestaInicial) {//verifica que la apuesta no se menor a 0 con una condicion
                        espacios();
                        while (0 < apuestaInicial) { //verifica que la apuesta no sea menor a 0 repitiendo un ciclo
                            int guardarCartas[] = new int[cantidadCarta];//arreglo donde guardamos los numeros aleatorios
                            System.out.println("");

                            System.out.println("Jugador: " + nombre);
                            System.out.println("Dinero: " + apuestaInicial);
                            for (int i = 1; i <= cantidadCarta; i++) {//un contador que sierver para generar el indice donde guardar el valor de las cartas que se desean
                                int valorCarta = (int) (Math.random() * (rangoMayor - rangoMenor) + rangoMenor);//random para generear un numero aleatorio entre un rango determinado
                                guardarCartas[i - 1] = valorCarta;//guardar carta en el indice dado por el contador menos 1
                                System.out.println("La carta " + i);
                                System.out.println(+guardarCartas[i - 1]);
                            }
                            int apuesta;
                            System.out.println("Ingrese su apuesta ");
                            apuesta = unoScanner.nextInt();//pide al usario su apuesta
                            if (apuesta <= apuestaInicial) {//verifica que el usuario no halla ingresado un valor mayor a su dinero
                                int cartaResultado = (int) (Math.random() * (rangoMayor - rangoMenor) + rangoMenor);
                                System.out.println("Tu carta es " + cartaResultado);
                                if (cartaResultado <= guardarCartas[0]) {
                                    if (guardarCartas[1] <= cartaResultado) {
                                        System.out.println("Ganaste");
                                        apuestaInicial = apuestaInicial + apuesta;
                                        System.out.println("Tu dinero es " + apuestaInicial);
                                    } else {
                                        System.out.println("Has Perdido");
                                        apuestaInicial = apuestaInicial - apuesta;
                                        System.out.println("Tu dinero es " + apuestaInicial);
                                    }
                                } else {
                                    System.out.println("Has Perdido");
                                    apuestaInicial = apuestaInicial - apuesta;
                                    System.out.println("Tu dinero es " + apuestaInicial);
                                }
                            } else {
                                System.out.println("No pueddes hacer esta apuesta, no tienes esa cantidad de dinero");
                            }
                        }
                    }
                    break;
                case 2:
                    regresar = true; //aqui damos como valor verdadero y termina con while
                    break;
                default:
                    System.out.println("Vuelve a elegir");
            }
        }
    }

    private static void hanoi() {
        boolean regresar = false;
        int segundaOpccion;
        Scanner unoScanner = new Scanner(System.in);
        while (!regresar) {
            System.out.println("");
            System.out.println("");
            System.out.println("1.Jugar");
            System.out.println("2.Regresar al menu");

            segundaOpccion = unoScanner.nextInt();

            switch (segundaOpccion) {
                case 1:
                    espacios();
                    System.out.println("Bienvenido al juego de la torre de hanoi");
                    Scanner dosScanner = new Scanner(System.in);

                    int cantidadDiscos;
                    int primeraTorre;
                    int segundaTorre;
                    int terceraTorre;
                    int contadorDeMovimientos;

                    primeraTorre = 1;
                    segundaTorre = 2;
                    terceraTorre = 3;

                    System.out.println("Cuantos discos desea usar");
                    cantidadDiscos = dosScanner.nextInt();

                    System.out.println("Numero de Discos " + cantidadDiscos);
                    System.out.println("Bienvenido al juego del ahorcado");
                    break;
                case 2:
                    regresar = true;
                    break;
                default:
                    System.out.println("Vuelve a elegir");
            }
        }
    }

    private static void descripcion() {
        boolean regresar = false;
        int segundaOpccion;
        Scanner unoScanner = new Scanner(System.in);
        while (!regresar) {
            System.out.println("");
            System.out.println("");
            System.out.println("1.Ver la descripcciòn");
            System.out.println("2.Regresar al menu");

            segundaOpccion = unoScanner.nextInt();

            switch (segundaOpccion) {
                case 1:
                    espacios();
                    System.out.println("Bienvenido te presentamos la descripciòn de cada juego");
                    break;
                case 2:
                    regresar = true;
                    break;
                default:
                    System.out.println("Vuelve a elegir");
            }
        }
    }

    private static void espacios() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}

