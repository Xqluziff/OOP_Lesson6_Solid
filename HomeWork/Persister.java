public class Persister implements Function {
	private User user;
	
	public Persister(User user){
		this.user = user;
	}


	@Override
	public void report() {
		System.out.println("Report for user: " + user.getName());
	}

	@Override
	public void save() {
		System.out.println("Save user: " + user.getName());

	}
}