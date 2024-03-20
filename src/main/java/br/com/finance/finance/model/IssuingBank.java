package br.com.finance.finance.model;

public class IssuingBank {

    private Integer id;
    private String bankName;

    public IssuingBank(Integer id, String bankName) {
        this.id = id;
        this.bankName = bankName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
