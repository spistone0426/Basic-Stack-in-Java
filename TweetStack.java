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
public class TweetStack {
    TweetNode top;

    public TweetStack() {
        this.top = new TweetNode();
    }
    public void push (TweetNode mynode){
        mynode.next = top.next;
        this.top.next = mynode;
    }
    public TweetNode top(){
        TweetNode topmost = top.next;
        return topmost;
    }
    public TweetNode pop(){
        TweetNode topmost = top.next;
        top.next = top.next.next;
        return topmost;
    }
    public boolean isEmpty(){
        return (this.top.next == null);
    }
    
    
}
