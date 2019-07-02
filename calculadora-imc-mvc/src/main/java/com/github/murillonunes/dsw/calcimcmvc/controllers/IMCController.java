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

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Float imc;
        Float altura;
        Float massa;

        altura = Float.valueOf(request.getParameter("altura"));
        massa = Float.valueOf(request.getParameter("massa"));

        IMCModel imcModel = new IMCModel(altura, massa);

        imc = imcModel.getIMC();

        request.setAttribute("resultado", imc);

        request.getRequestDispatcher("/calculoMvc.jsp").forward(request, response);

    }

}
