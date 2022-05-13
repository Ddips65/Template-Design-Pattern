/**
 * Description: NewEmailCenter is extends the EmailCenter class.
 */

package edu.bu.met.cs665.emailcenterofcustomer;

import edu.bu.met.cs665.typeofcustomer.Customer;
import edu.bu.met.cs665.typeofcustomer.NewCustomer;

public class NewEmailCenter extends EmailCenter {
  /**
   * Template method, creates the concrete customer.
   *
   * @param type String
   * @return NewCustomer
   */
  Customer generateEmail(String type) {
    if (type.equals("new")) {
      return new NewCustomer();
    } else {
      return null;
    }
  }
}
