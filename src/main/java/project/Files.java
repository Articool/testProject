package project;

import java.io.File;

public class Files {

    private static final String filenameOnePdf = new File("").getAbsolutePath() + "/File/files/" + 1 + ".pdf";
    private static final String filenameTwoXlsx = new File("").getAbsolutePath() + "/File/files/" + 2 + ".xlsx";
    private static final String filenameThreeTxt = new File("").getAbsolutePath() + "/File/files/" + 3 + ".txt";
    private static final String filenameFourJpg = new File("").getAbsolutePath() + "/File/files/" + 4 + ".jpg";
    private static final String filenameFiveDocx = new File("").getAbsolutePath() + "/File/files/" + 5 + ".docx";

    public static String getFileOnePdf() {
        return filenameOnePdf;
    }

    public static String getFileTwoXlsx() {
        return filenameTwoXlsx;
    }

    public static String getFileThreeTxt() {
        return filenameThreeTxt;
    }

    public static String getFileFourJpg() {
        return filenameFourJpg;
    }

    public static String getFileFiveDocx() {
        return filenameFiveDocx;
    }


}
