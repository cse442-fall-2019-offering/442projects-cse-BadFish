package game;

public class DataAccessTestCases {
	
	public static void main(String[] args) {
	
	DataAccess x = new DataAccess();
	System.out.println(x.getProfile(0).getNickName());
	x.getProfile(0).setGameStatus(1, true);
	x.getProfile(0).setGameStatus(2, true);
	x.getProfile(0).setGameStatus(3, true);
	x.saveData();
	
	DataAccess y = new DataAccess();
	System.out.println(x.getProfile(0).getNickName());
	x.getProfile(0).setGameStatus(1, true);
	x.getProfile(0).setGameStatus(2, true);
	x.getProfile(0).setGameStatus(3, true);
	x.saveData();
	
	DataAccess z = new DataAccess();
	System.out.println(x.getProfile(0).getNickName());
	x.getProfile(0).setGameStatus(1, true);
	x.getProfile(0).setGameStatus(2, true);
	x.getProfile(0).setGameStatus(3, true);
	x.saveData();
	
	
	}
	
}
