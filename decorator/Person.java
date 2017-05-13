public class Person {

	int height;
	int weight;

	Person(int h, int w) {
		this.height = h;
		this.weight = w;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWeight() {
		return this.weight;
	}

	public void describeYourself() {
		String str = String.format("I'm about %d inches tall and weigh %d lbs", this.height, this.weight);
		System.out.println(str);
	}

}