/**
 * Copyright (c) 2020 IT Train Wlodzimierz Krakowski (www.refactoring.pl)
 * Sources are available only for personal usage by Udemy students of this course.
 */
package pl.refactoring.interpreter.completed.spec;

import pl.refactoring.interpreter.completed.EstateMaterial;
import pl.refactoring.interpreter.completed.RealEstate;
import pl.refactoring.interpreter.completed.Spec;

public class MaterialSpec implements Spec {
    private EstateMaterial material;

    private MaterialSpec(EstateMaterial material) {
        this.material = material;
    }

    public static MaterialSpec ofMaterial(EstateMaterial material) {
        return new MaterialSpec(material);
    }

    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getMaterial().equals(material);
    }
}