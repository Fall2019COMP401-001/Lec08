package lec8.ex2.v1;

public interface Professor {
	
	enum Rank {ASSISTANT, ASSOCIATE, FULL};
	
	void promote();
	Rank getRank();
}
