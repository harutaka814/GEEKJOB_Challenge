/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.*;

/**
 *
 * @author 晴嵩
 */
public class User extends Human {
    private int x = 0;
    private int sum = 0;
    private boolean ToF ;
    
     public void setCard(List<Integer> array){
        for(int i=0;i<array.size();i++){
            myCards.add(array.get(i));
        }
    }
    public void setCard(int x){
        myCards.add(x);
    }
    public boolean checkSum(){
        int x = open();
        if(x<12){
            this.ToF = true;
        }else{
            this.ToF = false;
        }
        return this.ToF;
    }
    public int open(){
        int sum = 0;
        for(int i=0;i<myCards.size();i++){
            
                sum += myCards.get(i); 
            
        }
        return sum;
    }
    
}
