package com.baykalsoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;


public class MissingInteger {


  public static void main(String[] args) {

        int [] a = {6,2,4,2,3,9};
//        int [] a = {-3,3,1};
//    int[] a = {-3, -2, -1};
    Arrays.sort(a);
//    bubbleSort(a);
    List<Integer> list = new ArrayList<>();
    for (int e : a) {
      list.add(Integer.valueOf(e));
    }
    System.out.println(list);

    //Create set from array elements
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list);

    //Get back the array without duplicates
    Integer[] noduplicates = linkedHashSet.toArray(new Integer[]{});
    List<Integer> nodup = Arrays.asList(noduplicates);

    //Verify the array content
    System.out.println(Arrays.toString(noduplicates));

    int last = noduplicates.length;
    List<Integer> min2max = new ArrayList<>();
    for (int i = 1; i <= noduplicates[last - 1]; i++) {
      min2max.add(i);
    }
    System.out.println(min2max);

    boolean found = false;
    int smallest = 0;
    for (int e : min2max) {
      if (nodup.contains(e)) {
        continue;
      } else if (e <= 0) {
        continue;
      } else {
        smallest = e;
        found = true;
        break;
      }
    }
    if (!found) {
      smallest = noduplicates[last - 1] + 1;
      if (smallest == 0) {
        ++smallest;
      }
    }
    System.out.println(smallest);


  }




}