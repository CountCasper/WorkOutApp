import java.util.Arrays;
import java.util.Random;

public class Reps {
	private int Rep;
	private Movement[] moves;
	private int numMoves;
	
	public Reps(){
		Random rand = new Random();
		Random rand2 = new Random();
		this.Rep = rand.nextInt(3) + 1;
		this.numMoves = rand.nextInt(10) + 1;
		this.moves = new Movement[numMoves];;
		
		for (int i=0; i<numMoves; i++){
			moves[i]= new Movement();
		}
		
	}
	public int getRep() {
		return Rep;
	}
	public void setRep(int rep) {
		Rep = rep;
	}
	public Movement[] getMoves() {
		return moves;
	}
	public void setMoves(Movement[] moves) {
		this.moves = moves;
	}
	public int getNumMoves() {
		return numMoves;
	}
	public void setNumMoves(int numMoves) {
		this.numMoves = numMoves;
	}
	@Override
	public String toString() {
		return "Reps [Rep=" + Rep + ", moves=" + Arrays.toString(moves) + ", numMoves=" + numMoves + "]";
	}
	
}
