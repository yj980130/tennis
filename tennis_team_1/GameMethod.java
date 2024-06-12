package tennis_team_1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameMethod extends FileManager{
	public static int [][] scoreArr = new int [2][5]; //2팀 5세트까지 점수 저장
	static int plus = 0;

	// 2팀과 3개의 점수 체계(포인트, 게임, 세트)
	static int [][] scores = new int[2][4];
	DispScoreBoard dp = new DispScoreBoard();
	public static ArrayList <String> team1totalscore= new ArrayList<String>();
	public static ArrayList <String> team2totalscore= new ArrayList<String>();

	public int getSet(String gender) {	//세트

		Scanner scanner = new Scanner(System.in);
		int selectSet =0;

		do {

			if (gender.contains("남자")) {
				selectSet = 5;
			}else if (gender.contains("여자") || gender.contains("혼성")) {
				selectSet = 3;
			}else {
				System.out.println("성별(남자,여자,혼성)을 입력하세요");
			}
			System.out.println();
			//if

		} while (!gender.contains("남자") &&  !gender.contains("여자") &&  !gender.contains("혼성")); //do~while

		return selectSet;
	}

	public boolean getMode(String gender) {// 단식이면 true, 복식, 혼성이면 false
		
		if (gender.contains("혼성")) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃" + "\t".repeat(6) + "┃");
			System.out.println("┃" + "\t".repeat(6) + "┃");
			System.out.println("┃\t[혼성복식, 3세트]를 선택하셨습니다.\t┃");
			System.out.println("┃" + "\t".repeat(6) + "┃");
			System.out.println("┃" + "\t".repeat(6) + "┃");
			System.out.println("┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚");
			System.out.println();
			System.out.println();
			System.out.println();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}

		Scanner scanner = new Scanner(System.in);
		String modeStr = "";

		do {
			System.out.print("> 단식, 복식 경기 선택하세요 : ");
			System.out.print("\n → ");
			modeStr = scanner.next();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

			if(modeStr.equals("단식") && gender.equals("남자") ) {
				System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┃\t[남자단식, 5세트]를 선택하셨습니다.\t┃");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚");
				System.out.println();
				System.out.println();
				System.out.println();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return true;

			} else if(modeStr.equals("복식") && gender.equals("남자")) {
				System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┃\t[남자복식, 5세트]를 선택하셨습니다.\t┃");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚");
				System.out.println();
				System.out.println();
				System.out.println();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return false;

			} else if(modeStr.equals("단식") && gender.equals("여자")) {
				System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┃\t[여자단식, 3세트]를 선택하셨습니다.\t┃");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚");
				System.out.println();
				System.out.println();
				System.out.println();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return true;

			} else if(modeStr.equals("복식") && gender.equals("여자")) {
				System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┃\t[여자복식, 3세트]를 선택하셨습니다.\t┃");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┃" + "\t".repeat(6) + "┃");
				System.out.println("┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚");
				System.out.println();
				System.out.println();
				System.out.println();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return false;

			} else {
				System.out.println("단식 혹은 복식을 선택해주세요.");
			}
		} while (!modeStr.equals("단식") && !modeStr.equals("복식"));
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		return false;
	}
	
	public void pointWinner(int p, int set) {

		String [] points = {"0", "15", "30", "40", "WIN"};
		//score, game, set
		// p는 1과 2중 랜덤값을 받아옴
		// 1팀과 2팀을 나눠주는 행에 p-1을 줌으로써 0번째 방의 값을 가지는 팀1
		// 이나 1번째방의 값을 가지는 팀2에게 점수를 올려줌 
		scores[p-1][0]++;
		dp.dispPointScore(scores[0][0], scores[1][0]);

		// 포인트가 3-3(40-40)인 경우 듀스 룰 적용
		if (scores[0][0] == 3 && scores[1][0] == 3) {
			playDeuce(set);
		}

		// 한 팀의 포인트가 3(40) 이상이 되면 게임 점수 획득
		if (scores[p-1][0] > 3) {
			team1totalscore.add(points[scores[0][0]]);   			//팀 1 점수 저장
			team2totalscore.add(points[scores[1][0]]);   			//팀 2 점수 저장
			plusGame(p, set);
			scores[0][0] = scores[1][0] = 0;
		}

	}

	public void plusGame(int p, int set) {
		scores[p-1][1]++;
		++scoreArr[p-1][plus]; 										//게임수, 세트수 종합으로 txt에 저장하기 위한 배열

		// 한 팀이 다른 팀보다 2게임 이상 앞서고 6게임 이상 먼저 따면 세트 점수 획득
		if (scores[p-1][1] - scores[2-p][1] >= 2 && scores[p-1][1] >= 6) {
			plusSet(p, set);
			team1totalscore.add("setchange");						//세트별 구분자 :
			team2totalscore.add("setchange");						//세트별 구분자 :
			scores[0][1] = scores[1][1] = 0;
			plus++;
		}
	}

	public void plusSet(int p, int set) {

		scores[p-1][2]++;
		dp.dispSetScore(scores[0][2], scores[1][2]);
		// 한 팀의 세트 점수가 총 세트 수의 절반 이상이면 승리
		if (scores[p-1][2] >= (set/2+1)) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("\t\t┏" + "━".repeat(56) + "┓");
			System.out.println("\t\t┃\t\t\t\t\t\t\t ┃");
			System.out.println("\t\t┃\t\t\t\t\t\t\t ┃");
			System.out.println("\t\t┃\t\t\t\t\t\t\t ┃");
			System.out.println("\t\t┃\t\t\t최종 승리팀 \t\t\t ┃");
			System.out.println("\t\t┃\t\t\t\t\t\t\t ┃");
			System.out.println("\t\t┃\t\t     ▷ ▶ ▷ " + "Team" + p + " ◁ ◀ ◁\t\t\t ┃");
			System.out.println("\t\t┃\t\t\t\t\t\t\t ┃");
			System.out.println("\t\t┃\t\t\t\t\t\t\t ┃");
			System.out.println("\t\t┃\t\t\t\t\t\t\t ┃");
			System.out.println("\t\t┃\t\t경기결과를 파일로 저장합니다...\t\t ┃");
			System.out.println("\t\t┗" + "━".repeat(56) + "┛");
			System.out.println();

			totalscoreprint(p);
			System.exit(0);
		} 
	}

	public void playDeuce(int set) {
		System.out.println("┌" + "-".repeat(40) + "> Deuce <" + "-".repeat(40) + "┐");
		System.out.println();
		System.out.printf("\t\t\t  Team1 : %s\t   VS\tTeam2 : %s\n", Player.team1player, Player.team2player);
		System.out.println();
		Random rnd = new Random();
		int p;
		// 한 팀이 다른 팀보다 2점 선취할 때까지 반복
		while (true) {
			p = rnd.nextInt(2)+1;
			if (p==1) {
				scores[p-1][3]++;

				if (scores[0][3]==1) {
					scores[1][3]=0;
					System.out.printf("\t\t\t    Team1 : %s \t Team2 : %s\n","AD\t",  "\t");
					System.out.println();
					p = rnd.nextInt(2)+1;
					try {
						Thread.sleep(700);
					} catch (Exception e) {
						e.printStackTrace();
					}
					if (p==1) {

						System.out.printf("\t\t\t    Team1 : %s \t Team2 : %s\n","WIN\t",  "\t");
						System.out.println();
						try {
							Thread.sleep(700);
						} catch (Exception e) {
							e.printStackTrace();
						}
						System.out.println("\t\t\t\t     > Team1 승리 <");
						System.out.println();
						System.out.println("└" + "-".repeat(89) + "┘");
						try {
							Thread.sleep(700);
						} catch (Exception e) {
							e.printStackTrace();
						}
						System.out.println();
						plusGame(p, set);
						scores[0][0] = scores[1][0] = 0;
						scores[0][3] = scores[1][3] = 0;
						break;
					}else if (p==2) {
						System.out.printf("\t\t\t    Team1 : %s \t Team2 : %s\n","40\t",  "40\t");
						System.out.println();
						try {
							Thread.sleep(700);
						} catch (Exception e) {
							e.printStackTrace();
						}
						scores[0][3] = scores[1][3] = 0;
						continue;
					}
				}//if (scores[][])

			}//if(p==1)

			if (p==2) {
				scores[p-1][3]++;

				if (scores[1][3]==1) {
					scores[0][3]=0;
					System.out.printf("\t\t\t    Team1 : %s \t Team2 : %s\n","\t",  "AD\t");
					System.out.println();
					try {
						Thread.sleep(700);
					} catch (Exception e) {
						e.printStackTrace();
					}
					p = rnd.nextInt(2)+1;

					if (p==2) {
						System.out.printf("\t\t\t    Team1 : %s \t Team2 : %s\n","\t",  "Win\t");
						System.out.println();
						try {
							Thread.sleep(700);
						} catch (Exception e) {
							e.printStackTrace();
						}
						System.out.println("\t\t\t\t     > Team2 승리 <");
						System.out.println();
						System.out.println("└" + "-".repeat(89) + "┘");
						try {
							Thread.sleep(700);
						} catch (Exception e) {
							e.printStackTrace();
						}
						System.out.println();

						plusGame(p, set);
						scores[0][0] = scores[1][0] = 0;
						scores[0][3] = scores[1][3] = 0;

						break;
					}else if (p==1) {
						System.out.printf("\t\t\t    Team1 : %s \t Team2 : %s\n","40\t",  "40\t");
						System.out.println();
						try {
							Thread.sleep(700);
						} catch (Exception e) {
							e.printStackTrace();
						}
						scores[0][3] = scores[1][3] = 0;
						continue;   
					}
				}//if (scores[][])
			}//if(p==2)
		}//while
	} //playDeuce

	public static void totalscoreprint(int p) {
		int set=1;

		int team1gamewin=0;                   //1세트에서 획득한 team1의 점수
		int team2gamewin=0;
		String setreport="";                  //세트별 점수 문자열

		String team1line="team1: (1세트) ";   //team1의 score 정리할 문자열
		String team2line="team2: (1세트) ";   //team2의 score를 정리할 문자열

		for(int i =0; i <team1totalscore.size(); i ++) {
			if(team1totalscore.get(i).equals("setchange")) {   //배열안에 포함된 setchange를 구분자로 세트를 나눈다.
				if(team1gamewin>team2gamewin) 
					setreport += set+"세트 "+team1gamewin +":"+team2gamewin+ " team1 승리\n";
				else setreport += set+"세트 "+team1gamewin +":"+team2gamewin+ " team2 승리\n";
				set++;
				team1line += "\n\t\t("+set+"세트)";
				team2line += "\n\t\t("+set+"세트) ";                     
				team1gamewin=team2gamewin=0;
			}//if

			else{
				team1line += team1totalscore.get(i)+ "\t";         		//team1line에 team1totalscore 더하기
				team2line += team2totalscore.get(i)+ "\t";         		//team2line에 team2totalscore 더하기
				if(team1totalscore.get(i).equals("AD")) team1gamewin++; //한 세트 안에서 획득한 게임++
				else team2gamewin++;
			}//else
		}//for

		if(team1gamewin>team2gamewin)
			setreport += set+"세트 "+team1gamewin +":"+team2gamewin+ " team1 승리\n";
		else setreport += set+"세트 "+team1gamewin +":"+team2gamewin+ " team2 승리\n";

		String totalscore = "<총 경기 결과>\n"+p+"팀 승리\n";            
		String line1,line2, line3, line4, line5, line6, line7, line8, line9; 

		line1 = "─".repeat(25);
		line2 = "Set	    Team 1		Team 2\n";
		line3 = " 1		  "+ scoreArr[0][0]+"			  " + scoreArr[1][0]+"\n";
		line4 = " 2		  "+ scoreArr[0][1]+"			  " + scoreArr[1][1]+"\n";
		line5 = " 3		  "+ scoreArr[0][2]+"			  " + scoreArr[1][2]+"\n";
		line6 = " 4		  "+ scoreArr[0][3]+"			  " + scoreArr[1][3]+"\n";
		line7 = " 5		  "+ scoreArr[0][4]+"			  " + scoreArr[1][4]+"\n";
		line8 = "\n Tot	  "+ scores[0][2]+"			  " + scores[1][2]+"\n";

		String line = line2+line3+line4+line5+line6+line7;

		if (p == 1) totalscore += "승자 : " + Player.team1player+"\n\n"+line1+"\n"+line+line1+line8+line1;
		else totalscore += "승자 : " + Player.team2player+"\n\n"+line1+"\n"+line+line1+line8+line1;

		txtout(totalscore);

	} //totalscoreprint()
}// GameMethod (class)

