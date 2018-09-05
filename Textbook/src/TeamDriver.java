
public class TeamDriver
{
	
	public static void main (String [] args)
	{
		TeamDriver td = new TeamDriver();
		Player[] Team = new Player[9];
		Team[0] = new Player("Cornor Maxwell", 23.6, "Pitcher");
		Team[1] = new Player("James Lee", 25.0, "Pitcher");
		Team[2] = new Player("Christian Bale", 24.5, "Pitcher");
		Team[3] = new Player("Ben Saun", 25.7, "Pitcher");
		Team[4] = new Player("Chan Park", 32.6, "Pitcher");
		Team[5] = new Player("Ryan Kim", 15.3, "Pitcher");
		Team[6] = new Player("Luis Wayne", 16.4, "Pitcher");
		Team[7] = new Player("Tom Johnson", 22.3, "Pitcher");
		Team[8] = new Player("Rick Evans", 24.9, "Pitcher");
		Team way = new Team(Team, 3);
		System.out.println(way.getName());
		System.out.println(way.getRate());
		System.out.println(way.getPosition());
		System.out.println();
		way.setNM("Nick Chan");
		way.setRT(33.9);
		way.setPos("Pitcher");
		System.out.println(way.getName());
		System.out.println(way.getRate());
		System.out.println(way.getPosition());
		System.out.println();
		System.out.println(way.toString());
		System.out.println();
		System.out.println(way.equals(Team[1], Team[2]));
		System.out.println();
		System.out.println(way.pitcherCheck(Team));
		System.out.println();
		System.out.println(way.personCheck("Rick Evans", Team));
		System.out.println();
		System.out.println(way.posCheck(Team));
		System.out.println();
		System.out.println(way.percentageTeam(Team));
		System.out.println();
		Player[] newTeam = way.ascendingRate(Team);
		Team way2 = new Team(newTeam, 0);
		System.out.println(way2.getName());
		System.out.println();

	}
}
