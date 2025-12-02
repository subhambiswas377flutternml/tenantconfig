package app.config.appconfig.controller;


import app.config.appconfig.model.TenantEntity;
import app.config.appconfig.service.TenantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/tenant")
public class TenantController {
    final private TenantService tenantService;
    public TenantController(TenantService tenantService){
        this.tenantService = tenantService;
    }

    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public ResponseEntity<TenantEntity> getTenantById(@RequestHeader("bundleId") String bundleId){
        try{
            Optional<TenantEntity> tenant = tenantService.getTenantById(bundleId);
            if(tenant.isPresent()){
                return ResponseEntity.ok(tenant.get());
            }else{
                return ResponseEntity.notFound().build();
            }
        }catch(Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }
}
