/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPractice5;

/**
 *
 * @author 晴嵩
 */
public class Moji2 {
    public static void main(String[] args){
        String email = "abcde123@yaahhoo.co.jp" ;
        String s = email.substring(email.indexOf("@") );
        System.out.println("@以降の文字数:"
            + s.length() );
    }
    
}
