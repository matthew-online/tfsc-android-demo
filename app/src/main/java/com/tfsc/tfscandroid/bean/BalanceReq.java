package com.tfsc.tfscandroid.bean;

public class BalanceReq{

    private String jsonrpc;
    private String id;
    private String method;
    private Addr params;
    public static class Addr{
        private String address;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
    public BalanceReq(){
        this.jsonrpc = "2.0";
        this.id = "1";
        this.method = "get_balance";

    }
    public BalanceReq(String jsonrpc, String id, String method, Addr params) {
        this.jsonrpc = jsonrpc;
        this.id = id;
        this.method = method;
        this.params = params;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Addr getParams() {
        return params;
    }

    public void setParams(Addr params) {
        this.params = params;
    }
}

