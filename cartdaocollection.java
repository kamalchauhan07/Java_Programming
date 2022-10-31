package com.cognizant.truyum.dao;

import java.util.ArrayList;

import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImplTest {

	public static void main(String[] args) 
	{
		CartDaoCollectionImplTest cart=new CartDaoCollectionImplTest();
		try {
			cart.testAddCartItem();
			cart.testGetAllCartItems();
			cart.testRemoveCartItem();
			} 
		catch (CartEmptyException e) 
		{
			System.out.println(e);
		}
	}

	void testAddCartItem() throws CartEmptyException
	{
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.addCartItem(1,1);
		cartDao.getAllCartItems(1);
		ArrayList<MenuItem> menuItemList=cartDao.getAllCartItems(1);
		for(MenuItem x:menuItemList)
		{
			System.out.println(x);
		}
	}
	
	void testGetAllCartItems() throws CartEmptyException
	{
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.getAllCartItems(1);
		ArrayList<MenuItem> menuItemList=cartDao.getAllCartItems(1);
		for(MenuItem x:menuItemList)
		{
			System.out.println(x);
		}
		

	}
	
	void testRemoveCartItem() throws CartEmptyException
	{
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.removeCartItem(1,1);
		cartDao.getAllCartItems(1);
		ArrayList<MenuItem> menuItemList=cartDao.getAllCartItems(1);
		for(MenuItem x:menuItemList)
		{
			System.out.println(x);
		}
	}
	
	void testRemoveCartItem() throws CartEmptyException
	{
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.removeCartItem(1,1);
		cartDao.getAllCartItems(1);
		ArrayList<MenuItem> menuItemList=cartDao.getAllCartItems(1);
		for(MenuItem x:menuItemList)
		{
			System.out.println(x);
		}
	}

}
