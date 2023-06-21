public class Main{
	public static void main(String[] args){

		Persister persister = new Persister(new User("Bob"));
		persister.report();
		persister.save();

	}
}