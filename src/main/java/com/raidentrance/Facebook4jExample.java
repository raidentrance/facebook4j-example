/**
 * 
 */
package com.raidentrance;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Friend;
import facebook4j.Post;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

/**
 * @author raidentrance
 * 
 */
public class Facebook4jExample {
	public static void main(String[] args) throws FacebookException {
		Facebook facebook = new FacebookFactory().getInstance();
		facebook.setOAuthAppId("your api client", "your api secret");
		facebook.setOAuthAccessToken(new AccessToken(
				"your access token"));
		// Getting friends
		System.out.println("\tGetting friends\n");
		ResponseList<Friend> friends = facebook.getFriends();
		for (Friend friend : friends) {
			System.out.println(friend);
		}
		// Getting my posts
		System.out.println("\tGetting my posts\n");
		ResponseList<Post> feed = facebook.getFeed();
		for (Post post : feed) {
			System.out.println(post);
		}
		// Geeting geeks México posts
		System.out.println("\tGetting cool posts\n");
		ResponseList<Post> geeksFeed = facebook.getFeed("geeksJavaMexico");
		for (Post post : geeksFeed) {
			System.out.println(post);
		}
	}
}
