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
public class Dealer extends Human {
    //1～13のカード4セットを入れる箱
    List<Integer> cards = new ArrayList<Integer>();
    //dealとhitでcardsから抜き取った要素を入れる箱
   
    
   
    private boolean ToF ;
    //1～13のカードを4セットcardsに格納する
   public Dealer(){
        for(int i=0;i<4;i++){
            for(int j=1;j<=13;j++){
                if(j<11){
                cards.add(j);
                }else{
                    cards.add(10);
                }
            }
        }
        
    }
   //cardsから要素を二つ取り出す。取り出した要素はcardsから削除する。
    public List<Integer> deal(){
        List<Integer> array = new ArrayList<Integer>();
        Random x = new Random();
        
        
        for(int i=0;i<2;i++){
            Integer y = x.nextInt(cards.size());
            array.add(cards.get(y));
            cards.remove(y);
        }
       // System.out.println("格納するリスト"+ array.get(0) + "と"+array.get(1) );
        
        return array;
    }
    //checkSumでの判定を受けてtrueならcardsから要素を一つ取り出す。
    //取り出した要素は削除する。falseなら何もしない。
    public List<Integer> hit(){
        List<Integer> array = new ArrayList<Integer>();
        if(checkSum()==true){
            Random x = new Random();
            int y = x.nextInt(cards.size());
            array.add(cards.get(y));
            cards.remove(y); 
        }
        return array;
    }
    //dealで取り出した要素をmyCardsに追加する。
    public void setCard(List<Integer> array){
        
        for(int i=0;i<array.size();i++){
            myCards.add(array.get(i));
        }
    }
    //手札合計値が12以上ならヒットしない12未満ならヒットする
    public boolean checkSum(){
        int x = open();
        if(x<12){
            this.ToF = true;
        }else{
            this.ToF = false;
        }
        return this.ToF;
    }
    //手札を合計する
    public int open(){
        int sum = 0;
        for(int i=0;i<myCards.size();i++){
            
                sum += myCards.get(i); 
            
        }
        return sum;
    }
    
}
