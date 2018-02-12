package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car_model")
public class CarModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "model_title")
	private String modelTitle;
	
	@ManyToOne
	@JoinColumn(name = "engine_capacity_id")
	private CarEngineCapacity carEngineCapacity;
	
	@ManyToOne
	@JoinColumn(name = "fuel_type_id")
	private CarFuelType carFuelType;
	
	@ManyToOne
	@JoinColumn(name = "color_id")
	private CarColor carColor;
	
	@OneToMany(mappedBy = "carModel")
	private List<CarMake> carMakes = new ArrayList<>();

	public CarModel() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModelTitle() {
		return modelTitle;
	}

	public void setModelTitle(String modelTitle) {
		this.modelTitle = modelTitle;
	}

	public CarEngineCapacity getCarEngineCapacity() {
		return carEngineCapacity;
	}

	public void setCarEngineCapacity(CarEngineCapacity carEngineCapacity) {
		this.carEngineCapacity = carEngineCapacity;
	}

	public CarFuelType getCarFuelType() {
		return carFuelType;
	}

	public void setCarFuelType(CarFuelType carFuelType) {
		this.carFuelType = carFuelType;
	}

	public CarColor getCarColor() {
		return carColor;
	}

	public void setCarColor(CarColor carColor) {
		this.carColor = carColor;
	}

	public List<CarMake> getCarMakes() {
		return carMakes;
	}

	public void setCarMakes(List<CarMake> carMakes) {
		this.carMakes = carMakes;
	}

	@Override
	public String toString() {
		return "CarModel [id=" + id + ", modelTitle=" + modelTitle
				+ ", carEngineCapacity=" + carEngineCapacity + ", carFuelType="
				+ carFuelType + ", carColor=" + carColor + "]";
	}

	
	
	

}
