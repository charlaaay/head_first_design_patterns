public class main {

  public static void main(String[] args) {

    SCV scv = new SCV();
    CreateUnit unit = new CreateUnit(scv);
    Controller controller = new Controller(unit);

    #The controller doesn't know very much about the command, it simply executes it and relies on the createUnit command to make the SCV
    controller.doAction();
    
  }
}
