package br.com.springMVCMaven.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
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
	public String cadastrados(@RequestParam("imagem") MultipartFile file,Produto p, HttpServletRequest request) throws IOException{
		
		//Produto p = new Produto(null,nome,descricao,file.getBytes());
		
		
		
		this.dao.insere(p);
		
		List<Produto> p2 = this.dao.lista();
		
		System.out.println(file.getOriginalFilename());
		
			
	/*	FileOutputStream in =new FileOutputStream("C:\\Users\\Tiago\\workspaces java\\"
				+ "Java web\\springMVCMaven\\src\\main\\webapp\\"
				+ "resources\\imagens\\imagem.jpg");*/
			
		String path = request.getSession().getServletContext().getRealPath("/");
		
		System.out.println(path);
		
		//file.transferTo(new File());
		
		//file.transferTo(ResourceLoader.class.getResource("resources/imagens/"+file.getOriginalFilename()).getFile());
		
		//in.write(file.getBytes());
		
		//in.close();
		
		//model.addAttribute("produtos", );
		
		
		return "index";
	}
}
