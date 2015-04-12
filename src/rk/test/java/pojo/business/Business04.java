package rk.test.java.pojo.business;

public class Business04  extends Policy implements Business {

	@Override
	public int execute() {
		// TODO Auto-generated method stub
		System.out.println("Business04 logic");
		return super.getPolicy();

	}

}
