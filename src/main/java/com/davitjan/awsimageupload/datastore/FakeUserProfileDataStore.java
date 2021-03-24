package com.davitjan.awsimageupload.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.davitjan.awsimageupload.profile.UserProfile;

@Repository
public class FakeUserProfileDataStore {
	private static final List<UserProfile> USER_PROFILES = new ArrayList<>();
	
	static {
		USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "davit", null));
		USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "gohar", null));
	}
	
	public List<UserProfile> getUserProfiles() {
		return USER_PROFILES;
	}
}
