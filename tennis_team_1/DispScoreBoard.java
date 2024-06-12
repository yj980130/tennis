package tennis_team_1;

public class DispScoreBoard {

	public void dispPointScore (int t1_score, int t2_score){

		String [] points = {"0", "15", "30", "40", "WIN"};	//"WIN"값을 넣어주기 위해 String형으로 points배열 선언
		GameMethod g = new GameMethod();
		System.out.println();
		System.out.println("┏" + "━".repeat(89) + "┓");
		System.out.println();
		System.out.printf("\t\t\t Team1 : %s\t VS\tTeam2 : %s\n", Player.team1player, Player.team2player);
		System.out.println();
		System.out.printf("\t\t\tScore\t\t\tGame\t\t\tSet\t\t\n");
		System.out.printf("\tTeam1\t\t%s\t\t\t%d\t\t\t%d\t\t\n", points[t1_score], g.scores[0][1], g.scores[0][2]);
		System.out.println();
		System.out.printf("\tTeam2\t\t%s\t\t\t%d\t\t\t%d\t\t\n", points[t2_score], g.scores[1][1], g.scores[1][2]);
		System.out.println();
		System.out.println();
		System.out.println("┗" + "━".repeat(89) + "┛");
		System.out.println();
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void dispGameScore (int t1_game, int t2_game) {
		//System.out.printf("[ Team1 게임 점수 : %d \t Team2 게임 점수 : %d ]\n", t1_game, t2_game);
	}

	public void dispSetScore (int t1_set, int t2_set){

		System.out.printf("\t\t**** [ Team1 세트 점수 : %d \t Team2 세트 점수 : %d ] ****\n", t1_set, t2_set);
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
