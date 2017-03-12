# Trafi-Open-Data
Simple Java client for parsing Trafi open data csv file. 

Trafi is Finnish Transport Safety Agency and it publishes anonymous vehicle data. 
This is a simple java parser library to go through that data and provides java Stream out of it.

https://www.trafi.fi/en/information_services/open_data

Made and tested with version 4.8. Fields validated with 4.8 data.

Example use
'''java
 public static void main(String[] args) throws FileNotFoundException {
        String file = "...\\AvoinData4.8_uusi.csv";

        try (VehicleParser vehicleParser = new VehicleParser(new File(file))) {
            vehicleParser.stream()
                    .filter(v -> "COROLLA".equals(v.getVehicleModelName()))
                    .filter(v -> "Toyota".equalsIgnoreCase(v.getVehicleMake()))
                    .filter(v -> v.getVehicleTown() != null && v.getVehicleTown().toString().equals("Helsinki"))
                    .filter(v -> v.getRegistrationDateYear() == 1998)
                    .filter(v -> v.getOdometerReading() > 80000 && v.getOdometerReading() < 120000)
                    .forEach(v -> {
                        String msg = String.format("%d\t%s\t%s\t%s\t%d\t%s\t%s\t",
                                v.getRegistrationDateYear(),
                                v.getVehicleMake(),
                                v.getVehicleModelName(),
                                v.getVehicleChassis(),
                                v.getOdometerReading(),
                                v.getVehicleColor(),
                                v.getVehicleTown()
                        );
                        System.out.println(msg);
                    });
        }
    }
'''
