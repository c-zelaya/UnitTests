package banking;

import java.time.*;
import static org.junit.Assert.*;
import org.junit.*

/**
 * @author wpollock
 * @edited by Helene Hoffman
 *
 */
public class Transaction implements Comparable<Transaction> {
    private static int nextID = 1;

    private final int id;
    private final LocalDateTime timestamp;
    private final TransactionType type;
    private final double amount;
    private final String description;
    /**
     * @param type The type of this transaction
     * @param amount The amount of the transaction
     * @param description The description of the transaction.
     *        This may include check numbers, memo, payee, etc.
     */
    public Transaction (TransactionType type, double amount,
            String description) {
        this.id = 1;
        this.type = null;
        this.amount = 0.00;
        this.description = "";
        this.timestamp = LocalDateTime.now();
        // Stub
    }
    
        //Tests creation of a new transaction
        @Test
        public void testTransaction() {
            Transaction expectedTransaction = new Transaction (DEPOSIT, 100, "Check No. 123");
            assertEquals(expectedTransaction, Transaction());
            }
        
        //Tests transaction amount
        @Test
        public void testAmount() {
            Transaction testTransaction = new Transaction (DEPOSIT, 100, "Check No. 123");
            double expectedAmount = 100;
            assertEquals(expectedAmount, this.amount);
            }
        
        @Test
        public void testAmountNegative() {
            Transaction testTransaction = new Transaction (DEPOSIT, -100, "Check No. 123");
            double negativeAmount = -100;
            assertFalse("Is number positive?", negativeAmount > 0);
            }
        
        //Tests account description string
        @Test
        public void accountDescription() {
             Transaction testTransaction = new Transaction (DEPOSIT, 100, "Check No. 123");
            String expectedDescription = "Check No. 123";
            assertEquals(expectedDescription, this.description);
            }
        
        //The following six methods test each type of transaction, as
        //detailed in the transaction type class (DEPOSIT, WITHDRAWAL,
        //INTEREST, CHECK, FEE, PENALTY, ADJUSTMENT)
        @Test
        public void testTypeDeposit() {
            Transaction testTransaction = new Transaction (DEPOSIT, 100, "Check No. 123");
            String expectedType = DEPOSIT;
            assertEquals(expectedType, this.type);
            }
        
        @Test
        public void testTypeWithdrawal() {
            Transaction testTransaction = new Transaction (WITHDRAWAL, 100, "Check No. 123");
            String expectedType = WITHDRAWAL;
            assertEquals(expectedType, this.type);
            }
        
        @Test
        public void testTypeInterest() {
            Transaction testTransaction = new Transaction (INTEREST, 100, "Check No. 123");
            String expectedType = INTEREST;
            assertEquals(expectedType, this.type);
            }
        
        @Test
        public void testTypeCheck() {
            Transaction testTransaction = new Transaction (CHECK, 100, "Check No. 123");
            String expectedType = CHECK;
            assertEquals(expectedType, this.type);
            }
        
        @Test
        public void testTypeFee() {
            Transaction testTransaction = new Transaction (FEE, 100, "Check No. 123");
            String expectedType = FEE;
            assertEquals(expectedType, this.type);
            }
        
        @Test
        public void testTypePenalty() {
            Transaction testTransaction = new Transaction (PENALTY, 100, "Check No. 123");
            String expectedType = PENALTY;
            assertEquals(expectedType, this.type);
            }
        
        @Test
        public void testTypeAdjustment() {
            Transaction testTransaction = new Transaction (ADJUSTMENT, 100, "Check No. 123");
            String expectedType = ADJUSTMENT;
            assertEquals(expectedType, this.type);
            }
    /**
     * @return the id
     */
    public int getId () {
        return 0;  // Stub
    }

    /**
     * @return the timestamp for this transaction
     */
    public LocalDateTime getTimestamp () {
        return null;  // Stub
    }

    /**
     * @return the transaction type
     */
    public TransactionType getType () {
        return null;  // Stub
    }

    /**
     * @return the amount of this transaction.
     * Transaction amounts are always positive.
     */
    public double getAmount () {
        return 0.00;  // Stub
    }

    /**
     * @return the description
     */
    public String getDescription () {
        return null;  // Stub
    }

    @Override
    public String toString () {
        return "";  // Stub
    }

    @Override
    public int hashCode () {
        return 1;  // Stub
    }

    @Override
    public boolean equals (Object obj) {
        return false;  // Stub
    }

    @Override
    public int compareTo (Transaction other) {
        return 0;  // Stub
    }

}
