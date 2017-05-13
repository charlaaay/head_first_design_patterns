public class ClownDecorator implements PersonDecorator {

	Person person;

	ClownDecorator(Person p) {
		this.person = p;
	}

	public void describeYourself() {
		this.person.describeYourself();
		System.out.println("I'm also a clown that has a big red nose");
	}
}