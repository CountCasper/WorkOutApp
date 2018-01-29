import java.util.Random;
public class Movement {
	private static String[] disciplines = {"Cardio","Gymnastic","Dumbbell","Kettel bell","Olimpic Lifting","Power Lifting","StrongMan"};
	private static String[] cardioTypes = {"Run"};
	private static String[] gymnasticTypes = {"Ring Muscle ups"};
	private static String[] dumbellTypes = {"Dumbell Thrusters"};
	private static String[] kettelBellTypes = {"Snatch"};
	private static String[] olimpicLiftTypes = {"Snatch"};
	private static String[] powerLiftTypes = {"DeadLift"};
	private static String[] strongManTypes = {"Farmer Carry"};
	
	private int set;
	private int dist;
	private int weight;
	
	private String chosenDis;
	private String chosenMove;
	public Movement(){
		Random rand = new Random();
		
		
		//this.chosenMove = rand.nextInt(10) + 1;
		
		this.chosenDis = disciplines[rand.nextInt(disciplines.length)];
		choseMoves();
		
		
	}
	
	private void choseMoves(){
		Random rand = new Random();
		if(this.chosenDis.equals("Cardio")){
			this.chosenMove = cardioTypes[rand.nextInt(cardioTypes.length)];
		}else if(this.chosenDis.equals("Gymnastic")){
			this.chosenMove = gymnasticTypes[rand.nextInt(gymnasticTypes.length)];
		}else if(this.chosenDis.equals("Dumbbell")){
			this.chosenMove = dumbellTypes[rand.nextInt(dumbellTypes.length)];
		}else if(this.chosenDis.equals("Kettel bell")){
			this.chosenMove = kettelBellTypes[rand.nextInt(kettelBellTypes.length)];
		}else if(this.chosenDis.equals("Olimpic Lifting")){
			this.chosenMove = olimpicLiftTypes[rand.nextInt(olimpicLiftTypes.length)];
		}else if(this.chosenDis.equals("Power Lifting")){
			this.chosenMove = powerLiftTypes[rand.nextInt(powerLiftTypes.length)];
		}else if(this.chosenDis.equals("StrongMan")){
			this.chosenMove = strongManTypes[rand.nextInt(strongManTypes.length)];
		}else{
			this.chosenMove = "Error";
		}
	}
	
	public int getSet() {
		return set;
	}
	public void setSet(int set) {
		this.set = set;
	}
	public int getDist() {
		return dist;
	}
	public void setDist(int dist) {
		this.dist = dist;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getChosenDis() {
		return chosenDis;
	}
	public void setChosenDis(String chosenDis) {
		this.chosenDis = chosenDis;
	}
	public String getChosenMove() {
		return chosenMove;
	}
	public void setChosenMove(String chosenMove) {
		this.chosenMove = chosenMove;
	}
	@Override
	public String toString() {
		return "Movement [set=" + set + ", dist=" + dist + ", weight=" + weight + ", chosenDis=" + chosenDis
				+ ", chosenMove=" + chosenMove + "]";
	}

}
