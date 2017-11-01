/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizpoo;

import java.io.File;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main (String[] args){
        Scanner entradaConsola = new Scanner (System.in);
        WebGallery wg = new WebGallery();
        try{
            File datos = new File("datos/datos.txt");
            Scanner x = new Scanner(datos); 
            x.useDelimiter(",");
            while(x.hasNext()){
                String nombre =x.next();
                int numObras = x.nextInt();
                Artista artista = new Artista (numObras, nombre);
                for (int i = 0; i < numObras; i++){
                    String nombreObra = x.next();
                    String estilo = x.next();
                    String tecnica = x.next();
                    double valor = x.nextDouble();
                    Obra obra = new Obra(nombreObra,estilo,tecnica,valor);
                    artista.agregarObra(obra);
                }
                wg.agregarArtista(artista);
            }
        }catch(Exception E){
            System.out.println("No se encontro archivo con el nombre seleccionado para cargar informacion");
        }
        int continuar = 0;
        do{
        System.out.println("Bienvenido a WebGallery");
        System.out.println("Ingrese el numero de la opcion que desea:");
        System.out.println(" ");
        System.out.println("1. Ver lista de Obras de un autor");
        System.out.println("2. Calcular el valor de todas las obras");
        System.out.println(" ");
        try{
            int opcion = entradaConsola.nextInt();
            if (opcion == 1){
                System.out.println("Ingrese el nombre del autor cuyas obras quiere revisar:");
                String autor = entradaConsola.next();
                for(int i=0; i< wg.getArtistas().size(); i++){
                    if(wg.getArtistas().get(i).equals(autor)){
                        System.out.println(wg.getArtistas().get(i).nombre);
                        for (int j=0;i<wg.getArtistas().get(i).getNumObras();j++){
                            System.out.println(wg.getArtistas().get(i).listarObras()[i]);
                        }
                    }
                }
            }else if(opcion == 2){
                System.out.println("Valor total de las obras:" + wg.calcularValorTotal());
            }else{
                System.out.println("Opcion no disponible");
            }
        }catch (Exception w){
            System.out.println("Opcion no disponible, intente nuevamente");
        }
        }while(continuar == 0);
    }
}
