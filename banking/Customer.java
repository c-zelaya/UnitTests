package banking;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;

/**
 * @author wpollock
 *
 */
public class Customer implements Comparable<Customer> {
    private static int nextId = 1;

    private final Bank bank;
    private final String customerId;
    private final String lastName;
    private final String firstName;
    private final SortedSet<Account> customerAccounts = new TreeSet<>();

    /** Creates a new Customer object from a name.
     * Note for this project, we assume bank names are unique.
     * @param bank The bank owning this account
     * @param lastName The last name of the account owner.
     * @param firstName The first name of the account owner.
     */
    public Customer (Bank bank, String lastName, String firstName) {
        this.bank = null;
        this.customerId = "";
        this.lastName = "";
        this.firstName = "";
        // Stub
    }
    @Test
    public void testCustomer(){
      Customer expectedCustomer = new Customer();
      assertEquals(expectedCustomer, Customer());
    }

    /**
     * @return the bank
     */
    public Bank getBank () {
        return null;  // Stub
    }

    @Test
    public void testBank (){
        Bank bank = new Bank();
        bank.NAME = "Chase";
        bank.customers[] = {(bank.NAME,customers)};
        bank.insufficientFundsPenalty;
        assertEquals("Chase",(bank.NAME,customers), 10, bank.Bank());
}


    /** Getter for customer's ID
     * @return The customer's ID
     */
    public String getCustomerId () {
        return null;  // Stub
    }

    @Test
    public void testgetCustomerID(){

      Customer customer = new Customer();
      customer.CustomerID = 2123;
      assertEquals(2123, customer.getCustomerID());
    }
    /** Getter for the customer's last name
     * @return The customer's last name
     */
    public String getLastName () {
        return null;  // Stub
    }

    @Test
    public void testgetLastName(){
      getLastName gln = new getLastName();
      gln.lastName = "Howard";
      assertEquals("Howard", gln.getLastName());
    }

    /** Getter for the customer's first name
     * @return The customer's first name
     */

    public String getFirstName () {
        return null;  // Stub
    }
    @Test
    public void testgetFirstName(){
      getFirstName gfn = new getFirstName();
      gfn.FirstName = "Howard";
      assertEquals("Frank", gfn.getFirstName());    }

    /** Returns a read-only SortedSet of the customer's active
     *  accounts (if any)
     *
     * @return an immutable SortedSet of accounts (check for
     *  immutability of accounts; use a List?)
     */
    public SortedSet<Account> getCustomerAccounts () {
        return null;  // Stub
    }
    @Test
    public void testgetCustomerAccounts(){
      int count = 0;
    getCustomerAccounts.forEach(count++);
    assertThat(count).isBetween(1, 400,000);
    }
    }
    @Test
    public boolean testgetCustomerAccountsmutable(){

    List account = new ArrayList(Account);
    account.add("12323");
    if( Arrays.asList(account).contains("12323") {
      return true;
      }
    }

    /** Returns the total fees (including penalties) paid by this customer
     *  for year-to-date
     *
     * @return YTD fees paid
     */
    public double ytdFees () {
        return 0.0;  // Stub
    }

    @Test
    public void testytdFees(){
      assertEquals(double 0.0);
    }

    /** Returns the total interest paid to this customer for year-to-date
     * @return YTD interest payed
     */
    public double ytdInterest () {
        return 0.0;  // Stub
    }
    @Test
    public void testytdInterest(){
      assertEquals(double 0.0);
    }

    /** Adds a new bank account
     * @param initBal Initial balance
     * @param desc A description for the account, chosen by the customer
     * @return the newly added account object
     */
    public SavingsAccount addSavingsAccount (double initBal,  String desc) {
        return null;  // Stub
    }

    @Test
    public void testddSavingsAccount(){
      initBal = 250.00;
      desc = "College Fund";
      assertThat(desc).contains("College Fund");
      assertThat(initBal).contains(250.00);

    }

    /** Deletes a given account (in the real world, just marks it as defunct
     *  or something)
     * @param accountId the ID of the account to remove
     */
    public void removeAccount (String accountId) {
        // Stub
    }
    @Test
    public void testremoveAccount(){
      accountId = 123224;
      assertThat( Account.getMyItems().contains(accountId);

    }

    /** Find an account given an account ID
     *
     * @param accountId The ID of the desired account
     * @return The Account object, or null if no such account
     */
    public Account getAccount (String accountId) {
        return null;  // Stub
    }

    @Test
    public void testgetAccount(){
      accountId = 123224;
      assertThat( Account.getMyItems().contains(accountId), accountId);

    }
    @Override
    public String toString () {
        return "";  // Stub
    }

    @Override
    public int hashCode () {
        return 0;  // Stub
    }

    @Override
    public boolean equals (Object obj) {
        return false;  // Stub
    }

    @Override
    public int compareTo (Customer other) {
        return 1;  // Stub
    }
}
