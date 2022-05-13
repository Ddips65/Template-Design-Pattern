/**
 * Description: ReturningCustomer is extends the Customer class.
 */


package edu.bu.met.cs665.typeofcustomer;

/** ReturningCustomer extends Customer. */
public class ReturningCustomer extends Customer {

  /**
   * Template for Returning Customers.
   *
   * @return
   */
  public String typeofEmailTemplate() {
    // System.out.println("Generate E-mail Template for Returning Customers!");
    return ("Template for Returning Customers!");
  }
}
