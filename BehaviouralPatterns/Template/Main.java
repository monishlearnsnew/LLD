package BehaviouralPatterns.Template;

public class Main {
   public static void main(String[] args){
     JsonParser jsonParser = new JsonParser();
     CSVParser csvParser = new CSVParser();
     jsonParser.parse();
     csvParser.parse();
   }
}
