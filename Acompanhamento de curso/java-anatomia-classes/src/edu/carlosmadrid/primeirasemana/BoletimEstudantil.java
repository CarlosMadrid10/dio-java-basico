package edu.carlosmadrid.primeirasemana;

//Classe
public class BoletimEstudantil {

    // Métodos
    public static void main(String[] args) {

        // Fluxos
        int mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            //Ação
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }

}
