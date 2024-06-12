package tennis_team_1;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Tennis extends GameMethod {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		GameMethod g = new GameMethod(); 							//GameMethod 클래스 객체 g 생성
		Player p = new Player(); 									//Player 클래스 객체 p 생성
		String gender;

		System.out.println();
		System.out.print("\t\t");
		animateStars(50, 0.5);
		System.out.println("\t\t☆" + " ".repeat(48) + "☆");
		System.out.println("\t\t★" + "\t\t    테니스 게임\t\t\t ★");
		System.out.println("\t\t☆" + " ".repeat(48) + "☆");
		System.out.print("\t\t");
		animateStars(50, 0.5);
		System.out.println();
		System.out.println("\t\t→ 계속하려면 엔터를 누르세요.");
		System.in.read();
		System.in.skip(System.in.available());
		System.out.print("> 성별을 입력하세요(남자, 여자, 혼성)");
		System.out.print("\n → ");
		gender = scanner.next();

		int set = g.getSet(gender);         						// 세트 결정
		boolean mode = g.getMode(gender);   						// 입력받은 gender변수에 따라 단식 복식
		Random rnd = new Random();

		// 1팀 or 2팀   ,  player이름
		String [][] playername = p.Inputplayer(mode);
		p.getteam1player(playername);
		p.getteam2player(playername);

		while(true) {
			g.pointWinner(rnd.nextInt(2)+1, set);
		}
	}

	private static void animateStars(int count, double intervalInSeconds) {
		String blackStar = "★";
		String whiteStar = "☆";
		for (int i = 0; i < count; i++) {
			if (i % 2 == 0) System.out.print(blackStar);
			else System.out.print(whiteStar);
			try {
				TimeUnit.MILLISECONDS.sleep((long) (intervalInSeconds * 30));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
