package com.test.sales;

public class SalesData {
	int data[] = {0,44,12};
	public void display(){
		int sum = 0;
		for(int i=0;i<data.length;i++) {
			sum += i;
			System.out.println("TODO: Implement data display" + data[i]);
		}
		System.out.println("sum value are:" + sum);
	}
}
