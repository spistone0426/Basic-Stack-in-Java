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
public class Generic_Class_Build {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GenericStackLink genStack = new GenericStackLink();
        
        Node thisNode1 = new Node("Test");
        Node thisNode2 = new Node(100);
        Node thisNode3 = new Node(100.1);
        
        genStack.push(thisNode1);
        genStack.push(thisNode2);
        genStack.push(thisNode3);
        
        Node x = genStack.top();
        System.out.println(x.info);
        
        while (! genStack.isEmpty()){
            x = genStack.pop();
            System.out.println(x.info);
        }
    }
    
}
