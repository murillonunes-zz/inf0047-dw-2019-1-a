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
        Float imc = massa / (altura * altura);

        return imc;
    }

}
