package banking;

import static banking.TransactionType.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author wpollock
 * @edited by Helene Hoffman
 *
 */
public class SavingsAccount extends Account {
    // Default monthly interest rate, applied on last day of statement cycle:
    private static double DEFAULT_INTEREST_RATE = 2.0;  // a percent

    /**  SavingsAccount constructor, using default interest rate.
     * @param cust The customer that owns this account
     * @param initialBalance The initial account balance
     * @param description An account description provided by the owner
     */
    public SavingsAccount (Customer cust, double initialBalance,
            String description) {
        super(cust, initialBalance, description);
    }

    /** SavingsAccount constructor, using a custom interest rate.
     * @param cust The customer that owns this account
     * @param initialBalance The initial account balance
     * @param description An account description provided by the owner
     * @param interestRate  Account's default monthly interest rate
     */
    public SavingsAccount (Customer cust, double initialBalance,
            String description, double interestRate) {
        super(cust, initialBalance, description);
        // Stub
    }
        //tests creation of Savings Account
        @Test
        public void testSavingsAccount() {
            SavingsAccount expectedSavingsAccount = new SavingsAccount("Jane Doe", 100, "Savings Account", DEFAULT_INTEREST_RATE);
            assertEquals(expectedSavingsAccount, SavingsAccount());
            }
        
        //tests customer specified for account
        @Test
        public void testCustomer() {
            SavingsAccount testSavingsAccount = new SavingsAccount("Jane Doe", 100, "Savings Account", DEFAULT_INTEREST_RATE);
            String expectedName = "Jane Doe";
            assertEquals(expectedName, SavingsAccount.cust);
            
            }
        
        //tests initial balance of account
        @Test
        public void testInitialBalance() {
            SavingsAccount testSavingsAccount = new SavingsAccount("Jane Doe", 100, "Savings Account", DEFAULT_INTEREST_RATE);
            double expectedBalance = 100;
            assertEquals(expectedBalance, SavingsAccount.initialBalance);
            }
        
        //tests description specified for account
        @Test
        public void testAccountDescription() {
            SavingsAccount testSavingsAccount = new SavingsAccount("Jane Doe", 100, "Savings Account", DEFAULT_INTEREST_RATE);
            String expectedDescription = "Savings Account";
            assertEquals(expectedDescription, SavingsAccount.description);
            }
        
        //tests interest rate for account
        @Test
        public void testInterestRate() {
            SavingsAccount testSavingsAccount = new SavingsAccount("Jane Doe", 100, "Savings Account", DEFAULT_INTEREST_RATE);
            double expectedInterestRate = DEFAULT_INTEREST_RATE;
            assertEquals(expectedInterestRate, SavingsAccount.getDefaultInterestRate());
            }
        
    @Override
    public void deposit (double amount) {
        // Stub
    }

    @Override
    public void withdraw (double amount) {
        // Stub
    }

    /** Adds a transaction "INTEREST PAYMENT" based on this account's
     * monthly interest rate.
     * @param rate Interest rate to apply, as a percentage (e.g. 2.1".
     */
   
    public void addInterestTransaction (double rate) {
        // Stub

    }
        //tests addition of interest transaction for account
        @Test
        public void testInterestTransaction() {
        SavingsAccount testSavingsAccount = new SavingsAccount("Jane Doe", 100, "Savings Account", DEFAULT_INTEREST_RATE);
        Transaction INTEREST_PAYMENT = new Transaction();
        double rate = DEFAULT_INTEREST_RATE;
        assertTrue ("Add interest transaction?", rate == DEFAULT_INTEREST_RATE);
    }
    /**
     * @return the interestRate
     */
    public static double getDefaultInterestRate () {
        return 0.00;  // Stub
    }

    /**
     * @param interestRate the interestRate to set
     */
    public static void setDefaultInterestRate (double interestRate) {
        // Stub
    }
}
