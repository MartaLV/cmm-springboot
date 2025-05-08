package ceu.biolab.cmm.gcms.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class AnnotationByCompound {
    private List<GcmsCompounds> gcmsCompounds;

    public AnnotationByCompound(List<GcmsCompounds> gcmsCompounds) {
        this.gcmsCompounds = gcmsCompounds != null ? gcmsCompounds : new ArrayList<>();
    }

    public List<GcmsCompounds> getGcmsCompounds() {
        return gcmsCompounds;
    }

    public void setGcmsCompounds(List<GcmsCompounds> gcmsCompounds) {
        this.gcmsCompounds = gcmsCompounds != null ? gcmsCompounds : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "AnnotationByCompound{" +
                "gcmsCompounds=" + gcmsCompounds +
                '}';
    }
}
