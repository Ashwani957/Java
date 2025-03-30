//package ComparatorAndComparable;
//
//public class Emp implements  Comparable<Emp>{
//
//
//
//       private String name;
//      private String phone;
//        private   int empId;
//
//
//
//    @Override
//    public int compareTo(Emp o )
//    {
////        It compares the current object (this) with another object (o) based on empId.
////        Sorting Order:
////        If this.empId < o.empId → Returns negative (meaning this comes first).
////        If this.empId > o.empId → Returns positive (meaning o comes first).
////        If they are equal, it returns 0.
//
//        return this.empId - o.empId;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public int getEmpId() {
//        return empId;
//    }
//
//    public void setEmpId(int empId) {
//        this.empId = empId;
//    }
//
//    public Emp() {
//        super();
//    }
//
//    public Emp(String name, String phone, int empId) {
//        this.name = name;
//        this.phone = phone;
//        this.empId = empId;
//    }
//
//    @Override
//    public String toString() {
//        return "Emp{" +
//                "name='" + name + '\'' +
//                ", phone='" + phone + '\'' +
//                ", empId=" + empId +
//                '}';
//    }
//}


//form Here we use the comparator login
package ComparatorAndComparable;

public class Emp  {



    private String name;
    private String phone;
    private   int empId;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Emp() {
        super();
    }

    public Emp(String name, String phone, int empId) {
        this.name = name;
        this.phone = phone;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empId=" + empId +
                '}';
    }
}
