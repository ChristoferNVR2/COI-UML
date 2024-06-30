import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Player messi = new Player("Lionel Messi", LocalDate.of(1987, 6, 24), "Rosario, Argentina", "Forward", 10);
        Player Gabi = new Player("Gabi", LocalDate.of(1983, 7, 10), "Zaragoza, Spain", "Midfielder", 14);
        System.out.println(messi);
        System.out.println(messi.toString2());

        Country spain = new Country("Spain", "ESP");
        Country argentina = new Country("Argentina", "ARG");
        Team Spain = new Team("Spain", spain);
        Team Argentina = new Team("Argentina", argentina);

        Argentina.addPlayer(messi);
        Spain.addPlayer(Gabi);


    }
}