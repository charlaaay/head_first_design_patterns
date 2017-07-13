public class CreateUnit implements Command{

  private Unit unit;
  public CreateUnit(Unit u) {
    this.unit = u;
  }

  public void execute() {
    this.unit.build();
  }
}
