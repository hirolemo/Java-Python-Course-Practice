public class Main {
    public static void main(String[] args) {

        Team<FootballPlayer> Hawks = new Team<>("Hawks");
        Team<FootballPlayer> Dolphins = new Team<>("Dolphins");
        Team<FootballPlayer> Crocodiles = new Team<>("Crocs");

        League<Team<FootballPlayer>> CFL = new League<>("CFL");

        CFL.addTeam(Hawks);
        CFL.addTeam(Crocodiles);
        CFL.addTeam(Dolphins);

        Hawks.matchResult(Dolphins, 4, 5);
        Crocodiles.matchResult(Dolphins, 6, 6);
        Dolphins.matchResult(Crocodiles, 10, 0);
        CFL.printLeague();




    }
}
