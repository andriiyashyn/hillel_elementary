package lesson5;

public class Client extends Object {
    private String name;
    private String surname;
    private String fsurname;

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
//        if (o == null || !(o instanceof Client)) return false;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        return surname != null ? surname.equals(client.surname) : client.surname == null;
    }
}
