/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPractice5;
import java.util.*;
/**
 *
 * @author 晴嵩
 */
public class HidukeKadai1 {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        c.set(2016,00,01,00,00,00);
        Date d1 = c.getTime();
        System.out.println(d1);
        System.out.println("d1のタイムスタンプは" + d1.getTime() + "ミリ秒です。");
    }
    
}
