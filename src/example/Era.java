package example;

import java.io.Serializable;

//防御率に関するjavaBeans

public class Era implements Serializable {

	private int inning;
	private int RunsAllowed;
	private double era;

	public Era() {
	}

	public int getInning() {
		return inning;
	}

	public int getRunsAllowed() {
		return RunsAllowed;
	}

	public double getEra(){
		return era;
	}

	public void setInning(int inning) {
		this.inning = inning;
	}

	public void setRunsAllowd(int RunsAllowed) {
		this.RunsAllowed = RunsAllowed;
	}

	public void setEra(double era){
		this.era=era;
	}

}