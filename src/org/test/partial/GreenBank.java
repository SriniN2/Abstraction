package org.test.partial;

public class GreenBank extends RbiBank{

	public void saving() {
		System.out.println("Saving 5%");
	}
	
	public void current() {
		System.out.println("Current 4%");
	}
	
	public void goldLoan() {
		System.out.println("Gold loan 55%");
	}
	
	public static void main(String[] args) {
		
		GreenBank g = new GreenBank();
		
		g.saving();
		g.current();
		g.goldLoan();
		
		RbiBank r = new GreenBank();
		
		r.saving();
		r.current();
		
		
	}
}
