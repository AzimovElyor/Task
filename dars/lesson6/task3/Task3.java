package online.dars.lesson6.task3;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        /*ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(()-> System.out.println(LocalDateTime.now()),0L,1L, TimeUnit.MILLISECONDS);
        scheduledExecutorService.shutdown();*/
        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
    public static int findKthLargest(int[] nums, int k) {
        int max  = Integer.MIN_VALUE;
        for(int i = k-1; i < nums.length-k-1; i+=k){
            if(nums[i] > max) max = nums[i];
        }
        return max;
    }


    }
