class CubeCalculatorTest extends org.scalatest.funsuite.AnyFunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("Cubecalculator.cube 0 should be 0") {
    assert(CubeCalculator.cube(0) === 0)
  }

  test("Cubecalculator.cube 2*2 should be 64") {
    assert(CubeCalculator.cube(2*2) === 64)
  }

  test("Cubecalculator.cube 2 should not be 4 and this test shall fail"){
    assert(CubeCalculator.cube(2) === 4)
  }
}
