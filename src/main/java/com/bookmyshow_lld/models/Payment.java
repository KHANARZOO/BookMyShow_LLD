package com.bookmyshow_lld.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel{
    private int amount;
    private String referenceNumber;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
}
