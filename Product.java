public enum Product
{
  PHARMACEUTICALS(0.075),
  FOOD(0.13),
  ELECTRONICS(0.02),
  OTHER(0);

  private final double markupPercentage;

  Product(double markupPercentage)
  {
    this.markupPercentage = markupPercentage;
  }

  public double getMarkupPercentage()
  {
    return markupPercentage;
  }
}
