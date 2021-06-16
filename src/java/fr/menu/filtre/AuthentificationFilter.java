/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.menu.filtre;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author stag
 */
public class AuthentificationFilter implements Filter {
    

    @Override
    //méthode callback, appelée lors de la construction de cet objet par le serveur d'applications.
    public void init(FilterConfig fConfig) throws ServletException {

    }
    
    //cette méthode est appelée sur requête HTTP, au lieu de l'appel d'une servlet sur lequel ce filtre est déclaré. La propagation de la requête au filtre suivant, ou à la servlet est faite en invoquant filterChain.doFilter(request, response).

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String uri = req.getRequestURI(); //récupère l'URI de la requête

        HttpSession session = req.getSession(true);

        // le filtre vérifie si la session existe, si l'adresse n'est pas en html ou si l'uri se termine par LoginServlet sinon redirection
        if (session.isNew() && !(uri.endsWith("html") || uri.endsWith("LoginServlet"))) {
            res.sendRedirect("/AppliEuro2021Thierry/"); // redirection vers la page d'accueil
        } else {
            // autorisation d'accès à l'url
            chain.doFilter(request, response);
    }

    }

    @Override
    public void destroy() {
        //close any resources here
    }
}
