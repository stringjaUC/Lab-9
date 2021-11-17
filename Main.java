import java.io.*;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<Person>();
    people.add(new Person("John", 22, "Purple"));
    people.add(new Person("Steve", 32, "Red"));
    people.add(new Person("Jay", 23, "Green"));
    people.add(new Person("Grace", 44, "Yellow"));
    people.add(new Person("Katie", 21, "Orange"));
  
  try{
    FileWriter writer = new FileWriter("data.txt");
    BufferedWriter bufferW = new BufferedWriter(writer);
    for (int i = 0; i<people.size(); i++){
      bufferW.write(people.get(i).getName());
      bufferW.newLine();
      bufferW.write(Integer.toString(people.get(i).getAge()));
      bufferW.newLine();
      bufferW.write(people.get(i).getColor());
      bufferW.newLine();
      bufferW.flush();

    }
      bufferW.close();
  }
  catch (IOException e){
    System.out.println("An error occured:" + e);
  }
  try{
    FileReader myFile = new FileReader("data.txt");
    BufferedReader reader = new BufferedReader(myFile);
    while (reader.ready()) {
      String name = reader.readLine();
      String age = reader.readLine();
      String color = reader.readLine();
      System.out.printf("%-10s %-10s %-10s %n", name, age, color);
    }
    reader.close();
  }
  catch (IOException exc){
    System.out.println("An error occured:" + exc);
  }
  
  }
}
