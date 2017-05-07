import java.util.HashMap;
public class PlayerStat extends Stat {

	protected int kills;
	protected int deaths;

	public PlayerStat(int timestamp, int kills, int deaths) {
		this.unixTime = timestamp;
		this.kills = kills;
		this.deaths = deaths;
	}


	public HashMap<Object,Object> getStats() {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put("timestamp", this.unixTime);
		map.put("kills", this.kills);
		map.put("deaths", this.deaths);
		map.put("kdr", getKillDeathRatio());
		return map;
	}

	public double getKillDeathRatio() {
		if (this.deaths == 0) {
			return 0;
		}
		return (double) this.kills / (double) this.deaths;
	}

	public int getKills() {
		return this.kills;
	}

	public int getDeaths() {
		return this.deaths;
	}

}