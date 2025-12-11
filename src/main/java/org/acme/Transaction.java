package org.acme;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity
{
  @Column(name = "record_id")
  public Long recordId;
  
  @Column(name = "record_timestamp")
  public Long recordTimestamp;
  
  @Column(name = "card_account")
  public String cardAccount;
  
  @Column(name = "card_number")
  public String cardNumber;
  
  @Column(name = "card_number_masked")
  public String cardNumberMasked;
  
  @Column(name = "transaction_date")
  public String transactionDate;
  
  @Column(name = "payment_date")
  public String paymentDate;
  
  @Column(name = "statement_date")
  public String statementDate;
  
  @Column(name = "terminal_id")
  public String terminalId;
  
  @Column(name = "retailer_id")
  public String retailerId;
  
  @Column(name = "merchant_name")
  public String merchantName;
  
  @Column(name = "merchant_country")
  public String merchantCountry;
  
  @Column(name = "mcc")
  public String mcc;
  
  @Column(name = "original_purchase_amount")
  public String originalPurchaseAmount;
  
  @Column(name = "original_purchase_currency")
  public String originalPurchaseCurrency;
  
  @Column(name = "account_currency_amount")
  public String accountCurrencyAmount;
  
  @Column(name = "account_currency")
  public String accountCurrency;
  
  @Column(name = "settlement_amount")
  public String settlementAmount;
  
  @Column(name = "settlement_currency")
  public String settlementCurrency;
  
  @Column(name = "credit_or_debit")
  public String creditOrDebit;
  
  @Column(name = "auth_id")
  public String authId;
  
  @Column(name = "transaction_id")
  public String transactionId;
  
  @Column(name = "transaction_unique_id")
  public String transactionUniqueId;
  
  @Column(name = "unique_id")
  public String uniqueId;
  
  @Column(name = "approval_code")
  public String approvalCode;
  
  @Column(name = "installment")
  public String installment;
  
  @Column(name = "all_installments")
  public String allInstallments;
  
  @Column(name = "cashback_amount")
  public String cashbackAmount;
  
  @Column(name = "cashback_currency")
  public String cashbackCurrency;
  
  @Column(name = "transaction_additional_info")
  public String transactionAdditionalInfo;
  
  @Column(name = "merchant_country_of_origin")
  public String merchantCountryOfOrigin;
  
  @Column(name = "information_indicator")
  public String informationIndicator;
  
  @Column(name = "acceptor_customer_service_phone_number")
  public String acceptorCustomerServicePhoneNumber;
  
  @Column(name = "acceptor_phone_number")
  public String acceptorPhoneNumber;
  
  @Column(name = "acceptor_url_address")
  public String acceptorUrlAddress;
  
  @Column(name = "additional_acceptor_data")
  public String additionalAcceptorData;
  
  @Column(name = "card_available_balance_purchase")
  public String cardAvailableBalancePurchase;
  
  @Column(name = "card_available_balance_cash")
  public String cardAvailableBalanceCash;
  
  @Column(name = "card_available_balance_general")
  public String cardAvailableBalanceGeneral;
  
  @Column(name = "action_type")
  public String actionType;
}
