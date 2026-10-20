import java.util.Objects;

public class Player {
    private int playerId;
    private String username;
    private int level;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return playerId == player.playerId && level == player.level && Objects.equals(username, player.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, username, level);
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", username='" + username + '\'' +
                ", level=" + level +
                '}';
    }

    public Player(int playerId, String username, int level) {
        this.playerId = playerId;
        this.username = username;
        this.level = level;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
