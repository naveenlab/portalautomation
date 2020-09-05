package com.onlineClass.warmup;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Learning";
		String[] arr=str.split("");
		for(String w:arr) {
			if(w.equals(" ")) {
				continue;
			}else {
				
			}
			System.out.println(w);
		}
		
	}

}
