public class testinggg {
    // Create a savings account
    SavingsAccount savingsAccount = new SavingsAccount("SA1234", 5000);
savingsAccount.displayBalance();  // Output: Account Number: SA1234, Balance: 5000

savingsAccount.deposit(2000);
savingsAccount.displayBalance();  // Output: Account Number: SA1234, Balance: 7000

savingsAccount.withdraw(3000);
savingsAccount.displayBalance();  // Output: Account Number: SA1234, Balance: 4000

    // Create a current account
    CurrentAccount currentAccount = new CurrentAccount("CA5678", 10000);
    123456789098765434567890git
currentAccount.displayBalance();  // Output: Account Number: CA5678, Balance: 10000

currentAccount.withdraw(12000);  // Output: Insufficient funds
currentAccount.withdraw(5000);
currentAccount.displayBalance();  // Output: Account Number: CA5678, Balance: 5000

}
