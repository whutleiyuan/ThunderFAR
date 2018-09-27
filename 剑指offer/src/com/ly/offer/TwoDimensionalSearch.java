package com.ly.offer;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-09-27 10:49
 * @ Description：二维数组中的查找
 * @ Modified By：
 * @Version: 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class TwoDimensionalSearch {
    public static boolean Find(int target,int[][] array){
        int row=0;
        int column=array[0].length-1;
        while(row<array.length&&column>=0){
            if(array[row][column]>target){
                column--;
            }else if(array[row][column]<target){
                row++;
            }else{
                return  true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] array={{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7},{4,5,6,7,8},{5,6,7,8,9}};
        boolean find = Find(10, array);
        System.out.println(find);
    }
}