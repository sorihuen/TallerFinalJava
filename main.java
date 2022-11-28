
import java.util.Scanner;
import javax.swing.JOptionPane;

public class main {
  private static Scanner sc = new Scanner(System.in);
  static String numero1;
  static int operacion;
  static String numero2;
  static float resultado = 0;
  static String numero;
  static int control = 0;

  public static void main(String[] args) {

    clearScreen();

    System.out.println("***** Calculadora ******");
    System.out.println("");
    do {

      menuCalculadora();
      operacion = capturaopcion();

      if (operacion != 6) {
        System.out.print("Ingrese el primer(1) numero : ");
        numero1 = sc.nextLine();

        System.out.print("Ingrese el segundo(2) numero : ");
        numero2 = sc.nextLine();

      }
      switch (operacion) {
        case 1:
          suma(numero1, numero2);

          break;
        case 2:
          resta(numero1, numero2);

          break;
        case 3:
          multiplicacion(numero1, numero2);

          break;
        case 4:
          if (Integer.parseInt(numero2) == 0) {
            System.out.println("");
            System.out.println("*** No se puede dividir por (0)cero ***");
            System.out.println("");

          } else {
            division(numero1, numero2);

          }
        case 5:
          if (Integer.parseInt(numero2) == 0) {
            System.out.println("");
            System.out.println("*** Numero Cero(0) no valido ***");
            System.out.println("");

          } else {
            moduloDivision(numero1, numero2);

          }

          break;

        case 6:
          System.out.println("========Salir del sistema =========");
          break;

        default:
          System.out.println("*** Numero no valido ***");
          System.out.println("");
          break;
      }

    } while (operacion != 6);

  }

  private static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  // Funcion Menu
  public static void menuCalculadora() {
    System.out.println("=====================================");
    System.out.println("Seleccione un numero de operacion");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("5. Modulo de la Division");
    System.out.println("6. Salir");
    System.out.println("=====================================");

  }

  private static int capturaopcion() {
    return Integer.parseInt(sc.nextLine());

  }

  public static void valorInvalido() {
    JOptionPane.showMessageDialog(null, "Ingresaste valor invalido");
  }

  // --------- Operaciones: SUMA------------
  public static void suma(String num1, String num2) {
    try {
      resultado = Float.parseFloat(num1) + Float.parseFloat(num2);
      System.out.println("El resultado es : " + resultado);

    } catch (Exception e) {
      valorInvalido();
    }
    System.out.println("continuar la operacion marque 1 sino 0");
    int oper = capturaopcion();
    if (oper == 1) {
      do{
      
        menuCalculadora();
        operacion = capturaopcion();
        switch (operacion) {
          case 1:

            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            resultado = resultado + Float.parseFloat(numero);
            System.out.println("resultado : " + resultado);
          

          break;
          case 2:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            resultado = resultado - Float.parseFloat(numero);
            System.out.println("resultado : " + resultado);
         
          break;
          case 3:
            System.out.print("Ingrese un numero : ");
           numero = sc.nextLine();
           resultado = resultado * Float.parseFloat(numero);
           System.out.println("resultado : " + resultado);
             
          break;
          case 4:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
           if (Integer.parseInt(numero)==0) {
              System.out.println("");
              System.out.println("*** No se puede dividir por (0)cero ***");
              System.out.println("");

            } else {
              resultado = resultado / Float.parseFloat(numero);
              System.out.println("resultado : " + resultado);
           
            }
          break;
          case 5:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
           if (Integer.parseInt(numero)==0) {
              System.out.println("");
              System.out.println("*** Numero Cero(0) no valido ***");
              System.out.println("");

            } else {
               resultado = resultado % Float.parseFloat(numero);
              System.out.println("resultado : " + resultado);
        
            }
          break;
          case 6:
            System.out.println("***** Salir del sistema *****");
          break;

          default:
            System.out.println("Opcion invalida");
          break;
        }
      } while (operacion != 6);

    } else {
      System.out.println("volver al menu /Empezar nueva operacion");
      oper = 0;

    }

  }

  // ----------- RESTA----------------------
  public static void resta(String num1, String num2) {
    try {
      resultado = Float.parseFloat(num1) - Float.parseFloat(num2);
      System.out.println("El resultado es : " + resultado);

    } catch (Exception e) {
      valorInvalido();
    }
    System.out.println("continuar la operacion marque 1 sino 0");
    int oper = capturaopcion();
    if (oper == 1) {
      do {
        menuCalculadora();
        operacion = capturaopcion();
        switch (operacion) {
          case 1:

            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            resultado = resultado + Float.parseFloat(numero);

            System.out.println("resultado : " + resultado);

            break;
          case 2:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            resultado = resultado - Float.parseFloat(numero);

            System.out.println("resultado : " + resultado);

            break;
          case 3:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            resultado = resultado * Float.parseFloat(numero);
            System.out.println("resultado : " + resultado);

            break;
          case 4:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            if (Integer.parseInt(numero) == 0) {
              System.out.println("");
              System.out.println("*** No se puede dividir por (0)cero ***");
              System.out.println("");

            } else {
              resultado = resultado / Float.parseFloat(numero);
              System.out.println("resultado : " + resultado);

            }

            break;
          case 5:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            if (Integer.parseInt(numero) == 0) {
              System.out.println("");
              System.out.println("*** Numero Cero(0) no valido ***");
              System.out.println("");

            } else {
              resultado = resultado % Float.parseFloat(numero);
              System.out.println("resultado : " + resultado);

            }

            break;
          case 6:
            System.out.println("*** Salir del sistema *****");
            break;

          default:
            System.out.println("Opcion invalida");
            break;
        }
      } while (operacion != 6);

    } else {
      System.out.println("volver al menu /Empezar nueva operacion");

      oper = 0;

    }
  }

