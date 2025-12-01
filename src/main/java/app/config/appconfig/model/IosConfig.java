package app.config.appconfig.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class IosConfig {
    @Column(name="ios_api_key")
    @JsonProperty("api_key")
    private String apiKey;

    @Column(name="ios_app_id")
    @JsonProperty("app_id")
    private String appId;

    @Column(name="ios_sender_id")
    @JsonProperty("sender_id")
    private String senderId;

    @Column(name = "ios_storage_bucket")
    @JsonProperty("storage_bucket")
    private String storageBucket;

    @Column(name = "ios_project_id")
    @JsonProperty("project_id")
    private String projectId;

    public IosConfig(){}
    public IosConfig(String apiKey, String appId, String senderId, String storageBucket, String projectId){
        this.apiKey=apiKey;
        this.appId=appId;
        this.projectId=projectId;
        this.senderId=senderId;
        this.storageBucket=storageBucket;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getAppId() {
        return appId;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getStorageBucket() {
        return storageBucket;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public void setStorageBucket(String storageBucket) {
        this.storageBucket = storageBucket;
    }
}
