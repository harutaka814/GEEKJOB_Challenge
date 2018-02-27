/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPractice5;
import java.io.*;
/**
 *
 * @author 晴嵩
 */
public class FileSousa {
    public static void main(String[] args){
        try{
            File fp = new File("selfIntroduction.text");
            FileWriter fw = new FileWriter(fp);
            fw.write("私の名前は幾戸晴嵩です。1994年8月14日生まれで23歳です。");
            fw.close();
        }catch(IOException e){
            System.out.println("例外が発生しました。");
        }
    }
}
