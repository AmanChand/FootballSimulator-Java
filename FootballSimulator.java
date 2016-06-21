public class FootballSimulator
{
	public static void main(String[] args)
	{
		int touchDown = 7;
		int fieldGoal = 3;
		int homeScore = 0;
		int awayScore = 0;
		boolean homeBall = true;
		boolean awayBall = false;
		boolean gameInProgress = false;
		
		double coinToss = Math.random();
		if (coinToss <= 0.5)
		{
			homeBall = true;
			System.out.println("The Oregon Ducks won the coin toss!");
			gameInProgress = true;
		}
		else
		{
			awayBall = true;
			System.out.println("The Ohio State Buckeyes won the coin toss!");
			gameInProgress = true;
		}
		
		while (gameInProgress)
		{
			while (homeBall)
			{
			double homeChance = Math.random();
			if (homeChance < 0.4)
			{
				System.out.print("Oregon turnover!");
				System.out.println( " Oregon Ducks: " + homeScore + " Ohio State Buckeyes: " + awayScore );
				homeBall = false;
				awayBall = true;
			}
			else if (0.4 <= homeChance)
			{
				if (homeChance < 0.8)
				{
					homeScore = homeScore + fieldGoal;
					System.out.print("Oregon field goal!");
					System.out.println( " Oregon Ducks: " + homeScore + " Ohio State Buckeyes: " + awayScore );
					homeBall = false;
					awayBall = true;
				}
				else
				{
					homeScore = homeScore + touchDown;
					System.out.print("Touchdown Ducks!");
					System.out.println( " Oregon Ducks: " + homeScore + " Ohio State Buckeyes: " + awayScore );
					homeBall = false;
					awayBall = true;
				}
			}
		}
 
		while (awayBall)
		{
			double awayChance = Math.random();
			if (awayChance < 0.4)
			{
				System.out.print("Ohio State turnover!");
				System.out.println( " Oregon Ducks: " + homeScore + " Ohio State Buckeyes: " + awayScore );
				homeBall = true;
				awayBall = false;
			}
			else if (0.4 <= awayChance)
			{
				if (awayChance < 0.8)
				{
					awayScore = awayScore + fieldGoal;
					System.out.print("Ohio State field goal!");
					System.out.println( " Oregon Ducks: " + homeScore + " Ohio State Buckeyes: " + awayScore );
					homeBall = true;
					awayBall = false;
				}
				else
				{
					awayScore = awayScore + touchDown;
					System.out.print("Touchdown Buckeyes");
					System.out.println( " Oregon Ducks: " + homeScore + " Ohio State Buckeyes: " + awayScore );
					homeBall = true;
					awayBall = false;
				}
			}
		}
		
		if (homeScore >= 50)
		{
			System.out.println("Final Score: Oregon Ducks " + homeScore + ", Ohio State Buckeyes " + awayScore);
			gameInProgress = false;
		}
 
		if (awayScore >= 50)
		{
			System.out.println("Final Score: Oregon Ducks " + homeScore + ", Ohio State " + awayScore);
			gameInProgress = false;
		}
		
		}
 
	}
 
}