/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPractice5;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.*;
/**
 *
 * @author 晴嵩
 */
public class FileSousa3 {
    public static void main(String[] args){
        String s = "こんにちわ";
        //処理の名前と実行時間をfileに書き込み
        Date d1 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            File fp = new File("Moji.text");
            FileWriter fw = new FileWriter(fp);
            fw.write("文字の入れ替えの処理をします。");
            fw.write("実行時間:" + sdf1.format(d1) + "です。");
            fw.close();
        }catch(IOException e){
            System.out.println("例外が発生しました。");
        }
        //文字の入れ替え処理
        try{
            Thread.sleep(3000);
            Date d2 = new Date();
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            s = s.replace("こんにちわ","こんばんわ");
            File fp = new File("Moji.text");
            FileWriter fw = new FileWriter(fp,true);
            fw.write("文字の入れ替えの処理が終わりました。");
            fw.write("終了時間:" + sdf2.format(d2) + "です。");
            fw.close();
        }catch(IOException | InterruptedException e){
            System.out.println("例外が発生しました。");
        }
        //ログファイルの呼び出し
        try{
            File fp = new File("Moji.text");
            FileReader fr = new FileReader(fp);
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
            br.close();
        }catch(IOException e){
            System.out.println("例外が発生しました。");
        }
        
        
    }
}
