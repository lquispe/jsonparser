package com.ludtek.jsonparser.model;

import java.net.URI;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cotizacion {

	private final String uuid;
	private final String token;
	private final long idUsuario;
	private final String idCotizacion;
	private final URI uriIpref;
	private final String postcodesId;
	private final int version;
	private final List<Campo> campos;
	private final List<Lote> lotes;

	@JsonCreator
	public Cotizacion(@JsonProperty("uuid") String uuid,
			@JsonProperty("token") String token,
			@JsonProperty("idUsuario") long idUsuario,
			@JsonProperty("idCotizacion") String idCotizacion,
			@JsonProperty("urii_pref") URI uriIpref,
			@JsonProperty("postcodes_id") String postcodesId,
			@JsonProperty("version") int version,
			@JsonProperty("campos") List<Campo> campos,
			@JsonProperty("lotes") List<Lote> lotes) {
		super();
		this.uuid = uuid;
		this.token = token;
		this.idUsuario = idUsuario;
		this.idCotizacion = idCotizacion;
		this.uriIpref = uriIpref;
		this.postcodesId = postcodesId;
		this.version = version;
		this.campos = campos;
		this.lotes = lotes;
	}

	public String getUuid() {
		return uuid;
	}

	public String getToken() {
		return token;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public String getIdCotizacion() {
		return idCotizacion;
	}

	public URI getUriIpref() {
		return uriIpref;
	}

	public String getPostcodesId() {
		return postcodesId;
	}

	public int getVersion() {
		return version;
	}

	public List<Campo> getCampos() {
		return campos;
	}

	public List<Lote> getLotes() {
		return lotes;
	}

	@Override
	public String toString() {
		return "Cotizacion [uuid=" + uuid + ", token=" + token + ", idUsuario="
				+ idUsuario + ", idCotizacion=" + idCotizacion + ", uriIpref="
				+ uriIpref + ", postcodesId=" + postcodesId + ", version="
				+ version + ", campos=" + campos + ", lotes=" + lotes + "]";
	}

}
