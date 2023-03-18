package javaexamples;

import java.util.*;

public class LinkedListKthLargest {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(10);
        list.add(20);
        list.add(25);
        list.add(30);
        System.out.println("Enter the value of K ");
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder()); 
        for (Integer i : list) {
            pq.offer(i);
        }
        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }
        int kthLargest = pq.poll();
        System.out.println(kthLargest);
    }
}
