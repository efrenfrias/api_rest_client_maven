package com.accenture.api.bean;

public class OgObjectBean {
	
	private Engagement engagement;
	private String id;
	
	public OgObjectBean() {
		super();
	}

	public OgObjectBean(Engagement engagement, String id) {
		super();
		this.engagement = engagement;
		this.id = id;
	}

	public Engagement getEngagement() {
		return engagement;
	}

	public void setEngagement(Engagement engagement) {
		this.engagement = engagement;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engagement == null) ? 0 : engagement.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		OgObjectBean other = (OgObjectBean) obj;
		if (engagement == null) {
			if (other.engagement != null)
				return false;
		} else if (!engagement.equals(other.engagement))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OgObjectBean [engagement=" + engagement + ", id=" + id + "]";
	}
		

	
}
