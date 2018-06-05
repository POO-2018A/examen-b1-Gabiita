/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
//import .Autor;
import java.util.Scanner;
import autor.Autor;
import Libro;
/**
 *
 * @author ESFOT
 */
public class Biblioteca {

   
    static int contador=0;
    public static void main(String[] args) {
        
       
        
        Biblioteca biblioteca[] = new Biblioteca[10];
        Biblioteca favorito[]=new Biblioteca[10];
        String nombreAutor="";
        boolean nombreFavorito=false;
        int nombrePublicacion=0;
        String nombrePais="";
         String nombreTitulo="";
        
       Scanner scan = new Scanner (System.in);
       System.out.println("BIENVENIDO A SU BIBLIOTECA");
       System.out.println("ELIGE UNA OPCION: ");
       System.out.println("1.-Ingresar un nuevo libro");
       System.out.println("2.-Lista de libros favoritos");
       System.out.println("3.-Libros por autor");
       System.out.println("4.-Salir");
       int opcion=scan.nextInt();
      do {
       switch(opcion){ 
           
           case 1:   
           for (int i=0;i<biblioteca.length;i++){
           System.out.println("INGRESE LOS DATOS A SOLICITAR:");          
           System.out.println("Titulo del libro: ");
           scan.nextLine();
            nombreTitulo=scan.nextLine();
           System.out.println("Nombre del autor: ");
           nombreAutor=scan.nextLine();
           System.out.println("Pais de nacimiento del autor: ");
           nombrePais=scan.nextLine();
           System.out.println("Año de publicación del libro: ");
           nombrePublicacion=scan.nextInt();
           System.out.println("¿Es su libro Favorito?: ");
           System.out.println("Si:true o No:false ");    
           nombreFavorito=scan.nextBoolean();   
                       
               break;          
           case 2:
               
               for(int i=0; i<biblioteca.length; i++){
               Libro(nombreTitulo,nombreAutor,nombrePublicacion,nombreFavorito);
               }
              
               break;
               
           case 3:
               
               for(int i=0; i<biblioteca.length; i++){
               Autor(nombreAutor);
               }
           
               break;
           case 4: 
            System.out.println("SALIR");
       
               break;
               
           default:
               System.out.println("Ingrese una opcion correcta");
               break;
       
           }     
       }  
      }while(opcion!=4);
      }     
      }
      

   
    
    

