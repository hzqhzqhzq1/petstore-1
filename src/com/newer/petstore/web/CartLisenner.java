package com.newer.petstore.web;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.newer.petstore.domain.Cart;

/**
 * Application Lifecycle Listener implementation class CartLisenner
 *
 */
@WebListener
public class CartLisenner implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public CartLisenner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	Cart cart = new Cart();
    	arg0.getSession().setAttribute("CART", cart);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
