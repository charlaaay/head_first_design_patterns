public interface Subject {

	public void subscribe(Observer o);
	public void unsubscribe(Observer o);
	public void alertObservers(Stat s);

}