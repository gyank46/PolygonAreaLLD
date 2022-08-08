package com.example.Builder;

public class Mobile {

    private int RAM;
    private String OS;

    public int getRAM() {
        return RAM;
    }

    public String getOS() {
        return OS;
    }

    public int getStorage() {
        return Storage;
    }

    public double getPrice() {
        return Price;
    }

    public String getModel() {
        return Model;
    }

    public String getBrand() {
        return Brand;
    }

    private int Storage;
    private double Price;
    private String Model;
    private String Brand;


    public static MobileBuilder getBuilder(){
        return new MobileBuilder();
    }

    private Mobile(MobileBuilder builder){

        // we can add Validation here for corresponding attributes as well .
        this.RAM = builder.RAM;
        this.OS = builder.OS;
        this.Storage = builder.Storage;
        this.Price = builder.Price;
        this.Model = builder.Model;
        this.Brand = builder.Brand;
    }


    public static class MobileBuilder{
        private int RAM;
        private String OS;
        private int Storage;
        private double Price;
        private String Model;
        private String Brand;


        public MobileBuilder setRAM(int RAM){
            this.RAM=RAM;
            return this;
        }

        public MobileBuilder setOS(String OS){
            this.OS = OS;
            return this;
        }

        public  MobileBuilder setStorage(int Storage){
            this.Storage=Storage;
            return this;
        }

        public  MobileBuilder setPrice(double Price){
            this.Price=Price;
            return this;
        }

        public MobileBuilder setModel(String Model){
            this.Model = Model;
            return this;
        }

        public MobileBuilder setBrand(String Brand){
            this.Brand = Brand;
            return this;
        }

        public Mobile build(){
            return new Mobile(this);
        }

    }


}
