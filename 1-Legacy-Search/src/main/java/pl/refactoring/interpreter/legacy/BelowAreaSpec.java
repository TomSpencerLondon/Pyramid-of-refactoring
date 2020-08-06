package pl.refactoring.interpreter.legacy;

public class BelowAreaSpec {

  private float maxBuildingArea;

  public BelowAreaSpec(float maxBuildingArea) {
    this.maxBuildingArea = maxBuildingArea;
  }

  boolean isSatisfiedBy(RealEstate estate) {
    return estate.getBuildingArea() < maxBuildingArea;
  }
}
