package com.epam.rd.autotasks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        List<Integer> max= new ArrayList<>();
        for(int i=0;i<array.length;i++)
        {
            if((i>0 && array[i]<=array[i-1]) || (i != array.length-1 && array[i]<=array[i+1]))//this is important
             {
                max.add(array[i]);
            }
        }
        return max.stream().mapToInt(i->i).toArray();
      /*  int[] result=new int[array.length];
        int j=0;
        for(int i=0;i<array.length;i++){
           if((i>0 && array[i]<=array[i-1]) || (i != array.length-1 && array[i]<=array[i+1])){
               result[j++]=array[i];
           }
        }
        return Arrays.copyOf(result,j);*/
    }
}
