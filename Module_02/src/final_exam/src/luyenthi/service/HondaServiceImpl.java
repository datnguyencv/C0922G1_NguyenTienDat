package luyenthi.service;

import luyenthi.model.Honda;
import luyenthi.repository.read_write_file_honda.ReadFile;

import java.util.List;

public class HondaServiceImpl implements IHondaService{
    private static final String PATH_HONDA = "src/luyenthi/repository/honda.csv";
    @Override
    public void display() {
        List<Honda> hondas = ReadFile.readFileHonda(PATH_HONDA);
        for (int i = 0; i < hondas.size(); i++) {
            System.out.println(hondas.get(i));
        }
    }

    @Override
    public void addHonda(Honda honda) {

    }
}
