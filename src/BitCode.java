public class BitCode implements ISO{

    private int id;
    private String address;

    public BitCode(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void accounts() {
        System.out.println(id + " Accounts info");
    }

    public void clients() {
        System.out.println(id + " clients info");
    }

    @Override
    public void quality() {
        System.out.println(id + " Quality" );
    }

    @Override
    public void hrPolicies() {
        System.out.println(id + " HR Policies");
    }
}
