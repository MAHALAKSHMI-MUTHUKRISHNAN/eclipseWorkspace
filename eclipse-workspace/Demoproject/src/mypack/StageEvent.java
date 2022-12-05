package mypack;

public class StageEvent extends Event{

	private Integer noOfSeats;
	

	public StageEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public StageEvent(String name, String detail, String type, String organiserName, Integer noOfSeats) {
		super(name, detail, type, organiserName);
		this.noOfSeats = noOfSeats;
	}

	public Integer getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
}
