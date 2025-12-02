package app.config.appconfig.repository;

import app.config.appconfig.model.TenantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TenantRepository extends JpaRepository<TenantEntity, String> {
    Optional<TenantEntity> findByAndroidBundleId(String androidBundleId);
    Optional<TenantEntity> findByIosBundleId(String iosBundleId);
}
