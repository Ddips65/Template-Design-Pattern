/**
 * Description: VipEmailCenter is extends the EmailCenter class.
 */

package edu.bu.met.cs665.emailcenterofcustomer;

import edu.bu.met.cs665.typeofcustomer.Customer;
import edu.bu.met.cs665.typeofcustomer.VipCustomer;

public class VipEmailCenter extends EmailCenter {
  /**
   * Template method! implementation of method, creates the concrete customer.
   *
   * @param type String
   * @return VipEmailCenter
   */
  Customer generateEmail(String type) {
    if (type.equals("vip")) {
      return new VipCustomer();
    } else {
      return null;
    }
  }
}
