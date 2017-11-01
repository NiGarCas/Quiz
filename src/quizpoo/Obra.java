/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizpoo;

/**
 *
 * @author Estudiante
 */
public class Obra {
    private String nombre;
    private String estilo;
    private String tecnica;
    private double valor;

    public Obra(String nombre, String estilo, String tecnica, double valor) {
        this.nombre = nombre;
        this.estilo = estilo;
        this.tecnica = tecnica;
        this.valor = valor;
    }

    public double getValor() {
        return valor*1.02;
    }
    
    public String mostrarDatos(){
        return ("NOMBRE:" + this.nombre + "," + "ESTILO:" + this.estilo + "," + "TECNICA:" + this.tecnica);
    }
}
