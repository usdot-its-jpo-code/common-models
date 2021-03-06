package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "lat", "long" })
public class SeCorner {

	public String getLong() {
		return longitude;
	}

	public void setLong(String longitude) {
		this.longitude = longitude;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	private String longitude;
	private String lat;

}
