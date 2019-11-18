package com.accenture.api.reponse;

import com.accenture.api.bean.OgObjectBean;

public class ShareCountResponse {
	
	private OgObjectBean og_object;
	private String id;
	
	public ShareCountResponse() {
		super();
	}
	
	public ShareCountResponse(OgObjectBean og_object, String id) {
		super();
		this.og_object = og_object;
		this.id = id;
	}
	

	
	public OgObjectBean getOg_object() {
		return og_object;
	}

	public void setOg_object(OgObjectBean og_object) {
		this.og_object = og_object;
	}

	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((og_object == null) ? 0 : og_object.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShareCountResponse other = (ShareCountResponse) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (og_object == null) {
			if (other.og_object != null)
				return false;
		} else if (!og_object.equals(other.og_object))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShareCountBean [ogObject=" + og_object + ", id=" + id + "]";
	}
	
}
