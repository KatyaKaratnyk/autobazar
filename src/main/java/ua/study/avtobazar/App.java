package ua.study.avtobazar;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

import entity.Car;
import entity.CarColor;
import entity.CarEngineCapacity;
import entity.CarFuelType;
import entity.CarMake;
import entity.CarModel;
import entity.CarSeller;
import enums.Color;
import enums.FuelType;
import enums.Make;
import enums.Model;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
//		
		
//		//Заповнюємо кольори машини з енаму
		
//		for (int i = 0; i<Color.values().length; i++) {
//			
//			CarColor carColor = new CarColor();
//			carColor.setColor(Color.values()[i].toString());
//			entityManager.persist(carColor);
//		}
//		
//		//Заповнюємо об'єми двигунів
		
//		for (int i =1; i < 4; i++ ) {
//			for (int j = 0; j<10; j++) {
//				CarEngineCapacity carEngineCapacity = new CarEngineCapacity();
//				carEngineCapacity.setEngineCapacity(new Double(i+"."+j));
//				entityManager.persist(carEngineCapacity);
//			}
//		}
//		
//		for(int i = 0; i<FuelType.values().length; i++) {
//			CarFuelType carFuelType = new CarFuelType();
//			carFuelType.setFuelType(FuelType.values()[i].toString());
//			entityManager.persist(carFuelType);
//		}
		
		
		//Запонюється моделі і марки машин
		
//		for(int i = 0; i < Make.values().length; i++) {
//			for(int j = 0; j <100; j++) {
//				CarMake carMake = new CarMake();
//				
//				CarModel carModel = new CarModel();
//				
//				carModel.setModelTitle(Model.values()[(int)(Math.random()*5+i*5)].toString());
//				carModel.setCarEngineCapacity(entityManager.createQuery("select c from CarEngineCapacity c where c.id = :id", CarEngineCapacity.class)
//						.setParameter("id", new Long(""+(int)(Math.random()*30+1))).getSingleResult());
//				carModel.setCarFuelType(entityManager.createQuery("select c from CarFuelType c where c.id = :id", CarFuelType.class)
//						.setParameter("id", new Long(""+(int)(Math.random()*4+1))).getSingleResult());
//				carModel.setCarColor(entityManager.createQuery("select c from CarColor c where c.id = :id", CarColor.class)
//						.setParameter("id", new Long(""+(int)(Math.random()*7+1))).getSingleResult());
//				
//				entityManager.persist(carModel);
//				
//				carMake.setMakeTitle(Make.values()[i].toString());
//				carMake.setCarModel(carModel);
//				carMake.setYear((int)(Math.random()*27+1990));
//				
//				entityManager.persist(carMake);
//			}
//		}
		
		
		//Заповнюємо базу даних продавцями
		
//		String[] firstNames = {
//				"Kate", "Tom", "Steve", "Mary", "Pavlo", "Jhon", "Ihor", "Tanya", "Roman", "Iryna", "Victor" 
//		};
//		String[] lastNames = {
//				"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", 
//				"Harris", "Martin", "Thompson"
//		};
//		
//		for(int i = 0 ; i < 500; i++) {
//			CarSeller carSeller = new CarSeller();
//			carSeller.setFirstName(firstNames[(int)(Math.random()*(firstNames.length)-1)]);
//			carSeller.setLastName(lastNames[(int)(Math.random()*(lastNames.length)-1)]);
//			carSeller.setAge((int)(Math.random()*40+18));
//			carSeller.setPhoneNumber("093-"+(int)(Math.random()*1000000+8999999));
//			entityManager.persist(carSeller);
//		}
		
		
		//Заповнюємо базу машинами
		
//		for(int i = 1; i<=700; i++) {
//			Car car = new Car();
//			car.setSellPrice(Math.random()*300000+500);
//			car.setCarMake(entityManager.createQuery("select c from CarMake c where c.id = :id", CarMake.class).setParameter("id", (long)i).getSingleResult());
//			car.setCarSeller(entityManager.createQuery("select c from CarSeller c where c.id = :id", CarSeller.class).setParameter("id", new Long(""+(int)(Math.random()*4000+1))).getSingleResult());
//			entityManager.persist(car);
//			
//		}
		
		
		//--------------------Запити  з JPQL------------------------
		
		//1
//		Car car = entityManager.createQuery("select c from Car c where c.id = :id", Car.class).setParameter("id", 20l).getSingleResult();
//		System.out.println(car);
		//2
