class Aunty {
	public Aunty() {
		// default constructor
		// it's your wish to write this constructor
	}

	public void job() {
		System.out.println("Aunty reffering for a software developer");
	}
}

class Unclem {
	static public void main(String[] y) {
		Aunty a1 = new Aunty();

		// calling the job method on the Aunty instance
		System.out.print("From Aunty instance: ");
		a1.job();

		// calling the job method on the Unclem instance
		System.out.print("From Unclem instance: ");
		Dinga.needjob(a1);

		// calling the job method on the Dinga instance
		System.out.print("From Dinga instance: ");
		Dinga.needjob(a1);

		// calling the job method on the Dingi instance
		System.out.print("From Dingi instance: ");
		new Dingi().needjob(a1);

	}
}

class Dinga {
	static void needjob(Aunty a2) {
		// calling the "job" method on the Aunty instance passed as argument
		System.out.print("From Aunty instance passed to Dinga: ");
		a2.job();
	}
}

class Dingi {
	void needjob(Aunty a3) {
		// calling the "job" method on the Aunty instance passed as argument
		System.out.print("From Aunty instance passed to Dingi: ");
		a3.job();
	}
}