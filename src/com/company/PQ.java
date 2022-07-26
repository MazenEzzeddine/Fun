package com.company;

import java.util.PriorityQueue;
import java.util.Queue;


public class PQ
{
    public static void main(String[] args) {
        Queue<Integer> qi = new PriorityQueue<>();
        for (int i = 0; i < 15; i++)
            qi.add((int) (Math.random()*100));
        while (!qi.isEmpty())
            System.out.print(qi.poll() + " ");
        System.out.println();
    }
}