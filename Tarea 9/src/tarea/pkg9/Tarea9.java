
package tarea.pkg9;

import java.util.Scanner;

/**
 * @author Mariel loca papu pro
 */
public class Tarea9 {

    static int op;
    static String cpu;
    static String opi;
    
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu()
    {
        do{
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("¿Que te gustaria hacer?");
            System.out.println("1.¿Quieres entrar a la casa? \n2.¿Quieres jugar 'Piedra, Papel o Tijera'? \n3.Salir");
            opi= scanner.next();
            switch(opi)
                {
                    case "1":
                        Casa();
                        break;
                    case "2":
                        Juego();
                        break;
                    case "3":
                        System.out.println("Adios popo");
                        System.exit(1);
                        break;
                    default:
                        System.out.println("OPCION INVALIDA"); 
                        break;
                }
        }while(true);
    }
    
    public static void Casa()
    {
    System.out.println("-------------------------------------------------------------------------------------");
    System.out.println("Bienvenido a casa, ¿a donde quieres ir?");
    System.out.println("1.Sala \n2.Salir de la casa");
     opi= scanner.next();
     if(opi.equals("1"))
     {
     Sala();
     }
     else if(opi.equals("2"))
     {
     System.out.println("Adios popo");
     menu();
     }
     else
     {
     System.out.println("OPCION INVALIDA"); 
     Casa(); 
     }
    
    }
    
    public static void Sala()
    {
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("¿A donde quieres ir?");
        System.out.println("1.Cocina \n2.Habitacion 2do piso \n3.Patio \n4.Regresar");
        opi= scanner.next();

        if(opi.equals("1"))
        {
           Cocina();
        }
        else if(opi.equals("2"))
        {
           Habitacion();
        }
        else if(opi.equals("3"))
        {
           Patio();
        }
          else if(opi.equals("4"))
        {
           Casa();
        }
        else
        {
           System.out.println("OPCION INVALIDA"); 
           Sala(); 
        }
    }
    
    public static void Cocina()
    {
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("¿Quieres regresar?");
        System.out.println("1.Si \n2.no");
        opi= scanner.next();

        if(opi.equals("1"))
        {
           Sala();
        }
        else if(opi.equals("2"))
        {
           System.out.println("¿Por qu esigues aqui si no hay nada :v?");
           Cocina();
        }
        else
        {
           System.out.println("OPCION INVALIDA"); 
           Cocina(); 
        }
    }
    
    public static void Habitacion()
    {
         System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("¿A donde quieres ir?");
        System.out.println("1.Saltar por la ventana \n2.Sala");
        opi= scanner.next();

        if(opi.equals("1"))
        {
           System.out.println("Ya te moriste alv");
           System.exit(0);
        }
        else if(opi.equals("2"))
        {
           Sala();
        }
        else
        {
           System.out.println("OPCION INVALIDA"); 
           Habitacion(); 
        }
    }
    
    public static void Patio()
    {
        System.out.println("Rayos! tiene llave, no puedes salir :c "); 
        Sala();
    }
 
    public static void Juego()
    {
        do{
    System.out.println("----------------------O [] 8<---------------------------------------------------------------");
    System.out.println("Bienvenido al juego de 'Piedra Papel Tijera' \n ¿Quieres Jugar?");
    System.out.println("1.Si \n2.No ");
    op=scanner.nextInt();
    
     if(op == 1)
        {
           Empezar();
        }
        else if(op == 2)
        {
           menu();
        }
        else
        {
           System.out.println("OPCION INVALIDA"); 
           Juego(); 
        }
    
        }while(true);
    }
    
    public static void Empezar()
    {
     System.out.println("---------------------- O [] 8< ---------------------------------------------------------------");
     System.out.println("Elige sabiamente... \n1.Piedra \t2.Papel \t3.Tijera");
     opi=scanner.next();
     cpu = Double.toString(Math.ceil(Math.random()*3));
     
     
     if (opi.equals("1") )
     {
         System.out.print("O Piedra vs ");
         if(cpu.equals("1.0"))
         {                 
         System.out.print("Piedra O \n");
         System.out.print("Empate!!\n");
         Juego();
         }
         else if(cpu.equals("2.0"))
         {
              System.out.print("Papel [] \n");
         System.out.print("Has perdido!!\n");
         Juego();
         }
         else if(cpu.equals("3.0"))
         {
             System.out.print("Tijera >8 \n");
         System.out.print("Has ganado!!\n");
         Juego(); 
         }
         
     }
     if (opi.equals("2") )
     {
         System.out.print("[] Papel vs ");
         if(cpu.equals("1.0"))
         {
         System.out.print("Piedra O \n");
         System.out.print("Has ganado!!\n");
         Juego();
         }
         else if(cpu.equals("2.0"))
         {
             System.out.print("Papel [] \n");
         System.out.print("Empate!!\n");
         Juego();
         }
         else if(cpu.equals("3.0"))
         {
             System.out.print("Tijera >8 \n");
         System.out.print("Has perdido!!\n");
         Juego(); 
         }
         
     }
     if (opi.equals("3") )
     {
         System.out.print("8< Tijera vs ");
         if(cpu.equals("1.0"))
         {
             System.out.print("Piedra O \n");
         System.out.print("Has perdido!!\n");
         Juego();
         }
         else if(cpu.equals("2.0"))
         {
             System.out.print("Papel [] \n");
         System.out.print("Has ganado!!\n");
         Juego();
         }
         else if(cpu.equals("3.0"))
         {
             System.out.print("Tijera >8 \n");
         System.out.print("Empate!!\n");
         Juego(); 
         }
         
     }
    
    }
}

