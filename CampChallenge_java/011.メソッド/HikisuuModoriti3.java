/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPractice3;
import java.util.*;

/**
 *
 * @author 晴嵩
 */
public class HikisuuModoriti3 {
    //メソッドの定義　ID、名前、生年月日、住所
    public static String[] HikisuuModoriti3(String hikisuumodoriti3){
                //配列に3人の情報宣言
        String[] x = {"1234","きどはるたか","1994年8月14日","東京都江戸川区"};
        String[] y = {"1111","たろう","1981年1月29日",null};
        String[] z = {"2222","じろう","1900年3月20日","東京都墨田区"};
        //戻り値の箱を定義
        String[] xyz=null;
        //引数とIDが一致する人物の情報を戻り値の箱に代入
        for(int i=0;i<x.length;i++){
            if(hikisuumodoriti3==x[i]){
                xyz = x;
            }else if(hikisuumodoriti3==y[i]){
                xyz = y;
            }else if(hikisuumodoriti3==z[i]){
                xyz = z;
            }
        }
        return xyz;
        }
    //メインメソッド
    public static void main(String[] args){
        //取り出す人物の情報は二人までlimitを使用
        int limit = 2;
        //それぞれの人物のIDを格納する箱を宣言
        List<String> list1 = new ArrayList<>();
         list1.add("1234");
         list1.add("1111");
         list1.add("2222");
         //ランダムにIDを取り出したいのでリストをシャッフルする
         Collections.shuffle(list1);
         //格納の順番が変わった配列を0番目から順に２つだけ取り出す
         for(int i=0;i<limit;i++){
             //取り出したIDが"1234"の時ここから
             if(list1.get(i)=="1234"){
                String[] array1 = HikisuuModoriti3("1234");
                for(int j=1;j<array1.length;j++){
                    if(array1[j]==null){
                    continue;
                    }
                System.out.println(array1[j]);
                 }
             }//取り出したIDが"1234"の時ここまで
             
            //取り出したIDが"1111"の時ここから
             else if(list1.get(i)=="1111"){
                String[] array2 = HikisuuModoriti3("1111");
                for(int j=1;j<array2.length;j++){
                    if(array2[j]==null){
                        continue;
                    }
                System.out.println(array2[j]);
                }
            }//取り出したIDが"1111"の時ここまで
             
             //取り出したIDが"2222"の時ここから
             else if(list1.get(i)=="2222"){
                String[] array3 = HikisuuModoriti3("2222");
                for(int j=1;j<array3.length;j++){
                    if(array3[j]==null){
                    continue;
                    }
                System.out.println(array3[j]);
                }////取り出したIDが"2222"の時ここまで
            }
        }
    }
}
