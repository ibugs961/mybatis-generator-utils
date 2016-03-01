package net.javaw.example.model;

import java.io.Serializable;

public class ProjectWithBLOBs extends Project implements Serializable {
    private String jsonSpec;

    private String prevJsonSpec;

    private static final long serialVersionUID = 1L;

    public String getJsonSpec() {
        return jsonSpec;
    }

    public void setJsonSpec(String jsonSpec) {
        this.jsonSpec = jsonSpec == null ? null : jsonSpec.trim();
    }

    public String getPrevJsonSpec() {
        return prevJsonSpec;
    }

    public void setPrevJsonSpec(String prevJsonSpec) {
        this.prevJsonSpec = prevJsonSpec == null ? null : prevJsonSpec.trim();
    }
}