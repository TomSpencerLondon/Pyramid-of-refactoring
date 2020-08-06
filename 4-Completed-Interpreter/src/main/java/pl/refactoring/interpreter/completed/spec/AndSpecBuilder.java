package pl.refactoring.interpreter.completed.spec;

import pl.refactoring.interpreter.completed.Spec;

public class AndSpecBuilder {

  private Spec[] specs;

  public AndSpecBuilder withSpecs(Spec... specs) {
    this.specs = specs;
    return this;
  }

  public AndSpec createAndSpec() {
    return new AndSpec(specs);
  }
}