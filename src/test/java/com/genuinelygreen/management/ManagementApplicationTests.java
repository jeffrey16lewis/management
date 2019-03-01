package com.genuinelygreen.management;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagementApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void fibTest(){
        int[] fibArray = new int[100];
        int[] tempArray = new int[fibArray.length];

        // 1,2,3,4,5,6,7,8,9
        for(int i = 0; i < fibArray.length; i++){
            tempArray[i] = i;
        }
        for(int j = 0; j < tempArray.length; j++){
            if(j >= 2 && j < 99)
            fibArray[j] = tempArray[j+1] + fibArray[j++];
        }

        for(int f: fibArray){
            System.out.println(f);
        }

    }



}
