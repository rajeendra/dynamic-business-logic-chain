package rk.test.java.pojo.business;

public class Business05 extends Policy implements Business {

	@Override
	public int execute() {
		// TODO Auto-generated method stub
		System.out.println("Business05 logic");
		return super.getPolicy();

	}

}
