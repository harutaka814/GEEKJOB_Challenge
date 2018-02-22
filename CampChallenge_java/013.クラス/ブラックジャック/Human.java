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
public abstract class Human {
    //手札の要素を入れる箱
    List<Integer> myCards = new ArrayList<Integer>();
    //手札のカードの合計値を返却する
    public abstract int open();
    //ArrayListで受けたカードをmyCardsに追加する
    public abstract void setCard(List<Integer> array);
    
    //public abstract void setCard(int x);
    //myCardsの情報から追加で引くならTrue、引かないならFalseの判定をする
    public abstract boolean checkSum();
}
