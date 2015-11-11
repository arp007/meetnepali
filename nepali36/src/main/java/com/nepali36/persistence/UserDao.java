package com.nepali36.persistence;

import com.nepali36.model.UserAccount;

public interface UserDao extends BaseDao<UserAccount, Long>  {
	
	public UserAccount getUserByEmail(String email);
	
	

}
