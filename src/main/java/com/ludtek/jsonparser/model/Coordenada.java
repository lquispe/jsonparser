package com.ludtek.jsonparser.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coordenada {

	private final double latitud;
	private final double longitud;

	public Coordenada(@JsonProperty("k") double latitud,
			@JsonProperty("C") double longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public double getLatitud() {
		return latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	@Override
	public String toString() {
		return "Coordenada [latitud=" + latitud + ", longitud=" + longitud
				+ "]";
	}

}
