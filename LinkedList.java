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
public class LinkedList {

    TweetStrings head;
    TweetStrings last;

    public LinkedList() {
        this.head = new TweetStrings();
        this.last = this.head;
    }

    public void addLast(TweetStrings mystring) {
        this.last.next = mystring;
        this.last = mystring;
    }

    public void addFirst(TweetStrings mystring) {
        mystring.next = head.next;
        this.head.next = mystring;
    }

    public void printList() {
        TweetStrings curr = head.next;
        while (curr != null) {
            System.out.println(curr.name + ", " + curr.gender + ", " + curr.race + "");
            curr = curr.next;
        }
    }

    public TweetStrings get(int index) {
        TweetStrings curr = head.next;
        int counter = 0;
        while ((curr != null) && (counter < index)) {
            counter++;
            curr = curr.next;
        }
        return curr;
    }
    public void addAt (int index, TweetStrings mystring){
        TweetStrings index_predecessorNode = this.get(index -1);
        if (index_predecessorNode != null){
            mystring.next = index_predecessorNode.next;
            index_predecessorNode.next = mystring;
        }
    }
    public void remove(int index){
        TweetStrings index_predecessorNode = this.get(index -1);
        index_predecessorNode.next = index_predecessorNode.next.next;
    }
}
