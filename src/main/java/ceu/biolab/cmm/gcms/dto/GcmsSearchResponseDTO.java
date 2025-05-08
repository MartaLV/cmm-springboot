package ceu.biolab.cmm.gcms.dto;

import ceu.biolab.cmm.gcms.domain.GcmsFeatures;

import java.util.ArrayList;
import java.util.List;

public class GcmsSearchResponseDTO {
    private List<GcmsFeatures> gcmsFeatures;

    public GcmsSearchResponseDTO(List<GcmsFeatures> gcmsFeatures) {
        this.gcmsFeatures = gcmsFeatures != null ? gcmsFeatures : new ArrayList<>();
    }

    public List<GcmsFeatures> getGcmsFeatures() {
        return gcmsFeatures;
    }

    public void setGcmsFeatures(List<GcmsFeatures> gcmsFeatures) {
        this.gcmsFeatures = gcmsFeatures != null ? gcmsFeatures : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "GcmsSearchResponseDTO{" +
                "gcmsFeatures=" + gcmsFeatures +
                '}';
    }
}
