public class Employee {

    public static class Department {
        private String departmentName;

        public Department(String departmentName) {
            this.departmentName = departmentName;
        }

        public String getDepartmentName() {
            return departmentName;
        }
    }
    public class Address {
        private String street;
        private String houseNO;
        private String pincode;

        public Address(String street, String houseNO, String pincode) {
            this.street = street;
            this.houseNO = houseNO;
            this.pincode = pincode;
        }
    }
    private int id;
    private String name;
    private Department department;
    private Address address;

    public  Employee(int id,String name,String departmentName,String street,String houseNO,String pincode){
        this.id=id;
        this.name=name;
        this.department=new Department(departmentName);
        this.address=new Address(street, houseNO, pincode);
    }
    public void displayDetails(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("department:"+department.getDepartmentName());
        System.out.println("Street:"+address.street+"  house number:"+address.houseNO+"  pincode:"+address.pincode);
    }
}
public void main(String[] args){
    Employee emp=new Employee(101,"Gauri","CS","123 Elm St","4802","695029");
    emp.displayDetails();
}
