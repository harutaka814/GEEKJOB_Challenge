/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPractice4;

/**
 *
 * @author 晴嵩
 */
public class makeMain {
    public static void main(String[] args){
    //makeClassのクラスをインスタンス化
    makeClass mc = new makeClass();
    //makeClassのメソッドを呼び出し
    mc.setHikisuu(3,5);
    mc.print();
    }
}
