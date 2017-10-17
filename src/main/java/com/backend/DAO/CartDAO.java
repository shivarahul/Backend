package com.backend.DAO;

import com.backend.model.Cart;

public interface CartDAO {
	public boolean createCart(Cart cart);
	public boolean deleteCart(int id);
	public boolean getCart(int id);
	public boolean updateCart(Cart cart);
	

}
