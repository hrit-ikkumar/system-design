# Splitwise 
- Create an expense sharing application.
- An expense sharing application in which you can add your expenses and split it among different people. The app keeps balances between people as in who owes how much to whom.

### Requirements
- User can make transaction.
- User has multiple other users as friends or relatives
- User can do split as: EQUAL, EXACT, PERCENT
- User can add any amount and split that with other friends
- User should be able to see his balance at any point of time.

### Objects

1. User
2. Transactions

User: id, mobileNo, name, userName, email, transactions List<Transaction>
Transaction: id, amount, paymentMadeBy, splitType, HashMap<UserId, Expense>
Expense: expenseType

Enums
* Split: [EQUAL, EXACT, PERCENT]
* ExpenseType: [OWE, PAID]
