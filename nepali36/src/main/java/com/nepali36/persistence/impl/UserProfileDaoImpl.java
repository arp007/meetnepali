package com.nepali36.persistence.impl;

import com.nepali36.model.UserProfile;
import com.nepali36.persistence.UserProfileDao;

public class UserProfileDaoImpl  extends AppPersistenceDaoImpl<UserProfile, Long> implements UserProfileDao {

	@Override
	protected Class<UserProfile> getClassT() {
		return UserProfile.class;
	}
	
	@Override
	public void save(UserProfile t) {
		super.save(t);
		if (t.getLocation() != null){
			t.getLocation().setUserProfileKey(t.getKey());
		}
	}
	
	

}
