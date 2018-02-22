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
public class BJMain {
    public static void main(String[] args){
        Dealer d = new Dealer();
        User u = new User();
        
        d.setCard(d.deal());
        System.out.println("ディーラー:hitする前の手札合計" + d.open());
        List<Integer> x = d.hit();
        d.setCard(x);
        System.out.println("ディーラー:hitしたカード" + x );
        System.out.println("ディーラー:hitした後の手札合計" + d.open());
        
        u.setCard(d.deal());
        System.out.println("ユーザー:hitする前の手札合計" + u.open());
        List<Integer> y = d.hit();
        u.setCard(y);
        System.out.println("ユーザー:hitしたカード" + y );
        System.out.println("ユーザー:hitした後の手札合計" + u.open());
        //ディーラーとユーザーの勝敗判定
        if(u.open()>d.open()){
            System.out.println("ユーザーの勝ちです。");
        }else if(u.open()==d.open()){
            System.out.println("引き分けです。");
        }else{
            System.out.println("ディーラーの勝ちです。");
        }
        
        }
    }
    
    

