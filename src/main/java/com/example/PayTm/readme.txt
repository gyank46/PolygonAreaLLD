Allow users to create accounts via their phone number and password.
Allow users to update their profile details.
Send money to another user of the application. (Send money to another phone number)
Send money to a bank account.
Allow users to make payment for the transaction via Card/ UPI/ Netbanking
Allow users to refund a transaction. The refund amount will go to the original source.
Allow users to view transaction history.




// User Table
// Card Detail Table
// User Card Mapping
// Transaction Table (Foreign Key = User Table)
// DestinationTransactionType Enum - ToPaytmUser, ToBank, ToUPI ID
// SourceTransactionType Enum - FromWallet, FromUPI, FromCard, FromBankAccount

// User - Name, Email, Contact Number, PAN Number, Aadhar Number , UserId , List<Card>, List<BankAccount>

// Card - Card Number, ValidFrom , ValidDate, OwnerName, CardId

// User - UserID, CardId

// Transaction Table - SenderID, ReceiverID, SourceTransactionType, DestinationTransactionType, Amount , SentOrReceived

// TransactionToBankAccount -

// Bank Account - Bank Account Number, IFSC



