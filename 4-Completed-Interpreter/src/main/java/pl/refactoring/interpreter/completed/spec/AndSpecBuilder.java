package pl.refactoring.interpreter.completed.spec;

import java.util.ArrayList;
import java.util.List;
import pl.refactoring.interpreter.completed.Spec;

public class AndSpecBuilder {

  private List<Spec> specs = new ArrayList<>();

  public AndSpecBuilder withSpec(Spec spec) {
    specs.add(spec);
    return this;
  }

  public AndSpec createAndSpec() {
    return new AndSpec(specs.toArray(new Spec[specs.size()]));
  }
}