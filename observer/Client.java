//Business logic that brings instantiates the app

public class Client {

	public static void main(String[] args) {

		StatsManager manager = new StatsManager();
		PlayerStatTracker tracker = new PlayerStatTracker();
		manager.subscribe(tracker);

		//create mock stat
		PlayerStat stat = new PlayerStat(23843283,11, 7);
		//alert the subscribers that a new stat just came in
		manager.alertObservers(stat);
	}
}