package innerClass.staticNestedInnerClass;

public class Computer {

    private String brand;

    private String model;

    private OperatingSystem oS;

    public OperatingSystem getoS() {
        return oS;
    }

    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.oS=new OperatingSystem(osName);
    }
    class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer Model: "+model+",OS: "+ osName);
        }
    }

    static class USB{
        private String type;

        public USB(String type){
            this.type=type;
        }

        void displayInfo(){
            System.out.println("USB Type: "+type);
        }
    }


}
