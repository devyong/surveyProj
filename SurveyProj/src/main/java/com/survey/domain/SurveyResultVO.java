package com.survey.domain;

import java.util.Date;

public class SurveyResultVO {
	private int result_id;
	private String m_id;
	private int list_id;
	private Date survey_result;
	
	public int getResult_id() {
		return result_id;
	}
	public void setResult_id(int result_id) {
		this.result_id = result_id;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public int getList_id() {
		return list_id;
	}
	public void setList_id(int list_id) {
		this.list_id = list_id;
	}
	public Date getSurvey_result() {
		return survey_result;
	}
	public void setSurvey_result(Date survey_result) {
		this.survey_result = survey_result;
	}
	
	
}
