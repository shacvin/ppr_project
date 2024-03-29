public class Worker
{
    private long workerId;
    private String Name;
    private String Hostel;
    private long phoneNo;
    private long salary;
    private LocalTime shiftStart;
    private LocalTime shiftEnd;

    public WorkerInfo(long workerId ,String Name , String Hostel , long phoneNo , long salary , LocalTime shiftStart , LocalTime shiftEnd)
    {
        this.workerId = workerId;
        this.Name = Name;
        this.Hostel = Hostel;
        this.phoneNo = phoneNo;
        this.salary = salary;
        this.shiftStart = shiftStart;
        this.shiftEnd = shiftEnd;
    }

    public void UpdateInfo(String newHostel , long newPhoneNo , long newSalary , LocalTime    newshiftStart , LocalTime newShiftEnd)
    {
        Hostel = newHostel;
        phoneNo = newPhoneNo;
        salary = newSalary;
        shiftStart = newshiftStart;
        shiftEnd = newShiftEnd;
    }

    public long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(long workerId) {
        this.workerId = workerId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHostel() {
        return Hostel;
    }

    public void setHostel(String hostel) {
        Hostel = hostel;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public LocalTime getShiftStart() {
        return shiftStart;
    }

    public void setShiftStart(LocalTime shiftStart) {
        this.shiftStart = shiftStart;
    }

    public LocalTime getShiftEnd() {
        return shiftEnd;
    }

    public void setShiftEnd(LocalTime shiftEnd) {
        this.shiftEnd = shiftEnd;
    }
}