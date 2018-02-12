package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "sell_price")
	private double sellPrice;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private CarSeller carSeller;
	
	@ManyToOne
	@JoinColumn(name = "make_id")
	private CarMake carMake;

	public Car() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public CarSeller getCarSeller() {
		return carSeller;
	}

	public void setCarSeller(CarSeller carSeller) {
		this.carSeller = carSeller;
	}

	public CarMake getCarMake() {
		return carMake;
	}

	public void setCarMake(CarMake carMake) {
		this.carMake = carMake;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", sellPrice=" + sellPrice + ", carSeller="
				+ carSeller + ", carMake=" + carMake + "]";
	}
	
	

}
