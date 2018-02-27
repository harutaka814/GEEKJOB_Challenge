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
public class FileSousa2 {
    public static void main(String[] args){
        try{
            File fp = new File("selfIntroduction.text");
            FileReader fr = new FileReader(fp);
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
            fr.close();
        }catch(IOException e){
            System.out.println("例外が発生しました。");
        }
    }
    
}
