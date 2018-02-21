/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPractice3;

/**
 *
 * @author 晴嵩
 */
public class HikisuuModoriti1 {
    //メソッドの定義　ID、名前、生年月日、住所
    public static String[] HikisuuModoriti1(String hikisuumodoriti1){
                //配列に3人の情報宣言
        String[] x = {"1234","きどはるたか","1994年8月14日","東京都江戸川区"};
        String[] y = {"1111","たろう","1981年1月29日","東京都千代田区"};
        String[] z = {"2222","じろう","1900年3月20日","東京都墨田区"};
        String[] xyz=null;
        for(int i=0;i<x.length;i++){
            if(hikisuumodoriti1==x[i]){
                xyz = x;
            }else if(hikisuumodoriti1==y[i]){
                xyz = y;
            }else if(hikisuumodoriti1==z[i]){
                xyz = z;
            }
        }
        return xyz;
        }
    public static void main(String[] args){
        String[] array1 = HikisuuModoriti1("1234");
        for(int i=1;i<array1.length;i++){
            System.out.println(array1[i]);
        }
        String[] array2 = HikisuuModoriti1("2222");
        for(int i=1;i<array2.length;i++){
            System.out.println(array2[i]);
        }
        String[] array3 = HikisuuModoriti1("1111");
        for(int i=1;i<array3.length;i++){
            System.out.println(array3[i]);
        }
    }
    }
