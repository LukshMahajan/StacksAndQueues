import java.util.*;
public class Truck_Mahajan {
    private int maxCapacity;
    private double maxWeight;
    private String areaServes;
    private String location;
    private int numPackages;
    public double totalWeight;
    private Stack<Package_Mahajan> stack = new Stack<Package_Mahajan>();

    public Truck_Mahajan(int maxCapacity, double maxWeight, String areaServes, String location) {
        this.maxCapacity = maxCapacity;
        this.maxWeight = maxWeight;
        this.areaServes = areaServes;
        this.location = location;
        this.numPackages = 0;
        this.totalWeight = 0;
    }
    public ArrayList<Package_Mahajan> getAllPackages(){
        ArrayList<Package_Mahajan> allPackages = new ArrayList<Package_Mahajan>();
        for (Package_Mahajan packag : stack){
            allPackages.add(packag);
        }
        return allPackages;
    }
    public boolean canAdd(Package_Mahajan packag){
        if (numPackages>=maxCapacity)
            return false;
        if (totalWeight+packag.getWeight()>maxWeight)
            return false;
        return true;
    }
    public String getNextLocation(){
        // Figure out what to do if the stack is empty
        // How to get warehouse location
        if (stack.isEmpty()){
            return getLocation();
        }
        return stack.peek().getDestAdress();
    }
    public void addPackage(Package_Mahajan packag){
        if (!canAdd(packag)){
            System.out.println("Not enough space for package!");
            return;
        }
        stack.push(packag);
        numPackages++;
        totalWeight += packag.getWeight();
        System.out.println("Package added");
        if (numPackages==maxCapacity){
            deliverEverything();
        }
    }
    public void deliverPackage(){
        if (stack.isEmpty()){
            System.out.println("No packages to deliver");
            return;
        }
        setLocation(stack.peek().getDestAdress());
        stack.peek().setDelivered(true);
        totalWeight -= stack.peek().getWeight();
        stack.pop();
        numPackages--;
        System.out.println("Package delivered");
    }
    public void deliverEverything(){
        for (Package_Mahajan packag : stack) {
            deliverPackage();
        }
    }

    public int getNumPackages(){
        return numPackages;
    }

    public double getTotalWeight(){
        return totalWeight;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getAreaServes() {
        return areaServes;
    }

    public void setAreaServes(String areaServes) {
        this.areaServes = areaServes;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}


