package com.recycle.ecoeco.user.main.model.dto;
import java.util.Date;

public class PaymentDTO {

    // 결제
    private int paymentNo; // 결제 번호
    private int paymentPrice; // 결제 금액
    private Date paymentDate; // 결제일시
    private String apiPayNo; // API 결제번호

    public void PaymentDTO() {}

    public PaymentDTO(int paymentNo, int paymentPrice, Date paymentDate, String apiPayNo) {
        this.paymentNo = paymentNo;
        this.paymentPrice = paymentPrice;
        this.paymentDate = paymentDate;
        this.apiPayNo = apiPayNo;
    }

    public int getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(int paymentNo) {
        this.paymentNo = paymentNo;
    }

    public int getPaymentPrice() {
        return paymentPrice;
    }

    public void setPaymentPrice(int paymentPrice) {
        this.paymentPrice = paymentPrice;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getApiPayNo() {
        return apiPayNo;
    }

    public void setApiPayNo(String apiPayNo) {
        this.apiPayNo = apiPayNo;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "paymentNo=" + paymentNo +
                ", paymentPrice=" + paymentPrice +
                ", paymentDate=" + paymentDate +
                ", apiPayNo='" + apiPayNo + '\'' +
                '}';
    }
}
