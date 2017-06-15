public class SportFactory {

	private Person person;

	public enum athleteType {
		BASKETBALL_PLAYER,
		FOOTBALL_PLAYER,
		HOCKEY_PLAYER
	}

	public void createPerson(athleteType type) {

		switch(type) {

			case BASKETBALL_PLAYER:
				this.person = new BasketballPlayer();
				break;
			case FOOTBALL_PLAYER:
				this.person = new FootballPlayer();
				break;
			case HOCKEY_PLAYER:
				this.person = new HockeyPlayer();
				break;
		}
	}

	public Person getPerson() {
		return this.person;
	}
}

