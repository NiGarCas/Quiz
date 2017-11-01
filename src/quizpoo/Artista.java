/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizpoo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Artista extends Usuario{
    private int numObras;
    private ArrayList<Obra> obras;

    public Artista(int numObras, String nombre) {
        super(nombre);
        this.numObras = 0;
        this.obras = new ArrayList();
    }

    public int getNumObras() {
        return numObras;
    }
    
    public boolean agregarObra(Obra obra){
        numObras ++;
        return this.obras.add(obra);
    }
    
    public String[] listarObras(){
        String [] a = new String[this.numObras];
        for (int i = 0; i<this.numObras;i++){
            a[i] = this.obras.get(i).mostrarDatos();
        }
        return a;
    }
    
    public double calcularValorObras (){
        double vt = 0;
        for (int i = 0; i<this.numObras;i++){
            vt = vt + this.obras.get(i).getValor();
        }
        return vt;
    }
}
