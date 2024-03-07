public class Person
{
  private String name;
  private int    id;
  private static int personCount = 0;

  // constructor
  public Person(String pname)
  {
    name = pname;
    personCount++;
    id = 100 + personCount;
  }

  public String getName()
  {
    return name;
  }

  public int getID()
  {
    return id;
  }


public Person()
{
  this.name = "N/a";
  this.id = -1;
  personCount++;
}


public void reset(String name, int id)
{
  this.name = name;
  this.id = id;

}






  public String  toString()
  {
    return "name: " + name + "  id: " + id
      + "  (Person count: " + personCount + ")";
  }

  
  public static int getCount()
  {
    return personCount;
  }

} 
