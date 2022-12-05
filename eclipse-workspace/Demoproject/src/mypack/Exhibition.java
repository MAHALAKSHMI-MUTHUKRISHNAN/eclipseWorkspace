package mypack;

public class Exhibition extends Event{
	private Integer noOfStalls;

	public Exhibition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exhibition(String name, String detail, String type, String organiserName) {
		super(name, detail, type, organiserName);
		// TODO Auto-generated constructor stub
	}

	public Exhibition(String name, String detail, String type, String organiserName, Integer noOfStalls) {
		super(name, detail, type, organiserName);
		this.noOfStalls = noOfStalls;
	}

	public Integer getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(Integer noOfStalls) {
		this.noOfStalls = noOfStalls;
	}
}
