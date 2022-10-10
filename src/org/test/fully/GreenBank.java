package org.test.fully;

public class GreenBank implements RbiBank{

	@Override
	public void saving() {
		System.out.println("Saving 5%");
		
	}

	@Override
	public void current() {
		System.out.println("Current 6%");
		
	}

	@Override
	public void loan() {
		System.out.println("Loan 12%");
		
	}
	
	public static void main(String[] args) {
		
		GreenBank g = new GreenBank();
		
		g.saving();
		g.current();
		g.loan();
		
		RbiBank r = new GreenBank();
		
		r.saving();
		r.current();
		r.loan();
		
		
	}

	
	
	
}
