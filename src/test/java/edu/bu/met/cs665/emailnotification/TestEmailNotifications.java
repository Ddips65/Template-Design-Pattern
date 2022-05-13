/**
 * Description: Unit test for generate email-notification for different types of the customers.
 */

package edu.bu.met.cs665.emailnotification;

import static org.junit.Assert.assertEquals;
import edu.bu.met.cs665.emailcenterofcustomer.BusinessEmailCenter;
import edu.bu.met.cs665.emailcenterofcustomer.EmailCenter;
import edu.bu.met.cs665.emailcenterofcustomer.FrequentEmailCenter;
import edu.bu.met.cs665.emailcenterofcustomer.NewEmailCenter;
import edu.bu.met.cs665.emailcenterofcustomer.ReturningEmailCenter;
import edu.bu.met.cs665.emailcenterofcustomer.VipEmailCenter;
import org.junit.Test;

public class TestEmailNotifications {

  /** Test case for check types of the business customer. */
  @Test
  public void testBusinessCustomer() {
    EmailCenter businessCustomer = new BusinessEmailCenter();
    assertEquals(
        "Template for Business Customers!",
        businessCustomer.sendEmail("business", "Keli", "keli@gmail.com").typeofEmailTemplate());
  }
  /** Test case for check types of the frequent customer. */
  @Test
  public void testFrequentCustomer() {
    EmailCenter frequentCustomer = new FrequentEmailCenter();
    assertEquals(
        "Template for Frequent Customers!",
        frequentCustomer.sendEmail("frequent", "Lucy", "lucy@gmail.com").typeofEmailTemplate());
  }

  /** Test case for check types of the new customer. */
  @Test
  public void testNewCustomer() {

    EmailCenter newCustomer = new NewEmailCenter();
    assertEquals(
        "Template for New Customers!",
        newCustomer.sendEmail("new", "John", "john@gmail.com").typeofEmailTemplate());
  }

  /** Test case for check types of the vip customer. */
  @Test
  public void testVipCustomer() {

    EmailCenter vipCustomer = new VipEmailCenter();
    assertEquals(
        "Template for Vip Customers!",
        vipCustomer.sendEmail("vip", "Steve", "steve@gmail.com").typeofEmailTemplate());
  }

  /** Test case for check types of the returning customer. */
  @Test
  public void testReturnCustomer() {
    EmailCenter returnCustomer = new ReturningEmailCenter();
    assertEquals(
        "Template for Returning Customers!",
        returnCustomer.sendEmail("returning", "Tony", "tony@gmail.com").typeofEmailTemplate());
  }
}
