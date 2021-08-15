package com.emrullahyz.dpatterns.factory;

public class Run {

    public static void main(String[] args) {
	    String file = FileExporterFactory.getInstance(FileExporterFactory.FileType.PDF).export("file Content");
        System.out.println(file);
    }
}
