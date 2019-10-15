package game;

public class Profile {

	private String FirstName;
	private String LastName;
	private String NickName;
	private int Age;
	private boolean Game1;
	private int Score1;
	private boolean Game2;
	private int Score2;
	private boolean Game3;
	private int Score3;
	private int GameTime;

	public Profile(String firstName, String lastName, String nickName, int age, boolean game1, int score1,
			boolean game2, int score2, boolean game3, int score3, int gameTime) {
		FirstName = firstName;
		LastName = lastName;
		NickName = nickName;
		Age = age;
		Game1 = game1;
		Score1 = score1;
		Game2 = game2;
		Score2 = score2;
		Game3 = game3;
		Score3 = score3;
		GameTime = gameTime;
	}

	public String getFullName() {
		return FirstName + " " + LastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getNickName() {
		return NickName;
	}

	public int getAge() {
		return Age;
	}

	// Note: Returns False if input is invalid
	public boolean getGameStatus(int gameNumber) {
		if (gameNumber == 1) {
			return Game1;
		} else if (gameNumber == 2) {
			return Game2;
		} else if (gameNumber == 3) {
			return Game3;
		} else {
			return false;
		}
	}

	public boolean setGameStatus(int gameNumber, boolean finished) {
		if (gameNumber == 1) {
			Game1 = finished;
			return true;
		} else if (gameNumber == 2) {
			Game2 = finished;
			return true;
		} else if (gameNumber == 3) {
			Game3 = finished;
			return true;
		} else {
			// Invalid game number Input
			return false;
		}
	}
	
	public int getGameScore(int gameNumber) {
		if (gameNumber == 1) {
			return Score1;
		} else if (gameNumber == 2) {
			return Score2;
		} else if (gameNumber == 3) {
			return Score3;
		} else {
			return -1;
		}
	}
	
	public boolean setGameScore(int gameNumber, int score) {
		if (gameNumber == 1) {
			Score1 = score;
			return true;
		} else if (gameNumber == 2) {
			Score2 = score;
			return true;
		} else if (gameNumber == 3) {
			Score3 = score;
			return true;
		} else {
			// Invalid game number Input
			return false;
		}
	}
	
	public int getGameTime() {
		return GameTime;
	}
	
	public void setGameTime(int gameTime) {
		GameTime = gameTime;
	}
	
}
