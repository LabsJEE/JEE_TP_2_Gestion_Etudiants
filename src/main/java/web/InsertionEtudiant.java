package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertionEtudiant
 */
@WebServlet("/InsertionEtudiant")
public class InsertionEtudiant extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertionEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String nom = request.getParameter("nom");
	String prenom = request.getParameter("prenom");
        int cin = Integer.parseInt(request.getParameter("cin"));
        String sexe = request.getParameter("sexe");
	String specialite = request.getParameter("specialite");
        GestionEtudiants.addEtudiant(nom, prenom, cin, sexe, specialite);
	request.setAttribute("etudiants", GestionEtudiants.getEtudiants());
	request.getRequestDispatcher("affichage.jsp").forward(request, response);
    }
}