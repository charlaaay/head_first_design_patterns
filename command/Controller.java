public class Controller {
  private Command command;


  public Controller(Command c) {
    this.command = c;
  }

  public void doAction() {
    command.execute();
  }

}
