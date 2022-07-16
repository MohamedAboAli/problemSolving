package problemSolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

class User{
	int id;
	String name;
	List<User> followers;
	List<User> followees;
	Stack<Twit> allTwits;
}
class Twit{
	int id;
	User user;
	
	
}

class Twitter {
	public List<Twit> twitList;
	public HashMap<Integer,User> allUsers;
	  
    public Twitter() {
         
    }
     
    public void postTweet(int userId, int tweetId) {
        Twit t = new Twit(); 
    	t.id=tweetId;
    	User u=allUsers.get(userId);
    	t.user=u;
    	twitList.add(t);
    }
     
    public List<Twit> getNewsFeed(int userId) {
    	List<Twit> newsFeed=new ArrayList<Twit>();
    	User u=allUsers.get(userId);
    	List<User> followers = u.followers;
    	for(int i=0;i<10;i++) {
    		User follower=followers.get(i);
    		newsFeed.add(follower.allTwits.pop());
    	}
    	return newsFeed;
    	
    }
     
    public void follow(int followerId, int followeeId) {
    	User follower=allUsers.get(followerId);
    	User followee=allUsers.get(followeeId);
    	
    	follower.followees.add(followee);
    	followee.followers.add(follower);
    	
    	allUsers.put(followerId, follower);
    	allUsers.put(followeeId, followee);
    }
     
    public void unfollow(int followerId, int followeeId) {
    	User follower=allUsers.get(followerId);
    	User followee=allUsers.get(followeeId);
    	
    	follower.followees.remove(followee);
    	followee.followers.remove(follower);
    	
    	allUsers.put(followerId, follower);
    	allUsers.put(followeeId, followee);
    }
}
