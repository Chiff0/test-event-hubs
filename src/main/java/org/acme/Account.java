package org.acme;

import jakarta.persistence.*;


@Entity
@Table(name = "accounts")
public class Account extends BaseEntity
{  
  @Column(name = "record_id")
  public Long recodId;

  @Column(name = "card_code")
  public String cardCode;

  @Column(name = "card_holder_name")
  public String cardHolderName;

  @Column(name = "card_holder_tax")
  public String cardHolderTax;

  @Column(name = "card_number")
  public String cardNumber; 

  @Column(name = "card_number_masked")
  public String cardNumberMasked;

  @Column(name = "card_status")
  public String cardStatus;

  @Column(name = "card_status_date")
  public String cardStatusDate;

  @Column(name = "src_code")
  public String srmCode;

  @Column(name = "srm_code_date")
  public String srmCodeDate;
  
  @Column(name = "card_exp_date")
  public String cardExpDate;

  @Column(name = "card_additional")
  public String cardAdditional;

  @Column(name = "card_root")
  public String cardRoot;

  @Column(name = "card_account_status")
  public String cardAccountStatus;

  @Column(name = "card_account_owner_name")
  public String cardAccountOwnerName;

  @Column(name = "card_account_owner_tax")
  public String cardAccountOwnerTax;

  @Column(name = "card_account")
  public String cardAccount;
  
  @Column(name = "card_limit_purchase")
  public String cardLimitPurchase;

  @Column(name = "card_limit_cash")
  public String cardLimitCash;

  @Column(name = "card_limit_general")
  public String cardLimitGeneral;

  @Column(name = "card_account_limit")
  public String cardAccountLimit;

  @Column(name = "action_type")
  public String actionType;

  @Column(name = "record_time_stamp")
  public Long recordTimeStamp;
}

