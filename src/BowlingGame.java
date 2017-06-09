import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:03:48pm
// Student ID:IT57/2015

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException{
		//to be implemented
		if(frame.size()<10)
		{
			frames.add(frame);
		}else
			throw new BowlingException();
			
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		int score=0;
		for(int i=0;i<getFramesNumber(); i++)
		{
			score+=((List<Frame>) this.getFrames()).get(i).score();
		}
		return 0;
	}

	private int getFramesNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getFrames() {
		// TODO Auto-generated method stub
		return null;
	}
}
