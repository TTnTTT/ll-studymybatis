package domain;

import java.util.List;

public class OrderDetail {
private int  orderid;
private int goodsid;
private int amount;
private Double sum;
private List<Goods> goods;

public List<Goods> getGoods() {
	return goods;
}
public Double getSum() {
	return sum;
}
public void setSum(Double sum) {
	this.sum = sum;
}
public void setGoods(List<Goods> goods) {
	this.goods = goods;
}
/*private Orders orders;

public Orders getOrders() {
	return orders;
}
public void setOrders(Orders orders) {
	this.orders = orders;
}*/
public int getOrderId() {
	return orderid;
}
public void setOrderId(int orderId) {
	this.orderid = orderId;
}
public int getGoodsId() {
	return goodsid;
}
public void setGoodsId(int goodsId) {
	this.goodsid = goodsId;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}

}
