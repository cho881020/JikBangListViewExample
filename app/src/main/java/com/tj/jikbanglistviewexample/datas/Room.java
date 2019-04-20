package com.tj.jikbanglistviewexample.datas;

public class Room {

    int deposit; // 보증금
    int month_pay; // 월세

    String location; // 대략적인 지역
    int floor; // 몇층인지. 만약 지하라면 음수값으로. -2
    String description; // 설명 문구

    public Room(int deposit, int month_pay, String location, int floor, String description) {
        this.deposit = deposit;
        this.month_pay = month_pay;
        this.location = location;
        this.floor = floor;
        this.description = description;
    }
}
