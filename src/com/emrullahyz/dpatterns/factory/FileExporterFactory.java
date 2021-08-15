package com.emrullahyz.dpatterns.factory;

import java.nio.file.spi.FileTypeDetector;

public class FileExporterFactory {
    public static FileExporter getInstance(FileType fileType){
        switch (fileType){
            case PDF: return new PdfExporter();
            case EXCEL: return new ExcelExporter();
            default: throw new UnsupportedOperationException();
        }
    }

    enum FileType{
        PDF,
        EXCEL;
    }
}
