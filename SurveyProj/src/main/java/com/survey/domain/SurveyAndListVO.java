package com.survey.domain;

public class SurveyAndListVO {
	private int sv_id;
	private String sv_title;
	private String sv_writer;
	private int list_id;
	private String list_content;
	
	public int getSv_id() {
		return sv_id;
	}
	public void setSv_id(int sv_id) {
		this.sv_id = sv_id;
	}
	public String getSv_title() {
		return sv_title;
	}
	public void setSv_title(String sv_title) {
		this.sv_title = sv_title;
	}
	public String getSv_writer() {
		return sv_writer;
	}
	public void setSv_writer(String sv_writer) {
		this.sv_writer = sv_writer;
	}
	public int getList_id() {
		return list_id;
	}
	public void setList_id(int list_id) {
		this.list_id = list_id;
	}
	public String getList_content() {
		return list_content;
	}
	public void setList_content(String list_content) {
		this.list_content = list_content;
	}
	
	
}
