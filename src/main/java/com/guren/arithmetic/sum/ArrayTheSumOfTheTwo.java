package com.guren.arithmetic.sum;

import java.util.HashMap;
import java.util.Map;

public class ArrayTheSumOfTheTwo {
  public static void main(String[] args) {
    int[] nums = {3,1,10,5};
    int target = 6;

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++){
      int a = target - nums[i];
      System.out.println(a);
      if (map.containsKey(a)){
        System.out.println(i + "," + map.get(a));
        break;
      }
      map.put(nums[i], i);
    }
  }
}
