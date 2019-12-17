import java.io.Serializable;

public class Citizen implements Serializable {
    private static final long serialVersionUID = -3974764794585135235L;

    private String name;
    private Address address;
    private transient String passport;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", passport='" + passport + '\'' +
                '}';
    }
}
