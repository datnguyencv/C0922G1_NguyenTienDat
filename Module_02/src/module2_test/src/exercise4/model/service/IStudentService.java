package exercise4.model.service;

import jdk.nashorn.internal.ir.annotations.Ignore;

public interface IStudentService extends Iterable, Ignore {
    public void displayData();
    public boolean checkId(String id);
    public String getStudentName(String id);
    public void writeFile();
    public void readFile();
}
