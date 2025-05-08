package ceu.biolab.cmm.gcms.domain;

import ceu.biolab.cmm.shared.domain.compound.Compound;
import ceu.biolab.cmm.shared.domain.compound.Pathway;
import lombok.Data;

import java.util.List;


public class GcmsCompounds extends Compound {
    //TODO dbccs o llamarlo dbgcms pero que es???

    private double deltaRI; //TODO numero dado o calculado formula aqui??
    //TODO no se muy bien como poner esto
    private double msmsCosineScore;
    //private List<Pathway> pathwayList; //Esta puesto en compound




}
