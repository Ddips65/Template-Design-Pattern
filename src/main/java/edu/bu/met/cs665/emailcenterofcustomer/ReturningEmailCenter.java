/**
 * Description: ReturningEmailCenter is extends the EmailCenter class.
 */

package edu.bu.met.cs665.emailcenterofcustomer;

import edu.bu.met.cs665.typeofcustomer.Customer;
import edu.bu.met.cs665.typeofcustomer.ReturningCustomer;

public class ReturningEmailCenter extends EmailCenter {
  /**
   * Template method! implementation of method, creates the concrete customer. *
   *
   * @param type String
   * @return ReturningCustomer
   */
  Customer generateEmail(String type) {
    if (type.equals("returning")) {
      return new ReturningCustomer();
    } else {
      return null;
    }
  }
}
