package pl.refactoring.interpreter.legacy;

public class BelowAreaSpec implements Spec {

  private float maxBuildingArea;

  public BelowAreaSpec(float maxBuildingArea) {
    this.maxBuildingArea = maxBuildingArea;
  }

  @Override
  public boolean isSatisfiedBy(RealEstate estate) {
    return estate.getBuildingArea() < maxBuildingArea;
  }
}
