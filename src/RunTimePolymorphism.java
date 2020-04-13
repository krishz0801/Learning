
class MoneyHiest {
	void WhoAmI() {
		System.out.println("We are Robbers");
	}
}

class Professor extends MoneyHiest {
	void WhoAmI() {
		System.out.println("Professor");
	}
}

class Berlin extends MoneyHiest {
	void WhoAmI() {
		System.out.println("Berlin");
	}
}

class Nairobi extends MoneyHiest {
	void WhoAmI() {
		System.out.println("Nairobi");
	}
}

class Helsinki extends MoneyHiest {
	void WhoAmI() {
		System.out.println("Helsinki");
	}
}

class Rio extends MoneyHiest {
	void WhoAmI() {
		System.out.println("Rio");
	}
}

class Tokyo extends MoneyHiest {
	void WhoAmI() {
		System.out.println("Tokyo");
	}
}

class Moscow extends MoneyHiest {
	void WhoAmI() {
		System.out.println("Moscow");
	}
}

class RunTimePolymorphism {
	public static void main(String[] args) {
		MoneyHiest char0 = new MoneyHiest();
		MoneyHiest char1 = new Professor();
		MoneyHiest char2 = new Berlin();
		MoneyHiest char3 = new Nairobi();
		MoneyHiest char4 = new Helsinki();
		MoneyHiest char5 = new Rio();
		MoneyHiest char6 = new Tokyo();
		MoneyHiest char7 = new Moscow();

		char0.WhoAmI();
		char1.WhoAmI();
		char2.WhoAmI();
		char3.WhoAmI();
		char4.WhoAmI();
		char5.WhoAmI();
		char6.WhoAmI();
		char7.WhoAmI();

	}
}
