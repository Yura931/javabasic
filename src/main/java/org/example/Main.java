package org.example;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("text.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5); //버퍼의 크기는 5
            for(int i = '1'; i <= '9'; i++){
                bos.write(i);
                System.out.println((char)i);
            }

            //fos.close(); 이거로 하면 안됨. 버퍼를 닫아줘야 함
            bos.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}