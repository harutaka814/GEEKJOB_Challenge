package org.maypackage.sample;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 晴嵩
 */
import java.util.Date;
import java.io.Serializable;
public class ResultData implements Serializable {
    public ResultData(){}
    //フィールドの宣言
    private String luck;
    private Date d;
    //getter setterメソッドの作成
    public String getLuck(){return this.luck;}
    public Date getD(){return this.d;}
    public void setLuck(String luck){this.luck=luck;}
    public void setD(Date d){this.d=d;}
    
    
}
