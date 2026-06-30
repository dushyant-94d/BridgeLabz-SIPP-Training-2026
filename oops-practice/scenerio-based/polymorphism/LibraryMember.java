class LibraryMember {

    protected String memberName;
    protected String memberId;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public double calculateFine(int overdueDays) {
        return 0;
    }

    public void displayDetails() {
        System.out.println("Name : " + memberName);
        System.out.println("ID   : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    public StudentMember(String name, String id) {
        super(name, id);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    public FacultyMember(String name, String id) {
        super(name, id);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    public GuestMember(String name, String id) {
        super(name, id);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class Main {

    static void findMember(LibraryMember[] members, String id) {

        for (LibraryMember m : members) {

            if (m.memberId.equals(id)) {
                System.out.println("\nMember Found");
                m.displayDetails();
                return;
            }
        }

        System.out.println("Member Not Found");
    }

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Anil", "S101"),
                new FacultyMember("Rahul", "F201"),
                new GuestMember("Amit", "G301")
        };

        int overdueDays = 4;

        for (LibraryMember member : members) {

            member.displayDetails();
            System.out.println("Fine = ₹" + member.calculateFine(overdueDays));
            System.out.println();
        }

        findMember(members, "F201");
    }
}