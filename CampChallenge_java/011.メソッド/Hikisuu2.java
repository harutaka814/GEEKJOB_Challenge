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
public class Hikisuu2 {
    //メソッドの定義　引数が３つの場合
    public static void Hikisuu2(int x,int y,boolean z){
        
        int xy = x*y;
        //第3引数がtrueの場合
        if(z==true){
            xy=xy*xy;
            System.out.println(xy);
        }else{
            //第3引数がfalseの場合
            System.out.println(xy);
        }
            
    }
    //メソッドの定義　引数が一つの場合
    public static void Hikisuu2(int y){
        //デフォルト値の設定
        int x = 5;
        boolean z = false;
        //分岐なしで計算
        int xy = x*y;
        System.out.println(xy);
    }   
    //メインメソッドから呼び出し
    public static void main(String[] args){
        Hikisuu2(2,3,true);
        Hikisuu2(2,3,false);
        Hikisuu2(3);
    }
    
    
    
    
    
    
    
    
    
}
