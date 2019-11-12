package br.usj.edu.ads.lpii;

import jdk.nashorn.internal.ir.IfNode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Operacao")
public class Operacao extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String valorDigitadoA = request.getParameter("a");
        String valorDigitadoB = request.getParameter("b");
        String operacao = request.getParameter("op");

        double a = Integer.valueOf(valorDigitadoA);
        double b = Integer.valueOf(valorDigitadoB);
        double resultado =0;

        if (operacao.equals("+")) {
            resultado = a+b;
        }

        if(operacao.equals("-")) {
            resultado = a-b;
        }

        if(operacao.equals("*")) {
            resultado = a*b;
        }

        if (operacao.equals("/")) {
            resultado = a/b;
        }

        PrintWriter saida = response.getWriter();
        saida.println("<html>");
        saida.println("<body>");
        saida.println("<h1>Resultado:</h1>");
        saida.println("<h2>");
        saida.println(valorDigitadoA);
        saida.println(operacao);
        saida.println(valorDigitadoB);
        saida.println(" =");
        saida.print(" "+resultado);
        saida.println("</h2>");
        saida.println("</body>");
        saida.println("</html>");



    }

     }
