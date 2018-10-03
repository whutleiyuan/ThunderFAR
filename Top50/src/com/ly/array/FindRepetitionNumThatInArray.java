package com.ly.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-10-02 23:26
 * @ Description：请在给出的整数数组中找到重复的数字。
 * @ Modified By：
 * @Version: V1.0
 */

public class FindRepetitionNumThatInArray {
    //原生代码BY ThunderFAR.
    public static List<Integer> findRepetitionNumThatInArray(int[] array){
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(map.keySet().contains(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],0);
            }
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()!=0){
                list.add(entry.getKey());
            }
        }
        return list;
    }

    //测试
    public static void main(String[] args) {
        int[] array={1,1,2,3,3,4,5,2,7,5,8,9,3,10};
        List<Integer> testNum = findRepetitionNumThatInArray(array);
        for (Integer aa:testNum){
            System.out.println(aa);
        }
    }
}