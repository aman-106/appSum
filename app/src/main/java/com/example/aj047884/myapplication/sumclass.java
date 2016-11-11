package com.example.aj047884.myapplication;

import java.io.Serializable;

/**
 * Created by AJ047884 on 10/6/2016.
 */

public class sumclass  implements Serializable
{
    private int a=0;
    private int b=0;
    public void setintA(int a)
    {
        this.a=a;
    }
    public void setintB(int b )
    {
        this.b=b;
    }
    public int cals()
    {
        return this.a+this.b;
    }

}