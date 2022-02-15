package com.segio;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.segio.service.EjemplarService;
import com.segio.service.LocalizacionService;
import com.segio.service.ParcelaService;
import com.segio.service.PlantaService;

@Controller
public class AppController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	// formato de fecha segun haga falta
	dateFormat.setLenient(false);
	binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@Autowired //aqui hay que hacer lo mismo con todas las clases.
	private EjemplarService ejemplarservice;
	@Autowired
	private PlantaService plantaservice;
	@Autowired
	private LocalizacionService localizacionservice;
	@Autowired
	private ParcelaService parcelaservice;
	
	//Para Ejemplares
	
	@RequestMapping("/")
	public String viewHomePageEjemplar(Model model) {
		
		List<Ejemplar> listEjemplares = ejemplarservice.listAll();
		model.addAttribute("listaEjemplares", listEjemplares);
		List<Localizacion> listLozalizaciones = localizacionservice.listAll();
		model.addAttribute("listaLocalizaciones", listLozalizaciones);
		List<Planta> listPlantas = plantaservice.listAll();
		model.addAttribute("listaPlantas", listPlantas);
		List<Parcela> listParcelas = parcelaservice.listAll();
		model.addAttribute("listaParcelas", listParcelas);
		
		
		return "index";
	}
	
	@RequestMapping("/newejemplar")
	public String showNewProductPageEjemplar(Model model) {
		Ejemplar ejemplares = new Ejemplar();
		model.addAttribute("ejemplares", ejemplares);
		
		return "new_ejemplar";
	}
	
	@RequestMapping(value = "/saveejemplar", method = RequestMethod.POST)
	public String saveProductEjemplar(@ModelAttribute("ejemplares") Ejemplar ejemplares) {
		ejemplarservice.save(ejemplares);
		
		return "redirect:/";
	}
	
	@RequestMapping("/editarejemplar/{id}")
	public ModelAndView showEditProductPageEjemplar(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_ejemplar");
		Ejemplar ejemplares = ejemplarservice.get(id);
		mav.addObject("ejemplares", ejemplares);
		
		return mav;
	}
	
	@RequestMapping("/eliminarejemplar/{id}")
	public String deleteProductEjemplar(@PathVariable(name = "id") int id) {
		ejemplarservice.delete(id);
		return "redirect:/";		
	}
	
	// Para Plantas
	
	


	
	@RequestMapping("/newplanta")
	public String showNewProductPagePlanta(Model model) {
		Planta plantas = new Planta();
		model.addAttribute("plantas", plantas);
		
		return "new_planta";
	}
	
	@RequestMapping(value = "/saveplanta", method = RequestMethod.POST)
	public String saveProductPlanta(@ModelAttribute("plantas") Planta plantas) {
		plantaservice.save(plantas);
		
		return "redirect:/";
	}
	
	@RequestMapping("/editarplanta/{id}")
	public ModelAndView showEditProductPagePlanta(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_planta");
		Planta plantas = plantaservice.get(id);
		mav.addObject("plantas", plantas);
		
		return mav;
	}
	
	@RequestMapping("/eliminarplanta/{id}")
	public String deleteProductPlanta(@PathVariable(name = "id") int id) {
		plantaservice.delete(id);
		return "redirect:/";		
	}
	
	// Para Lozalizaciones
	

	
	@RequestMapping("/newlozalizacion")
	public String showNewProductPageLocalizacion(Model model) {
		Localizacion localizaciones = new Localizacion();
		model.addAttribute("localizaciones", localizaciones);
		
		return "new_localizacion";
	}
	
	@RequestMapping(value = "/savelocalizacion", method = RequestMethod.POST)
	public String saveProductLocalizacion(@ModelAttribute("localizaciones") Localizacion localizaciones) {
		localizacionservice.save(localizaciones);
		
		return "redirect:/";
	}
	
	@RequestMapping("/editarlocalizacion/{id}")
	public ModelAndView showEditProductPageLocalizacion(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_localizacion");
		Localizacion localizaciones =localizacionservice.get(id);
		mav.addObject("localizaciones", localizaciones);
		
		return mav;
	}
	
	@RequestMapping("/eliminarlocalizacion/{id}")
	public String deleteProductLocalizacion(@PathVariable(name = "id") int id) {
		localizacionservice.delete(id);
		return "redirect:/";		
	}
	
	// Para Parcelas
	

	
	@RequestMapping("/newparcela")
	public String showNewProductPageParcela(Model model) {
		Parcela parcelas = new Parcela();
		model.addAttribute("parcelas", parcelas);
		
		return "new_parcela";
	}
	
	@RequestMapping(value = "/saveparcela", method = RequestMethod.POST)
	public String saveProductParcela(@ModelAttribute("parcelas") Parcela parcelas) {
		parcelaservice.save(parcelas);
		
		return "redirect:/";
	}
	
	@RequestMapping("/editarparcela/{id}")
	public ModelAndView showEditProductPageParcela(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_parcela");
		Parcela parcelas = parcelaservice.get(id);
		mav.addObject("parcelas", parcelas);
		
		return mav;
	}
	
	@RequestMapping("/eliminarparcela/{id}")
	public String deleteProductParcela(@PathVariable(name = "id") int id) {
		parcelaservice.delete(id);
		return "redirect:/";		
	}
	
}
