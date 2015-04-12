package rk.test.java.pojo.business;

public class Business03 extends Policy implements Business {

	@Override
	public int execute() {
		// TODO Auto-generated method stub
		System.out.println("Business03 logic");
		return super.getPolicy();
	}

}
