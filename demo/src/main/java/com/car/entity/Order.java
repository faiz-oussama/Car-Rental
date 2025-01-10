package com.car.entity;

import java.math.BigDecimal;
import java.util.*;
public class Order {

    private long OrderId;
    private long UserId;
    private long CarId;
    private Date OrderDate;
    private Date ReturnDate;
    private boolean CarReturned;
    private BigDecimal RentalCost;


    public Order() {
    }
    public Order(long OrderId, long UserId, long CarId, Date OrderDate, Date ReturnDate, boolean CarReturned, BigDecimal RentalCost) {
        this.OrderId = OrderId;
        this.UserId = UserId;
        this.CarId = CarId;
        this.OrderDate = OrderDate;
        this.ReturnDate = ReturnDate;
        this.CarReturned = CarReturned;
        this.RentalCost = RentalCost;
    }

    public long getOrderId() {
        return OrderId;
    }

    public void setOrderId(long orderId) {
        OrderId = orderId;
    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public long getCarId() {
        return CarId;
    }

    public void setCarId(long carId) {
        CarId = carId;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date orderDate) {
        OrderDate = orderDate;
    }

    public Date getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(Date returnDate) {
        ReturnDate = returnDate;
    }

    public boolean isCarReturned() {
        return CarReturned;
    }

    public void setCarReturned(boolean carReturned) {
        CarReturned = carReturned;
    }

    public BigDecimal getRentalCost() {
        return RentalCost;
    }

    public void setRentalCost(BigDecimal rentalCost) {
        RentalCost = rentalCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderId=" + OrderId +
                ", UserId=" + UserId +
                ", CarId=" + CarId +
                ", OrderDate=" + OrderDate +
                ", ReturnDate=" + ReturnDate +
                ", CarReturned=" + CarReturned +
                ", RentalCost=" + RentalCost +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return OrderId == order.OrderId &&
                UserId == order.UserId &&
                CarId == order.CarId &&
                CarReturned == order.CarReturned &&
                Objects.equals(OrderDate, order.OrderDate) &&
                Objects.equals(ReturnDate, order.ReturnDate) &&
                Objects.equals(RentalCost, order.RentalCost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(OrderId, UserId, CarId, OrderDate, ReturnDate, CarReturned, RentalCost);
    }
}
