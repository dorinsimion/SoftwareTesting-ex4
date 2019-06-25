package com.company;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testPositive(){
        //given
        StringUtils stringUtils = new StringUtils();
        //when
        boolean result = stringUtils.check("abcab");
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testNegative(){
        //given
        StringUtils stringUtils = new StringUtils();
        //when
        boolean result = stringUtils.check("abcac");
        //then
        Assert.assertFalse(result);
    }

    @Test
    public void testNull(){
        //given
        StringUtils stringUtils = new StringUtils();
        //when
        boolean result = stringUtils.check(null);
        //then
        Assert.assertFalse(result);
    }
}
