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
public class Modoriti1 {
    //メソッドの定義 boolean型で戻り値
    public static boolean Modoriti1(){
        //常にtrueを呼び出し元に返す
        return true;
    }
    //メインメソッドからModoriti1メソッド呼び出し
    public static void main(String[] args){
        boolean x = Modoriti1();
        //戻り値によって分岐する
        if(x = true){
            System.out.println("この処理は正しく実行できました。");
        }else{
            System.out.println("この処理は正しく実行できませんでした。");
        }
    }
}
