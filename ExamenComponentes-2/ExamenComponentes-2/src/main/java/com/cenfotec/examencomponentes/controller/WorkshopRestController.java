package com.cenfotec.examencomponentes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.examencomponentes.domain.Workshop;
import com.cenfotec.examencomponentes.service.WorkshopService;


@RestController
public class WorkshopRestController {


    @Autowired
    private WorkshopService workshopService;

    @RequestMapping(path="/dataTable_Workshop", method= RequestMethod.GET)
    public List<Workshop> getAllEmployees(){
        return workshopService.getAll();
    }
}
