package com.revature.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.BooksDAO;
import com.revature.model.Book;


@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		BooksDAO dao=new BooksDAO();
		
		List<Book> books;
		try {
			books = dao.findAll();
			if (books.size()>0){
				RequestDispatcher rd= request.getRequestDispatcher("list.jsp");
				request.setAttribute("books", books);
				rd.forward(request,response);					
			}
			else{
				response.sendRedirect("failure.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

	
	}	


