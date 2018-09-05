public class OldMacDonald
{
public static void main(String[] args)
{
	Farm oldFarm = new Farm();
	oldFarm.animalSounds();
    Cow c = new Cow();
    System.out.println(c.getType() + " goes " + c.getSound());
    Chick ch = new Chick();
    Pig p = new Pig();
    System.out.println( ch.getType() + " goes " + ch.getSound());
    System.out.println( p.getType() + " goes " + p.getSound());
  }
}
