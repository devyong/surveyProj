package com.survey.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.survey.domain.ResultVO;
import com.survey.service.SurveyResultService;

@RestController

public class ResultController {
	
	@Inject
	private SurveyResultService sRService;
	
	@RequestMapping(value = "/getResult/{sv_id}", method = RequestMethod.GET)
	public ResponseEntity<List<ResultVO>> getResult (@PathVariable("sv_id") int sv_id){
		ResponseEntity<List<ResultVO>> result = null;
		
		try {
			result = new ResponseEntity<>(sRService.listResult(sv_id), HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
			result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		System.out.println(result);
		return result;
		
	}
}
