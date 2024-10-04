public class Vehicle {
    private int id;
    private String makeModel;

    public Vehicle(int id, String makeModel) {
        this.id = id;
        this.makeModel = makeModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", makeModel='" + makeModel + '\'' +
                '}';
    }
}
