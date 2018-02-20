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
public class Modoriti2 {
    //メソッドの定義 Id、名前、生年月日、住所
    public static String[] Modoriti2(){
        String[] profile = {"1234","きどはるたか","1994年8月14日","東京都江戸川区××"};
        
        return profile;
    }
    public static void main(String[] args){
        String[] x = Modoriti2();
        for(int i=1;i<x.length;i++){
           System.out.println(x[i]); 
        }
        
    }
}
