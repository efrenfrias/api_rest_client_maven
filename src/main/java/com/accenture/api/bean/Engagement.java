package com.accenture.api.bean;

public class Engagement {
	
	private int count;
	private String social_sentence;
	
	public Engagement() {
		super();
	}

	public Engagement(int count, String social_sentence) {
		super();
		this.count = count;
		this.social_sentence = social_sentence;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getSocial_sentence() {
		return social_sentence;
	}

	public void setSocial_sentence(String social_sentence) {
		this.social_sentence = social_sentence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((social_sentence == null) ? 0 : social_sentence.hashCode());
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
		Engagement other = (Engagement) obj;
		if (count != other.count)
			return false;
		if (social_sentence == null) {
			if (other.social_sentence != null)
				return false;
		} else if (!social_sentence.equals(other.social_sentence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engagement [count=" + count + ", social_sentence=" + social_sentence + "]";
	}

	
	
}
