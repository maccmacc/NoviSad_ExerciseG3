import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test(expected=BowlingException.class)
	public void test_of_limits() throws BowlingException{
		BowlingGame game= new BowlingGame();
		game.addFrame(new Frame(0.0));
		game.addFrame(new Frame(0.0));
		game.addFrame(new Frame(0.0));
		game.addFrame(new Frame(0.0));
		game.addFrame(new Frame(0.0));
		game.addFrame(new Frame(0.0));
		game.addFrame(new Frame(0.0));
		
	}
	 @Test (excepted=BowlingException.class)
	 public void test_od_spare_works() throws BowlingExpection {
		 BowlingGame game= new BowlingGame();
		 
		 String check= toString()
		 
	 }
}
