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
	
	@Test
	public void test_score() throws BowlingException {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(5,2));
		String check= Integer.toString(game.getFrames().get(0).score());
		assertEquals("greska se ne poklapa sa ocekivanjima", "7", check);
		
	}
	
	@Test
	public void check_if_single_frame_score_is_inside_bounds() throws BowlingException{
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(5,6));
	}
	
	@Test
	public void check_if_game_score_works() throws BowlingException{
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(1,4));
		game.addFrame(new Frame(1,10));
		game.addFrame(new Frame(1,3));
	    String score = Integer.toString(game.score());
	    assertEquals("Rezultat se ne poklapa","20",score);
	}
	
	 
	 
	 
	 
		
	 
}
