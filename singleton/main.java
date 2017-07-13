public class main {


  public static void main(String [] args) {

    Earth e = Earth.getInstance();
    e.setPopulation(14);
    System.out.println("The population is " + e.getPopulation());

    Earth e1 = Earth.getInstance();
    System.out.println("The population is " + e1.getPopulation());
  }



}
