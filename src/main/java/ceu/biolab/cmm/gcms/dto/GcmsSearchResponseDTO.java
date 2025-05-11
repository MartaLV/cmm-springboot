package ceu.biolab.cmm.gcms.dto;

import ceu.biolab.cmm.gcms.domain.GCMSFeature;

import java.util.ArrayList;
import java.util.List;

public class GcmsSearchResponseDTO {
    private List<GCMSFeature> gcmsFeatures;

    public GcmsSearchResponseDTO(List<GCMSFeature> gcmsFeatures) {
        this.gcmsFeatures = gcmsFeatures != null ? gcmsFeatures : new ArrayList<>();
    }

    public List<GCMSFeature> getGcmsFeatures() {
        return gcmsFeatures;
    }

    public void setGcmsFeatures(List<GCMSFeature> gcmsFeatures) {
        this.gcmsFeatures = gcmsFeatures != null ? gcmsFeatures : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "GcmsSearchResponseDTO{" +
                "gcmsFeatures=" + gcmsFeatures +
                '}';
    }
}
