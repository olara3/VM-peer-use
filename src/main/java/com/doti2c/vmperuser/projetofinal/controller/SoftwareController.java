package com.doti2c.vmperuser.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doti2c.vmperuser.projetofinal.dao.SoftwareDAO;
import com.doti2c.vmperuser.projetofinal.model.Software;

@RestController
@CrossOrigin("*")
public class SoftwareController {
	
	@Autowired
	private SoftwareDAO swDao;

	@GetMapping("/softwares")
	public ResponseEntity<ArrayList<Software>> recuperarTodos(){
			ArrayList<Software> lista = (ArrayList<Software>)swDao.findAll();
			return ResponseEntity.ok(lista);
	}
	
}
