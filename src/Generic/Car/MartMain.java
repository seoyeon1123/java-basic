package Generic.Car;

public class MartMain {
    public static void main(String[] args) {
        Product<Tv,String> product = new Product<>();
        product.setKind(new Tv());
        product.setModel("스마트 TV");

        Tv tv = product.getKind();
        String tvModel = product.getModel();

        Product<Car,String> product1 = new Product<>();
        product1.setKind(new Car());
        product1.setModel("SUV 자동차");

        Car car = product1.getKind();
        String carModel = product1.getModel();





    }
}
