package pl.refactoring.interpreter.basement.specs;

import pl.refactoring.interpreter.basement.RealEstate;
import pl.refactoring.interpreter.basement.Spec;

public class AndSpec implements Spec {

  private final Spec firstSpec;
  private final Spec secondSpec;

  public AndSpec(Spec firstSpec, Spec secondSpec) {
    this.firstSpec = firstSpec;
    this.secondSpec = secondSpec;
  }

  public boolean isSatisfiedBy(RealEstate estate) {
    return firstSpec.isSatisfiedBy(estate) &&
          secondSpec.isSatisfiedBy(estate);
  }
}
