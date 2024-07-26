package com.numerodasorte.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.numerodasorte.daos.SegredoDAO;
import com.numerodasorte.jogo.Numerosorte;

@Controller
public class formController {

	@Autowired
	private SegredoDAO segredoDao;

	@RequestMapping("/segredo/form")
	public String form() {
		return "segredo/form";
	}

	@RequestMapping ("/segredo")
	public String gravar (Numerosorte Numerosorte) {

		System.out.println (Numerosorte);
		segredoDao.gravar(Numerosorte);
		return "segredo/adivinhei";
	}
}
