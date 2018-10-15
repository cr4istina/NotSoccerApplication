package box;

public class League {
    public static void main(String[] args) {
    Fighter fighter1 = new Fighter();
    fighter1.fighterName = "Buakaw Por. Pramuk";
    Fighter fighter2 = new Fighter();
    fighter2.fighterName = "Yodsankai Fairtex";
    Fighter fighter3 = new Fighter();
    fighter3.fighterName = "Saenchai";
    Fighter[] theFighters = {fighter1, fighter2, fighter3};
    SportClub team1 = new SportClub();
    team1.sportClubName = "Thailand";
    team1.fighterArray = theFighters;

    SportClub team2 = new SportClub();
    team2.sportClubName = "The Others";
    team2.fighterArray = new Fighter[3];
    team2.fighterArray[0] = new Fighter();
    team2.fighterArray[0].fighterName = "Azize Hlali";
    team2.fighterArray[1] = new Fighter();
    team2.fighterArray[1].fighterName = "Enriko Kehl";
    team2.fighterArray[2] = new Fighter();
    team2.fighterArray[2].fighterName = "Tetsuya Yamoto";

        for (Fighter theFighter : team1.fighterArray) {
            System.out.println(theFighter.fighterName);
        }

        for (Fighter theFighter : team2.fighterArray) {
            System.out.println(theFighter.fighterName);
        }

    }
}
