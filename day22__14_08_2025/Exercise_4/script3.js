class BankAccount {
    constructor(accountNumber, balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    deposit(amount) {
        if (amount > 0) {
            this.balance += amount;
            console.log(`Deposited: ${amount}. New Balance: ${this.balance}`);
        } else {
            console.log("Deposit amount must be positive.");
        }
    }

    withdraw(amount) {
        if (amount > this.balance) {
            console.log("Insufficient funds.");
        } else if (amount <= 0) {
            console.log("Withdrawal amount must be positive.");
        } else {
            this.balance -= amount;
            console.log(`Withdrawn: ${amount}. New Balance: ${this.balance}`);
        }
    }
}

// Example usage:
let account = new BankAccount("ACC123", 500);
console.log(`Account Number: ${account.accountNumber}, Initial Balance: ${account.balance}`);

account.deposit(200);   // Adds 200
account.withdraw(100);  // Subtracts 100
account.withdraw(700);  // Tries to withdraw more than balance