  // ------------MULTIPLICACION -------------------
  public static void multiplicacion(String num1, String num2) {
    try {
      resultado = Float.parseFloat(num1) * Float.parseFloat(num2);
      System.out.println("El resultado es : " + resultado);

    } catch (Exception e) {
      valorInvalido();
    }
    System.out.println("continuar la operacion marque 1 sino 0");
    int oper = capturaopcion();
    if (oper == 1) {
      do {
        menuCalculadora();
        operacion = capturaopcion();
        switch (operacion) {
          case 1:

            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            resultado = resultado + Float.parseFloat(numero);

            System.out.println("resultado : " + resultado);

            break;
          case 2:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            resultado = resultado - Float.parseFloat(numero);

            System.out.println("resultado : " + resultado);

            break;
          case 3:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            resultado = resultado * Float.parseFloat(numero);
            System.out.println("resultado : " + resultado);
            break;
          case 4:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            if (Integer.parseInt(numero) == 0) {
              System.out.println("");
              System.out.println("*** No se puede dividir por (0)cero ***");
              System.out.println("");

            } else {
              resultado = resultado / Float.parseFloat(numero);
              System.out.println("resultado : " + resultado);

            }

            break;
          case 5:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            if (Integer.parseInt(numero) == 0) {
              System.out.println("");
              System.out.println("*** Numero Cero(0) no valido ***");
              System.out.println("");

            } else {
              resultado = resultado % Float.parseFloat(numero);
              System.out.println("resultado : " + resultado);

            }
            break;
          case 6:
            System.out.println("**** Salir del sistema *****");
            break;
          default:
            System.out.println("Opcion Invalida");
            break;
        }
      } while (operacion != 6);

    } else {
      System.out.println("volver al menu /Empezar nueva operacion");

      oper = 0;

    }

  }

  // ---------------DIVISION--------------------------
  public static void division(String num1, String num2) {
    try {
      resultado = Float.parseFloat(num1) / Float.parseFloat(num2);
      System.out.println("El resultado es : " + resultado);

    } catch (Exception e) {
      valorInvalido();
    }
    System.out.println("continuar la operacion marque 1 sino 0");
    int oper = capturaopcion();
    if (oper == 1) {
      do {
        menuCalculadora();
        operacion = capturaopcion();
        switch (operacion) {
          case 1:

            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            resultado = resultado + Float.parseFloat(numero);

            System.out.println("resultado : " + resultado);

            break;
          case 2:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            resultado = resultado - Integer.parseInt(numero);

            System.out.println("resultado : " + resultado);

            break;
          case 3:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            resultado = resultado * Float.parseFloat(numero);

            System.out.println("resultado : " + resultado);

            break;
          case 4:

            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            if (Integer.parseInt(numero) == 0) {
              System.out.println("");
              System.out.println("*** No se puede dividir por (0)cero ***");
              System.out.println("");

            } else {
              resultado = resultado / Float.parseFloat(numero);
              System.out.println("resultado : " + resultado);

            }

            break;

          case 5:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            if (Integer.parseInt(numero) == 0) {
              System.out.println("");
              System.out.println("*** Numero Cero(0) no valido ***");
              System.out.println("");

            } else {
              resultado = resultado % Float.parseFloat(numero);
              System.out.println("resultado : " + resultado);

            }
            break;
          case 6:
            System.out.println("**** Salir del sistema *****");
            break;

          default:
            break;
        }
      } while (operacion != 6);

    } else {
      System.out.println("volver al menu /Empezar nueva operacion");

      oper = 0;

    }

  }

  // --------MODULO DE LA DIVISION ----------
  public static void moduloDivision(String num1, String num2) {
    try {
      resultado = Integer.parseInt(num1) % Integer.parseInt(num2);
      System.out.println("El resultado es : " + resultado);

    } catch (Exception e) {
      valorInvalido();
    }
    System.out.println("continuar la operacion marque 1 sino 0");
    int oper = capturaopcion();
    if (oper == 1) {
      do {
        menuCalculadora();
        operacion = capturaopcion();
        switch (operacion) {
          case 1:

            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            resultado = resultado + Integer.parseInt(numero);

            System.out.println("resultado : " + resultado);

            break;
          case 2:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            resultado = resultado - Integer.parseInt(numero);

            System.out.println("resultado : " + resultado);

            break;
          case 3:
            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            resultado = resultado * Integer.parseInt(numero);

            System.out.println("resultado : " + resultado);

            break;
          case 4:

            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            if (Integer.parseInt(numero) == 0) {
              System.out.println("");
              System.out.println("*** No se puede dividir por (0)cero ***");
              System.out.println("");

            } else {
              resultado = resultado / Integer.parseInt(numero);
              System.out.println("resultado : " + resultado);

            }

            break;
          case 5:

            System.out.print("Ingrese un numero : ");
            numero = sc.nextLine();
            if (Integer.parseInt(numero) == 0) {
              System.out.println("");
              System.out.println("*** Numero Cero(0) no valido ***");
              System.out.println("");

            } else {
              resultado = resultado % Integer.parseInt(numero);
              System.out.println("resultado : " + resultado);

            }

            break;
          case 6:
            System.out.println("***** Salir del sistema *****");
            break;

          default:
            System.out.println("Opcion invalida");
            break;
        }
      } while (operacion != 6);

    } else {
      System.out.println("volver al menu /Empezar nueva operacion");

      oper = 0;

    }

  }

}
