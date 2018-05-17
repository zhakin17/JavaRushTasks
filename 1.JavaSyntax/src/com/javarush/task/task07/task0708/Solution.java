package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            arrayList.add(reader.readLine());
            arrayList.add(reader.readLine());
            arrayList.add(reader.readLine());
            arrayList.add(reader.readLine());
            arrayList.add(reader.readLine());

        ArrayList<String> arrayList2 = new ArrayList();

        arrayList2.add("");

        for (int i = 0; i < arrayList.size(); i++) {
            String tmp;
            if (arrayList.get(i).toString().length() > arrayList2.get(0).toString().length()){
                tmp = arrayList.get(i).toString();
                arrayList2.set(0,tmp);

            }
            else  if (arrayList.get(i).toString().length() == arrayList2.get(0).toString().length()){
                tmp = arrayList.get(i).toString();
                arrayList2.add(tmp);
            }
        }
             arrayList2.forEach((a)->System.out.println(a));
    }





}
