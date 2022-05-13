/** Assignment-5 Description: Email center is the Creator class with the generateEmail. */

package edu.bu.met.cs665.emailcenterofcustomer;

import edu.bu.met.cs665.typeofcustomer.Customer;

public abstract class EmailCenter {

  private String subject;
  private String emailBody;

  /**
   * generateEmail is abstract method in abstract class EmailCenter.
   *
   * @param type String
   * @return
   */
  abstract Customer generateEmail(String type);

  /**
   * This is the Template Method. send email notification to different types of the customers.
   *
   * @param customerType String
   * @param customerName String
   * @param customerEmailId String
   * @return ct1
   */
  public final Customer sendEmail(
      String customerType, String customerName, String customerEmailId) {
    Customer ct1 = generateEmail(customerType);
    subject = "Welcome " + customerName + "......";
    emailBody =
        "Hello " + customerName + " thanks for being a part of " + customerType + " customer.";

    System.out.println(
        ct1.typeofEmailTemplate()
            + "\n"
            + "to: "
            + customerEmailId
            + "\n"
            + "subject: "
            + subject
            + "\n"
            + "emailBody: "
            + emailBody);
    System.out.println("-------------------------------------------------------------------------");
    return ct1;
  }

  // Refactoring and remove below method CustomerInfo ct1 = generateEmail(customerType);
  // is able to identify which type of the customer is.
  // public String toString(String customerType) { return customerType; }

}
