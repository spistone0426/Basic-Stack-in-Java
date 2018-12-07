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
public class MyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        TweetStack myStack = new TweetStack();

        TweetNode myNode1 = new TweetNode(100, "pos", "hello");
        TweetNode myNode2 = new TweetNode(200, "pos", "hello");
        TweetNode myNode3 = new TweetNode(300, "pos", "hello");
        TweetNode myNode4 = new TweetNode(5000, "pos", "hello");

        myStack.push(myNode1);
        myStack.push(myNode2);
        myStack.push(myNode3);
        myStack.push(myNode4);

        TweetNode t = myStack.top();
        System.out.println(t.tweetID);

        while (!myStack.isEmpty()) {
            t = myStack.pop();
            System.out.println(t.tweetID);
        }
        System.out.println();
        //Part C
        TweetObjectStack objStack = new TweetObjectStack();
        
        TweetObject myObj1 = new TweetObject("USer1", 500, 85);
        TweetObject myObj2 = new TweetObject("USer2", 100, 700);
        TweetObject myObj3 = new TweetObject("USer3", 1000, 1000);
        TweetObject myObj4 = new TweetObject("USer4", 123, 456);
        
        objStack.push(myObj1);
        objStack.push(myObj2);
        objStack.push(myObj3);
        objStack.push(myObj4);
        
        TweetObject o = objStack.top();
        System.out.println(o.name);
        
        while (! objStack.isEmpty()){
            o = objStack.pop();
            System.out.println(o.followers);
        }
        
        LinkedList list = new LinkedList();
        
        TweetStrings myString1 = new TweetStrings("Bob","Male","White");
        TweetStrings myString2 = new TweetStrings("Mary","Female","Hispanic");
        TweetStrings myString3 = new TweetStrings("Jessica","Female","Black");
        TweetStrings myString4 = new TweetStrings("Randy","Male","Asian");
        
        list.addAt(0, myString1);
        list.addLast( myString2);
        list.addAt(1,myString3);
        list.addFirst(myString4);
        
        list.printList();
        
        
        
    }
}