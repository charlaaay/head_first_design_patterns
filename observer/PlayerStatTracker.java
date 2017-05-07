import java.util.HashMap;
public class PlayerStatTracker implements Observer {

	public void updatePlayerStat(PlayerStat s) {
		System.out.println("KDR: " + s.getKillDeathRatio());
	}

	public void update(Stat s, HashMap<Object,Object> map) {
		Class cls = s.getClass();
		String className = cls.getName();

		System.out.println("I have access to any stats that are updated");
		System.out.println("The class is " + className);
		System.out.println("The KDR is " + map.get("kdr"));
	}

}