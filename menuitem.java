package com.cognizant.truyum.dao;

import com.cognizant.truyum.util.DateUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//import java.util.Date;


import com.cognizant.truyum.model.MenuItem;
//import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao 
{
	private static ArrayList<MenuItem> menuItemList;
	public MenuItemDaoCollectionImpl()
	{
		if(menuItemList == null)
		{
			try
			{
			ArrayList<MenuItem> menuItem = new ArrayList<>();
			MenuItem e1 = new MenuItem(1,"sandwich",99.0f,true,DateUtil.convertToDate("15/03/2017"),"Main Course",true);
			menuItem.add(e1);
			MenuItem e2 = new MenuItem(2,"Burger",129.0f,true,DateUtil.convertToDate("23/12/2017"),"Main Course",false);
			menuItem.add(e2);
			MenuItem e3 = new MenuItem(3,"Pizza",149.0f,true,DateUtil.convertToDate("21/08/2018"),"Main Course",false);
			menuItem.add(e3);
			MenuItem e4 = new MenuItem(4,"French Fries",57.0f,false,DateUtil.convertToDate("02/07/2017"),"Starter",true);
			menuItem.add(e4);
			MenuItem e5 = new MenuItem(5,"Chocolate Brownie",32.0f,true,DateUtil.convertToDate("02/11/2022"),"Dessert",true);
			menuItem.add(e5);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

	@Override
	public ArrayList<MenuItem> getMenuItemListAdmin() {
		return menuItemList ;
	}

	@Override
	public ArrayList<MenuItem> getMenuItemListCustomer()
	{
		ArrayList<MenuItem> m =  new ArrayList<MenuItem>();
		//DateUtil d = new DateUtil();
		//DateUtil du = new DateUtil();
		
			for(MenuItem x : menuItemList)
			{
				if((x.isActive()==true)&&(x.getDateoflaunch().before(convertToDate("19/08/2019"))))
				{
					m.add(x);
				}
			}
			
			for(int i =1 ; i<=4 ; i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
			}
		
			System.out.println("\n");
		}
	}
		return m;
		
	}

	private Date convertToDate(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) 
	{
		for(MenuItem x: menuItemList)
		{
			if(x.getId()==menuItem.getId())
			{
				x.setId(menuItem.getId());
				x.setName(menuItem.getName());
				x.setActive(menuItem.isActive());
				x.setCategory(menuItem.getCategory());
				x.setDateoflaunch(menuItem.getDateoflaunch());
				x.setFreeDelivery(menuItem.isFreeDelivery());
				x.setPrice(menuItem.getPrice());
			}
			
		}
		
	}
	public void testModifyMenuItem()
	{
		MenuItem menuItem = new MenuItem(1,"sandwich",99.0f,true,DateUtil.convertToDate("15/03/2017"),"Main Course",true);
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		menuItemDao.modifyMenuItem(menuItem);
		menuItemDao.getMenuItem(menuItem.getId());
		System.out.println("Details are Modified");
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		MenuItem x1 = null;
		for(MenuItem x : menuItemList)
		{
			if(x.getId()==menuItemId)
			{
				x1=x;
				break;
			}
		}
		return x1;
	}

}
