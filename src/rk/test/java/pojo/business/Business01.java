package rk.test.java.pojo.business;

public class Business01 extends Policy implements Business {

	@Override
	public int execute() {
		// TODO Auto-generated method stub
		System.out.println("Business01 logic");
		return super.getPolicy();

	}

}
