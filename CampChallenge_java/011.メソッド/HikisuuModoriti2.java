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
public class HikisuuModoriti2 {
    //メソッドの定義　ID、名前、生年月日、住所
    public static String[] HikisuuModoriti2(String hikisuumodoriti2){
                //配列に3人の情報宣言
        String[] x = {"1234","きどはるたか","1994年8月14日","東京都江戸川区"};
        String[] y = {"1111","たろう","1981年1月29日",null};
        String[] z = {"2222","じろう","1900年3月20日","東京都墨田区"};
        String[] xyz=null;
        for(int i=0;i<x.length;i++){
            if(hikisuumodoriti2==x[i]){
                xyz = x;
            }else if(hikisuumodoriti2==y[i]){
                xyz = y;
            }else if(hikisuumodoriti2==z[i]){
                xyz = z;
            }
        }
        return xyz;
        }
    public static void main(String[] args){
        String[] array1 = HikisuuModoriti2("1234");
        for(int i=1;i<array1.length;i++){
            if(array1[i]==null){
               continue;
            }
            System.out.println(array1[i]);
        }
        String[] array2 = HikisuuModoriti2("2222");
        for(int i=1;i<array2.length;i++){
            if(array2[i]==null){
                continue;
            }
            System.out.println(array2[i]);
        }
        String[] array3 = HikisuuModoriti2("1111");
        for(int i=1;i<array3.length;i++){
            if(array3[i]==null){
                continue;
            }
            System.out.println(array3[i]);
            
        }
    }
    }