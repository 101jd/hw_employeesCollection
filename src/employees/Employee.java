package employees;

public class Employee {
    String name;
    int stage;
    int table;
    String phoneNumber;

    public Employee(String name, int stage, int table, String phoneNumber){
        this.name = name;
        this.stage = stage;
        this.table = table;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getStage() {
        return stage;
    }

    public int getTable() {
        return table;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(name)
                .append(System.lineSeparator())
                .append(phoneNumber)
                .append(System.lineSeparator())
                .append("Stage: ")
                .append(stage)
                .append(System.lineSeparator())
                .append("Table number: ")
                .append(table)
                .append(System.lineSeparator())
                .toString();
    }
}
