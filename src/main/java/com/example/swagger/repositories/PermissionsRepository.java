package com.example.swagger.repositories;

import com.example.swagger.models.Permission;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IBM-ResearchLab on 26/07/2018.
 *
 * @author Karumba Samuel <karumbas@ke.ibm.com>
 */
public interface PermissionsRepository extends CrudRepository<Permission, Integer> {

}
