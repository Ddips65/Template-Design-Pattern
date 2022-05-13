/**
 * Assignment-5
 * Description: FrequentEmailCenter is extends the EmailCenter class.
 */

package edu.bu.met.cs665.emailcenterofcustomer;

import edu.bu.met.cs665.typeofcustomer.Customer;
import edu.bu.met.cs665.typeofcustomer.FrequentCustomer;

public class FrequentEmailCenter extends EmailCenter {
  /**
   * Template method! implementation of method, creates the concrete customer.
   *
   * @param type String
   * @return FrequentCustomer
   */
  Customer generateEmail(String type) {
    if (type.equals("frequent")) {
      return new FrequentCustomer();
    } else {
      return null;
    }
  }
}
