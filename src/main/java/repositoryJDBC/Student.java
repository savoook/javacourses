package repositoryJDBC;

public class Student {
    int id;
    String surname;
    String name;
    String group;
    //Data data;
    Boolean status;

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", status=" + status +
                '}';
    }
}
