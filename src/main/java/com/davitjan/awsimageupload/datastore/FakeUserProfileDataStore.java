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
		USER_PROFILES.add(new UserProfile(UUID.fromString("cd3f0578-9875-4ccd-b735-1fa265ce8fe4"), "davit", null));
		USER_PROFILES.add(new UserProfile(UUID.fromString("1d789963-e6de-4cec-8513-eae0c08aceb6"), "gohar", null));
	}
	
	public List<UserProfile> getUserProfiles() {
		return USER_PROFILES;
	}
}
