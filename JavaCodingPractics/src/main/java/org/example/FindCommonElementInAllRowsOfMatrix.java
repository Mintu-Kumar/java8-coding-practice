package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindCommonElementInAllRowsOfMatrix {


    private static void getCommonElementsInAllRows(int[][] matrix){

        int rows = matrix.length;
        int cloumns = matrix[0].length;
        Map<Integer,Integer> elementCountMap = new HashMap<>();
        for(int j=0;j<cloumns;j++){
            elementCountMap.put(matrix[0][j],1);
        }

        for(int i=1;i<rows;i++){
            for(int j=0;j<cloumns;j++){
                if(elementCountMap.containsKey(matrix[i][j]) && elementCountMap.get(matrix[i][j]) ==i){
                      elementCountMap.put(matrix[i][j],i+1);
                }
            }
        }
        System.out.println(elementCountMap);
          Set<Map.Entry<Integer,Integer>> entrySet =  elementCountMap.entrySet();
           for(Map.Entry<Integer,Integer> entry:entrySet){
                if(entry.getValue() == rows)
                    System.out.println(entry.getKey());
           }
    }
    public static void main(String []args){

        int[][] matrix = {
                {33, 77, 11, 99, 88},
                {11, 44, 22, 77, 55},
                {88, 66, 77, 11, 33},
                {77, 99, 11, 44, 66},
                {55, 33, 44, 77, 11},
                {99, 77, 66, 11, 88}
        };

        getCommonElementsInAllRows(matrix);
    }
}
