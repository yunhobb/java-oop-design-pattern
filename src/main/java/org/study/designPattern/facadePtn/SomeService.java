package org.study.designPattern.facadePtn;

public class SomeService {

    private FacadeVideoAnalyzer facadeVideoAnalyzer;

    public VideoAnalysisResult analyzeVideo(String videoUrl) {
        VideoAnalysisResult videoAnalysisResult = facadeVideoAnalyzer.analyze();


        return videoAnalysisResult;
    }
}
