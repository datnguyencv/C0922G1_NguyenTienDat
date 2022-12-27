package case_study_furama_resort_part_two.services;

import java.util.List;

public interface IService<O> {
    List<O> getList();

    void addElement(O o);
}