//		List<CarSeller> carSellers = entityManager.createQuery("select c from CarSeller c where c.firstName = :firstName", CarSeller.class).setParameter("firstName", "Kate").getResultList();
//		carSellers.forEach(System.out::println);
		//3
//		List<CarMake> carMakes = entityManager.createQuery("select c from CarMake c where c.makeTitle = :title and c.year = :year", CarMake.class)
//				.setParameter("title", "VOLKSWAGEN")
//				.setParameter("year", 1998)
//				.getResultList();
//		carMakes.forEach(System.out::println);
		//4
//		List<CarModel> carModels = entityManager.createQuery("select c from CarModel c join c.carColor z where z.color = :color ", CarModel.class)
//				.setParameter("color", "BLACK")
//				.getResultList();
//		carModels.forEach(System.out::println);
		
		//5
//		List<Car> cars = entityManager.createQuery("select c from Car c where c.sellPrice between :start and :finish", Car.class)
//				.setParameter("start", new Double("10000"))
//				.setParameter("finish", new Double("15000"))
//				.getResultList();
//		cars.forEach(System.out::println);
		
		//6
//		List<CarSeller> carSellers2 = entityManager.createQuery("select c from CarSeller c where c.firstName = :first and c.lastName = :last", CarSeller.class)
//				.setParameter("first", "Mary")
//				.setParameter("last", "Smith")
//				.getResultList();
//		carSellers2.forEach(System.out::println);
		
		//7
		List<Car> cars2 = entityManager.createQuery("select c from Car c join c.carMake z join z.carModel t where t.modelTitle = :title", Car.class)
				.setParameter("title", "RAM")
				.getResultList();
		cars2.forEach(System.out::println);
		
		//8
		List<Car> cars3 = entityManager.createQuery("select c from Car c join c.carMake z join z.carModel t join t.carFuelType y where y.fuelType like '%PETROL'", Car.class)
				.getResultList();
		cars3.forEach(System.out::println);
		
		//9
		List<CarMake> carMakes = entityManager.createQuery("select c from CarMake c where c.year between :start and :end", CarMake.class)
				.setParameter("start", 2000)
				.setParameter("end", 2001)
				.getResultList();
		carMakes.forEach(System.out::println);
		
		//10
		List<CarSeller> carSellers3 = entityManager.createQuery("select c from CarSeller c where c.age > :age", CarSeller.class)
				.setParameter("age", 55)
				.getResultList();
		carSellers3.forEach(System.out::println);
		
		
		//----------------------Запити з Criteria------------------------------
		
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Car> query = criteriaBuilder.createQuery(Car.class);
		Root<Car> root = query.from(Car.class);
		query.select(root);
		
		//1
		Expression<Double> priceExpression = root.get("sellPrice");
		Predicate pricePredicate = criteriaBuilder.le(priceExpression, new Double("150000"));
		query.where(pricePredicate);
		List<Car> cars4 = entityManager.createQuery(query).getResultList();
		cars4.forEach(System.out::println);
		
		//2
		Predicate pricePredicate2 = criteriaBuilder.ge(priceExpression, new Double("150000"));
		query.where(pricePredicate2);
		cars4 = entityManager.createQuery(query).getResultList();
		cars4.forEach(System.out::println);
		//3
		CriteriaQuery<CarSeller> carSellerQuery = criteriaBuilder.createQuery(CarSeller.class);
		Root<CarSeller> carSellerRoot = carSellerQuery.from(CarSeller.class);
		Expression<String> firstNameExpression = carSellerRoot.get("firstName");
		Predicate firstNamePredicate = criteriaBuilder.like(firstNameExpression, "K%");
		carSellerQuery.where(firstNamePredicate);
		List<CarSeller> carSellers4 = entityManager.createQuery(carSellerQuery).getResultList();
		carSellers4.forEach(System.out::println);
		
		
		//4
		Expression<String> lastNameExpression = carSellerRoot.get("lastName");
		Predicate lastNamePredicate = criteriaBuilder.like(lastNameExpression, "%h");
		carSellerQuery.where(lastNamePredicate);
		List<CarSeller> carSellers5 = entityManager.createQuery(carSellerQuery).getResultList();
		carSellers5.forEach(System.out::println);
		
		//5
		Predicate allPredicate = criteriaBuilder.and(firstNamePredicate, lastNamePredicate);
		carSellerQuery.where(allPredicate);
		List<CarSeller> carSellers6 = entityManager.createQuery(carSellerQuery).getResultList();
		carSellers6.forEach(System.out::println);
		

		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
    }
}
