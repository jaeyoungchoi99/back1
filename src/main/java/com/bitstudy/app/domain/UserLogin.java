package com.bitstudy.app.domain;

public class
UserLogin {

    private String id;
    private String pw;
    private boolean rememberId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public boolean isRememberId() {
        return rememberId;
    }

    public void setRememberId(boolean rememberId) {
        this.rememberId = rememberId;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", rememberId=" + rememberId +
                '}';
    }
}
