package com.atguigu.工厂模式;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 11:29
 */
public class SimpleFactory {
   public RouJiaMo getRoujiamo(String type){
       switch (type){
           case "纯瘦": return  new ChunShou();
           case "肥瘦": return  new FeiShou();
           case "普通": return  new Putong();
       }
    return null;
   }

}
