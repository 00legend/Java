class City{
    String cityname;
    int PinCode;

    City(){
        this.cityname="delhi";
        this.PinCode=585101;
    }
}

class CityTest{
    public static void main(String[] args){

        City c= new City();
        System.out.println("THE CITY NAME AND PIN CODE :"+c.cityname+" "+c.PinCode);
    }
}