package rk.test.java.pojo.business;

public class Business02 extends Policy implements Business {

	@Override
	public int execute() {
		// TODO Auto-generated method stub
		System.out.println("Business02 logic");
		return super.getPolicy();

	}

}
