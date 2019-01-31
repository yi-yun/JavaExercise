package com.yiyun;

import com.yiyun.Rule03.Elvis;
import com.yiyun.Rule04.UtilityClass;
import com.yiyun.Rule05.Lexicon;
import com.yiyun.Rule05.SpellChecker;
import com.yiyun.Rule06.RomanNumerals;
import org.junit.Test;

public class AllTest {

    @Test
    public void Test0x(){
    }
    @Test
    public void Test06(){
        System.out.println(RomanNumerals.isRomanNumeral("IV"));
    }
    @Test
    public void Test05(){
        SpellChecker spellChecker = new SpellChecker(new Lexicon());
        System.out.println(spellChecker.isValid("test"));
    }
    @Test
    public void Test03(){
        Elvis elvis1 = Elvis.INSTANCE;
        Elvis elvis2 = Elvis.INSTANCE;
        Elvis elvis3 = Elvis.INSTANCE;
//        Elvis elvis = new Elvis();
        
    }
    @Test
    public void Test04(){
//        UtilityClass utilityClass = new UtilityClass();
    }
}
