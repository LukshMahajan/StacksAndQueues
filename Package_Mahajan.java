public class Package_Mahajan {
    private double weight;
    private String destArea;
    private String destAdress;
    private boolean isDelivered;

    Package_Mahajan(double weight, String destArea, String destAdress, boolean isDelivered){
        this.destAdress = destAdress;
        this.weight = weight;
        this.destArea = destArea;
        this.isDelivered = isDelivered;
    }
    public String getStatus(){
        if (isDelivered){
            return "Delivered";
        }
        return "Not Delivered";
    }
    public String getDestArea() {
        return destArea;
    }

    public void setDestArea(String destArea) {
        this.destArea = destArea;
    }

    public String getDestAdress() {
        return destAdress;
    }

    public void setDestAdress(String destAdress) {
        this.destAdress = destAdress;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



}
