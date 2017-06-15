public class Main {
	public static void main(String[] args) {
	
		SportFactory factory = new SportFactory();
		factory.createPerson(SportFactory.athleteType.BASKETBALL_PLAYER);
		Person person = factory.getPerson();
		person.whoAmI();
	}
}
