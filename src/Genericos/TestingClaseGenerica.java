/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Genericos;

/**
 * Clase que crea y utiliza objetos tipo CalseGenerica
 * @author Abraham
 */
public class TestingClaseGenerica {
    public static void main(String[] args){
    
        //Declarar un objeto de la clase genérica
        ClaseGenerica<String> objeto1;
        ClaseGenerica<Integer> objeto2;
        //Declara un obgeto de la clase generica tipo Canción
        ClaseGenerica<Canción> objeto3;
        
        //construir el objeto1
        objeto1 = new ClaseGenerica<>("Ginger");
        System.out.println("El contenido del objeto1 es: " + objeto1.getObjeto());
        System.out.println("El tipo de dato del objeto1 es: ");
        objeto1.getType();
        
        //Construir y usar el objeto2
        objeto2 = new ClaseGenerica<Integer>(100);
        System.out.println("El contenido del objeto 2 es: " + objeto2.getObjeto());
        objeto2.getType();
        
        //CONSTRUIR OBJETO TIPO CANCIÓN
        Canción unaCanción=new Canción("In the end","Link Park");
        objeto3=new ClaseGenerica<>(unaCanción);
        System.out.println("El contenido del objeto3 es: "+ objeto3.getObjeto());
        objeto3.getType();

    }

}