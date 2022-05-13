/** Description: BusinessEmailCenter is extends the EmailCenter class. */

package edu.bu.met.cs665.emailcenterofcustomer;

import edu.bu.met.cs665.typeofcustomer.BusinessCustomer;
import edu.bu.met.cs665.typeofcustomer.Customer;

public class BusinessEmailCenter extends EmailCenter {
  /**
   * Template method! implementation of method, creates the concrete customer.
   *
   * @param type String
   * @return new BuisnessCustomer
   */
  @Override
  Customer generateEmail(String type) {
    if (type.equals("business")) {
      return new BusinessCustomer();
    } else {
      return null;
    }
  }
}
