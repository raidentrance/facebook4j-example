/**
 * 
 */
package com.raidentrance;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Friend;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

/**
 * @author raidentrance
 * 
 */
public class Facebook4jExample {
	public static void main(String[] args) throws FacebookException {
		Facebook facebook = new FacebookFactory().getInstance();
		facebook.setOAuthAppId("", "");
		facebook.setOAuthAccessToken(new AccessToken(""));
		ResponseList<Friend> friends = facebook.getFriends();
		for (Friend friend : friends) {
			System.out.println(friend);
		}
	}
}
