/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_7_iii_stack;

/**
 *
 * @author spist222
 */
public class TweetObject {
    String name;
    int followers;
    int following;
    TweetObject next;

    public TweetObject(String name, int followers, int following) {
        this.name = name;
        this.followers = followers;
        this.following = following;
        this.next = null;
    }
    public TweetObject(){
        this.name = "";
        this.followers = 0;
        this.following = 0;
        this.next = null;
    }
    
    
    
}
