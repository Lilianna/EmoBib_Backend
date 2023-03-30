package be.technobel.emobiblio.service;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import jakarta.servlet.http.HttpServletResponse;
public interface FileService {
    public void exportCSV(String fileName, HttpServletResponse response)
            throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException;
}
