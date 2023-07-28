/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Spetrone
 */
public class calculadoraGrafica {
    
    private double base;
    private double altura;
    private double radio;
    private double apotema;
    private double diagoMayor;
    private double diagoMenor;

    public calculadoraGrafica() {
    }

    public calculadoraGrafica(double base, double altura, double radio, double apotema, double diagoMayor, double diagoMenor) {
        this.base = base;
        this.altura = altura;
        this.radio = radio;
        this.apotema = apotema;
        this.diagoMayor = diagoMayor;
        this.diagoMenor = diagoMenor;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getDiagoMayor() {
        return diagoMayor;
    }

    public void setDiagoMayor(double diagoMayor) {
        this.diagoMayor = diagoMayor;
    }

    public double getDiagoMenor() {
        return diagoMenor;
    }

    public void setDiagoMenor(double diagoMenor) {
        this.diagoMenor = diagoMenor;
    }

    @Override
    public String toString() {
        return "calculadoraGrafica{" + "base=" + base + ", altura=" + altura + ", radio=" + radio + ", apotema=" + apotema + ", diagoMayor=" + diagoMayor + ", diagoMenor=" + diagoMenor + '}';
    }
    
    
}
