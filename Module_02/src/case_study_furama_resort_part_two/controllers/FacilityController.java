package case_study_furama_resort_part_two.controllers;

import case_study_furama_resort_part_two.models.facility.Facility;
import case_study_furama_resort_part_two.services.impl.facility.FacilityServiceImpl;

import java.util.Map;

public class FacilityController {
    private FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public Map<Facility,Integer> getFacilityList() {
        return this.facilityService.getMap();
    }

    public void addFacility(Facility facility, int usedTimes) {
        this.facilityService.addFacility(facility, usedTimes);
    }

    public Map<Facility,Integer> getMaintenanceList() {
        return this.facilityService.getFacilityMaintenanceList();
    }
}
