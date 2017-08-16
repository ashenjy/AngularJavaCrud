 package com.ashen.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ashen.bean.user;


public class userService {

	static HashMap<Integer,user> userIdMap=getuserIdMap();


	public userService() {
		super();

		if(userIdMap==null)
		{
			userIdMap=new HashMap<Integer,user>();
			// Creating some object of userlist while initializing
			user usera=new user(1, "Ashen",22);
			user userb=new user(4, "John",27);
			user userc=new user(3, "Jack",25);
			user userd=new user(2, "shane",23);


			userIdMap.put(1,usera);
			userIdMap.put(4,userb);
			userIdMap.put(3,userc);
			userIdMap.put(2,userd);
		}
	}

	public List<user> getAlluserlist()
	{
		List<user> userlist = new ArrayList<user>(userIdMap.values());
		return userlist;
	}

	public user getuser(int id) throws Exception
	{
		user user= userIdMap.get(id);

		if(user == null)
		{
			throw new Exception("user with id "+id+" not found");
		}
		return user;
	}
	public user adduser(user user)
	{
		user.setId(getMaxId()+1);
		userIdMap.put(user.getId(), user);
		return user;
	}

	public user updateuser(user user)
	{
		if(user.getId()<=0)
			return null;
		userIdMap.put(user.getId(), user);
		return user;

	}
	public void deleteuser(int id)
	{
		userIdMap.remove(id);
	}

	public static HashMap<Integer, user> getuserIdMap() {
		return userIdMap;
	}

	
	public static int getMaxId()
	{ 	 int max=0;
	for (int id:userIdMap.keySet()) {  
		if(max<=id)
			max=id;

	}  

	return max;


	}
}
