package pl.refactoring.interpreter.emerging.specs;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pl.refactoring.interpreter.emerging.RealEstate;
import pl.refactoring.interpreter.emerging.Spec;

class AndSpecTest {

  private Spec yesSpec;

  @BeforeEach
  void setUp() {
    yesSpec = Mockito.mock(Spec.class);
    Mockito.when(yesSpec.isSatisfiedBy(Mockito.any(RealEstate.class)))
        .thenReturn(true);
  }

  @Test
  void should_verify_two_components_in_case_of_yes_results() {
    // Given
    AndSpec andSpec = new AndSpec(yesSpec, yesSpec);

    // When
    boolean andResult = andSpec.isSatisfiedBy(Mockito.mock(RealEstate.class));

    // Then
    assertTrue(andResult);

    Mockito.verify(yesSpec, times(2))
        .isSatisfiedBy(Mockito.any(RealEstate.class));
  }


  @Test
  void should_verify_three_components_in_case_of_yes_results() {
    // Given
    AndSpec andSpec = new AndSpec(yesSpec, yesSpec, yesSpec);

    // When
    boolean andResult = andSpec.isSatisfiedBy(Mockito.mock(RealEstate.class));

    // Then
    assertTrue(andResult);

    Mockito.verify(yesSpec, times(3))
        .isSatisfiedBy(Mockito.any(RealEstate.class));
  }
}