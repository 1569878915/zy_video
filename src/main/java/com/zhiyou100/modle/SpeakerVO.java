package com.zhiyou100.modle;

public class SpeakerVO {
	private Integer page;
	private Integer began;
	private String speakerSearchField;
	private String jobSearchField;
	
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getBegan() {
		return began;
	}

	public void setBegan(Integer began) {
		this.began = began;
	}

	public String getSpeakerSearchField() {
		return speakerSearchField;
	}

	public void setSpeakerSearchField(String speakerSearchField) {
		this.speakerSearchField = speakerSearchField;
	}

	public String getJobSearchField() {
		return jobSearchField;
	}

	public void setJobSearchField(String jobSearchField) {
		this.jobSearchField = jobSearchField;
	}

	@Override
	public String toString() {
		return "SpeakerVO [page=" + page + ", began=" + began + ", speakerSearchField=" + speakerSearchField
				+ ", jobSearchField=" + jobSearchField + "]";
	}
	
}
