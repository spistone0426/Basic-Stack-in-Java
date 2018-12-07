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
public class TweetNode {
    public int tweetID;
    public String tweetSentiment;
    public String tweetText;
    TweetNode next;

    public TweetNode(int tweetID, String tweetSentiment, String tweetText) {
        this.tweetID = tweetID;
        this.tweetSentiment = tweetSentiment;
        this.tweetText = tweetText;
        this.next = null;
    }
    
    public TweetNode(){
        this.tweetID = -1;
        this.tweetSentiment = "";
        this.tweetText = "";
        this.next = null;
    }
    
    
}


