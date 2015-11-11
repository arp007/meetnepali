package com.nepali36.persistence.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jdo.Query;



import com.google.inject.Singleton;
import com.nepali36.model.UserAccount;
import com.nepali36.persistence.UserDao;

@Singleton
public class UserDaoImpl extends AppPersistenceDaoImpl<UserAccount, Long> implements UserDao {

	@Override
	protected Class<UserAccount> getClassT(){
		return UserAccount.class;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public UserAccount getUserByEmail(String email) {
		Map paramMap = new HashMap<String, String>();
		paramMap.put("eml", email);
		List<UserAccount> ua = getByQuery("where email == eml", paramMap);
		return ua.get(0);
		
	}
	
	@Override
	public void save(UserAccount t) {
		super.save(t);
		if (t.getProfile() != null){
			t.getProfile().setAccountKey(t.getKey());
		}
	}
	
	
}
