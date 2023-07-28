/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextragrupal2;
import entidad.calculadoraGrafica;
import Servicio.calculadoraService;
import java.util.Scanner;
/**
 *
 * @author Spetrone
 */
public class EjercicioExtragrupal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        calculadoraService cs = new calculadoraService();
        int opcion;
        
        System.out.println("MENU");
        System.out.println("1.Cuadrado");
        System.out.println("2.Cuadrado");
        opcion = leer.nextInt();
        switch(opcion){
            case 1:
                calculadoraGrafica c1 = cs.crearCuadrado();
                double A = cs.calcularAC(c1);
                double P = cs.calcularPC(c1);
                System.out.println(A +"  "+ P);
                break;
            case 2:
                calculadoraGrafica r1 = cs.crearRectangulo();
                double AR = cs.calcularAR(r1);
                double PR = cs.calcularPR(r1);
                System.out.println(AR +"  "+ PR);
                break;
            case 3:
                calculadoraGrafica t1 = cs.crearTriangulo();
                double AT = cs.calcularAT(t1);
                double PT = cs.calcularPT(t1);
                System.out.println(AT +"  "+ PT);
                break;
            case 4:
                calculadoraGrafica cr1 = cs.crearCirculo();
                double ACr = cs.calcularACr(cr1);
                double PCr = cs.calcularPCr(cr1);
                System.out.println(ACr +"  "+ PCr);
                break;
            case 5:
                calculadoraGrafica h1 = cs.crearHexagono();
                double AH = cs.calcularAH(h1);
                double PH = cs.calcularPH(h1);
                System.out.println(AH +"  "+ PH);
                break;
            case 6:
                calculadoraGrafica p1 = cs.crearPentagono();
                double AP = cs.calcularAP(p1);
                double PP = cs.calcularPP(p1);
                System.out.println(AP +"  "+ PP);
                break;
            case 7:
                calculadoraGrafica ro1 = cs.crearRombo();
                double ARo = cs.calcularARo(ro1);
                double PRo = cs.calcularPRo(ro1);
                System.out.println(ARo +"  "+ PRo);
                break;
                
                
        }
        
    }
    
}
