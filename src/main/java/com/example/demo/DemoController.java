package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kx.administration.defined.service.PatientService;

import platform.webservice.BaseController;

@Controller
@RequestMapping("/api/{version}/{resource}")
 public class DemoController extends BaseController {
		protected boolean accountFilterRequired() {return true;}
		protected boolean facilityFilterRequired() {return true;}
		public DemoController() {super(new com.kx.administration.defined.resource.Patient(),new PatientService());}
}