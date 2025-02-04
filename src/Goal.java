public class Goal extends Event {

    public Goal(Match match, int minute, Player player) {
        super(match, minute, player);
    }

    @Override
    public String getInfo() {
        return "Goal by " + getPlayer().getName() + " at " + getMinute() + " minute in match " + getMatch().getTeam1().getName() + " vs " + getMatch().getTeam2().getName();
    }
}
