package com.example.swagger.controllers;

import com.example.swagger.models.Permission;
import com.example.swagger.repositories.PermissionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IBM-ResearchLab on 26/07/2018.
 *
 * @author Karumba Samuel <karumbas@ke.ibm.com>
 */
@RestController
@RequestMapping("/permissions")
public class PermissionController {

    private PermissionsRepository permissionsRepository;

    @Autowired
    public PermissionController(PermissionsRepository permissionsRepository) {
        this.permissionsRepository = permissionsRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Permission> getAllPermission(){
        List<Permission> permissions = (List<Permission>) permissionsRepository.findAll();

        return  permissions;
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Permission createPermission(@RequestBody Permission permission){
        Permission myPermission = permissionsRepository.save(permission);

        return myPermission;
    }

}
