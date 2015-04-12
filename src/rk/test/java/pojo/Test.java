package rk.test.java.pojo;

import rk.test.java.pojo.business.*;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rec(-1);

	}
	
	private static void rec(int x){
		if (x<0){
			x=new Policy().getPolicy();
		}
		
		if (x==6){ 
			System.out.println("Business ends...");
			return;
		}
		else{ 
			Business b=null; 
			if (x==1){
				b = new Business01();
			}
			else if(x==2){
				b = new Business02();
			}
			else if(x==3){
				b = new Business03();
			}
			else if(x==4){
				b = new Business04();
			}
			else if(x==5){
				b = new Business05();
			}
			x=b.execute();
			rec(x);
		}
	}

}
