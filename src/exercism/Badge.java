package exercism;

public class Badge {
    public String print(Integer id, String name, String department) {
        if (department == null) {
            department = "owner".toUpperCase();
        }

        if (id == null) {
            return name + " - " + department.toUpperCase();
        }

        return "[" + id + "]" + " - " + name + " - "  + department.toUpperCase();
    }

    public static void main(String[] args) {
        Badge badge = new Badge();

        System.out.println(badge.print(734, "Ernest Johnny Payne", "Strategic Communication"));
        System.out.println(badge.print(null, "Jane Johnson", "Procurement"));
        System.out.println(badge.print(254, "Charlotte Hale", null));

    }
}
