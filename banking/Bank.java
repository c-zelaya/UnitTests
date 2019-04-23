package banking;

import java.util.*;
import java.util.stream.Collectors;
import org.junit.*; // The various annotations
import static org.junit.Assert.*; //AssertX methods
import org.junit.runner.JUnitCore; // Test runner

/**
 * @author wpollock
 *
 */
public class Bank {
    private final String NAME;
    private final Map<String, Customer> customers = new HashMap<>();
    private double insufficientFundsPenalty = 10.00;  // Default, in dollars

    /** Creates a new Bank object with the given name.
     *
     * @param name Name of the bank
     */
     
    
    public Bank (String name) {
        this.NAME = "";  // Stub
        
        @Test
        public void testBankName(){
          assertEquals(Bank, this.NAME);

        }
    }

    /** Starts up the Bank simulator
     * @param args command line arguments - ignored
     */
    public static void main (String[] args) {
        System.out.println("Hello from Bank");  // Stub
        
        @Test
        public void testMain(){
          assertEquals("", outContent.toString());

        }
    }

    /**
     * @return the insufficientFundsPenalty
     */
    public  double getInsufficientFundsPenalty () {
        return insufficientFundsPenalty;
        
        @Test 
        public void testInsufficientFundsPenalty(){
            assertTrue(true);
            }
    }

    /**
     * @param insufficientFundsPenalty the insufficientFundsPenalty to set
     */
    @Test
    public void setInsufficientFundsPenalty (double insufficientFundsPenalty) {
        insufficientFundsPenalty = 0;// Stub
       
        @Test 
        public void testSetInsufficientFundsPenalty(){
            assertTrue( insufficientFundsPenalty > 0 );
            }
    }

    /**
     * @return the name
     */
    public String getNAME () {
        return NAME;

        @Test 
        public void testGetNAME(){
            assertTrue( true );
            }
    }

    /** Adds a new bank account
     *
     */
    public void addAccountWizard () {
        BankAccount Account = new BankAccount()// Stub
        
        @Test
        public void testAddAccountWizard(){
            assertEquals(Account, BankAccount());
       }
    }

    /** Generates a report of all current accounts, in account ID order
     * @return A list of all accounts of all customers of this bank, sorted
     * by ID.
     *
     */
    public SortedSet<Account> getAllAccounts () {
        // for each customer, get accounts and add to sorted set.
        return null;  //Stub

        @Test
        public void testGetAllAccounts(){
            assertEquals(Account, BankAccount());
       }

    }

    /** Add a new customer to the bank, using a GUI form
     *
     */
    public void addCustomerWizard () {
    }
       
    /** Add a new customer to the bank.
     * @param lastName Customer's last (sur- or family) name
     * @param firstName Customer's first (or given) name
     * @return the customer's ID
     */
    public String addCustomer (String lastName, String firstName) {
        return null;  // Stub

        @Test 
        public void testAddCustomer("Bar", "Foo"){
            Customer = "Bar" + "Foo";
            assertFalse(Failed);
        }
    }

    /** Deletes a customer from the bank.
     * (In reality, just marks the customer as non-current.)
     * @param customerId the ID of the customer to remove
     */
    public void removeCustomer (String customerId) {
        // Stub
        
        @Test
        public void testRemoveCustomer("Bar", "Foo"){
            Customer = null;
            assertFalse(Failed);
        }
    }

    /** Generates a report of all current customers, in customer ID order
     * @return SortedSet of all customers at this bank.
     */
    public SortedSet<Customer> getAllCustomers () {
        return null;  // Stub

        @Test
        public void testGetAllCustomer(){
        streamreader(Customer);
        assertFalse(Failed);
        
        }
    }

    /** Get a Customer object, given a customer's ID
     *
     * @param customerId The ID of the customer
     * @return That customer's Account, or null
     */
    public Customer getCustomer (String customerId) {
        return null;  // Stub

        @Test
        public void testgetCustomer(){
        double customerId;
        assertFalse(Failed);
        
        }
    }

    /** Get a List of Customer objects, given a customer's last and
     * first names
     *
     * @param lastName The customer's last name
     * @param firstName The customer's first name
     * @return a List of Customers with that first and last name,
     * or null if no such customer exists
     */
    public List<Customer> getCustomer (String lastName, String firstName) {
        return null;  // Stub
        @Test
        public void testGetListCustomer(){
            Until(EOF){
                streamreader(Customers);
                }
        assertFalse(Failed);
        
        }
    }

    /** Return a List of a given customer's accounts (if any)
     *
     * @param customerId The Customer ID who's account list is desired.
     * @return a List of the accounts of that customer, if any.
     */
    public List<Account> getCustomersAccounts (String customerId) {
        return null;  // Stub
        
        @Test
        public void getCustomersAccounts(){
            Until(EOF){
                double customerId;
                }
        assertFalse(Failed);
        
        }
`   
    }
}
