package library;

public class Books extends Item {

	private String fantasy;
	private String historic;
	private String romance;

	public Books() {
		super();
	}

	public String getFantasy() {
		return fantasy;
	}

	public void setFantasy(String fantasy) {
		this.fantasy = fantasy;
	}

	public String getHistoric() {
		return historic;
	}

	public void setHistoric(String historic) {
		this.historic = historic;
	}

	public String getRomance() {
		return romance;
	}

	public void setRomance(String romance) {
		this.romance = romance;
	}

}