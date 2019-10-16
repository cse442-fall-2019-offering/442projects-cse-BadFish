package game;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DataAccessTestCases {

	@Test
	public void WritingTest() {
		DataAccess x = new DataAccess();
		x.setProfile(0, "Thomas", "Bassett", "Tom", 21, false, 0, false, 0, false, 0, 0);
		x.setProfile(1, "joe", "peter", "Nate", 88, false, 0, false, 0, false, 0, 0);
		x.setProfile(2, "viva-la-vita", "123456", "same3", 105, false, 0, false, 0, false, 0, 0);

		// Profile 0
		Assert.assertEquals(x.getProfile(0).getFirstName(), "Thomas");
		Assert.assertEquals(x.getProfile(0).getLastName(), "Bassett");
		Assert.assertEquals(x.getProfile(0).getFullName(), "Thomas Bassett");
		Assert.assertEquals(x.getProfile(0).getNickName(), "Tom");
		Assert.assertEquals(x.getProfile(0).getAge(), 21);
		Assert.assertEquals(x.getProfile(0).getGameStatus(1), false);
		Assert.assertEquals(x.getProfile(0).getGameStatus(2), false);
		Assert.assertEquals(x.getProfile(0).getGameStatus(3), false);
		Assert.assertEquals(x.getProfile(0).getGameScore(1), 0);
		Assert.assertEquals(x.getProfile(0).getGameScore(2), 0);
		Assert.assertEquals(x.getProfile(0).getGameScore(3), 0);
		Assert.assertEquals(x.getProfile(0).getGameTime(), 0);

		// Profile 1
		Assert.assertEquals(x.getProfile(1).getFirstName(), "joe");
		Assert.assertEquals(x.getProfile(1).getLastName(), "peter");
		Assert.assertEquals(x.getProfile(1).getFullName(), "joe peter");
		Assert.assertEquals(x.getProfile(1).getNickName(), "Nate");
		Assert.assertEquals(x.getProfile(1).getAge(), 88);
		Assert.assertEquals(x.getProfile(1).getGameStatus(1), false);
		Assert.assertEquals(x.getProfile(1).getGameStatus(2), false);
		Assert.assertEquals(x.getProfile(1).getGameStatus(3), false);
		Assert.assertEquals(x.getProfile(1).getGameScore(1), 0);
		Assert.assertEquals(x.getProfile(1).getGameScore(2), 0);
		Assert.assertEquals(x.getProfile(1).getGameScore(3), 0);
		Assert.assertEquals(x.getProfile(1).getGameTime(), 0);

		// Profile 2
		Assert.assertEquals(x.getProfile(2).getFirstName(), "viva-la-vita");
		Assert.assertEquals(x.getProfile(2).getLastName(), "123456");
		Assert.assertEquals(x.getProfile(2).getFullName(), "viva-la-vita 123456");
		Assert.assertEquals(x.getProfile(2).getNickName(), "same3");
		Assert.assertEquals(x.getProfile(2).getAge(), 105);
		Assert.assertEquals(x.getProfile(2).getGameStatus(1), false);
		Assert.assertEquals(x.getProfile(2).getGameStatus(2), false);
		Assert.assertEquals(x.getProfile(2).getGameStatus(3), false);
		Assert.assertEquals(x.getProfile(2).getGameScore(1), 0);
		Assert.assertEquals(x.getProfile(2).getGameScore(2), 0);
		Assert.assertEquals(x.getProfile(2).getGameScore(3), 0);
		Assert.assertEquals(x.getProfile(2).getGameTime(), 0);

		x.saveData();
	}

	@Test
	public void AccessTest() {

		DataAccess x = new DataAccess();

		// Profile 0 updates
		x.getProfile(0).setGameStatus(1, true);
		x.getProfile(0).setGameScore(1, 1034);
		x.getProfile(0).setGameTime(2);

		// Profile 1 updates
		x.getProfile(1).setGameStatus(3, true);
		x.getProfile(1).setGameScore(3, 12098);
		x.getProfile(1).setGameTime(12);

		// Profile 2 updates
		x.getProfile(2).setGameStatus(2, true);
		x.getProfile(2).setGameScore(2, 66);
		x.getProfile(2).setGameTime(1);

		// Profile 0
		Assert.assertEquals(x.getProfile(0).getFirstName(), "Thomas");
		Assert.assertEquals(x.getProfile(0).getLastName(), "Bassett");
		Assert.assertEquals(x.getProfile(0).getFullName(), "Thomas Bassett");
		Assert.assertEquals(x.getProfile(0).getNickName(), "Tom");
		Assert.assertEquals(x.getProfile(0).getAge(), 21);
		Assert.assertEquals(x.getProfile(0).getGameStatus(1), true);
		Assert.assertEquals(x.getProfile(0).getGameStatus(2), false);
		Assert.assertEquals(x.getProfile(0).getGameStatus(3), false);
		Assert.assertEquals(x.getProfile(0).getGameScore(1), 1034);
		Assert.assertEquals(x.getProfile(0).getGameScore(2), 0);
		Assert.assertEquals(x.getProfile(0).getGameScore(3), 0);
		Assert.assertEquals(x.getProfile(0).getGameTime(), 2);

		// Profile 1
		Assert.assertEquals(x.getProfile(1).getFirstName(), "joe");
		Assert.assertEquals(x.getProfile(1).getLastName(), "peter");
		Assert.assertEquals(x.getProfile(1).getFullName(), "joe peter");
		Assert.assertEquals(x.getProfile(1).getNickName(), "Nate");
		Assert.assertEquals(x.getProfile(1).getAge(), 88);
		Assert.assertEquals(x.getProfile(1).getGameStatus(1), false);
		Assert.assertEquals(x.getProfile(1).getGameStatus(2), false);
		Assert.assertEquals(x.getProfile(1).getGameStatus(3), true);
		Assert.assertEquals(x.getProfile(1).getGameScore(1), 0);
		Assert.assertEquals(x.getProfile(1).getGameScore(2), 0);
		Assert.assertEquals(x.getProfile(1).getGameScore(3), 12098);
		Assert.assertEquals(x.getProfile(1).getGameTime(), 12);

		// Profile 3
		Assert.assertEquals(x.getProfile(2).getFirstName(), "viva-la-vita");
		Assert.assertEquals(x.getProfile(2).getLastName(), "123456");
		Assert.assertEquals(x.getProfile(2).getFullName(), "viva-la-vita 123456");
		Assert.assertEquals(x.getProfile(2).getNickName(), "same3");
		Assert.assertEquals(x.getProfile(2).getAge(), 105);
		Assert.assertEquals(x.getProfile(2).getGameStatus(1), false);
		Assert.assertEquals(x.getProfile(2).getGameStatus(2), true);
		Assert.assertEquals(x.getProfile(2).getGameStatus(3), false);
		Assert.assertEquals(x.getProfile(2).getGameScore(1), 0);
		Assert.assertEquals(x.getProfile(2).getGameScore(2), 66);
		Assert.assertEquals(x.getProfile(2).getGameScore(3), 0);
		Assert.assertEquals(x.getProfile(2).getGameTime(), 1);

		x.saveData();

	}

	@Test
	public void ReadingTest() {

		DataAccess x = new DataAccess();

		// Profile 0
		Assert.assertEquals(x.getProfile(0).getFirstName(), "Thomas");
		Assert.assertEquals(x.getProfile(0).getLastName(), "Bassett");
		Assert.assertEquals(x.getProfile(0).getFullName(), "Thomas Bassett");
		Assert.assertEquals(x.getProfile(0).getNickName(), "Tom");
		Assert.assertEquals(x.getProfile(0).getAge(), 21);
		Assert.assertEquals(x.getProfile(0).getGameStatus(1), true);
		Assert.assertEquals(x.getProfile(0).getGameStatus(2), false);
		Assert.assertEquals(x.getProfile(0).getGameStatus(3), false);
		Assert.assertEquals(x.getProfile(0).getGameScore(1), 1034);
		Assert.assertEquals(x.getProfile(0).getGameScore(2), 0);
		Assert.assertEquals(x.getProfile(0).getGameScore(3), 0);
		Assert.assertEquals(x.getProfile(0).getGameTime(), 2);

		// Profile 1
		Assert.assertEquals(x.getProfile(1).getFirstName(), "joe");
		Assert.assertEquals(x.getProfile(1).getLastName(), "peter");
		Assert.assertEquals(x.getProfile(1).getFullName(), "joe peter");
		Assert.assertEquals(x.getProfile(1).getNickName(), "Nate");
		Assert.assertEquals(x.getProfile(1).getAge(), 88);
		Assert.assertEquals(x.getProfile(1).getGameStatus(1), false);
		Assert.assertEquals(x.getProfile(1).getGameStatus(2), false);
		Assert.assertEquals(x.getProfile(1).getGameStatus(3), true);
		Assert.assertEquals(x.getProfile(1).getGameScore(1), 0);
		Assert.assertEquals(x.getProfile(1).getGameScore(2), 0);
		Assert.assertEquals(x.getProfile(1).getGameScore(3), 12098);
		Assert.assertEquals(x.getProfile(1).getGameTime(), 12);

		// Profile 3
		Assert.assertEquals(x.getProfile(2).getFirstName(), "viva-la-vita");
		Assert.assertEquals(x.getProfile(2).getLastName(), "123456");
		Assert.assertEquals(x.getProfile(2).getFullName(), "viva-la-vita 123456");
		Assert.assertEquals(x.getProfile(2).getNickName(), "same3");
		Assert.assertEquals(x.getProfile(2).getAge(), 105);
		Assert.assertEquals(x.getProfile(2).getGameStatus(1), false);
		Assert.assertEquals(x.getProfile(2).getGameStatus(2), true);
		Assert.assertEquals(x.getProfile(2).getGameStatus(3), false);
		Assert.assertEquals(x.getProfile(2).getGameScore(1), 0);
		Assert.assertEquals(x.getProfile(2).getGameScore(2), 66);
		Assert.assertEquals(x.getProfile(2).getGameScore(3), 0);
		Assert.assertEquals(x.getProfile(2).getGameTime(), 1);

		x.saveData();

	}

}
