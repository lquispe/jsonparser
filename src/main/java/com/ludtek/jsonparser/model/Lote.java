package com.ludtek.jsonparser.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lote {

	private final long id;
	private final Campo campo;
	private final String gPoly;
	private final List<Coordenada> coordenadas;
	private final double ha;
	private final double centroLat;
	private final double centroLong;
	private final CodigoPostal codigoPostal;
	private final String cultivo;
	private final int cultivoId;
	private final String imagenSat;
	private final boolean valido;

	public Lote(@JsonProperty("id") long id,
			@JsonProperty("campo") Campo campo,
			@JsonProperty("gPoly") String gPoly,
			@JsonProperty("coordenadas") List<Coordenada> coordenadas,
			@JsonProperty("ha") double ha,
			@JsonProperty("CentroLat") double centroLat,
			@JsonProperty("CentroLong") double centroLong,
			@JsonProperty("codPos") CodigoPostal codigoPostal,
			@JsonProperty("cultivo") String cultivo,
			@JsonProperty("cultivo_id") int cultivoId,
			@JsonProperty("imagenSat") String imagenSat,
			@JsonProperty("valido") boolean valido) {
		super();
		this.id = id;
		this.campo = campo;
		this.gPoly = gPoly;
		this.coordenadas = coordenadas;
		this.ha = ha;
		this.centroLat = centroLat;
		this.centroLong = centroLong;
		this.codigoPostal = codigoPostal;
		this.cultivo = cultivo;
		this.cultivoId = cultivoId;
		this.imagenSat = imagenSat;
		this.valido = valido;
	}

	public long getId() {
		return id;
	}

	public Campo getCampo() {
		return campo;
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

	public CodigoPostal getCodigoPostal() {
		return codigoPostal;
	}

	public String getCultivo() {
		return cultivo;
	}

	public int getCultivoId() {
		return cultivoId;
	}

	public String getImagenSat() {
		return imagenSat;
	}

	public boolean isValido() {
		return valido;
	}

	@Override
	public String toString() {
		return "Lote [id=" + id + ", campo=" + campo + ", gPoly=" + gPoly
				+ ", coordenadas=" + coordenadas + ", ha=" + ha
				+ ", centroLat=" + centroLat + ", centroLong=" + centroLong
				+ ", codigoPostal=" + codigoPostal + ", cultivo=" + cultivo
				+ ", cultivoId=" + cultivoId + ", imagenSat=" + imagenSat
				+ ", valido=" + valido + "]";
	}

}
