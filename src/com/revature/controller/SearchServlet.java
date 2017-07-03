package com.revature.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.BooksDAO;
import com.revature.model.Book;


@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Name=request.getParameter("bookname");
		Book book =new Book();
		book.setBookName(Name);
		
		BooksDAO dao= new BooksDAO();
		List<Book> books;
		try {
			books = dao.findByName(book);
			if (books.size()>0){
				RequestDispatcher rd= request.getRequestDispatcher("viewbook.jsp");
				request.setAttribute("books", books);
				rd.forward(request,response);					
			}
			else{
				response.sendRedirect("failure.jsp");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
