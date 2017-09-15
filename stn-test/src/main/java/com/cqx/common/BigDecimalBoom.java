package com.cqx.common;



import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by Shan on 2017/2/9.
 */
public class BigDecimalBoom {

    /**
     * BigDecimal的加减乘除都是运算好后返回一个新的BigDecimal 原来的对象值不变
     */
    @Test
    public void caculateTest(){
        BigDecimal param1 = BigDecimal.ZERO;
        BigDecimal result = param1.add(BigDecimal.TEN);
        System.out.println(result);


        BigDecimal param2 = BigDecimal.ZERO;
        param2 = param2.add(BigDecimal.ONE);
        System.out.println(param2);
    }

    @Test
    public void integerTest(){
        Integer i = null;
        Assert.assertTrue(i < 1);

    }

    @Test
    public void kexuejishufa(){
        BigDecimal bd = new BigDecimal("0.0000000000");
        System.out.println(bd);
        System.out.println(bd.toPlainString()); //采用非科学计数法

        BigDecimal bd1 = null;
        System.out.println(bd1);
//        System.out.println(bd1.toPlainString());  //NullPointerException
    }
}
