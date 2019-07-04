/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.murillonunes.dsw.calcimcmvc.model;

public class IMCModel {

    private float massa;

    private float altura;

    public IMCModel(float massa, float altura) {
        this.massa = massa;
        this.altura = altura;
    }

    public Float getIMC() {
        Float alturaCm = (altura) / 100;
        Float imc = massa / (alturaCm * alturaCm);

        return imc;
    }

    public String getFaixaDoIMC() {
        Float imc = getIMC();

        if (imc < 17) {
            return "Muito abaixo do peso";
        } else if (imc >= 17 && imc <= 18.49) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.99) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.99) {
            return "Acima do peso";
        } else if (imc >= 30 && imc <= 34.99) {
            return "Obesidade I";
        } else if (imc >= 35 && imc <= 39.99) {
            return "Obesidade II (severa)";
        } else {
            return "Obesidade III (mórbida)";
        }
    }

}
