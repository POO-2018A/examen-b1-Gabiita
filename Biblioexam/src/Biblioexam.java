import java.util.Scanner;


public class Biblioexam {


    public static void main (String [] args){

            Scanner scan = new Scanner(System.in);
            int opcion=0;
            int auxiliar=0;
            Autorexam.contador2=0;
            Autorexam [] ListaAutor=new Autorexam[10];
            Libroexam [] libro= new Libroexam[10];
            int [] Favoritos = new int [10];

            do{
                System.out.println("##BIENVENIDO A SU BIBLIOTECA##");
                System.out.println("1.-INGRESAR UN LIBRO");
                System.out.println("2.-LISTA DE FAVORITOS");
                System.out.println("3.-LIBROS POR AUTOR");
                System.out.println("4.-Salir");

                opcion=scan.nextInt();

                switch(opcion){
                    case 1:

                        if(Autorexam.contador<=10){
                            System.out.println("Ingresar el libro: " + (Autorexam.contador+1));
                            scan.nextLine();
                            System.out.println("Nombre del Autor: ");
                            String nombreAutor=scan.nextLine();
                            System.out.println("Nombre del pais: ");
                            String nombrePais=scan.nextLine();


                            System.out.println("##DATOS DE LOS LIBROS##");
                            System.out.println("Titulo del libro: ");
                            String nombreLibro=scan.nextLine();
                            System.out.println("Anio de publicacion: ");
                            int anioLibro=scan.nextInt();
                            System.out.println("Es su libro favorito?");
                            scan.nextLine();
                            String libroFavorito=scan.nextLine();

                            if(libroFavorito.equals("si")|| libroFavorito.equals("SI")|| libroFavorito.equals("Si")){
                                System.out.println("Hecho!");
                                Favoritos[auxiliar]=Autorexam.contador;
                                auxiliar++;
                            }

                            libro[Autorexam.contador]=new Libroexam(nombreLibro,anioLibro);
                            ListaAutor[Autorexam.contador]= new Autorexam(nombreAutor,nombrePais,libro);

                            Autorexam.contador++;
                        }
                        break;

                    case 2:
                        System.out.println("##LISTA DE FAVORITOS##");
                        for(int i=0; i<auxiliar;i++){
                            System.out.println(ListaAutor[Favoritos[i]]);
                        }
                        break;

                    case 3:
                        System.out.println("##LIBROS POR AUTOR##");
                        for(int i=0; i<Autorexam.contador; i++){
                            System.out.println(ListaAutor[i]);
                            Autorexam.contador2++;
                        }
                        break;

                    case 4:
                        System.out.println("ADIOS");
                        break;

                    default:
                        System.out.println("INGRESA UNA OPCION CORRECTA");
                            break;

                }

            }while(opcion!=4);

    }
}
