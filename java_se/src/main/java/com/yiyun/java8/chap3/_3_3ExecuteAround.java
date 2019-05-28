package com.yiyun.java8.chap3;

import java.io.BufferedReader;
import java.io.FileReader;

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

    public static void main(String[] args) throws Exception{
        processFile((BufferedReader br)->br.readLine());
        processFile((BufferedReader br)->br.readLine()+br.readLine());
    }
  
}
