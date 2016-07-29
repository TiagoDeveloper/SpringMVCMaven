package br.com.springMVCMaven.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.com.springMVCMaven.model.GenericDao;
import br.com.springMVCMaven.model.Produto;

@Controller
public class SpringController {

	@Autowired
	private GenericDao<Produto> dao;
	
	@RequestMapping("/")
	public String home(){
		
		
		
		return "templates/template";
	}
	
	@RequestMapping("cadastrar")
	public String cadastrados(@RequestParam("imagem") MultipartFile file,
			@RequestParam("nome") String nome,
			@RequestParam("descricao") String descricao) throws IOException{
		
		Produto p = new Produto(null,nome,descricao,file.getBytes());
		
		
		
		this.dao.insere(p);
		
		List<Produto> p2 = this.dao.lista();
		
		
		
			
		FileOutputStream in =new FileOutputStream("C:\\Users\\Tiago\\Desktop\\imagem.jpg");
			
		in.write(p2.get(0).getImagem());
		
		in.close();
		
		//model.addAttribute("produtos", );
		
		
		return "index";
	}
}
