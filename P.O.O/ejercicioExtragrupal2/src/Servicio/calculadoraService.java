/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.calculadoraGrafica;
import java.util.Scanner;

/**
 *
 * @author Spetrone
 */
public class calculadoraService {
    
    public calculadoraGrafica crearCuadrado(){
        Scanner leer = new Scanner(System.in);
        calculadoraGrafica cuadrado = new calculadoraGrafica();
        
        System.out.println("Ingrese valor del lado: ");
        cuadrado.setAltura(leer.nextDouble());
        return cuadrado;
    }
    
     public calculadoraGrafica crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        calculadoraGrafica rectangulo = new calculadoraGrafica();
        
        System.out.println("Ingrese valor de la altura: ");
        rectangulo.setAltura(leer.nextDouble());
         System.out.println("Ingrese valor de la base: ");
        rectangulo.setBase(leer.nextDouble());
        return rectangulo;
    }
     
      public calculadoraGrafica crearTriangulo(){
        Scanner leer = new Scanner(System.in);
        calculadoraGrafica triangulo = new calculadoraGrafica();
        
        System.out.println("Ingrese valor de la altura: ");
        triangulo.setAltura(leer.nextDouble());
        System.out.println("Ingrese valor de la base: ");
        triangulo.setBase(leer.nextDouble());
        return triangulo;
    }
      
        public calculadoraGrafica crearCirculo(){
        Scanner leer = new Scanner(System.in);
        calculadoraGrafica circulo = new calculadoraGrafica();
        
        System.out.println("Ingrese valor del radio: ");
        circulo.setRadio(leer.nextDouble());
        return circulo;
    }
       
        public calculadoraGrafica crearHexagono(){
        Scanner leer = new Scanner(System.in);
        calculadoraGrafica hexagono = new calculadoraGrafica();
        
        System.out.println("Ingrese valor del lado: ");
        hexagono.setAltura(leer.nextDouble());
        return hexagono;
    }
        
         public calculadoraGrafica crearPentagono(){
        Scanner leer = new Scanner(System.in);
        calculadoraGrafica pentagono = new calculadoraGrafica();
        
        System.out.println("Ingrese valor del lado: ");
        pentagono.setAltura(leer.nextDouble());
        return pentagono;
    }
         
          public calculadoraGrafica crearRombo(){
        Scanner leer = new Scanner(System.in);
        calculadoraGrafica rombo = new calculadoraGrafica();
        
        System.out.println("Ingrese valor de la diagonal mayor: ");
        rombo.setDiagoMayor(leer.nextDouble());
        System.out.println("Ingrese valor de la diagonal menor: ");
        rombo.setDiagoMenor(leer.nextDouble());
        return rombo;
    }
          
          public double calcularAC(calculadoraGrafica cuadrado){
              double area = Math.pow(cuadrado.getAltura(), 2);
              return area;
           }
          
          public double calcularAR(calculadoraGrafica rectangulo){
              double area = rectangulo.getAltura() * rectangulo.getBase();
              return area;
           }
          
          public double calcularAT(calculadoraGrafica triangulo){
              double area = triangulo.getAltura() * triangulo.getBase() /2;
              return area;
           }
          
          public double calcularACr(calculadoraGrafica circulo){
              double area = Math.pow(circulo.getRadio(), 2) * Math.PI;
              return area;
           }
          
          public double calcularAH(calculadoraGrafica hexagono){
              double area = calcularPH(hexagono) * 0.87 * hexagono.getAltura()/2;
              return area;
           }
          
          public double calcularAP(calculadoraGrafica pentagono){
              double area = calcularPH(pentagono) * pentagono.getAltura() * 0.69/2;
              return area;
           }
          
          public double calcularARo(calculadoraGrafica rombo){
              double area = rombo.getDiagoMayor() * rombo.getDiagoMenor() /2;
              return area;
           }
          
          public double calcularPC(calculadoraGrafica cuadrado){
              double perimetro = cuadrado.getAltura() * 4;
              return perimetro;
           }
          
          public double calcularPR(calculadoraGrafica rectangulo){
              double perimetro = (rectangulo.getAltura() * 2) + (rectangulo.getBase()*2);
              return perimetro;
           }
          
          public double calcularPT(calculadoraGrafica triangulo){
              double perimetro = triangulo.getAltura() * 3;
              return perimetro;
           }
          
          public double calcularPCr(calculadoraGrafica circulo){
              double perimetro = (2 * Math.PI) * circulo.getRadio();
              return perimetro;
           }
          
          public double calcularPH(calculadoraGrafica hexagono){
              double perimetro = hexagono.getAltura() * 6;
              return perimetro;
           }
          
          public double calcularPP(calculadoraGrafica pentagono){
              double perimetro = pentagono.getAltura() * 5;
              return perimetro;
           }
          
          public double calcularPRo(calculadoraGrafica rombo){
              double perimetro = rombo.getAltura() * 4;
              return perimetro;
           }
}
