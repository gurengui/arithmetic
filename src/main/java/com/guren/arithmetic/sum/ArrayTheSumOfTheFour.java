package com.guren.arithmetic.sum;

import java.util.*;

public class ArrayTheSumOfTheFour {
  public static void main(String[] args) {
    int[] nums = {-2,0,0,3,3,-1};
    int target = 5;

    List<List<Integer>> result = new ArrayList<>();
    int le = nums.length;
    Arrays.sort(nums);
    List<Integer> list;

    for(int i=0; i<le-3; i++){
      if (nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target){
        break;
      }
      if (nums[i] + nums[le-1] + nums[le-2] + nums[le-3] < target){
        continue;
      }
      if (i > 0 && nums[i] == nums[i-1]){
        continue;
      }
      for(int j=i+1; j<le-2; j++){
        if (nums[i] + nums[j] + nums[j+1] + nums[j+2] > target){
          break;
        }
        if (nums[i] + nums[j] + nums[le-1] + nums[le-2] < target){
          continue;
        }
        if (j > i+1 && nums[j] == nums[j-1]){
          continue;
        }
        int min = j + 1;
        int max = le - 1;
        while(min < max){
          if (min > j+1 && nums[min] == nums[min-1]){
            ++min;
            continue;
          }
          if (max < le-1 && nums[max] == nums[max+1]){
            --max;
            continue;
          }
          int sum = nums[i] + nums[j] + nums[min] + nums[max];
          if (sum > target){
            --max;
          } else if(sum < target){
            ++min;
          } else {
            list = new ArrayList<>();
            list.add(nums[i]);
            list.add(nums[j]);
            list.add(nums[min]);
            list.add(nums[max]);
            result.add(list);
            ++min;
            --max;
          }
        }
      }
    }
    result.forEach(l -> {
      l.forEach(integer -> {
        System.out.print(integer + " ");
      });
      System.out.println();
    });


  }
}
