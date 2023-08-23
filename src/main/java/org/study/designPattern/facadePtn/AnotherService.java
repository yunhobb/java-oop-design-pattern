package org.study.designPattern.facadePtn;

public class AnotherService {
    private FacadeVideoAnalyzer facadeVideoAnalyzer;

    public VideoAnalysisResult analyzeVideo(String videoUrl) {
        VideoAnalysisResult videoAnalysisResult = facadeVideoAnalyzer.analyze(videoFeature);


        return videoAnalysisResult;
    }

}
