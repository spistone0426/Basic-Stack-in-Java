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
public class GenericStackLink <T> {
   
    Node<T> top;
    public GenericStackLink(){
        this.top = new Node();
    }
    public void push (Node<T> mynode){
        mynode.next = top.next;
        this.top.next = mynode;
    }
    public Node<T> top(){
        Node topmost = top.next;
        return topmost;
    }
    public Node <T> pop(){
        Node topmost = top.next;
        top.next = top.next.next;
        return topmost;
    }
    public boolean isEmpty(){
        return (this.top.next ==  null);
    }
}