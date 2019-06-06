package com.yiyun.java8.chap3;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _3_3ExecuteAround {
    public static String processFile() throws Exception{
        try (BufferedReader br=
                 new BufferedReader(
                     new FileReader("data.txt"))){
            return br.readLine();
        }
    }


    public static String processFile(BufferedReaderProcessor processor) throws Exception{
        try (BufferedReader br=
                 new BufferedReader(
                     new FileReader("data.txt"))){
            return processor.process(br);
        }
    }

    public  static <T> void forEach(List<T> list, Consumer<T> c){
        for (T i:list) {
            c.accept(i);
        }
    }
    
    @Test
    public void fun(){
        forEach(Arrays.asList(1,2,53,4,3),
            (Integer i)-> System.out.println("i = " + i));
    }
    public static void main(String[] args) throws Exception{
//        processFile((BufferedReader br)->br.readLine());
//        processFile((BufferedReader br)->br.readLine()+br.readLine());
        forEach(Arrays.asList(1,2,3,4,5),
            (Integer i)-> {
            if (i>=3) System.out.println("i = " + i);
        });
        
    }
  
}
