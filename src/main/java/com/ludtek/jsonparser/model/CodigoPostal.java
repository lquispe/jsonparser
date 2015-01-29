package com.ludtek.jsonparser.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CodigoPostal {

	private final long postcodeId;
	private final double latitude;
	private final double longitude;
	private final String postalCode;
	private final String region1Name;
	private final String region2Name;
	private final String locality;
	private final String subLocality;

	public CodigoPostal(@JsonProperty("postcodes_id") long postcodeId,
			@JsonProperty("Latitude") double latitude,
			@JsonProperty("Longitude") double longitude,
			@JsonProperty("PostalCode") String postalCode,
			@JsonProperty("Region1Name") String region1Name,
			@JsonProperty("Region2Name") String region2Name,
			@JsonProperty("Locality") String locality,
			@JsonProperty("SubLocality") String subLocality) {
		super();
		this.postcodeId = postcodeId;
		this.latitude = latitude;
		this.longitude = longitude;
		this.postalCode = postalCode;
		this.region1Name = region1Name;
		this.region2Name = region2Name;
		this.locality = locality;
		this.subLocality = subLocality;
	}

	public long getPostcodeId() {
		return postcodeId;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getRegion1Name() {
		return region1Name;
	}

	public String getRegion2Name() {
		return region2Name;
	}

	public String getLocality() {
		return locality;
	}

	public String getSubLocality() {
		return subLocality;
	}

	@Override
	public String toString() {
		return "CodigoPostal [postcodeId=" + postcodeId + ", latitude="
				+ latitude + ", longitude=" + longitude + ", postalCode="
				+ postalCode + ", region1Name=" + region1Name
				+ ", region2Name=" + region2Name + ", locality=" + locality
				+ ", subLocality=" + subLocality + "]";
	}

}
