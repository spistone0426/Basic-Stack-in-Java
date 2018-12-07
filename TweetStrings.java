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
public class TweetStrings {
    String name;
    String gender;
    String race;
    TweetStrings next;

    public TweetStrings(String name, String gender, String race) {
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.next = null;
    }
    
    public TweetStrings(){
        this.name = "";
        this.gender = "";
        this.race = "";
        this.next = null;
    }
    
    
}
