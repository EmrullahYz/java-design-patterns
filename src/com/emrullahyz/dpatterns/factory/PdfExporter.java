package com.emrullahyz.dpatterns.factory;
//package private class
class PdfExporter implements FileExporter {
    @Override
    public String export(String content){
        return "PDF ->" + content;
    }
}
