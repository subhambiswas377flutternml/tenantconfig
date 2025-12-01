package app.config.appconfig.service;

import app.config.appconfig.model.TenantEntity;
import app.config.appconfig.repository.TenantRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class TenantService {
    private TenantRepository tenantRepository;
    public TenantService(TenantRepository tenantRepository){
        this.tenantRepository=tenantRepository;
    }

    public Optional<TenantEntity> getTenantById(String bundleId){
        Optional<TenantEntity> tenant = tenantRepository.findById(bundleId);
        return tenant;
    }
}
