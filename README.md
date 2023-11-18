# ATM-Simulator

The Java ATM Simulator is a program designed to mimic the operations of an Automated Teller Machine (ATM). Here's an overview of its key components and functionalities:

Menu Interface:

The program presents users with a text-based menu, displayed in the console.
Users can choose from options such as deposit, withdraw, transfer, check balance, and exit.
Transaction Operations:

Deposit: Users can deposit a specified amount into their account.
Withdraw: Users can withdraw a specified amount, provided they have sufficient funds.
Transfer: Users can transfer funds to another account. 
Check Balance: Users can inquire about their current account balance.

Balance Management:
The program maintains a simulated account balance, which is initially set to a predefined value.
Deposits and withdrawals modify this balance accordingly.

Looped Execution:
The program runs in a continuous loop, allowing users to perform multiple transactions without restarting the application.
The loop continues until the user chooses the exit option.

Input Handling:
The program uses the Scanner class to take user input for transaction amounts and choices.

Error Handling: Minimal error handling is implemented, such as checking for negative amounts or insufficient funds during withdrawals.

Exit Mechanism:Users can choose to exit the program, ending the simulation.
