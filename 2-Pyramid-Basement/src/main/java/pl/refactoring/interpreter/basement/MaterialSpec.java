package pl.refactoring.interpreter.basement;

public class MaterialSpec implements Spec {

  private EstateMaterial material;

  public MaterialSpec(EstateMaterial material) {
    this.material = material;
  }

  public boolean isSatisfiedBy(RealEstate estate) {
    return estate.getMaterial().equals(material);
  }
}