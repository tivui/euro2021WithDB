/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.menu.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author stag
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    // Déclaration de variables finales
    private final String userID = "admin";
    private final String password = "123";
    private final String userName = "Thierry";


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        // Récupère les paramètres des inputs du formulaire
        String loginName = request.getParameter("login");
        String loginPwd = request.getParameter("pwd");
        
        
        // Vérification des identifiants 
        if (userID.equals(loginName) && password.equals(loginPwd)) {

            // Session , expiration au bout de 120 sec et déconnexion avec retour au menu au menu principal depuis le Servlet Logout
           
            HttpSession session = request.getSession(); // A ce point, le cookie JSESSIONID est créé, sa valeur est l'identifiant de la session
            session.setAttribute("userName", userName); // stockage de l'atttribut username dans la session
            session.setMaxInactiveInterval(120);

            // Cookie qui récupère le username
            Cookie userCookie = new Cookie("userLogin", loginName);
            userCookie.setMaxAge(1 * 10); //expiration du cookie au bout de 10S
            response.addCookie(userCookie); //le stocke pendant 10s

            // Client side redirect
            response.sendRedirect("menu");
        } else {

            // Server side redirect
            try (PrintWriter out = response.getWriter()) {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.html");
                out.println("<font color=red>Les informations fournies sont incorrectes (essayez "
                    + userID + "/" + password + ").</font>");
                rd.include(request, response);
            }
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}