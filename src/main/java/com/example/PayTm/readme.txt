Requirements: Create design (class diagram and schema design) and write working code for a command-line payment application that supports the following use cases.

In future:
 a user might create via email ID/ google login; fb logic
I might want to refund to original payment source
How to

Behaviour:
Check for balance before making payment via wallet
GUI + APIs

Allow USERS to create accounts via their phone number and password.

// RegisterUser [phone_number] [password]


Allow USERS to update their profile details.

// UpdateUser [user_id] [name] [email] [phone_number]


Send money to another user of the application. (Send money to another phone number)

// CreateTransaction PAYTM [from_user_id] [to_user_id] [amount]


Send money to a bank account.

// CreateTransaction BANK [from_user_id] [account_number] [ifsc_code] [amount]


Allow users to make payment for the transaction via Card/ UPI/ Netbanking

// MakePayment [transaction_id] [payment_method] [... details related to payment method ...]


Allow users to refund a transaction. The refund amount will go to the original source.

// RefundTransaction [transaction_id]


Allow users to view transaction history.

// ViewTransactionsHistory [user_id]



Classes - User, Bank Account, Card, Wallet, Transaction, SendMoneyToWallet, SendMoneyToBankAccount , MakePaymentViaWallet, MakePaymentViaUPI, MakePaymentViaBankAccount, MakePaymentViaCard,
Interface - Send Money
Interface - Make Payment
Interface - Refund Money
User Table - UserId, Name, Phone Number, Email, WalletID
Wallet - WalletID, Amount, UserID
BankAccount - BankAccountID, BankAccount Number, Bank Account Owner Name, IFSC Code
BankAccountID_UserID_Mapping - UserID, BankAccountID
Card - CardId, Card Number, Card CVV, Card Owner Name, Card Expiry Date
UserID_CardID_Mapping - UserID, CardID
Transaction - UserID, TransactionID
Payment - TransactionID, SourceID, SourceType, RecipientID, DestinationType




