/*
 * @Author: AFei tjtgcyf@gmail.com
 * @Date: 2023-09-20 10:38:00
 * @LastEditors: AFei tjtgcyf@gmail.com
 * @LastEditTime: 2023-09-20 11:11:11
 * @FilePath: /BackendLearning/Java/Practice4/Item.java
 * @Description: "https://how2j.cn/k/oo/oo-class-object/286.html"
 * 
 * Copyright (c) 2023 by AFei, All Rights Reserved. 
 */
package Java.Practice4;

public class Item {
    private String _name;
    private float _price;

    public Item()
    {
        _name = "null";
        _price = 0.0f;
    }
    public Item(String name, float price)
    {
        _name = name;
        _price = price;
    }
    /**
     * @description:main function 
     * @param {String[]} args
     * @return void
     */
    public static void main(String[] args)
    {
        Item bloodBottle = new Item("blood bottle", 9.0f);
        Item shoes = new Item("shoes", 50.0f);
        Item sword = new Item("sword", 70.0f);
        System.out.println("blood bottle: " + bloodBottle._price);
        System.out.println("shoes: " + shoes._price);
        System.out.println("sword: " + sword._price);
    }
}
