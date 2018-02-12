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
@Table(name = "car_make")
public class CarMake {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "make_title")
	private String makeTitle;
	
	@Column(name = "manufacture_year")
	private int year;
	
	@ManyToOne
	@JoinColumn(name = "model_id")
	private CarModel carModel;
	
	@OneToMany(mappedBy = "carMake")
	private List<Car> cars = new ArrayList<Car>();

	public CarMake() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMakeTitle() {
		return makeTitle;
	}

	public void setMakeTitle(String makeTitle) {
		this.makeTitle = makeTitle;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public CarModel getCarModel() {
		return carModel;
	}

	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "CarMake [id=" + id + ", makeTitle=" + makeTitle + ", year="
				+ year + ", carModel=" + carModel + "]";
	}
	
	

}
