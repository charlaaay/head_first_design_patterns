import java.util.ArrayList;

public class StatsManager implements Subject{
	ArrayList<Observer> listeners = new ArrayList<Observer>();

	public StatsManager() {}

	public void subscribe(Observer o) {
		this.listeners.add(o);
	}

	public void unsubscribe(Observer o) {
		int index = this.listeners.indexOf(o);

		if (index >= 0) {
			this.listeners.remove(o);
		}
	}

	public void alertObservers(Stat s) {
		for (Observer o : listeners) {
			o.update(s, s.getStats());
		}
	}

}