package org.wltea.analyzer.core;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterUtilTest {

    @Test
    public void testRegularize() {
        for (int i = Character.MIN_VALUE; i <= Character.MAX_VALUE; i++) {
          char c =  CharacterUtil.regularize((char)i,true,true);
          if(c!= (char)i){
              System.out.println("i="+i+"|"+(char)i+",c="+c);
          }
        }

    }
}