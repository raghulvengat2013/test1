package com.te.program;

import java.util.Scanner;

public class Array {
	    public static void main(String[] args) {
	    	 Scanner scan=new Scanner(System.in);
	    	    int size=scan.nextInt();
	    	    int[][]arr=new int[size*size][size*size];
	    	    for(int i=0;i<size;i++){
	    	        for(int j=0;j<size;j++){
	    	            arr[i][j]=scan.nextInt();  
	    	        }
	    	    }
	    	}
	    }

