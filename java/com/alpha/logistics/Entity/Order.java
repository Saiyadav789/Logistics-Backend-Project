package com.alpha.logistics.Entity;



import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
    @Id
    private int id;
    private String Orderdate;
    private String status="placed";
    private double cost;
    private String email;
    
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", Orderdate=" + Orderdate + ", status=" + status + ", cost=" + cost + ", carrier="
				+ carrier + ", loading=" + loading + ", unloading=" + unloading + ", cargo=" + cargo + ",Email="+ email+"]";
	}

	
	public Order() {
		super();
	}

	public Order(int id, String orderdate, String status, double cost, Carrier carrier, Loading loading,
			Unloading unloading, Cargo cargo,String email) {
		super();
		this.id = id;
		this.Orderdate = orderdate;
		this.status = status;
		this.cost = cost;
		this.carrier = carrier;
		this.loading = loading;
		this.unloading = unloading;
		this.cargo = cargo;
		this.email=email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderdate() {
		return Orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.Orderdate = orderdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Carrier getCarrier() {
		return carrier;
	}

	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	public Loading getLoading() {
		return loading;
	}

	public void setLoading(Loading loading) {
		this.loading = loading;
	}

	public Unloading getUnloading() {
		return unloading;
	}

	public void setUnloading(Unloading unloading) {
		this.unloading = unloading;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Autowired
    @OneToOne(cascade = CascadeType.ALL)
    private Carrier carrier;
    
    @Autowired
    @OneToOne(cascade = CascadeType.ALL)
    private Loading loading;
    
    @Autowired
    @OneToOne(cascade = CascadeType.ALL)
    private Unloading unloading;
    
    @Autowired
    @OneToOne(cascade = CascadeType.ALL)
    private Cargo cargo;
}
