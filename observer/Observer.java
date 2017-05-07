import java.util.HashMap;
public interface Observer {

	public void update(Stat s, HashMap<Object,Object> stats);
}