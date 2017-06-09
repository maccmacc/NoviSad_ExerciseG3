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
	
	@Test
	public void test_if_spare_works() throws BowlingException{
		BowlingGame game= new BowlingGame();
		game.addFrame(new Frame(10,0));
		String check= Boolean.toString(game.getFrames().get(0).isSpare());
		assertEquals("neocekivani ishod ocekivao se spare", "true", check);
		
	}
	
	@Test
	public void test_if_strike_works() throws BowlingException {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(10,0));
		String check= Boolean.toString(game.getFrames().get(0).isStrike());
		assertEquals("neocekivani ishod ocekivao se spare", "true", check);
	}
	
	
	
	 
	 
	 
	 
		
	 
}
