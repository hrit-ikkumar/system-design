package creational.prototype;

public abstract class Device implements Cloneable{
    private String processor;

    public Device() {

    }

    public Device(String processor) {
        this.processor = processor;
    }

    // Implement clone method for prototype
    @Override
    public Device clone() throws CloneNotSupportedException {
        Device clonedDevice = (Device)super.clone();
        clonedDevice.init("Intel");
        return clonedDevice;
    }

    protected void init(String processor){
        this.processor = processor;
    }

    public abstract void reset();
}
