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
public class HidukeKadai3 {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        c.set(2016,10,04,10,00,00);
        Date now = c.getTime();
        //タイムスタンプの表示
        System.out.println("タイムスタンプ:" + now.getTime());
        //日時の表示
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("日付の表示:"  + sdf.format(now));
        
    }
}
