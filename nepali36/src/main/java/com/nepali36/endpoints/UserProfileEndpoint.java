package com.nepali36.endpoints;

import javax.inject.Inject;
import javax.inject.Named;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.response.NotFoundException;
import com.nepali36.model.UserProfile;
import com.nepali36.model.dto.ResponseMessage;
import com.nepali36.persistence.impl.UserProfileDaoImpl;

@Api(
	    name = "matchnepali",
	    version = "v1",
	    scopes = {Constants.EMAIL_SCOPE},
	    clientIds = {Constants.WEB_CLIENT_ID, Constants.ANDROID_CLIENT_ID, Constants.IOS_CLIENT_ID},
	    audiences = {Constants.ANDROID_AUDIENCE}
	)
public class UserProfileEndpoint {
	
	@Inject
	private UserProfileDaoImpl userProfileDao;
	
	@ApiMethod(name = "user.profile.save", httpMethod = "post")
	public UserProfile saveUserProfile( UserProfile userProfile){
		try {
			userProfileDao.save(userProfile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return userProfile;
		
	}
	
	@ApiMethod(name = "user.profile.get", httpMethod="get", path = "user/profile/")
	public UserProfile getUserProfile(@Named("id") Long id) throws NotFoundException{
		System.out.println("**************");
		System.out.println(id);
		try{
			UserProfile userProfile = userProfileDao.getById(id);
//			if (userProfile.is_archived()){
//				throw new NotFoundException("Entity is Archived");
//			}
			return userProfile;
		}catch (Exception e){
			throw new NotFoundException("Entity not found in datastore");
		}
		
		
	}
	
	@ApiMethod(name ="user.profile.update", httpMethod="post")
	public UserProfile updateUserProfile(UserProfile userProfile) throws NotFoundException{
		if (userProfile.getKey() != null){
			userProfileDao.update(userProfile);
		}else{
			throw new NotFoundException("Ojbect not found");
		}
		return userProfile;
		
	}
	
	@ApiMethod(name = "user.profile.delete", httpMethod="get", path = "user/profile/delete")
	public ResponseMessage deleteUserProfile(@Named("id") Long id) throws NotFoundException{
		UserProfile up = userProfileDao.getById(id);
		up.set_archived(true);
		return new ResponseMessage("Deleted Successfully");
	}
	
	

}
