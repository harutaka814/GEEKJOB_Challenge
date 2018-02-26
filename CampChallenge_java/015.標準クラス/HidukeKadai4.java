/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPractice5;
import java.util.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author 晴嵩
 */
public class HidukeKadai4 {
    public static void main(String[] args){
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.set(2015,00,01,00,00,00);
        c2.set(2015,11,31,23,59,59);
        Date d1 = c1.getTime();
        Date d2 = c2.getTime();
        System.out.println(d1);
        System.out.println(d2);
        long l1 = d1.getTime();
        long l2 = d2.getTime();
        System.out.println("差は" + (l2-l1) + "ミリ秒です。");
    }
    
}
