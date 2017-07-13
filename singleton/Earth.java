public class Earth {

  private static Earth instance = null;
  private int population = 0;

  public static Earth getInstance() {
    if (instance == null)
      instance = new Earth();

    return instance;
  }

  public void setPopulation(int p) {
    this.population = p;
  }

  public int getPopulation() {
    return this.population;
  }
}
