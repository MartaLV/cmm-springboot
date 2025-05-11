package ceu.biolab.cmm.gcms.domain;

import ceu.biolab.cmm.shared.domain.compound.Compound;
import ceu.biolab.cmm.shared.domain.msFeature.Peak;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@SuperBuilder
public class GCMSFeature {

    private List<Peak> peaks;
    private double RI;
    private Optional<Double> RT;

    private List<GCMSAnnotation> gcmsAnnotations; //annotations

    /*public GCMSFeature(List<Peak> peaks, double RI, Optional<Double> RT,
                       List<GCMSAnnotation> gcmsAnnotations) {
        this.peaks = peaks != null ? peaks : new ArrayList<>();
        this.RI = RI;
        this.RT = RT;
        this.gcmsAnnotations = gcmsAnnotations != null ? gcmsAnnotations : new ArrayList<>();
    }*/

}
