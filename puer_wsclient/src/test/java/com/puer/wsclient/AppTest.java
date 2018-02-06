package com.puer.wsclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.test.context.junit4.SpringRunner;

import com.puer.wsclient.ykd.YkdService;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest extends TestCase
{
    
    @Autowired
    private YkdService ykdService;
    @Test
    public void testYkdapi() {
        String s = ykdService.callService("getCountry", "{\"pageSize\":\"1\",\"page\":1}");
        System.out.println(s);
    }
    
   
}
