package com.visiontech.controller;
import com.visiontech.dto.DTORecomendation;
import com.visiontech.entities.Ruta;
import com.visiontech.services.ServiceRecomendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class RecomendationController {
    @Autowired
    ServiceRecomendation serviceRecomendation;
}
