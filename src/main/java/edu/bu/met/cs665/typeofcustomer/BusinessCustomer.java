/**
 * Description: BusinessCustomer is extends the Customer class.
 */

package edu.bu.met.cs665.typeofcustomer;

/** BusinessCustomer extends Customer class. */
public class BusinessCustomer extends Customer {

  /**
   * Template for Business Customers.
   *
   * @return
   */
  @Override
  public String typeofEmailTemplate() {
    return ("Template for Business Customers!");
  }
}
