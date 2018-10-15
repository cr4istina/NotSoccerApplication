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

    Sport muayThai = new Sport();
    muayThai.homeClub = team1;
    muayThai.awayClub = team2;

    Wins knockout1 = new Wins();
    knockout1.theFighter = muayThai.homeClub.fighterArray[0];
    knockout1.theSportClub = muayThai.homeClub;
    knockout1.theRound = 1;
    knockout1.theTime = "on 08.20.2017 in Bangkok, Thailand";

    Wins[] theWinner = {knockout1};
    muayThai.wins = theWinner;

        System.out.println("The winner " + muayThai.wins[0].theTime + ", in the " + muayThai.wins[0].theRound + " Round is " + muayThai.wins[0].theFighter.fighterName + " from " + muayThai.wins[0].theSportClub.sportClubName + ".");
        



    }
}
