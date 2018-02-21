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
    makeClassSuper mcs = new makeClassSuper();
    //makeClassSuperのメソッドを呼び出し
    mcs.setHikisuu(3,5);
    mcs.print();
    //フィールドの初期化
    mcs.fieldClear();
    mcs.print();
    
    }
}
