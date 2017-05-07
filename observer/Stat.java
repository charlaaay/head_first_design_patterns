import java.util.HashMap;
public abstract class Stat {

	int unixTime;

	public HashMap<Object,Object> getStats() {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put("timestamp", unixTime);
		return map;
	}
}