package ceu.biolab.cmm.gcms.dto;

import ceu.biolab.cmm.gcms.domain.GcmsSpectra;
import ceu.biolab.cmm.shared.domain.MzToleranceMode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GcmsSearchRequestDTO {
    //private List<Double> mzValues = new ArrayList<>();
    //private List<Double> intensityValues = new ArrayList<>();

    private List<GcmsSpectra> gcmsSpectrum; //Group of Spectra

    private double mzTolerance; //Units Da_or_ppm
    private MzToleranceMode mzToleranceMode;
    private double retentionIndex;
    private double retentionIndexTolerance;

    private final String derivationMethod = "methyl-chloroformiates"; //TODO crear enumerado aunq solo usemos este
    private String columnType; //TODO crear enumerado???

    public GcmsSearchRequestDTO(List<GcmsSpectra> gcmsSpectrum, double mzTolerance,
                                MzToleranceMode mzToleranceMode, double retentionIndex, double retentionIndexTolerance,
                                String columnType) {
        this.gcmsSpectrum = gcmsSpectrum != null ? gcmsSpectrum : new ArrayList<>();
        this.mzTolerance = mzTolerance;
        //TODO Es alguno es concreto?? --> ppm, mda
        this.mzToleranceMode = mzToleranceMode != null ? mzToleranceMode : MzToleranceMode.PPM;
        this.retentionIndex = retentionIndex;
        this.retentionIndexTolerance = retentionIndexTolerance;
        this.columnType = columnType;
    }

    public List<GcmsSpectra> getGcmsSpectrum() {
        return gcmsSpectrum;
    }

    public void setGcmsSpectrum(List<GcmsSpectra> gcmsSpectrum) {
        this.gcmsSpectrum = gcmsSpectrum != null ? gcmsSpectrum : new ArrayList<>();
    }

    public double getMzTolerance() {
        return mzTolerance;
    }

    public void setMzTolerance(double mzTolerance) {
        if (mzTolerance < 0) {
            throw new IllegalArgumentException("mzTolerance must be non-negative");
        }
        this.mzTolerance = mzTolerance;
    }

    public MzToleranceMode getMzToleranceMode() {
        return mzToleranceMode;
    }
    //Is PPM or MDA
    public void setMzToleranceMode(MzToleranceMode mzToleranceMode) {
        this.mzToleranceMode = mzToleranceMode != null ? mzToleranceMode : MzToleranceMode.PPM;;
    }

    public double getRetentionIndex() {
        return retentionIndex;
    }

    public void setRetentionIndex(double retentionIndex) {
        this.retentionIndex = retentionIndex;
    }

    public double getRetentionIndexTolerance() {
        return retentionIndexTolerance;
    }

    //MUST BE <0???
    public void setRetentionIndexTolerance(double retentionIndexTolerance) {
        //this.retentionIndexTolerance = retentionIndexTolerance;
        if (retentionIndexTolerance < 0) {
            throw new IllegalArgumentException("retentionIndexTolerance must be non-negative");
        }
        this.retentionIndexTolerance = retentionIndexTolerance;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getDerivationMethod() {
        return derivationMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GcmsSearchRequestDTO that = (GcmsSearchRequestDTO) o;
        return Double.compare(mzTolerance, that.mzTolerance) == 0 &&
               Double.compare(retentionIndex, that.retentionIndex) == 0 &&
               Double.compare(retentionIndexTolerance, that.retentionIndexTolerance) == 0 &&
               Objects.equals(gcmsSpectrum, that.gcmsSpectrum) &&
               mzToleranceMode == that.mzToleranceMode &&
               Objects.equals(derivationMethod, that.derivationMethod) &&
               Objects.equals(columnType, that.columnType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gcmsSpectrum, mzTolerance, mzToleranceMode, retentionIndex,
                retentionIndexTolerance, derivationMethod, columnType);
    }

    @Override
    public String toString() {
        return "GcmsSearchRequestDTO{" +
                "gcmsSpectrum=" + gcmsSpectrum +
                ", mzTolerance=" + mzTolerance +
                ", mzToleranceMode=" + mzToleranceMode +
                ", retentionIndex=" + retentionIndex +
                ", retentionIndexTolerance=" + retentionIndexTolerance +
                ", derivationMethod='" + derivationMethod + '\'' +
                ", columnType='" + columnType + '\'' +
                '}';
    }
}
