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
public class WebGallery {
    private ArrayList<Artista> artistas;
    private ArrayList<Comprador> compradores;

    public WebGallery() {
        this.artistas = new ArrayList();
        this.compradores = new ArrayList();
        
    }

    
    public boolean agregarArtista(Artista artista){
        return this.artistas.add(artista);
    }
    
    public double calcularValorTotal (){
        double vt = 0;
        for (int i = 0; i<this.artistas.size();i++){
            vt = vt + this.artistas.get(i).calcularValorObras();
        }
        return vt;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }
}
