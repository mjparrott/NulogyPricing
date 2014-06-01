public class Pricing
{
  private static final double FLAT_MARKUP = 0.05;
  private static final double PERSON_MARKUP = 0.012;
  
  private double basePrice;
  private int people;
  private Product product;

  public Pricing(double basePrice, int people, Product product)
  {
    this.basePrice = basePrice;
    this.people = people;
    this.product = product;
  }

  public double estimateCost()
  {
    double flatMarkup = basePrice * (1 + FLAT_MARKUP);
    double personMarkup = flatMarkup * (PERSON_MARKUP * people);
    double productMarkup = flatMarkup * product.getMarkupPercentage();

    return flatMarkup + personMarkup + productMarkup;
  }
}
