public class TesteData{
   public static void main (String args[])
   {
      Data data = new Data(06, 04, 2018);
      System.out.println("Meu aniversario: "+ data.toString());
      
      data.setData(31,02, 2018);
      System.out.println("Que data e essa?" + data.toString());
      
   }
}