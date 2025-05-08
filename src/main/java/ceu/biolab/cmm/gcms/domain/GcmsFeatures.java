package ceu.biolab.cmm.gcms.domain;

import java.util.ArrayList;
import java.util.List;

public class GcmsFeatures {
    //TODO los tres request?

    private List<Double> requestMzValues;
    private List<Double> requestIntensityValues;
    private double requestRIValue;

    private List<AnnotationByCompound> annotationByCompound; //annotations

    public GcmsFeatures(List<Double> requestMzValues, List<Double> requestIntensityValues,
                        double requestRIValue, List<AnnotationByCompound> annotationByCompound) {
        this.requestMzValues = requestMzValues != null ? requestMzValues : new ArrayList<>();
        this.requestIntensityValues = requestIntensityValues != null ? requestIntensityValues : new ArrayList<>();
        this.requestRIValue = requestRIValue;
        this.annotationByCompound = annotationByCompound != null ? annotationByCompound : new ArrayList<>();
    }

    public List<Double> getRequestMzValues() {
        return requestMzValues;
    }

    public void setRequestMzValues(List<Double> requestMzValues) {
        this.requestMzValues = requestMzValues != null ? requestMzValues : new ArrayList<>();
    }

    public List<Double> getRequestIntensityValues() {
        return requestIntensityValues;
    }

    public void setRequestIntensityValues(List<Double> requestIntensityValues) {
        this.requestIntensityValues = requestIntensityValues != null ? requestIntensityValues : new ArrayList<>();
    }

    public double getRequestRIValue() {
        return requestRIValue;
    }

    public void setRequestRIValue(double requestRIValue) {
        this.requestRIValue = requestRIValue;
    }

    public List<AnnotationByCompound> getAnnotationByCompound() {
        return annotationByCompound;
    }

    public void setAnnotationByCompound(List<AnnotationByCompound> annotationByCompound) {
        this.annotationByCompound = annotationByCompound != null ? annotationByCompound : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "GcmsFeatures{" +
                "requestMzValues=" + requestMzValues +
                ", requestIntensityValues=" + requestIntensityValues +
                ", requestRIValue=" + requestRIValue +
                ", annotationByCompound=" + annotationByCompound +
                '}';
    }
}
