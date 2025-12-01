package app.config.appconfig.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class FirebaseConfig {
    @Column(name="android_config")
    @JsonProperty("android")
    @Embedded
    private AndroidConfig androidConfig;

    @Column(name = "ios_config")
    @JsonProperty("ios")
    @Embedded
    private IosConfig iosConfig;

    public FirebaseConfig(){}
    public FirebaseConfig(AndroidConfig androidConfig, IosConfig iosConfig){
        this.androidConfig=androidConfig;
        this.iosConfig=iosConfig;
    }

    public AndroidConfig getAndroidConfig() {
        return androidConfig;
    }

    public IosConfig getIosConfig() {
        return iosConfig;
    }

    public void setAndroidConfig(AndroidConfig androidConfig) {
        this.androidConfig = androidConfig;
    }

    public void setIosConfig(IosConfig iosConfig) {
        this.iosConfig = iosConfig;
    }
}
