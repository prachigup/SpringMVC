package com.prachi.common.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prachi.common.dao.M2000Dao;
import com.prachi.common.model.M2000;


@RestController
public class M2000Controller {

	@Autowired
	private M2000Dao m2000Dao;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<?> getListAll() {
		List<M2000> mlist = new ArrayList<M2000>();
		try{
			mlist = m2000Dao.listAll();
		}catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<M2000>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<M2000>>(mlist, HttpStatus.OK);
	}
}
