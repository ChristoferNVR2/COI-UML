import java.time.LocalDate;

public class Player extends Person {
    private String position;
    private int number;
    private Team team;

    public Player(String name, LocalDate birthDate, String birthPlace, String position, int number) {
        super(name, birthDate, birthPlace);
        this.position = position;
        this.number = number;
    }

    public Player(String name, LocalDate birthDate, String birthPlace, String position, int number, Team team) {
        super(name, birthDate, birthPlace);
        this.position = position;
        this.number = number;
        this.team = team;
    }

    @Override
    public String getInfo() {
        return super.getName() + ", Age: " + super.calculateAge() + ", Position: " + position + ", Number: " + number;
    }

    public String getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return super.getName() + ", Age: " + super.calculateAge() + ", Position: " + position + ", Number: " + number;
    }
}
