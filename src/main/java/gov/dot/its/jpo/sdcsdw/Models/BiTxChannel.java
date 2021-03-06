package gov.dot.its.jpo.sdcsdw.Models;

public class BiTxChannel {
	private String ch178;
	private String chControl;
	private String chService;
	private String ch172;
	private String ch174;
	private String ch176;
	private String ch180;
	private String ch182;
	private String ch184;
	
	public String getCh178() {
		return ch178;
	}

	public void setCh178(String ch178) {
		this.ch178 = ch178;
	}
	
	public String getChControl() {
		return this.chControl;
	}

	public void setChControl(String chControl) {
		this.chControl = chControl;
	}
	
	public String getChService() {
		return this.chService;
	}

	public void setChService(String chService) {
		this.chService = chService;
	}
	
	public String getCh172() {
		return this.ch172;
	}

	public void setCh172(String ch172) {
		this.ch172 = ch172;
	}
	
	public String getCh174() {
		return this.ch174 ;
	}

	public void setCh174(String ch174) {
		this.ch174 = ch174;
	}
	
	public String getCh176() {
		return this.ch176;
	}

	public void setCh176(String ch176) {
		this.ch176 = ch176;
	}
	
	public String getCh180() {
		return this.ch180;
	}

	public void setCh180(String ch180) {
		this.ch180 = ch180;
	}
	
	
	public String getCh182() {
		return this.ch182;
	}

	public void setCh182(String ch182) {
		this.ch182 = ch182;
	}
	
	public String getCh184() {
		return this.ch184;
	}

	public void setCh184(String ch184) {
		this.ch184 = ch184;
	}
	

	public void setChannel(int channel) {
		switch (channel) {
		case 0:
			setChControl("");
			break;
		case 1:
			setChService("");
			break;
		case 2:
			setCh172("");
			break;
		case 3:
			setCh174("");
			break;
		case 4:
			setCh176("");
			break;
		case 5:
			setCh178("");
			break;
		case 6:
			setCh180("");
			break;
		case 7:
			setCh182("");
			break;
		case 8:
			setCh184("");
			break;

		default:
			break;
		};
			
	}

}
