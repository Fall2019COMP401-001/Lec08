package lec8.ex2.v1;

public interface Student {
	enum Status {FRESHMAN, SOPHOMORE, JUNIOR, SENIOR}

	void addCredits(int num_credits);
	Status getStatus();
	
}
