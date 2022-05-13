/**
 * Description: abstract class customer.
 */

package edu.bu.met.cs665.typeofcustomer;

public abstract class Customer {

  /**
   * Refactoring and commented part move to the inside the Email Center class.
   * private String customerName;
   * private String subject;
   * private String emailBody;
   * public String getCustomerName(){
   *    return customerName;
   * }
   * public void setCustomerName(String customerName) {
   *    this.customerName = customerName;
   * }
   */

  public abstract String typeofEmailTemplate();
}
