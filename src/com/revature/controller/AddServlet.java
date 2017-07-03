package com.revature.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.BooksDAO;
import com.revature.model.Book;


@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String BookName=request.getParameter("bookname");
		String AuthorName=request.getParameter("authorname");
		int Price = Integer.parseInt(request.getParameter("price"));
		
		Book book = new Book();

		book.setBookName(BookName);
		book.setAuthorName(AuthorName);
		book.setPrice(Price);
		

		BooksDAO dao = new BooksDAO();
		try {
			dao.add(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

	
	

}
