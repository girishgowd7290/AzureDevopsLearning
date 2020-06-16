package com.ggbs.azure.azureDevopsLearning.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureDevopsLearningController {

	@GetMapping("/welcome")
	public String start() {
		return "Welcome to Azure Devops learning";
	}
}
