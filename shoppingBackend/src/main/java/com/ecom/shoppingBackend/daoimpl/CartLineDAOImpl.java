package com.ecom.shoppingBackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.SessionFactoryUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecom.shoppingBackend.dao.CartLineDAO;
import com.ecom.shoppingBackend.dto.Cart;
import com.ecom.shoppingBackend.dto.CartLine;
import com.ecom.shoppingBackend.dto.OrderDetail;



@Repository("cartLineDAO")
@Transactional
public class CartLineDAOImpl implements CartLineDAO {

	@Autowired
	private SessionFactoryUtils sessionFactory;
	
	public CartLine getByCartAndProduct(int cartId, int productId) {
		String query = "FROM CartLine WHERE cartId = :cartId AND product.id = :productId";
		try {
			
			return ((SessionFactory) sessionFactory).getCurrentSession()
									.createQuery(query,CartLine.class)
										.setParameter("cartId", cartId)
										.setParameter("productId", productId)
											.getSingleResult();
			
		}catch(Exception ex) {
			return null;	
		}
		
	}

	public boolean add(CartLine cartLine) {
		try {
			((SessionFactory) sessionFactory).getCurrentSession().persist(cartLine);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public boolean update(CartLine cartLine) {
		try {
			((SessionFactory) sessionFactory).getCurrentSession().update(cartLine);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public boolean remove(CartLine cartLine) {	
		try {			
			((SessionFactory) sessionFactory).getCurrentSession().delete(cartLine);
			return true;
		}catch(Exception ex) {
			return false;
		}		
	}


	public List<CartLine> list(int cartId) {
		String query = "FROM CartLine WHERE cartId = :cartId";
		return ((SessionFactory) sessionFactory).getCurrentSession()
								.createQuery(query, CartLine.class)
									.setParameter("cartId", cartId)
										.getResultList();		
	}

	public CartLine get(int id) {		
		return ((SessionFactory) sessionFactory).getCurrentSession().get(CartLine.class, Integer.valueOf(id));
	}

	public boolean updateCart(Cart cart) {
		try {			
			((SessionFactory) sessionFactory).getCurrentSession().update(cart);			
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}

	public List<CartLine> listAvailable(int cartId) {
		String query = "FROM CartLine WHERE cartId = :cartId AND available = :available";
		return ((SessionFactory) sessionFactory).getCurrentSession()
								.createQuery(query, CartLine.class)
									.setParameter("cartId", cartId)
									.setParameter("available", true)
										.getResultList();
	}

	public boolean addOrderDetail(OrderDetail orderDetail) {
		try {			
			((SessionFactory) sessionFactory).getCurrentSession().persist(orderDetail);			
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}
		
}
