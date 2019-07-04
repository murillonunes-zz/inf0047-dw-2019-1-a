/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.murillonunes.dsw.calcimcmvc.controllers;

import com.github.murillonunes.dsw.calcimcmvc.model.IMCModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/")
public class IMCController extends HttpServlet {

    protected void service(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String strAltura = request.getParameter("altura");
        String strMassa = request.getParameter("massa");
        String strIMC = "";
        String strFaixaDoIMC = "";
        String msgErro = "";
        boolean paramVazios, ocorrenciaDeErro;

        if (strAltura != null && strMassa != null) {
            paramVazios = false;
            try {
                float altura = Float.parseFloat(strAltura.replace(",", "."));
                float massa = Float.parseFloat(strMassa.replace(",", "."));

                IMCModel model = new IMCModel(massa, altura);
                float imc = model.getIMC();
                strIMC = String.valueOf(imc);
                strFaixaDoIMC = model.getFaixaDoIMC();
                ocorrenciaDeErro = false;
            } catch (Exception e) {
                ocorrenciaDeErro = true;
                msgErro = "Ocorreu um erro: os dados preenchidos são inválidos.";
            }
        } else {
            paramVazios = true;
            ocorrenciaDeErro = false;
        }

        // Adiciona a variável na requisição para o JSP trabalhar.
        request.setAttribute("imc", strIMC);
        request.setAttribute("faixaDoIMC", strFaixaDoIMC);
        request.setAttribute("ocorrenciaDeErro", ocorrenciaDeErro);
        request.setAttribute("msgErro", msgErro);
        request.setAttribute("paramVazios", paramVazios);

        // Redireciona requisição para o JSP.
        request.getRequestDispatcher("/imc.jsp").forward(request, response);

    }

}
