public class main {

	public static void main(String[] args) {

		Person p = new Person(72, 150);
		ClownDecorator cd = new ClownDecorator(p);
		cd.describeYourself(); 
	}
}