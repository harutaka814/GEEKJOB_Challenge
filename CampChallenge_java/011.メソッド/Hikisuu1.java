/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPractice3;

/**
 *
 * @author 晴嵩
 */
public class Hikisuu1 {
    //メソッドの定義 int型で一つ受け取る
    public static void Hikisuu1(int hikisuu1){
        //奇数、偶数の判定
        if(hikisuu1%2==0){
        System.out.println(hikisuu1 + "は偶数です");
    }else{
            System.out.println(hikisuu1 + "は奇数です");
        }
    }
    public static void main(String[] args){
        //メインからメソッド呼び出し
        //偶数の場合
        Hikisuu1(30);
        //奇数の場合
        Hikisuu1(15);
    }    
        
        
    
    
        
    
}
