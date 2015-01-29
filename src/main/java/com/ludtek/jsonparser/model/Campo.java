package com.ludtek.jsonparser.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Campo {

	private final long id;
	private final int cantidadLotes;
	private final String gPoly;
	private final List<Coordenada> coordenadas;
	private final double ha;
	private final double centroLat;
	private final double centroLong;
	private final String desc;
	private final CodigoPostal codigoPostal;
	private final String imagenSat;
	private final String imagenSatConLotes;
	private final boolean valido;

	public Campo(@JsonProperty("id") long id,
			@JsonProperty("CantidadLotes") int cantidadLotes,
			@JsonProperty("gPoly") String gPoly,
			@JsonProperty("coordenadas") List<Coordenada> coordenadas,
			@JsonProperty("ha") double ha,
			@JsonProperty("CentroLat") double centroLat,
			@JsonProperty("CentroLong") double centroLong,
			@JsonProperty("dec") String desc,
			@JsonProperty("codPos") CodigoPostal codigoPostal,
			@JsonProperty("imagenSat") String imagenSat,
			@JsonProperty("imagenSatConLotes") String imagenSatConLotes,
			@JsonProperty("valido") boolean valido) {
		super();
		this.id = id;
		this.cantidadLotes = cantidadLotes;
		this.gPoly = gPoly;
		this.coordenadas = coordenadas;
		this.ha = ha;
		this.centroLat = centroLat;
		this.centroLong = centroLong;
		this.desc = desc;
		this.codigoPostal = codigoPostal;
		this.imagenSat = imagenSat;
		this.imagenSatConLotes = imagenSatConLotes;
		this.valido = valido;
	}

	public long getId() {
		return id;
	}

	public int getCantidadLotes() {
		return cantidadLotes;
	}

	public String getgPoly() {
		return gPoly;
	}

	public List<Coordenada> getCoordenadas() {
		return coordenadas;
	}

	public double getHa() {
		return ha;
	}

	public double getCentroLat() {
		return centroLat;
	}

	public double getCentroLong() {
		return centroLong;
	}

	public String getDesc() {
		return desc;
	}

	public CodigoPostal getCodigoPostal() {
		return codigoPostal;
	}

	public String getImagenSat() {
		return imagenSat;
	}

	public String getImagenSatConLotes() {
		return imagenSatConLotes;
	}

	public boolean isValido() {
		return valido;
	}

	@Override
	public String toString() {
		return "Campo [id=" + id + ", cantidadLotes=" + cantidadLotes
				+ ", gPoly=" + gPoly + ", coordenadas=" + coordenadas + ", ha="
				+ ha + ", centroLat=" + centroLat + ", centroLong="
				+ centroLong + ", desc=" + desc + ", codigoPostal="
				+ codigoPostal + ", imagenSat=" + imagenSat
				+ ", imagenSatConLotes=" + imagenSatConLotes + ", valido="
				+ valido + "]";
	}

}
