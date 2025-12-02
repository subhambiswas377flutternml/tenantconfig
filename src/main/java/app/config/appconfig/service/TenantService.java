package app.config.appconfig.service;

import app.config.appconfig.model.TenantEntity;
import app.config.appconfig.repository.TenantRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class TenantService {
    final private TenantRepository tenantRepository;
    public TenantService(TenantRepository tenantRepository){
        this.tenantRepository=tenantRepository;
    }

    public Optional<TenantEntity> getTenantById(String bundleId){
        Optional<TenantEntity> tenantAndroid = tenantRepository.findByAndroidBundleId(bundleId);
        Optional<TenantEntity> tenantIos = tenantRepository.findByIosBundleId(bundleId);

        if(tenantAndroid.isPresent()){
            return tenantAndroid;
        }else{
            return tenantIos;
        }
    }
}
