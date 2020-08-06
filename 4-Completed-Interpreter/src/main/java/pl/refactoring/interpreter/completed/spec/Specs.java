package pl.refactoring.interpreter.completed.spec;

public class Specs {

  public static AreaRangeSpec ofAreaRange(float minArea, float maxArea) {
      return new AreaRangeSpec(minArea, maxArea);
  }
}
