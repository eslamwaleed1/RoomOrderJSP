package com.builder.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.builder.*;
/**
 * Servlet implementation class PizzaOrderServlet
 */
@WebServlet("/orderRoom")
public class RoomOrderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomOrderServlet() {
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
        String numberOfBeds = request.getParameter("numberOfBeds");
        String view = request.getParameter("view");
        String type = request.getParameter("type");

        RoomBuilder builder = new ConcreteRoomBuilder();
        builder.setNumberOfBeds(numberOfBeds);

        Room room = builder.build();

        // Forward to a JSP page to display the room order summary
        request.setAttribute("room", room);
        RequestDispatcher dispatcher = request.getRequestDispatcher("roomSummary.jsp");
        dispatcher.forward(request, response);
    }

}
