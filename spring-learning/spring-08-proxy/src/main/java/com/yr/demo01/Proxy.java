package com.yr.demo01;

public class Proxy implements Rent{
    // 代理的核心是多态
    private Rent host;
    public Proxy(){}

    public Proxy(Rent host){
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        System.out.println("中介帮忙出租房子");
    }

    public void seeHouse(){
        System.out.println("中介帮你看房");
    }

    public void contract(){
        System.out.println("中介和你签合同");
    }

    public void charge(){
        System.out.println("收中介费");
    }
}
