package com.zhiyou100.modle;

public class QueryVO {

private Integer page;
private Integer began;
private  String videoTitleKeyWord;
private String speakerSearchField;
private String courseSearchField;
public String getVideoTitleKeyWord() {
	return videoTitleKeyWord;
}
public void setVideoTitleKeyWord(String videoTitleKeyWord) {
	this.videoTitleKeyWord = videoTitleKeyWord;
}
public String getSpeakerSearchField() {
	return speakerSearchField;
}
public void setSpeakerSearchField(String speakerSearchField) {
	this.speakerSearchField = speakerSearchField;
}
public String getCourseSearchField() {
	return courseSearchField;
}
public void setCourseSearchField(String courseSearchField) {
	this.courseSearchField = courseSearchField;
}
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
@Override
public String toString() {
	return "QueryVO [page=" + page + ", began=" + began + ", videoTitleKeyWord=" + videoTitleKeyWord
			+ ", speakerSearchField=" + speakerSearchField + ", courseSearchField=" + courseSearchField + "]";
}




}
