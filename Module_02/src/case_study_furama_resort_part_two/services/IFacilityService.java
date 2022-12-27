package case_study_furama_resort_part_two.services;

import case_study_furama_resort_part_two.models.facility.Facility;

import java.util.Map;

public interface IFacilityService extends IService<Facility> {
    Map<Facility,Integer> getFacilityMaintenanceList();
}
