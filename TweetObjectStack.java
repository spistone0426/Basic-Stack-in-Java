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
public class TweetObjectStack {
    TweetObject top;

    public TweetObjectStack() {
        this.top = new TweetObject();
    }
    public void push (TweetObject myobj){
        myobj.next = top.next;
        this.top.next = myobj;
    }
    public TweetObject top(){
        TweetObject topmost = top.next;
        return topmost;
    }
    public TweetObject pop(){
        TweetObject topmost = top.next;
        top.next = top.next.next;
        return topmost;
    }
    public boolean isEmpty(){
        return (this.top.next == null);
    }
}

