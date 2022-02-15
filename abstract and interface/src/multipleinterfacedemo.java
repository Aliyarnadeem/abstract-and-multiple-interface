interface PersonWorking
{
void working();
}
interface PersonTravelling
{
void travelling();
}
interface PersonSleeping
{
void sleeping();
}
class Person implements PersonWorking, PersonTravelling, PersonSleeping
{
public void working()
{
System.out.println("person is working");
}
public void travelling()
{
System.out.println("person is travelling");
}
public void sleeping()
{
System.out.println("person is sleeping");
}
}
public class multipleinterfacedemo
{
public static void main(String args[])
{
Person a = new Person();
a.working();
a.travelling();
a.sleeping();
}
}
