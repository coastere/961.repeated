package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] A = {5,1,5,2,5,3,5,4};
        HashSet<Integer> aa = new HashSet<>();
        for (int i = 0; i <A.length ; i++) {
            if (aa.contains(A[i])) {
                System.out.println(A[i]);
                break;
            }else
                aa.add(A[i]);

        }

    }
}
