package org.study.designPattern.facadePtn;

public class FacadeVideoAnalyzer {
    private FileDownloader downloader;
    private VideoEncoder encoder;
    //등등

    public VideoAnalysisResult analyze(String videoUrl) {
        String filePaht = downloader.download(videoUrl);
        String encodedFilePath = encode.encode(filePaht);
    }

}
