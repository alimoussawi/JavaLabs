package Lab3;

public class Task3 {
}

class Computer {
String manufacturer;
int serialNumber;
float price;
int quantityCPU;
int frequencyCPU;

    public Computer(String manufacturer, int serialNumber, float price, int quantityCPU, int frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }
    public void view(){
        System.out.println("this computer details: "+"manufacturer: "+manufacturer+" serialNumber :"+serialNumber+" price: "+price+" quantityCPU: "+quantityCPU+"frequencyCPU: "+frequencyCPU);
    }
}