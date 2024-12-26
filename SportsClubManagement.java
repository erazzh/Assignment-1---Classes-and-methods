class Sport {
    private String name;
    private int players;

    Sport(String name, int players) { this.name = name; this.players = players; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPlayers() { return players; }
    public void setPlayers(int players) { this.players = players; }

    public String toString() { return name + " (Players: " + players + ")"; }
}

class Player {
    private String name, sport;
    private int age;

    Player(String name, int age, String sport) { this.name = name; this.age = age; this.sport = sport; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getSport() { return sport; }
    public void setSport(String sport) { this.sport = sport; }

    public String toString() { return name + " (Age: " + age + ", Sport: " + sport + ")"; }
}

class SportsClub {
    private String name, location;

    SportsClub(String name, String location) { this.name = name; this.location = location; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String toString() { return name + " (Location: " + location + ")"; }
}

public class SportsClubManagement {
    public static void main(String[] args) {
        Sport football = new Sport("Football", 11);
        Sport basketball = new Sport("Basketball", 5);

        Player player1 = new Player("Yermakhan Yesmyrza", 17, "Football");
        Player player2 = new Player("Yeraly Zhumagul", 17, "Basketball");

        SportsClub club1 = new SportsClub("City Club", "Astana");
        SportsClub club2 = new SportsClub("City Club", "Almaty");

        System.out.println(football);
        System.out.println(basketball);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(club1);
        System.out.println(club2);
    }
}
