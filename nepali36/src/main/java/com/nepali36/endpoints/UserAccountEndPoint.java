package com.nepali36.endpoints;

import javax.inject.Inject;
import javax.inject.Named;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.nepali36.model.UserAccount;
import com.nepali36.model.UserProfile;
import com.nepali36.persistence.impl.UserDaoImpl;

@Api(
	    name = "matchnepali",
	    version = "v1",
	    scopes = {Constants.EMAIL_SCOPE},
	    clientIds = {Constants.WEB_CLIENT_ID, Constants.ANDROID_CLIENT_ID, Constants.IOS_CLIENT_ID},
	    audiences = {Constants.ANDROID_AUDIENCE}
	)
public class UserAccountEndPoint {
	
	@Inject
	private UserDaoImpl userDao;
	
	@ApiMethod(name = "user.account.save", httpMethod = "post" , path = "user/account/save")
	public UserAccount saveUserAccount( UserAccount userAccount){
		try {
			userDao.save(userAccount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return userAccount;
		
	}
	@ApiMethod(name = "user.account.get", httpMethod = "get" , path = "user/account")
	public UserAccount getUserAccount( @Named("id") Long id){
		try {
			UserAccount userAcct = userDao.getById(id);
			return userAcct;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
		
	}
	
	

}
