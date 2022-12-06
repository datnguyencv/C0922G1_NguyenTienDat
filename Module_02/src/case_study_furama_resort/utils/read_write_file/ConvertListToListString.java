package case_study_furama_resort.utils.read_write_file;

import case_study_furama_resort.models.facility.Facility;
import case_study_furama_resort.models.facility.House;
import case_study_furama_resort.models.facility.Room;
import case_study_furama_resort.models.facility.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConvertListToListString {

    public List<String> listFacilityToString(Map<Facility, Integer> facilityIntegerMap) {
        Set<Facility> facilitySet = facilityIntegerMap.keySet();
        List<String> stringFacilityList = new ArrayList<>();
        for (Facility facility : facilitySet) {
            stringFacilityList.add(facility.toString() + facilityIntegerMap.get(facility));
        }
        return stringFacilityList;
    }

    public List<String> listHouseToListString(Map<House, Integer> houseIntegerMap) {
        Set<House> houseSet = houseIntegerMap.keySet();
        List<String> stringHouseList = new ArrayList<>();
        for (House house : houseSet) {
            stringHouseList.add(house.toString() + houseIntegerMap.get(house));
        }
        return stringHouseList;
    }

    public List<String> listRoomToListString(Map<Room, Integer> roomIntegerMap) {
        Set<Room> roomSet = roomIntegerMap.keySet();
        List<String> stringRoomList = new ArrayList<>();

        for (Room room : roomSet) {
            stringRoomList.add(room.toString() + roomIntegerMap.get(room));
        }
        return stringRoomList;
    }

    public List<String> listVillaToListString(Map<Villa, Integer> villaIntegerMap) {
        Set<Villa> villaSet = villaIntegerMap.keySet();
        List<String> stringVillaList = new ArrayList<>();

        for (Villa villa : villaSet) {
            stringVillaList.add(villa.toString() + villaIntegerMap.get(villa));
        }
        return stringVillaList;
    }

}
