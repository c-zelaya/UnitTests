package banking;
import static org.junit.Assert.*;
import org.junit.*;
/** A list of the possible types of transactions in the banking simulation.
 * @author wpollock
 * @edited by Helene Hoffman
 *
 */
public enum TransactionType {
    DEPOSIT, WITHDRAWAL, INTEREST, CHECK, FEE, PENALTY, ADJUSTMENT;
    
   //tests Transaction type Deposit.
   @Test
   public void testEnumTypeDeposit() {
    assertEquals("DEPOSIT", banking.TransactionType.DEPOSIT);
}
   //tests Transaction type Withdrawal.
   @Test
   public void testEnumTypeWithdrawal() {
    assertEquals("WITHDRAWAL", banking.TransactionType.WITHDRAWAL);
}  
   //tests Transaction type Check.
   @Test
   public void testEnumTypeCheck() {
    assertEquals("CHECK", banking.TransactionType.CHECK);
}  
   //tests Transaction type Fee.
   @Test
   public void testEnumTypeFee() {
    assertEquals("FEE", banking.TransactionType.FEE);
} 
   //tests Transaction type Penalty.
   @Test
   public void testEnumTypePenalty() {
    assertEquals("PENALTY", banking.TransactionType.PENALTY);
} 
   //tests Transaction type Adjustment.
   @Test
   public void testEnumTypeAdjustment() {
    assertEquals("PENALTY", banking.TransactionType.ADJUSTMENT);
} 
}
