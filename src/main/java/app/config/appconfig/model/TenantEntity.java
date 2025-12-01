package app.config.appconfig.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "Tenants")
public class TenantEntity {
    @Column(name = "primary_color")
    @JsonProperty("primary_color")
    private String primaryColor;

    @Column(name = "on_primary")
    @JsonProperty("on_primary")
    private String onPrimary;

    @Column(name = "login_logo")
    @JsonProperty("login_logo")
    private String loginLogo;

    @Column(name = "tenant_id")
    @JsonProperty("tenant_id")
    private String tenantId;

    @Column(name = "bundle_id")
    @JsonProperty("bundle_id")
    @Id
    private String bundleId;

    @Column(name = "firebase")
    @JsonProperty("firebase")
    @Embedded
    private FirebaseConfig firebaseConfig;

    public TenantEntity(){}
    public TenantEntity(String primaryColor, String onPrimary, String loginLogo, String tenantId, FirebaseConfig firebaseConfig, String bundleId){
        this.loginLogo=loginLogo;
        this.tenantId=tenantId;
        this.onPrimary=onPrimary;
        this.primaryColor=primaryColor;
        this.firebaseConfig=firebaseConfig;
        this.bundleId=bundleId;
    }

    public FirebaseConfig getFirebaseConfig() {
        return firebaseConfig;
    }

    public String getLoginLogo() {
        return loginLogo;
    }

    public String getOnPrimary() {
        return onPrimary;
    }

    public String getTenantId() {
        return tenantId;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setFirebaseConfig(FirebaseConfig firebaseConfig) {
        this.firebaseConfig = firebaseConfig;
    }

    public void setLoginLogo(String loginLogo) {
        this.loginLogo = loginLogo;
    }

    public void setOnPrimary(String onPrimary) {
        this.onPrimary = onPrimary;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }
}
