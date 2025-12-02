package app.config.appconfig.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @Column(name = "android_bundle_id")
    @Id
    private String androidBundleId;

    @JsonIgnore
    @Column(name = "ios_bundle_id")
    private String iosBundleId;

    @Column(name = "firebase")
    @JsonProperty("firebase")
    @Embedded
    private FirebaseConfig firebaseConfig;

    public TenantEntity(){}
    public TenantEntity(String primaryColor, String onPrimary, String loginLogo, String tenantId, FirebaseConfig firebaseConfig, String androidBundleId, String iosBundleId){
        this.loginLogo=loginLogo;
        this.tenantId=tenantId;
        this.onPrimary=onPrimary;
        this.primaryColor=primaryColor;
        this.firebaseConfig=firebaseConfig;
        this.androidBundleId=androidBundleId;
        this.iosBundleId=iosBundleId;
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

    public String getAndroidBundleId() {
        return androidBundleId;
    }

    public String getIosBundleId() {
        return iosBundleId;
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

    public void setAndroidBundleId(String androidBundleId) {
        this.androidBundleId = androidBundleId;
    }

    public void setIosBundleId(String iosBundleId) {
        this.iosBundleId = iosBundleId;
    }
}
